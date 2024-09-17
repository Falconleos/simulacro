package Model;

import Enums.TipoVehiculo;

public class AutoUrbano extends Auto {

    public AutoUrbano() {
    }

    public AutoUrbano(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo, Integer numAirbags, Integer cantMaxOcupantes) {
        super(nombreModelo, precioMercado, tipoVehiculo, numAirbags, cantMaxOcupantes);
    }

    @Override
    public String toString() {
        return "AutoUrbano{" +
                super.toString() +
                "}";
    }


}
