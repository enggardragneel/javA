package program.mat;
import java.util.Scanner;

public class Matematika {
    public static double volBalok(double p, double l, double t){
        double v = p * l * t;
        return v;
    }

    public static double luasSegitiga(double a, double t){
        double l = (double)1/2 * a * t;
        return l;
    }

    public static double volKerucut(double r, double t){
        double v = (double)1/3 * Math.PI * Math.pow(r,2) * t;
        return v;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String lagi;

        do {
            System.out.println("\n\tMenu Utama");
            System.out.println("==========================");
            System.out.println("1. Volume Balok");
            System.out.println("2. Luas Segitiga");
            System.out.println("3. Volume Kerucut");
            System.out.println("==========================");
            System.out.print("Silahkan pilih [1,2,3] : ");

            short pilih = userInput.nextShort();
            switch (pilih) {
                case 1:
                    double pb, lb, tb;
                    System.out.print("\nMasukkan panjang balok : ");
                    pb = userInput.nextDouble();
                    System.out.print("Masukkan lebar balok : ");
                    lb = userInput.nextDouble();
                    System.out.print("Masukkan tinggi balok : ");
                    tb = userInput.nextDouble();
                    System.out.println("Volume balok adalah : " + volBalok(pb, lb, tb));
                    break;

                case 2:
                    double as, ts;
                    System.out.print("\nMasukkan panjang alas segitiga : ");
                    as = userInput.nextDouble();
                    System.out.print("Masukkan tinggi segitiga : ");
                    ts = userInput.nextDouble();
                    System.out.println("Luas segitiga adalah : " + luasSegitiga(as, ts));
                    break;

                case 3:
                    double r, tk;
                    System.out.print("\nMasukkan jari jari kerucut : ");
                    r = userInput.nextDouble();
                    System.out.print("Masukkan tinggi kerucut : ");
                    tk = userInput.nextDouble();
                    System.out.println("Volume kerucut adalah : " + volKerucut(r, tk));
                    break;

                default:
                    System.out.println("Tolong pilih menu yang tersedia");
                    break;
            }

            System.out.print("\nApakah anda ingin mengulang perhitungan (y/n) ? ");
            lagi = userInput.next();
        }while(lagi.equalsIgnoreCase("y"));


    }
}
