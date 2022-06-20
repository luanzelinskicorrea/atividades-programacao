package exerci01;

public class exerci01{
    public static void main(String[] args) {

        Integer soma=0;
        Long multi=(long) 1;

        for(int i=1;i<30;i++){
            if((i%2)==1){
                soma += i;
            }else{
                multi *= i;
            }
        }
        System.out.print("O valor da soma sequencial é de: "+soma+"\n");
        System.out.print("O valor da multiplicação sequencial é de: "+multi+"\n");
    }
}