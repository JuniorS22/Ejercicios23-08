import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);
        int horas, horasextras,horasextras2, sueldofinal=0;
        System.out.println("Ingrese horas trabajadas");
        horas = into.nextInt();
        if (horas > 40 && horas <= 48) {
            horasextras = (horas - 40) * 80;
            sueldofinal = horasextras + (40 * 40);
        } else if (horas > 48) {
            horasextras = (horas - 40);

            if (horasextras <= 8) {
                horasextras = (horas - 40) * 80;
                sueldofinal = horasextras + (40 * 40);

            } else if (horasextras > 8) {
                horasextras = (horas - 48) * 120;
                horasextras2 = 8 * 80;
                sueldofinal = (horasextras + horasextras2)+(40*40);
            }
        }else {
            sueldofinal=40*horas;
        }

        System.out.println("Su sueldo final es: s/. "+sueldofinal );
    }
}