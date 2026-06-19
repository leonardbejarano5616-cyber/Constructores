public class App {

    public static void main(String[] args) {

        DepositoAgua deposito1 = new DepositoAgua(100);
        DepositoAgua deposito2 = new DepositoAgua(50);

        deposito1.setDepositoDesborde(deposito2);

        deposito1.agregarAgua(130);

        System.out.println("Deposito 1");
        deposito1.mostrarEstado();

        System.out.println("Deposito 2");
        deposito2.mostrarEstado();
    }
}