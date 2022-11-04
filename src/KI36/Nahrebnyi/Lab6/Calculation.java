package KI36.Nahrebnyi.Lab6;

/**
 * Class Calculation
 *
 * @author Serhii
 * @version  1.0
 */
public class Calculation //Тут все те саме, що і в минулій
{
    /**
     * Method Calculate
     * @param x
     * @return y
     */
    public double Calculate(int x)
    {
        double y = 0, rad, tgX = 0;
        rad = x * Math.PI / 180.0;
        try
        {
            if (x == 0)
            {
                throw new ArithmeticException();
            }
            tgX = (Math.sin(x)) / Math.cos(x);
            y = tgX / (3 * x);
            if (y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY)
            {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e)
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
