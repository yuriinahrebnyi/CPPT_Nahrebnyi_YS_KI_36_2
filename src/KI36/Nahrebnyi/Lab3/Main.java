package KI36.Nahrebnyi.Lab3;

/**
 * Main class
 *
 * @author Yura
 * @version 1.0
 */
public class Main
{
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args)
    {
        Plant plant = new Plant("Plant", 1, 19.2);

        plant.GrowUp();
        System.out.println("---------------------------------------------");
        plant.PrintInfo();
        System.out.println("---------------------------------------------");
        plant.Wither();
        System.out.println("---------------------------------------------");
        plant.PrintInfo();
    }
}