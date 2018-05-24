public class Calculate {
    private double result;

    public void summa(double first, double second)
    {
        result = first + second;
    }
    public void vichitanie(double first, double second)
    {
        result = first - second;
    }

    public void proizv(double first, double second)
    {
        result = first * second;
    }

    public void delenie(double first, double second)
    {
        result = (first / second) + (first % second);
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