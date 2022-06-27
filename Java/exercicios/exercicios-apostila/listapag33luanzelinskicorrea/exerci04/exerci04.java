package exerci04;

import java.util.Scanner;

public class exerci04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double horas, salario;

        System.out.print("Digite quantas horas foram trabalhadas: ");    
        horas = input.nextDouble();

        salario = horas * 10.25;

        System.out.print("O valor do salário será de: R$"+salario);
    }
}
