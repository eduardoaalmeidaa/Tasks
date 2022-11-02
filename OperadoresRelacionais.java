import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("=======================");

        System.out.println("Primeira variavel: ");
        int primeiraVariavel = tec.nextInt();
        System.out.println("Segunda variavel: ");
        int segundaVariavel = tec.nextInt();

        System.out.println("O valor da primeira variavel e " + primeiraVariavel +
         " e o da segunda variavel e " + segundaVariavel + ".");

         System.out.println("=======================");

         boolean primeiraVariavelEMaiorQueASegunda  = primeiraVariavel > segundaVariavel;
        System.out.println("\nA primeira variavel e maior que a segunda? " + primeiraVariavelEMaiorQueASegunda);

         boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
         System.out.println("\nA primeira variavel e menor que a segunda? " + primeiraVariavelEMenorQueASegunda );

         boolean primeiraVariavelEMaiorIgualQueASegunda = primeiraVariavel >= segundaVariavel;
         System.out.println("\nA primeira variavel e maior ou igual a segunda? " + primeiraVariavelEMaiorIgualQueASegunda);

         boolean primeiraVariavelEMenorIgualQueASegunda = primeiraVariavel <= segundaVariavel;
         System.out.println("\nA primeira variavel e menor ou igual a segunda? " + primeiraVariavelEMenorIgualQueASegunda);

         boolean variaveisIguais = primeiraVariavel == segundaVariavel; //Verifica se as variaveis sao iguais.
         System.out.println("\nAs variaveis sao iguais? " + variaveisIguais);

         boolean variaveisDiferentes = primeiraVariavel != segundaVariavel; //Verifica se as variaveis sao diferentes.
         System.out.println("\nAs variaveis sao diferentes? " + variaveisDiferentes);
         
         System.out.println("\nFIM!");
         System.out.println("=======================");
         tec.close(); 
    }
}