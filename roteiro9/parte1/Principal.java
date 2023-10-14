package roteiro9.parte1;

public class Principal {
    public static void main(String[] args) {
        // Criar uma instância de Retangulo
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        
        // Criar uma instância de Quadrado
        Quadrado quadrado = new Quadrado(4.0);
        
        // Testar métodos da interface FiguraGeometrica para o Retangulo
        System.out.println("Dados do Retângulo:");
        System.out.println("Nome da figura: " + retangulo.getNomeFigura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
        
        // Testar métodos da interface FiguraGeometrica para o Quadrado
        System.out.println("\nDados do Quadrado:");
        System.out.println("Nome da figura: " + quadrado.getNomeFigura());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
    }
}
