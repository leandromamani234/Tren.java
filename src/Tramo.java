import java.awt.geom.Arc2D;
import java.util.Date;

public class Tramo {
    Ciudad origen;
    Ciudad destino;
    Date horaSalida;
    Double duracion;

    public Tramo(Ciudad origen, Ciudad destino, Date horaSalida, Double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Tramo{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", horaSalida=" + horaSalida +
                ", duracion=" + duracion +
                '}';
    }
}
