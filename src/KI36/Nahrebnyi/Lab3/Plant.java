package KI36.Nahrebnyi.Lab3;

/**
 * Lab 3. Class Plant
 */
public class Plant
{
    private String name;
    private int age;
    private double length;
    private Leaf[] leaves = null;
    private Branch[] branches = null;
    private Logger logger = Logger.getLogger("logs.txt");

    /**
     * Constructor
     * @param name
     * @param age
     * @param length
     */
    public Plant(String name, int age, double length) //Конструктор
    {
        logger.log(logger.infoFlag + "Plant constructor was called");
        this.name = name;
        this.age = age;
        this.length = length;

        // Тут ми просто заповнюємо масив об'єктів Листок
        leaves = new Leaf[age * 6];
        for (int i = 0; i < age * 6; i++)
        {
            leaves[i] = new Leaf("green");
        }

        // Тут ми просто заповнюємо масив об'єктів Гілка
        branches = new Branch[age * 3];
        for (int i = 0 ; i< age * 3; i++)
        {
            branches[i] = new Branch();
        }
    }

    /**
     * Getter for name
     * @return name
     */
    public String getName()
    {
        logger.log(logger.infoFlag + "Plant getName was called");
        return name;
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name)
    {
        logger.log(logger.infoFlag + "Plant setName was called");
        this.name = name;
    }

    /**
     * Getter for Age
     * @return age
     */
    public int getAge()
    {
        logger.log(logger.infoFlag + "Plant getAge was called");
        return age;
    }

    /**
     * Setter for Age
     * @param age
     */
    public void setAge(int age)
    {
        logger.log(logger.infoFlag + "Plant setAge was called");
        this.age = age;
    }

    /**
     * Getter for leaves
     * @return leaves
     */
    public Leaf[] getLeaves()
    {
        logger.log(logger.infoFlag + "Plant getLeaves was called");
        return leaves;
    }

    /**
     * Setter for leaves
     * @param leaves
     */
    public void setLeaves(Leaf[] leaves)
    {
        logger.log(logger.infoFlag + "Plant setLeaves was called");
        this.leaves = leaves;
    }

    /**
     * Getter for branches
     * @return branches
     */
    public Branch[] getBranches()
    {
        logger.log(logger.infoFlag + "Plant getBranches was called");
        return branches;
    }

    /**
     * Setter for branches
     * @param branches
     */
    public void setBranches(Branch[] branches)
    {
        logger.log(logger.infoFlag + "Plant setBranches was called");
        this.branches = branches;
    }

    /**
     * Getter for length
     * @return length
     */
    public double getLength()
    {
        logger.log(logger.infoFlag + "Plant getLength was called");
        return length;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length)
    {
        logger.log(logger.infoFlag + "Plant setLength was called");
        this.length = length;
    }

    /**
     * Method to grow up
     */
    public void GrowUp()
    {
        logger.log(logger.infoFlag + "Plant GrowUp method was called was called");
        for (int i = 0; i < age*3; i++) //Тут ми викликаємо по-черзі у всіх гілок і всіх листків метод Рости
        {
            branches[i].GrowUp();
        }
        for (int i = 0; i < age*6; i++)
        {
            leaves[i].GrowUp();
        }
    }

    /**
     * Method to print info
     */
    public void PrintInfo()
    {
        logger.log(logger.infoFlag + "Plant PrintInfo method was called");
        System.out.println("Plant: { name: " + name + "; length: " + length + "s.; age: " + age +" }");
        for (int i = 0; i < age*3; i++) //Тут ми викликаємо по-черзі у всіх гілок і всіх листків метод ВивестиІнформацію
        {
            branches[i].PrintInfo();
        }
        for (int i = 0; i < age*6; i++)
        {
            leaves[i].PrintInfo();
        }
    }

    /**
     * Method to Wither
     */
    public void Wither()
    {
        logger.log(logger.infoFlag + "Plant Wither was called");
        for (int i = 0; i < age * 6; i++) //Тут ми викликаємо по-черзі у всіх листків метод В'янути
        {
            leaves[i].Wither();
        }
    }
}
