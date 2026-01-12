import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage: ");
        double volt = sc.nextDouble();

        System.out.print("Enter ampere: ");
        double ampere = sc.nextDouble();

        double watts = volt * ampere;

        System.out.println("Power in Watts = " + watts);
    }
}
