package Model;

import Enums.TipoVehiculo;

public abstract class Auto extends Vehiculo{

    private Integer numAirbags;
    private Integer cantMaxOcupantes;

    public Auto(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo, Integer numAirbags, Integer cantMaxOcupantes) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.numAirbags = numAirbags;
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    public Auto() {
    }

    public Integer getNumAirbags() {
        return numAirbags;
    }

    public void setNumAirbags(Integer numAirbags) {
        this.numAirbags = numAirbags;
    }

    public Integer getCantMaxOcupantes() {
        return cantMaxOcupantes;
    }

    public void setCantMaxOcupantes(Integer cantMaxOcupantes) {
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    @Override
    public String toString() {
        return "Auto{" +
                super.toString() +
                "numAirbags=" + numAirbags +
                ", cantMaxOcupantes=" + cantMaxOcupantes +
                '}';
    }


}
