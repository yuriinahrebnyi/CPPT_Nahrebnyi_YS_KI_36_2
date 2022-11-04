package KI36.Nahrebnyi.Lab6;

public class Main
{
    public static void main(String[] args)
    {
        Calculation calculation = new Calculation();

        double result = calculation.Calculate(3); // рахуємо приклад
        String fileNameTXT = "1.txt";
        String fileNameBIN = "1.bin";

        WRResults.WriteInTXT(fileNameTXT, result); // записуємо результати
        WRResults.WriteInBIN(fileNameBIN, result);

        System.out.println("Result from TXT file: " + WRResults.ReadFromTXT(fileNameTXT)); // виводимо результати
        System.out.println("Result from BIN file: " + WRResults.ReadFromBIN(fileNameBIN));
    }
}