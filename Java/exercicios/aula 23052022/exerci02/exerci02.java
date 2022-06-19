package exerci02;
import java.util.Scanner;

public class exerci02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float num1, num2, som, sub, mul, div;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        num2 = input.nextFloat();
        System.out.println("");

        som = num1+num2;
        sub = num1-num2;
        mul = num1*num2;
        div = num1/num2;

        System.out.println("O resultado da adição é: "+som);
        System.out.println("O resultado da subtração é: "+sub);
        System.out.println("O resultado da multiplicação é: "+mul);
        System.out.println("O resultado da divisão é: "+div);
    }
}
