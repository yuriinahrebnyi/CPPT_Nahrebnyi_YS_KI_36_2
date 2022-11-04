package KI36.Nahrebnyi.Lab7;

public class Main
{
    public static void main(String[] args)
    {
        Building<? super Room> building = new Building<>();

        building.AddItem(new Flat(45.4, 4, 3));
        building.AddItem(new Flat(41.2, 7, 2));
        building.AddItem(new Flat(22.6, 6, 3));
        building.AddItem(new Flat(85.2, 2, 5));
        building.AddItem(new Duplex(45.4, 4, 334567, 3));
        building.AddItem(new Duplex(127.4, 9, 100000, 5));
        building.AddItem(new Duplex(109.2, 10, 902000, 4));
        building.AddItem(new Duplex(134.9, 15, 33456227, 6));
        building.AddItem(new Duplex(121.4, 10, 9630000, 4));

        var max = building.FindMax();
        System.out.println("All buildings: ");
        building.PrintAllItems();

        System.out.print("Max element: ");
        max.PrintInfo();
    }
}