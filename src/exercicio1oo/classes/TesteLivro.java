package exercicio1oo.classes;

public class TesteLivro {
    public static void main(String[] args) {
        Livro william = new Livro();
        william.titular = "mauricio";
        william.autor = "fulano";
        william.genero = "terror";
        william.emprestado = true;
        System.out.println("titular: " + william.titular);
        System.out.println("autor: " + william.autor);
        System.out.println("genero: " + william.genero);
        System.out.println("emprestado: " + william.emprestado);
    }
}
