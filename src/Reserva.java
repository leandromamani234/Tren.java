import java.util.Date;

public class Reserva {
    String lcalizador;
    Date fechaEmision;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;
    Trayecto trayecto;

    public Reserva(String lcalizador, Date fechaEmision, Ciudad ciudadOrigen, Ciudad ciudadDestino, Trayecto trayecto) {
        this.lcalizador = lcalizador;
        this.fechaEmision = fechaEmision;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.trayecto = trayecto;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "lcalizador='" + lcalizador + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", ciudadOrigen=" + ciudadOrigen +
                ", ciudadDestino=" + ciudadDestino +
                ", trayecto=" + trayecto +
                '}';
    }
}
