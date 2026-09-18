package exercicio1oo.classes;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno william = new Aluno();
        william.matricula = "123";
        william.nome = "william";
        william.idade = 21;
        william.nota1 = 5;
        william.nota2 = 6;
        william.nota3 = 7;
        william.nota4 = 8;
        System.out.println("Matricula: " + william.matricula);
        System.out.println("Nome: " + william.nome);
        System.out.println("idade: " + william.idade);
        System.out.println("nota 1: " + william.nota1);
        System.out.println("nota 2: " + william.nota2);
        System.out.println("nota 3: " + william.nota3);
        System.out.println("nota 4: " + william.nota4);
    }
}
