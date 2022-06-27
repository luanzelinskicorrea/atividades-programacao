package exerci06;

public class exerci06{
    public static void main(String[] args) {
        for(Integer i=1;i<=123;i++){
            if((i%2==0) || (i%3==0)){
                System.out.println(i+" nao primo");
            }else{
                System.out.println(i+" primo");
            }
        }
    }
}