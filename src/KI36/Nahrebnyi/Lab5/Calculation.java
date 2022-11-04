package KI36.Nahrebnyi.Lab5;

/**
 * Class Calculation
 *
 * @author Serhii
 * @version  1.0
 * Клас для прорахування прикладу
 */
public class Calculation
{
    /**
     * Method Calculate
     * @param x
     * @return y
     * Метод, який рахує
     */
    public double Calculate(int x)
    {
        double y = 0, rad, tgX = 0;
        rad = x * Math.PI / 180.0;
        try
        {
            if (x == 0 || rad == Math.PI / 2 || rad == 3*Math.PI / 2) // Якщо х є нулем, кидаємо помилку, бо на нуль ділити не можна. Також кидаємо полику,  якщо для такого значення х неіснує тангенса
            {
                throw new ArithmeticException();
            }
            tgX = (Math.sin(x)) / Math.cos(x); // Тут рахуємо тангенс
            y = tgX / (3 * x);  // Тут вже цілий приклад
            if (y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY) // кидаємо помилку, якщо результат є нескінченність
            {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) // Ловим помилки і виводим причину помилки
        {
            if (rad == Math.PI / 2 || rad == 3*Math.PI / 2)
            {
                throw new MyException("Exception reason: Illegal value of X for tangent calculation");
            }
            if (x == 0)
            {
                throw new MyException("Exception reason: 3*x = 0");
            }
        }
        return y;
    }
}
