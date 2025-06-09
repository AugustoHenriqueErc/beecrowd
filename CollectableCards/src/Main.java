import java.util.Scanner;

class MDC {
    public static int run(int a, int b)
    {
        if(b == 0) return a;
        return run(b, a % b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nTestCases = sc.nextInt();

        for(int i = 0; i< nTestCases; i++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            MDC.run(n1,n2);
            System.out.println(MDC.run(n1,n2));
        }
    }
}


