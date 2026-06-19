public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    // Constructor vacío
    public Vuelo() {
    }

    // Constructor de ruta
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
    }

    // Constructor completo
    public Vuelo(String numero, String origen, String destino,
                 int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        if (ocupacion >= 0 && ocupacion <= capacidadMaxima) {
            this.ocupacion = ocupacion;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Número: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println();
    }

    public void embarcar(int pasajeros) {
        if (ocupacion + pasajeros <= capacidadMaxima) {
            ocupacion += pasajeros;
        } else {
            System.out.println("No hay espacio suficiente.");
        }
    }

    public void desembarcar(int pasajeros) {
        if (pasajeros <= ocupacion) {
            ocupacion -= pasajeros;
        } else {
            ocupacion = 0;
        }
    }
}