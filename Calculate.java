public class Calculate {
    private static double result;

    public void summa(double first, double second)
    {
        result = first + second;
    }
    public void vichitanie(double first, double second)
    {
        result = first - second;
    }
    public void proizvedenie(double first, double second)
    {
        result = first * second;
    }
    public void div(double first, double second) throws ArithmeticException  {
        if (second != 0) {
            result = (first / second) + (first % second);
        }

        else {
            throw new ArithmeticException("You tried to divide by 0");
        }

    }
    public void stepen(double first, double second)
    {
        result = (int) Math.pow(first,second);
    }
    public double getResult()
    {
        return this.result;
    }
    public double cleanResult()
    {
        return this.result = 0;
    }
}