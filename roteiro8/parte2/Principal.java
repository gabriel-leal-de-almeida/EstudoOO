package roteiro8.parte2;

public class Principal {

    public static void main(String[] args) {

    VeiculoCarga v2 = new VeiculoCarga("22bb", 2000, 1000);
    VeiculoPasseio v3 = new VeiculoPasseio("333ccc", 2020,7);
    VeiculoPequeno v4 = new VeiculoPequeno("PKW-1J77", 2018,"Up");
        
        System.out.println("pedagio v2: " +v2.calcPedagio());
        System.out.println("pedagio v3: " +v3.calcPedagio());
        System.out.println("pedagio v4: " +v4.calcPedagio());

    }
}
