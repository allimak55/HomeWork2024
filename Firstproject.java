import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int num = in.nextInt();
        String rem = "";
        while(num != 0) {
            rem = num % 2 + rem;
            num /= 2;
        }
        out.print(rem);
    }
}
