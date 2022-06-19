import java.util.Scanner;

public class exerci02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        Double custo, venda, percentual;

        System.out.print("Digite o valor de custo de um produto: R$");
        custo = input.nextDouble();

        System.out.print("Digite o percentual de acréscimo: ");
        percentual = input.nextDouble();

        venda = (custo+(custo*(percentual/100)));

        System.out.println("O valor de venda é de: R$"+venda);
    }
}
