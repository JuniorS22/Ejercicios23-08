import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner into=new Scanner(System.in);
            System.out.println("Ingrese numero");
            int num=into.nextInt();
            System.out.println(resolverFactorial(num));
    }
     static int resolverFactorial(int n){
        int conta=1;
        for (int i=1;i<=n;i++){
            conta=i*conta;
        }
        return conta;
    }
}
