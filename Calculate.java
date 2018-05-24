import java.util.Scanner;
public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an action");
        String deistvie = scanner.nextLine();
        System.out.println("Please enter a first number");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a second number");
        int second = Integer.parseInt(scanner.nextLine());
        switch (deistvie) {
            case "+":
                System.out.println("Result = " + summa(first, second));
                break;

            case "-":
                System.out.println("Result = " + vichitanie(first, second));
                break;

            case "*":
                System.out.println("Result = " + proizv(first, second));
                break;

            case "/":
                System.out.println("Result = " + delenie(first, second));
                break;
            case "^":
                System.out.println(stepen(first, second));
                break;
        }
    }

    public static int summa(int first, int second)
    {
        return first + second;
    }
    public static int vichitanie(int first, int second)
    {
        return first - second;
    }

    public static int proizv(int first, int second)
    {
        return first * second;
    }

    public static double delenie(double first, double second)
    {
        return (first / second) + (first % second);
    }

    public static int stepen(int first, int second)
    {
        return (int) Math.pow(first,second);
    }
}