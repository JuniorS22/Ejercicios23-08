import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        String con="";
        System.out.println("Ingrese numero");
        int num=into.nextInt();
        for (int i=0;i<num;i++){
            con+="*";
            System.out.println(con);
        }
    }
}
