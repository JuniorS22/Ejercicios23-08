import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num=into.nextInt();
        int[] num2=new int[num];
        for (int i=0;i<num;i++){
            num2[i]=(int)Math.floor(Math.random()*1000+1);;
            System.out.println("El elemento " + i + " es: " + num2[i]);
        }
    }
}
