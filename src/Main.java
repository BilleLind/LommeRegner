import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("mine fede lommeregner");

        LommeRegner lommeregner = new LommeRegner();

        System.out.println("Hvad vil du lægge sammen ?");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(lommeregner.sum(a, b));

        System.out.println("Hvad vil du trække fra hinanden? ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println(lommeregner.minus(c, d));

        System.out.println("Hvad vil du Multiplikere? ");
        double e = input.nextDouble();
        double f = input.nextDouble();
        System.out.println(lommeregner.multiplikere(e, f));

        System.out.println("Hvad vil du Dele? ");
        double g = input.nextDouble();
        double h = input.nextDouble();
        System.out.println(lommeregner.dele(g, h));





    }
}
