package patikadev;
import java.util.Scanner;
public class yildizUcgen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("bir sayı giriniz:");
        n = in.nextInt();

        for (int i=0;i<=n;i++){
            for (int k =0;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int t =1;t<=(2 * i -(1));t++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=n-1;i>=0;i--){
            for (int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for (int t=1;t<=2*i+1;t++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
