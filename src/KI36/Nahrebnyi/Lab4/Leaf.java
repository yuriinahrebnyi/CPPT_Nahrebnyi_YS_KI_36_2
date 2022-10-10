package KI36.Nahrebnyi.Lab4;

import java.util.Random;

/**
 * Class Leaf
 * @version 1.0
 * @author Yura
 */
public class Leaf
{
    private String color;
    private double length;
    private Logger logger = Logger.getLogger();

    /**
     * Constructor
     * @param color
     */
    public Leaf(String color)
    {
        logger.log(logger.infoFlag + "Leaf constructor was called");
        this.color = color;
        Random random = new Random();
        this.length = random.nextDouble(10);
    }

    /**
     * Getter for color
     * @return color
     */
    public String getColor()
    {
        logger.log(logger.infoFlag + "Leaf getColor was called");
        return color;
    }

    /**
     * Setter for color
     * @param color
     */
    public void setColor(String color)
    {
        logger.log(logger.infoFlag + "Leaf setColor was called");
        this.color = color;
    }

    /**
     * Getter for length
     * @return length
     */
    public double getLength()
    {
        logger.log(logger.infoFlag + "Leaf setLength was called");
        return length;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length)
    {
        logger.log(logger.infoFlag + "Leaf getColor was called");
        this.length = length;
    }

    /**
     * Method Wither
     */
    void Wither()
    {
        logger.log(logger.infoFlag + "Leaf Wither method was called");
        this.color = "Yellow";
        System.out.println("Autumn came and the leaves withered");
    }

    /**
     * Method GrowUp
     */
    void GrowUp()
    {
        logger.log(logger.infoFlag + "Leaf GrowUp method was called");
        Random random = new Random();
        double grow = random.nextDouble(10);
        this.length +=  grow;

        System.out.println("Leaf grow up " + grow + "s.");
    }

    /**
     * Method PrintInfo
     */
    void PrintInfo()
    {
        logger.log(logger.infoFlag + "Leaf PrintInfo was called");
        System.out.println("Leaf: { length: " + length +" s.; color: " + color + " }");
    }
}
