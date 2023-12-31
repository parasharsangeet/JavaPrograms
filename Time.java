import java.util.Scanner;

public class Time {

    int hr, min, sec;

    public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hours, mins and seconds");
        hr = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();

        sc.close();
    }

    public void convert() {
        sec = hr * 60 * 60 + min * 60 + sec;
    }

    public void show() {
        System.out.println("Time in seconds: " + sec);
    }

    public static void main(String[] args) {
        Time obj = new Time();

        obj.input();
        obj.convert();
        obj.show();
    }

}
