import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num=into.nextInt();
        for (int i=0;i<num;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
