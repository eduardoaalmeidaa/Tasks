import java.util.Scanner;

public class OperadoresAtribuicao {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Digite o primeiro numero: ");
        int num1 = tec.nextInt();
        System.out.println(num1);
        System.out.println("Digite o segundo numero: ");
        int num2 = tec.nextInt();
        System.out.println(num2);

        System.out.println("\nAdicao entre o primeiro e segundo numero!");
        int adicao = num1;
        adicao += num2;
        System.out.println("O resultado da adicao entre " + num1 + " e " + num2 + " e: " + adicao);

        System.out.println("\nSubtracao entre o primeiro e o segundo numero");
        int subtracao = num1;
        subtracao -= num2;
        System.out.println("O resultado da subtracao entre " + num1 + " e " + num2 + " e: " + subtracao);

        System.out.println("\nMultiplicacao entre o primeiro e o segundo numero e: ");
        int multiplicacao = num1;
        multiplicacao *= num2;
        System.out.println("O resultado da multiplicacao entre " + num1 + " e " + num2 + " e: " + multiplicacao);

        System.out.println("\nDivisao entre o primeiro e o segundo numero e: ");
        float divisao = num1;
        divisao /= num2;
        System.out.println("O resultado da divisao entre " + num1 + " e " + num2 + " e: " + divisao);

        System.out.println("\nO resto da divisao entre o primeiro e o segundo numero e: ");
        float restoDaDivisao = num1;
        restoDaDivisao %= num2;
        System.out.println("O resto da divisao entre" + num1 + " e " + num2 + " e: " + restoDaDivisao);

        tec.close();
  }
}