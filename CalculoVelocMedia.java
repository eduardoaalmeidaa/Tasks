import java.util.Scanner;

public class CalculoVelocMedia{
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------CALCULO DA VELOCIDADE MEDIA!----------");
        System.out.println("Qual a distancia percorrida?");
        float distanciaPercorrida = leitor.nextFloat(); //Armazena a DISTANCIA percorrida (em KM)
        System.out.println("A distancia percorrida foi de: " + distanciaPercorrida + " KM.");
        System.out.println("Qual o tempo gasto? ");
        float tempoGasto = leitor.nextFloat(); //Armazena o TEMPO(em Horas) que foi gasto para percorrer a distancia
        System.out.println("O tempo gasto foi de: " + tempoGasto + " horas.");

        float velocidadeMedia = distanciaPercorrida / tempoGasto; //Calculo da velocidade.

        System.out.println("Para encontrarmos a velocidade media, pegamos a distancia(" + distanciaPercorrida + ") e dividimos pelo tempo gasto(" +
        tempoGasto + ").");

        System.out.println("A velocidade media e de: " + velocidadeMedia + "KM/H"); //Imprime o resultado.
        leitor.close();
        
    }
}