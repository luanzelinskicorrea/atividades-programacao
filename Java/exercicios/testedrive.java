public class testedrive {
    public static void main(String[] args){
        carro c1 = new carro();
        c1.marca = "Fiat";
        c1.cor = "verdeavermelhado";
        c1.velocidade = 70;
        c1.ano = 2015;

        c1.acelerar(30);
        System.out.println("Velocidade depois de acelerar: " + c1.velocidade + "km/hora");
        c1.freiar(10);
        System.out.println("Velocidade depois de freiar: " + c1.velocidade + " km/hora");
    }
}