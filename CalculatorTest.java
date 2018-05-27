import org.junit.Test;

/**
 * Created by Юра on 27.05.2018.
 */
public class CalculatorTest {
    private Calculate calculate = new Calculate();

    @Test
    public void testSumma() {
        calculate.summa(10, 2);
        System.out.println(calculate.getResult());
    }

    @Test
    public void testVichitanie() {
        calculate.vichitanie(10, 2);
        System.out.println(calculate.getResult());
    }

    @Test
    public void testProizvedenie() {
        calculate.proizvedenie(10, 2);
        System.out.println(calculate.getResult());
    }

    @Test
    public void testDiv() {
        calculate.div(10, 2);
        System.out.println(calculate.getResult());
    }

    @Test
    public void testStepen() {
        calculate.stepen(10, 2);
        System.out.println(calculate.getResult());
    }
}