import java.util.Scanner;
class Number
{
    char[]digits;
    String num;
    public Number(String num)
    {
        this.num = num;
        digits = num.toCharArray();
    }
    public int[] getIntArray()
    {
        int[] intArray = new int[num.length()];
        for(int i=0;i < num.length();i++)
        {
            intArray[i] = digits[i] - '0';
        }
        return intArray;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        scr.nextLine();
        for(int i = 0; i < n;i++)
        {
            String s = scr.nextLine();
            String[] string = s.split(" ");
            Number A = new Number(string[0]);
            Number B = new Number(string[1]);

            int[] a = A.getIntArray();
            int[] b = B.getIntArray();

            boolean encaixa = true;
            for(int j = 0;j<b.length;j++)
            {
                if(a[a.length-(1+j)] != b[b.length-(1+j)]){
                    encaixa = false;
                    break;
                }
            }
            if(encaixa) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }
    }
}