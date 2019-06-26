import java.util.Scanner;
class MyCalculator {
    public static long power(int n, int p) throws Exception
    {
        long r=1;
        if(n==0&&p==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else if(n<0||p<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            for(;p>0;p--)
            {
                r=r*n;
            }
            return r;

        }
    }  
}