package PWPW;

public class Task_1
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,1,0,0,0,0};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A)
    {
        int reverseCounter = 0;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i <A.length ; i++)
        {
          if(A[i] == 0)
          {
              tails++;
          }else
          {
              heads++;
          }
        }

        if(tails>heads)
        {
            reverseCounter = heads;
        }
        else if(heads>tails)
        {
            reverseCounter = tails;
        }
        else if(heads==tails)
        {
            reverseCounter = tails;
        }
        return reverseCounter;
    }
}
