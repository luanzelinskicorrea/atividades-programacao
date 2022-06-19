import java.util.Scanner;

public class exerci05{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Float num;

    System.out.print("Digite um número qualquer: ");
    num = input.nextFloat();

    if(num%2 == 0){
        System.out.println("\nO número digitado é par");
    }else{
        System.out.println("\nO número digitado é ímpar");
    }
        
    }
}