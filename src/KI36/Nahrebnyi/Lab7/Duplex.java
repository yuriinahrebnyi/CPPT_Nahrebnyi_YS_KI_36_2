package KI36.Nahrebnyi.Lab7;

/**
 * Class Duplex implements Room
 */
public class Duplex implements Room
{ // Клас, який реалізує інтерфейс
    private double area;
    private int floor;
    private int numberOfRooms;
    private double price;


    /**
     * Constructor
     * @param area
     * @param floor
     * @param price
     * @param numberOfRooms
     */
    public Duplex(double area, int floor, double price, int numberOfRooms)
    {
        this.area = area;
        this.floor = floor;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Setter for area
     * @param area
     */
    public void setArea(double area)
    {
        this.area = area;
    }

    /**
     * Getter for floors
     * @return floor
     */
    public int getFloor()
    {
        return floor;
    }

    /**
     * Setter for floors
     * @param floor
     */
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    /**
     * Getter for price
     * @return price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Setter for price
     * @param price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * getter for number of rooms
     * @return rooms
     */
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    /**
     * Setter for rooms
     * @param numberOfRooms
     */
    public void setNumberOfRooms(int numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Overrided method for area
     * @return
     */
    @Override
    public double getArea()
    {
        return area;
    }

    /**
     * Overrided method PrintInfo
     */
    @Override
    public void PrintInfo()
    {
        System.out.println("Duplex: -area: " + area + "; -floor: " + floor + "; -number of rooms: " + numberOfRooms + "; -price: " + price);
    }
}
