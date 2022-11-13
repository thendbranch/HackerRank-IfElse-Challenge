import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz : ");
        int n = input.nextInt();

        if (n>=1 && n<=100){
            if (n == 1){
                System.out.println("Weird");
            } else if (n % 2 == 1) {
                System.out.println("Weird");
            } else if (n>=2 && n<=5) {
                System.out.println("Not Weird");
            } else if (n>=6 && n<=20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Geçerli Sayı Giriniz.. (1-100 arası)");
        }
    }
}