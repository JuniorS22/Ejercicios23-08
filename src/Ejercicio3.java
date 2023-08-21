import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        final int pagofijo=10;
        double pagos=0;
        System.out.println("Ingrese litros de agua");
        int litros=into.nextInt();
        if (litros<=50){
            pagos=pagofijo;
        } else if (litros>=51 && litros<=200) {
            pagos=pagofijo+0.5 * (litros-50);
        } else if (litros>200) {
            pagos=pagofijo+0.5 * (litros-50)+ 1.5*(litros-200);
        }
        System.out.println("$ "+pagos);
    }
}
