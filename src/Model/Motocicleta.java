package Model;

import Enums.TipoVehiculo;

public class Motocicleta extends Vehiculo implements Deportivos{

    private Double cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo, Double cilindrada) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.cilindrada = cilindrada;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void competirEnPista(){
        System.out.println("Moto compitiendo");
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                super.toString() +
                "cilindrada=" + cilindrada +
                '}';
    }
}
