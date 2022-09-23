public class Main {
    public static void main(String [] args){
        //LOCOMOTORAS
        Locomotor loc509 = new Locomotor(509);
        Locomotor loc566 = new Locomotor(566);
        Locomotor loc666 = new Locomotor();
        loc666.codigo = 666;
        //VAGONES
        Vagon vagon1 = new Vagon("2 pisos",80);
        Vagon vagon2 = new Vagon("1 piso",40);
        Vagon vagon3 = new Vagon("2 pisos",80);
        //TREN 509
        Tren tren509 = new Tren(509);
        loc509.tren = tren509;
        vagon1.tren =tren509;
        vagon2.tren =tren509;
        //TREN666
        Tren tren666 =new Tren(666);
        loc666.tren = tren666;
        vagon3.tren = tren666;
        System.out.println(tren509);
        System.out.println(tren666);

    }
}
