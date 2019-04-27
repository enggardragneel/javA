package program.suhu;
import java.io.IOException;
import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) throws IOException {
        double fh, rm, kv;
        String lagi;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("\nMasukkan Suhu Celcius : ");
            double bil = userInput.nextDouble();

            rm = (double)4/5 * bil;
            fh = (double)9/5 * bil + 32;
            kv = bil + 273.15;

            System.out.println("=======Konversi=======");
            System.out.println("Fahrenheit : " + fh);
            System.out.println("Reamur : " + rm);
            System.out.println("Kelvin : " + kv);
            System.out.println("======================");
            System.out.print("Ingin mencoba lagi (y) ? : ");
            lagi = userInput.next();
        }while(lagi.equalsIgnoreCase("y"));



    }
}
