package PWPW;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static int solution(int X)
    {
        List<Osoba> p = new ArrayList<>();

        for (int i=0;i<X;i++)
        {
            int w = (i*10) %99;
            p.add(new Osoba(w, "John" +(i+1)));
        }
        int counter = 0;

        for(Osoba x :p)
        {
            if(x.Wiek>18)
                counter++;
        }
        return counter;
    }
}

// ZADANIE SQL //

/*

SELECT m.id, m.title, COALESCE(SUM(number_of_tickets),0) from movies m Left Join reservations r ON r
       .movie_id=m.id GROUP BY m.id, m.title ORDER BY COALESCE(SUM(number_of_tickets),0) DESC, m.id ASC;
*/