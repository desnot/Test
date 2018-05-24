import java.util.Scanner;

/**
 * Created by Юра on 24.05.2018.
 */
public class Reader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            Calculate calculate = new Calculate();
            String exit = "no";
            while (!exit.equals("yes"))
            {
                System.out.println("Please select an action");
                String deistvie = scanner.nextLine();
                System.out.println("Please enter a first number");
                int first = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter a second number");
                int second = Integer.parseInt(scanner.nextLine());
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
                System.out.println(calculate.getResult());
                calculate.cleanResult();
                System.out.println("Exit: yes/no");
                exit = scanner.nextLine();
            }
        }
        finally {
            scanner.close();
        }

    }
}
