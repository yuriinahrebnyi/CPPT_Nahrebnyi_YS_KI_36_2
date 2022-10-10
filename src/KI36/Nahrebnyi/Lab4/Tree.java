package KI36.Nahrebnyi.Lab4;

public class Tree extends Plant implements DropLeaves
{
    /**
     * Constructor
     *
     * @param name
     * @param age
     * @param length
     */
    public Tree(String name, int age, double length)
    {
        super(name, age, length);
        logger.log(logger.infoFlag + "Tree constructor was called");
    }

    //Перевизначаю інтерфейс
    @Override
    public void ToDropLeaves()
    {
        logger.log(logger.infoFlag + "Tree ToDropLeaves method was called");
        for (int i = 0; i < getAge() * 6; i++)
        {
            leaves[i] = null;
        }
    }

    //Перевизначаю абстрактний метод
    @Override
    public void GrowUp()
    {
        logger.log(logger.infoFlag + "Tree GrowUp method was called was called");
        for (int i = 0; i < age*3; i++)
        {
            branches[i].GrowUp();
        }
        for (int i = 0; i < age*6; i++)
        {
            leaves[i].GrowUp();
        }
    }

    //Перевизначаю абстрактний метод
    @Override
    public void PrintInfo()
    {
        logger.log(logger.infoFlag + "Tree PrintInfo method was called");
        System.out.println("Plant: { name: " + name + "; length: " + length + "s.; age: " + age +" }");
        for (int i = 0; i < age*3; i++)
        {
            branches[i].PrintInfo();
        }
        for (int i = 0; i < age*6; i++)
        {
            leaves[i].PrintInfo();
        }
    }

    //Перевизначаю абстрактний метод
    @Override
    public void Wither()
    {
        logger.log(logger.infoFlag + "Plant Wither was called");
        for (int i = 0; i < age * 6; i++)
        {
            leaves[i].Wither();
        }

    }
}
