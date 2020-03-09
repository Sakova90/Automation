package lessonVariable;

import java.util.Scanner;

public class Lesson3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a:");
        String ReadFromConsoleA = scanner.nextLine();
        System.out.print("Please, enter b:");
        String ReadFromConsoleB = scanner.nextLine();
        //System.out.println("Text: "+ stringIReadFromConsole);
        Integer ConverterStringA = Integer.parseInt(ReadFromConsoleA);
        Integer ConverterStringB = Integer.parseInt(ReadFromConsoleB);

        System.out.println("\033[30m Result a+b: "+ (ConverterStringA+ConverterStringB));
        System.out.println("\033[35m Result a-b: "+ (ConverterStringA-ConverterStringB));





    }
}
