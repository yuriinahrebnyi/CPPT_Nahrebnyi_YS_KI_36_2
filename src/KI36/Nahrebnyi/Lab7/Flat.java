package KI36.Nahrebnyi.Lab7;

/**
 * Class Flat that implements interface Room
 */
public class Flat implements Room //клас, який реалізує заданий інтерфейс
{
    private double area;
    private int floor;
    private int numberOfRooms;

    /**
     * Constructor
     * @param area
     * @param floor
     * @param numberOfRooms
     */
    public Flat(double area, int floor, int numberOfRooms)
    {
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Overrided method getArea
     * @return area
     */
    @Override
    public double getArea()
    {
        return area;
    }

    /**
     *Overrided method PrintInfo
     */
    @Override
    public void PrintInfo()
    {
        System.out.println("Flat: -area: " + area + "; -floor: " + floor + "; -number of rooms: " + numberOfRooms);
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
     * Getter for floor
     * @return floor
     */
    public int getFloor()
    {
        return floor;
    }

    /**
     * Setter for floor
     * @param floor
     */
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    /**
     * Getter for number of rooms
     * @return
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
}
