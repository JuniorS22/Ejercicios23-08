import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        int edad,condi;
        System.out.println("Ingrese la edad del usuario");
        edad=into.nextInt();
        if (edad>=15){
            System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:");
            condi=into.nextInt();
            if (condi==1){
                System.out.println("El invitado si puede ingresar a la fiesta");
            } else if (condi==0) {
                System.out.println("El invitado no puede ingresar a la fiesta");
            }else{
                System.out.println("POR FAVOR DEBE INGRESAR EL NUMERO 1 o 0");
            }
        } else if (edad<15) {
            System.out.println("El invitado si puede ingresar a la fiesta");

        }
    }
}
