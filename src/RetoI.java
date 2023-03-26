import java.util.Scanner;

public class RetoI {
    public static void main(String[] args) {
        int cantidadNumero, operacion=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el total de numeros que va a digitar");
        cantidadNumero=lectura.nextInt();
        int [] numero = new int [cantidadNumero];
            for(int i=0; i<cantidadNumero; i++){
                System.out.println("Escriba un numero");
                numero[i]=lectura.nextInt();
            }
            for (int i=0; i<cantidadNumero; i++){
                operacion=numero[i]%2;
                if(operacion == 0){
                    System.out.println("El numero " + numero[i] + " es multiplo de 2");
                } else {
                    System.out.println("El numero " + numero[i] + " no es multiplo de 2");
                } 
            }
        lectura.close();    
    }   
}
