import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Min;
        System.out.println(("Enter numl :"));
        int n1 = scan.nextInt();
        Min = n1;

        System.out.println("Enter num2");
        int n2 = scan.nextInt();
        if (n2 < Min) {
            Min = n2;
        }

        System.out.println("Enter num2");
        int n3 = scan.nextInt();
        if (n3 < Min) {
            Min = n3;

        }
        System.out.println("Miniul number is " + Min);
        scan.close();

    }
}

