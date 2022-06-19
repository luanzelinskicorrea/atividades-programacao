import java.util.Scanner;

public class exerci03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double aluguel, alimentacao, contas, transporte, salmens;

        System.out.print("Digite o valor total de aluguel pago: R$");
        aluguel = input.nextDouble();

        System.out.print("Digite o valor total gasto com alimentação: R$");
        alimentacao = input.nextDouble();

        System.out.print("Digite o valor toal gasto com transporte: R$");
        transporte = input.nextDouble();

        salmens = 1.2*(aluguel+alimentacao+transporte);

        System.out.println("O salário ideal seria de: R$"+salmens);
    }
}
