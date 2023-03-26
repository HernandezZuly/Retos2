import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        int contador = 0;
        Scanner lectura = new Scanner(System.in);
        String [][] palabras = new String [3][3];
        for(int i=0; i<palabras.length; i++){
            for(int j=0; j<palabras.length; j++){
                System.out.println("Digite la palabra en la posición " + i + " " + j);
                palabras[i][j] = lectura.next();
            }
        }
        for(int i=0; i<palabras.length; i++){
            for(int j=0; j<palabras.length; j++){
                System.out.print(palabras[i][j] + "\t");
            }
        System.out.println();
        }
        for (int i=0; i<palabras.length; i++) {
            for (int j=0; j<palabras.length; j++) {
                if (palabras[j][i].equals(palabras[j][i])) {
                    System.out.println("La palabra repetida es " + palabras[i][j]);
                    contador=contador+1;
                } 
                else if(contador==0){
                    System.out.println("No hubo palabras repetidas");
                }
            }   
        }
        lectura.close();
    }
}
