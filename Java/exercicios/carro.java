public class carro {
    //Atributos
    String marca, cor;
    Integer ano, velocidade;

    //Métodos
    void acelerar(Integer aceleracao){
        velocidade += aceleracao;
    }

    void freiar(Integer desaceleracao){
        velocidade -= desaceleracao;
    }
}