package Codility_3;

        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;
        import java.util.stream.IntStream;

public class Solution
{
    public static void main(String[] args)
    {
        int[] arr = {9,1,9,2,9,1,9,2,9,3,9};
        System.out.println(solution(arr));
    }
    public static IntStream solution(int[] A)
    {
        Set<Integer> allItems = new HashSet<>();
        return Arrays.stream(A)
                .filter(n -> Arrays.stream(A)
                        .filter(x -> x == n).count() == 1).limit(1);
    }
}

