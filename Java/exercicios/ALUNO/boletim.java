public class boletim {
    public static void main(String[] args){
        
        Integer turmaa, turmab, nota1a1d1, nota1a1d2, nota1a1d3, nota1a2d1, nota1a2d2, nota1a2d3, nota1a3d1, nota1a3d2, nota1a3d3;
        Integer nota2a1d1, nota2a1d2, nota2a1d3, nota2a2d1, nota2a2d2, nota2a2d3, nota2a3d1, nota2a3d2, nota2a3d3;

        turmaa = 0;
        turmab = 0;

        //Disciplina 1
        disciplinas d1 = new disciplinas();
        d1.nome_disciplina = "Matemática";
        d1.professor = "Silvana";

        //Disciplina 2
        disciplinas d2 = new disciplinas();
        d2.nome_disciplina = "Ed. Física";
        d2.professor = "Edson";

        //Disciplina 3
        disciplinas d3 = new disciplinas();
        d3.nome_disciplina = "Química";
        d3.professor = "Carina";

        //aluno 1
        aluno a1 = new aluno();
        a1.nome = "Luan";
        a1.serie = "3º";
        a1.turma = "3-54";
        a1.matricula = "4550853386";
        turmaa += 1;
        nota1a1d1 = 7;
        nota1a1d2 = 5;
        nota1a1d3 = 10;
        nota2a1d1 = 8;
        nota2a1d2 = 4;
        nota2a1d3 = 5;

        //aluno 2
        aluno a2 = new aluno();
        a2.nome = "JotaJunior";
        a2.serie = "3º";
        a2.turma = "3-54";
        a2.matricula = "4550863385";
        turmaa += 1;
        nota1a2d1 = 9;
        nota1a2d2 = 5;
        nota1a2d3 = 4;
        nota2a2d1 = 8;
        nota2a2d2 = 4;
        nota2a2d3 = 7;

        //aluno 3
        aluno a3 = new aluno();
        a3.nome = "JotaSenior";
        a3.serie = "3º";
        a3.turma = "3-33";
        a3.matricula = "4550999999";
        turmab += 1;
        nota1a3d1 = 6;
        nota1a3d2 = 9;
        nota1a3d3 = 6;
        nota2a3d1 = 5;
        nota2a3d2 = 8;
        nota2a3d3 = 3;

        //1 - Total de alunos por turma
        System.out.println("Total de alunos na turma 3-54: "+turmaa);
        System.out.println("Total de alunos na turma 3-33: "+turmab);
        System.out.println("\n");

        //2 - Nota de 2 alunos na disciplina de matemática
        System.out.println("As notas do aluno "+a1.nome+" na disciplina de "+d1.nome_disciplina+" são: "+nota1a1d1+" e "+nota2a1d1);
        System.out.println("As notas do aluno "+a3.nome+" na disciplina de "+d1.nome_disciplina+" são: "+nota1a3d1+" e "+nota2a3d1);
        System.out.println("\n");

        //3 - Média de 3 alunos de 3 disciplinas diferentes
        System.out.println("A média do aluno "+a1.nome+" na disciplina de "+d1.nome_disciplina+" é: "+((float)(nota1a1d1+nota2a1d1)/2));
        System.out.println("A média do aluno "+a2.nome+" na disciplina de "+d2.nome_disciplina+" é: "+((float)(nota1a2d2+nota2a2d2)/2));
        System.out.println("A média do aluno "+a3.nome+" na disciplina de "+d3.nome_disciplina+" é: "+((float)(nota1a3d3+nota2a3d3)/2));
        System.out.println("\n");
    }
}
