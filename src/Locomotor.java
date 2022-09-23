public class Locomotor {
    int codigo;
    Tren tren;
public Locomotor(int i){

}
public Locomotor(){

}
    public Locomotor(int codigo, Tren tren) {
        this.codigo = codigo;
        this.tren = tren;
    }

    @Override
    public String toString() {
        return "Locomotor{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }
}
