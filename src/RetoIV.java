import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); 
        String [][] nombrePro = new String [4][4];
        int [][] precio = new int [4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("Digite el nombre del producto en la posición " + i + " " + j);
                nombrePro[i][j] = lectura.next();
                System.out.println("Digite el precio del producto");
                precio[i][j] = lectura.nextInt();
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(i+" " + j + "\t");
            } System.out.println();
            for(int j=0; j<4; j++){   
                System.out.print(nombrePro[i][j] + "\t");
            } System.out.println();
            for(int j=0; j<4; j++){
                System.out.print(precio[i][j] + "\t");
            } System.out.println();
        }
        lectura.close();
    }
}
