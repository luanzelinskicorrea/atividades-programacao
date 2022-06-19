public class corrida {

    public static void main(String[] args){

        carro c1 = new carro();
        c1.marca = "Ferrari";
        c1.cor = "verdola";
        c1.velocidade = 70;
        c1.ano = 2000;

        carro c2 = new carro();
        c2.marca = "Subaru";
        c2.cor = "verdeazulado";
        c2.velocidade = 71;
        c2.ano = 2010;

        System.out.println("A velocidade Inicial do carro 1 é: " + c1.velocidade);
        System.out.println("A velocidade Inicial do carro 2 é: " + c2.velocidade);

        c1.acelerar(4);
        c2.acelerar(10);
        System.out.println("\nPassado um certo tempo...");

        System.out.println("\nA velocidade Atual do carro 1 é: " + c1.velocidade);
        System.out.println("A velocidade Atual do carro 2 é: " + c2.velocidade);

        if(c1.velocidade > c2.velocidade){

            System.out.println("\nA posição atual do carro 1 é: 1º lugar");
            System.out.println("A posição atual do carro 2 é 2º lugar");

        }else if(c1.velocidade == c2.velocidade){

            System.out.println("\nIsso é possível?");

        }else if(c1.velocidade < c2.velocidade){

            System.out.println("\nA posição atual do carro 1 é: 2º lugar");
            System.out.println("A posição atual do carro 2 é: 1º lugar");

        }else{

            System.out.println("\nErro: Erro ao colocar os dados, tente novamente");
            
        }
    }
}
