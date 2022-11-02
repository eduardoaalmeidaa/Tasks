import java.util.Scanner;

public class TrianguloLados{
    public static void main(String[]args){
        double lado1, lado2, lado3 = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("INFORME A MEDIDA DO LADO:");

        lado1 = leia.nextDouble();
        lado2 = leia.nextDouble();
        lado3 = leia.nextDouble();

        System.out.println(lado1);
        System.out.println(lado2);
        System.out.println(lado3);

        if((lado1 + lado2 <= lado3) && (lado1 + lado3 <= lado2) && (lado2 + lado3 <= lado1)){
            System.out.println("ESTA MEDIA NÃO FORMA UM TRIÂNGULO: ");
        }else{
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("TRIÂNGULO EQUILATERO");
            }else{
                if((lado1 == lado3) || (lado2 == lado3) || (lado1 == lado2)){
                    System.out.println("TRIÂNGULO ISÓSCELES");
                }else{
                System.out.println("TRIÂNGULO ESCALENO");
                }
            }
        }
        System.out.println("==================================================");
    }
}
        
    