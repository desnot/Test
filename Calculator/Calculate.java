class Calculate {
    private static double result;

    void summa(double first, double second)
    {
        result = first + second;
    }
    void vichitanie(double first, double second)
    {
        result = first - second;
    }
    void proizvedenie(double first, double second)
    {
        result = first * second;
    }
    void div(double first, double second) throws ArithmeticException  {
        if (second != 0) {
            result = (first / second) + (first % second);
        }

        else {
            throw new ArithmeticException("You tried to divide by 0");
        }

    }
    void stepen(double first, double second)
    {
        result = (int) Math.pow(first,second);
    }
    double getResult()
    {
        return result;
    }
    void cleanResult()
    {
        result = 0;
    }
}