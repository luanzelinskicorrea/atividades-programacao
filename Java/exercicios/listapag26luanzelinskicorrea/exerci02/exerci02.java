//Aluno: Luan Zelinski Corrêa || Turma: 3-54
//
//Programa exato ao 1, calcular a área do trapézio
//utilizando valores de ponto flutuante e depois
//imprima na tela duas informações:
//
//Valor exato da área
//Valor arredondado para inteiro

import java.util.Scanner;

public class exerci02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double h, b, B, area;
        
        System.out.print("Digite a altura do trapézio: ");
        h = input.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        b = input.nextDouble();

        System.out.print("Digite a base maior do trapézio: ");
        B = input.nextDouble();

        area = (h*(b+B))/2;

        System.out.println("A área do trapézio é: "+area);

        System.out.println("O valor inteiro da área é: "+area.intValue());
    }
}
