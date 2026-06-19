public class App {
    public static void main(String[] args) {

        Vuelo v1 = new Vuelo();

        Vuelo v2 = new Vuelo(
                "AV9401",
                "Bogota",
                "Medellin");

        Vuelo v3 = new Vuelo(
                "LA450",
                "Cali",
                "Cartagena",
                100,
                150);

        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        v3.embarcar(20);
        v3.desembarcar(50);

        System.out.println("Después de las operaciones:");
        v3.mostrarInfo();
    }
}