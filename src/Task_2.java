import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static int solution(int X)

    {
        List<Osoba> list = new ArrayList();
        int n = 0;

        for (int i = 0; i <X ; i++)
        {
            if(i<10)
                list.add(new Osoba(n*10,"John" + n+1));

        }
        return (int) list.stream().filter(p -> p.getWiek() > 18).count();
    }
}