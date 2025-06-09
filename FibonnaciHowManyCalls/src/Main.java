import java.util.Scanner;
class Fib {
    long i;
    public Fib()
    {
        this.i = 0;
    }
    public long run(long num) {
        i++;
        if(num <= 1) return num;
        else return run(num - 1) + run(num - 2);
    }
    public long getNumberOfCalls()
    {
        return i;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTestCases = sc.nextInt();
        for(int i = 0; i < nTestCases; i++)
        {
            int fib = sc.nextInt();
            Fib f = new Fib();
            long result = f.run(fib);

            System.out.printf("fib(%d) = %d calls = %d\n",fib,f.getNumberOfCalls() ,result);
        }
    }
}