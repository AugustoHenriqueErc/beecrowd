import java.util.Scanner;
class Timer
{
    private int seconds;
    private int minutes;
    private int hours;
    public Timer(int seconds)
    {
        this.seconds = seconds;
        setTime();
    }

    public void setTime()
    {
        minutes = seconds/60;
        if(seconds >= 60) seconds = seconds % 60;
        hours = minutes/60;
        if(minutes >= 60) minutes = minutes % 60;
    }
    @Override
    public String toString()
    {
        return String.valueOf(hours)+":"+String.valueOf(minutes)+":"+String.valueOf(seconds);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int seconds = scr.nextInt();
        Timer timer = new Timer(seconds);
        System.out.println(timer.toString());
    }
}
