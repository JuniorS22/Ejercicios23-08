import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
        int aleatorio=(int)Math.floor(Math.random()*100+1);
        System.out.println(aleatorio);
        int conta=0,num=0;
        do{

            System.out.println("Ingrese numero");
            num=into.nextInt();
            if (num<aleatorio){
                System.out.println("Número demasiado bajo, intenta nuevamente");
            } else if (num>aleatorio) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            }
            conta++;
        }while (aleatorio!=num);
        System.out.println("¡Felicidades! ¡Haz adivinado el número!");
        System.out.println("Usted hizo " + conta+ " intentos");
    }
}
