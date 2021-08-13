import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature(e.g.,10.0 C or 20.0 F)");

        String line = scanner.nextLine();

        if (line.indexOf("F")!= -1) {
            String Fahrenheit = line;
            Fahrenheit = Fahrenheit.replace("F", "");
            float Celsius = (Float.parseFloat(Fahrenheit) - 32) * 5 / 9;
            System.out.printf("The converted temperature is %5.2f C.", Celsius);
        } else if (line.indexOf("C")!= -1) {
            String Celsius = line;
            Celsius = Celsius.replace("C", "");
            float Fahrenheit = Float.parseFloat(Celsius) * 9 / 5 + 32;
            System.out.printf("The converted temperature is %5.2f F.", Fahrenheit);
        } else {
            System.out.println("Please enter the correct temperature format");
        }

    }


}
