package lab2;
import java.io.*;
import java.util.*;

/**
 * Клас Lab2NahrebnyiKI36 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Yura
 * @version 1.0
 */
public class Lab2NahrebnyiKI36
{
    /**
     * Статичний метод main є точкою входу в програму
     * @param args
     */
    public static void main(String[] args)
    {
        int SIZE;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = null;
        PrintWriter fout = null;

        try
        {
            dataFile = new File("MyFile.txt"); // відкриваємо файл для запису матриці у нього
            fout = new PrintWriter(dataFile);

            System.out.print("Введіть розмір матриці: ");
            SIZE = in.nextInt();
            in.nextLine();
            if (SIZE < 8) // якщо у нас розмір матриці менший ніж 8, кидаєм помилку
            {
                throw new MyExceptions("Ви ввели надто малий розмір матриці");
            }

            char [][] arr = new char[SIZE][]; // Створюєм двовимірний зубчастий масив (тобто рядків у ньому буде стільки, який розмір ми ввели)
            for(int i = 0; i < SIZE; i++)
            {
                arr[i] = new char[SIZE - i]; // тут створюєм самі рядки і розмір кожного наступного рядка менший від попереднього на один
            }

            System.out.print("\nВведіть символ-заповнювач: ");
            filler = in.nextLine(); //тут просимо користувача ввести символ, яким буде заповнена матриця
            if (filler.length() > 1) //якщо користувач ввів більше ніж один символ, кидаєм помилку
            {
                throw new MyExceptions("Ви ввели надто багато символів для заповнення");
            }

            for (int i = 0; i < SIZE; i++)
            {
                for (int j = 0 ; j < SIZE - i; j++) // тут цикл працює по тій самі логіці, що і коли ми створєум рядки. Тобто він робить стільки кроків, як кожен раз на один менше ніж минулого
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    fout.print(arr[i][j] + " "); // тут ми просто виводим цю матрицю на екран
                    System.out.print(arr[i][j] + " "); // тут записуєм її у файл
                }
                fout.println();
                System.out.println();
            }
        } //У цих двох блоках ми ловимо помилки, які ми кидали раніше
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (MyExceptions ex)
        {
            System.err.println(ex.getMessage());
        }
        finally // тут ми просто закриваєм файл, який раніше відкрили
        {
            fout.flush();
            fout.close();
        }
    }

}