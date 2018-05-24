public class Calculate {
    private double result;

    public void summa(int first, int second)
    {
        result = first + second;
    }
    public void vichitanie(int first, int second)
    {
        result = first - second;
    }

    public void proizv(int first, int second)
    {
        result = first * second;
    }

    public void delenie(double first, double second)
    {
        result = (first / second) + (first % second);
    }

    public void stepen(int first, int second)
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