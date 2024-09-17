package Model;

import Enums.TipoVehiculo;

import java.util.List;

public class AutoCarrera extends Auto implements Deportivos{

    private Double velMax;

    public AutoCarrera() {
    }

    public AutoCarrera(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo, Integer numAirbags, Integer cantMaxOcupantes, Double velMax) {
        super(nombreModelo, precioMercado, tipoVehiculo, numAirbags, cantMaxOcupantes);
        this.velMax = velMax;
    }

    public Double getVelMax() {
        return velMax;
    }

    public void setVelMax(Double velMax) {
        this.velMax = velMax;
    }

    @Override
    public void competirEnPista(){
        System.out.println("Auto compitiendo");
    }

    @Override
    public String toString() {
        return "AutoCarrera{" +
                super.toString() +
                "velMax=" + velMax +
                '}';
    }



}
