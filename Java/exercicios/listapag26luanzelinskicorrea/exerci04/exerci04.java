//Aluno: Luan Zelinski Corrêa || Turma: 3-54
//
//Programa que indique o valor verdade das 
//seguintes expressões:
//
//a. (1>2)---------------> false
//b. (8==8)--------------> true
//c. ((12-5)>6)
//d. (0<3)&&(8<9)
//e. ((i++)>i)
//f. ((10*90/50-2)==16)

public class exerci04 {
    public static void main(String[] args) {
        Boolean a, b, c, d, e, f;
        Integer i;

        i = 0;

        a = (1>2);
        b = (8==8);
        c = ((12-5)>6);
        d = (0<3)&&(8<9);
        e = ((i++)>i);
        f = ((10*90/50-2)==16);

        System.out.println("Expressão A: "+a);
        System.out.println("Expressão B: "+b);
        System.out.println("Expressão C: "+c);
        System.out.println("Expressão D: "+d);
        System.out.println("Expressão E: "+e);
        System.out.println("Expressão F: "+f);
    }
}
