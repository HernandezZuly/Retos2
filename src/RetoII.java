import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String [] participantes = new String [8];
        double [] tiempo = new double [8];
        for(int i=0; i<tiempo.length; i++){
            System.out.println("Digite el nombre del participante " + i);
            participantes[i]=lectura.next();
            System.out.println("Digite el tiempo que se demoró en recorrer la piscina el nadador " + i);
            tiempo[i]=lectura.nextDouble();
        }
        
        for (int i = 0; i<tiempo.length - 1; i++) {
            for (int j = i+1; j<tiempo.length; j++) {
                if (tiempo[i] > tiempo[j]) {
                    double temp = tiempo[i];
                    tiempo[i] = tiempo[j];
                    tiempo[j] = temp;
                    
                    String tempNombre = participantes[i];
                    participantes[i] = participantes[j];
                    participantes[j] = tempNombre;
                }
            }
        }
        System.out.println("Los tres mejores tiempos son:");
        for (int i = 1; i <=3; i++) {
            System.out.println( "El puesto numero " + i + " quedo " + participantes[i] + " con un tiempo de " + tiempo[i] + "s");
        }
    lectura.close();
    }
}
