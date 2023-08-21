import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        System.out.println("Ingrese numero");
        String a="";
        int num=into.nextInt();
        int mayor=0;
        int[] num2=new int[num];
        for (int i=0;i<num;i++){
            num2[i]=(int)Math.floor(Math.random()*100+1);
            mayor=Math.max(num2[i],mayor);
            a+=num2[i]+",";
        }
        System.out.println("{"+a+"}");
        System.out.printf("El numero mayor es : " + mayor);
    }
}
