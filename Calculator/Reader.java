import java.util.Scanner;

/**
 * Created by Юра on 24.05.2018.
 */
public class Reader {
    static Scanner scanner = new Scanner(System.in);
    static Calculate calculate = new Calculate();
    static boolean isResult = false;
    public static void main(String[] args) throws Exception {
        try {
            double first;
            double saveResult = 0;
            String exit;
            while (true) {
                if (!isResult) {
                    System.out.println("Please enter a first number");
                    first = Integer.parseInt(scanner.nextLine());
                } else {
                    first = saveResult;
                    System.out.println("The first number is a " + first);
                }
                System.out.println("Please enter a second number");
                double second = Integer.parseInt(scanner.nextLine());
                System.out.println("Please select an action");
                String action = scanner.nextLine();
                choixAction(first, second, action);
                System.out.println(calculate.getResult());
                System.out.println("Exit? yes/no");
                exit = scanner.nextLine();
                if (exit.equals("yes")) {
                    scanner.close();
                    break;
                }
                saveResult = calculate.getResult();
                usePreviousResult();
                calculate.cleanResult();
            }
        } catch (Exception e) {
            scanner.close();
            throw e;
        }
    }

    public static boolean usePreviousResult() {
        System.out.println("Do you want to use previous result? yes/no");
        String choice = scanner.nextLine();
        if (choice.equals("no")) {
            return isResult = false;
        } else {
            return isResult = true;
        }
    }

    public static void choixAction(double first, double second, String deistvie) {
        switch (deistvie) {
            case "+":
                calculate.summa(first, second);
                break;

            case "-":
                calculate.vichitanie(first, second);
                break;

            case "*":
                calculate.proizvedenie(first, second);
                break;

            case "/":
                calculate.div(first, second);
                break;
            case "^":
                calculate.stepen(first, second);
                break;
        }
    }
}
