import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num=into.nextInt();
        String a="";
        int[] num2=new int[num];
        for (int i=0;i<num;i++){

            System.out.println("Ingrese dato en la posicion " + i + " del array" );
            num2[i]=into.nextInt();
        }
        for (int i = num - 1; i >= 0; i--) {
            a += num2[i] + " ";
        }
        System.out.println(a);
    }
}
