public class Trayecto {
    Ciudad origen;
    Ciudad destino;

    public Trayecto(Ciudad origen, Ciudad destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Trayecto{" +
                "origen=" + origen +
                ", destino=" + destino +
                '}';
    }
}
