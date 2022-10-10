package KI36.Nahrebnyi.Lab4;

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
        Tree tree = new Tree("Tree", 1, 19.2);

        tree.GrowUp();
        System.out.println("---------------------------------------------");
        tree.PrintInfo();
        System.out.println("---------------------------------------------");
        tree.Wither();
        System.out.println("---------------------------------------------");
        tree.PrintInfo();
    }
}