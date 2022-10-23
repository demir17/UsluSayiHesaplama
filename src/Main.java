import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k, temp = 1;

        System.out.println("Bir sayı giriniz:");
        n = sc.nextInt();

        System.out.println("Üssünü giriniz:");
        k = sc.nextInt();

        for(int i = 1;i<= k; i++ ){
            temp *= n;
        }
        System.out.println(temp);

    }
}
