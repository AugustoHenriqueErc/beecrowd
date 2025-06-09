import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String word = scr.nextLine();
        do
        {
            char[]w = word.toCharArray();
            for(int i = 0; i<w.length;i++) {
                if(i == 0) w[i] = Character.toUpperCase(w[i]);
                else {
                    if(Character.isUpperCase(w[i-1])) w[i] = Character.toLowerCase(w[i]);
                    else w[i] = Character.toUpperCase(w[i]);
                }
            }
            System.out.println(new String(w));
            word = scr.nextLine();
        }while (scr.hasNextLine());
    }
}