import java.util.Scanner;
public class Calculate {

    public static void main(String[] args) {
        System.out.println("Please select an action");
        Scanner scanner = new Scanner(System.in);
        String deistvie = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        switch (deistvie) {
            case "+":
                System.out.println(summa(first, second));
                break;

            case "-":
                System.out.println(vichitanie(first, second));
                break;

            case "*":
                System.out.println(proizv(first, second));
                break;

            case "/":
                System.out.println(delenie(first, second));
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