package roteiro1.parte2;

public class Exercicio01 {
    public static void main(String[] args) {
        double salarioBase = 2500; // R$
        int numHoraExtra = 10; // horas
        double valorHora = salarioBase / 200; // 200 = 40 horas semanais * 5 semanas
        double valorHoraExtra = numHoraExtra * valorHora; // R$/hora

        System.out.println("Salario base: " + salarioBase);
        System.out.println("Valor hora: " + valorHora);
        System.out.println("Valor hora extra: " + valorHoraExtra);
        System.out.println("Salario final: " + (salarioBase + valorHoraExtra));
}
}