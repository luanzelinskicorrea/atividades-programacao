package exerci03;
import java.util.Scanner;
public class exerci03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer num;

        System.out.print("Digite um número inteiro qualquer: ");
        num = input.nextInt();

        if((num%2==0) || (num%3==0)){
            //não primo
        }
    }
}
