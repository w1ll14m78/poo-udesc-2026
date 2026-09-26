package exercicio1oo.classes;

public class TesteCarro {
    public static void main(String[] args) {
        Carro william = new Carro();
        william.modelo = "rs6";
        william.marca = "audi";
        william.ano = 2026;
        william.velocidade = 280;
        System.out.println("modelo: " + william.modelo);
        System.out.println("marca: " + william.marca);
        System.out.println("ano: " + william.ano);
        System.out.println("velocidade: " + william.velocidade);
    }
}
