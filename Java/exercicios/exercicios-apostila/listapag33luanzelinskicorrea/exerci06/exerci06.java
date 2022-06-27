package exerci06;

import java.util.Scanner;

public class exerci06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Double quilosinput, quilos, librasinput, libras;

        System.out.print("Digite uma quantidade qualquer de quilos: ");
        quilosinput = input.nextDouble();

        System.out.print("Digite uma quantidade qualquer de libras: ");
        librasinput = input.nextDouble();

        quilos = librasinput*0.454;
        libras = quilosinput/0.454;

        System.out.println(quilosinput+" quilos = "+libras+" libras");
        System.out.println(librasinput+" libras = "+quilos+" quilos");
    }        
}
