package roteiro9.parte2;

public class Principal {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5.0, 3.0);        
        Quadrado quadrado = new Quadrado(4.0);
        Circulo circulo = new Circulo(2);
        
        System.out.println("Dados do Retângulo:");
        System.out.println("Nome da figura: " + retangulo.getNomeFigura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
        
        System.out.println("\nDados do Quadrado:");
        System.out.println("Nome da figura: " + quadrado.getNomeFigura());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        System.out.println("\nDados do Circulo");
        System.out.println("Nome da figura: " + circulo.getNomeFigura());
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
    }
}
