public class boletim {
    public static void main(String[] args){

        //Editor/programador: Luan Zelinski Corrêa - Turma: 3-54
        //
        //Dupla: Nicollas Ferrari Candinho
        //
        //OBS: O senhor me disse que eu estaria isento da 3, ou seja, eu faria
        //apenas a 1 e a 2 se o Nicollas estivesse a visualizar o que eu 
        //estivesse fazendo.

        Float nota1a1d1, nota2a1d1, nota1a2d1, nota2a2d1, nota1a3d1, nota2a3d1, nota1a4d1, nota2a4d1; 

        disciplinas d2 = new disciplinas();
        d2.nome_disciplina = "Filosofia";

        aluno a1 = new aluno();
        a1.nome = "Luan";
        a1.turma = "3-54";
        a1.periodo = "Integral";
        nota1a1d1 = (float)7.5;
        nota2a1d1 = (float)6.0;

        aluno a2 = new aluno();
        a2.nome = "João";
        a2.turma = "2-52";
        a2.periodo = "Diurno";
        nota1a2d1 = (float)7.5;
        nota2a2d1 = (float)6.0;

        aluno a3 = new aluno();
        a3.nome = "Lucas";
        a3.turma = "3-54";
        a3.periodo = "Integral";
        nota1a3d1 = (float)7.2;
        nota2a3d1 = (float)6.9;

        aluno a4 = new aluno();
        a4.nome = "Silvano";
        a4.turma = "3-54";
        a4.periodo = "Integral";
        nota1a4d1 = (float)6.23;
        nota2a4d1 = (float)3.33;

        //1 - Exibir 3 alunos que estudem no período integral
        System.out.println("O aluno "+a1.nome+" estuda no período "+a1.periodo);
        System.out.println("O aluno "+a2.nome+" estuda no período "+a2.periodo);
        System.out.println("O aluno "+a3.nome+" estuda no período "+a3.periodo);
        System.out.println("\n");
        
        //2 - Nota de filosofia de 1 aluno que estude de manhã na turma 2-52
        System.out.println("O Aluno "+a2.nome+" tem as notas "+nota1a2d1+" e "+nota2a2d1);
        System.out.println("\n");
    }
}
