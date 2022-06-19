import java.util.Scanner;

public class exerci01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double dep, tot1, tot12;
        

        System.out.print("Digite o valor total do depósito: ");
        dep = input.nextDouble();

        tot1 = dep+(0.007*dep);
        tot12 = dep+(0.007*dep*12);

        System.out.println("O valor rendido em 1 mês é: R$"+tot1);
        System.out.println("O valor rendido em 12 meses é: R$"+tot12);
    }
}