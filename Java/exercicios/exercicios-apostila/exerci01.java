//Aluno: Luan Zelinski Corrêa || Turma: 3-54
//
//Programa para calcular a área de um trapézio, onde:
//
//h = altura
//b = base menor
//B = base maior
//
//Área = (h*(b+B))/2

import java.util.Scanner;

public class exerci01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer h, b, B;
        Double area;
        
        System.out.print("Digite a altura do trapézio: ");
        h = input.nextInt();

        System.out.print("Digite a base menor do trapézio: ");
        b = input.nextInt();

        System.out.print("Digite a base maior do trapézio: ");
        B = input.nextInt();

        area = (double)(h*(b+B))/2;

        System.out.println("A área do trapézio é: "+area);
    }
}