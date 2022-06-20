//analisar se um número é positivo ou negativo
//caso positivo, é true, mas se caso negativo, é false.

import java.util.Scanner;

public class teste01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float num;

        System.out.print("Digite um número qualquer: ");
        num = input.nextFloat();

        System.out.println();

        if(num > 0){
            System.out.println("True - Postitivo");
        }else if(num < 0){
            System.out.println("False - Negativo");
        }else if(num == 0){
            System.out.println("Ambiguous - True e False");
        }else{
            System.out.println("Ambiguous - Not True e Not Flase");
        }
    }
}