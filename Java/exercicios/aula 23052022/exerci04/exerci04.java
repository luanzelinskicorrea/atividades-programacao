package exerci04;
import java.util.Scanner;

public class exerci04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float num;

        System.out.print("Digite um número: ");
        num = input.nextFloat();

        if(num > 0){
            System.out.println("O número digitado é maior que 0");
        }else if(num < 0){
            System.out.println("O número digitado é menor que 0");
        }
    }
}
