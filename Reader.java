import java.util.Scanner;

/**
 * Created by Юра on 24.05.2018.
 */
public class Reader {
    public static void main(String[] args) throws Exception {
        double saveResult = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            Calculate calculate = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Please enter a first number");
                double first;
                if (saveResult == 0) {
                    first = Integer.parseInt(scanner.nextLine());
                } else {
                    first = saveResult;
                    System.out.println("First number is " + first);
                }
                System.out.println("Please enter a second number");
                int second = Integer.parseInt(scanner.nextLine());

                System.out.println("Please select an action");
                String deistvie = scanner.nextLine();
                switch (deistvie) {
                    case "+":
                        calculate.summa(first, second);
                        break;

                    case "-":
                        calculate.vichitanie(first, second);
                        break;

                    case "*":
                        calculate.proizv(first, second);
                        break;

                    case "/":
                        calculate.delenie(first, second);
                        break;
                    case "^":
                        calculate.stepen(first, second);
                        break;
                }
                saveResult = calculate.getResult();
                System.out.println(saveResult);
                calculate.cleanResult();
                System.out.println("Exit: yes/no");
                exit = scanner.nextLine();
                System.out.println("Do you want to use previous result? yes/no");
                String choice = scanner.nextLine();
                saveResult = usePreviousResult(choice, saveResult);
            }
            scanner.close();
        }
        catch (Exception e){
            scanner.close();
            throw new Exception("Ooops... something went wrong!");
        }

    }

    public static double usePreviousResult(String choice, double result) {
        if (choice.equals("no")) {
            return 0;
        } else {
            return result;
        }
    }
}
