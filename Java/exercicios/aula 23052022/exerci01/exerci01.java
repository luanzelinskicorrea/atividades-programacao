package exerci01;
import java.util.Scanner;

public class exerci01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numero1, numero2, soma;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.println("");

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        System.out.println("");

        soma = numero1 + numero2;

        System.out.println("O resultado da soma é: "+soma);
    }
}