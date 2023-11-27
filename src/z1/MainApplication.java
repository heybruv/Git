package z1;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your day : ");
        int day = scanner.nextInt();
        System.out.print("Input your month (ex.:January,February,March): ");
        String month = scanner.next();
        ZodiacDate myDate = new ZodiacDate(day, month);



        myDate.ZodGuesser();
    }
}
