package exerci03;
import java.util.Scanner;

public class exerci03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float distancia, combustivel, consumo;

        System.out.print("A distância total percorrida é (em Km): ");
        distancia = input.nextFloat();

        System.out.print("A quantidade de combustível gasto foi de: ");
        combustivel = input.nextFloat();

        consumo = distancia/combustivel;

        System.out.println("\nO consumo médio é de: "+consumo+"Km/L\n");
    }
    
}
