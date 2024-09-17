package Model;

import Enums.TipoVehiculo;

import java.util.List;

public abstract class Vehiculo {

    private String nombreModelo;
    private Double precioMercado;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo) {
        this.nombreModelo = nombreModelo;
        this.precioMercado = precioMercado;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public Double getPrecioMercado() {
        return precioMercado;
    }

    public void setPrecioMercado(Double precioMercado) {
        this.precioMercado = precioMercado;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", precioMercado=" + precioMercado +
                ", tipoVehiculo=" + tipoVehiculo +
                '}';
    }

    public void updatePrice(Integer porcentaje){

        Double porc = Double.valueOf(porcentaje);

        porc = this.getPrecioMercado() + (this.getPrecioMercado() * (porc/100));

        this.setPrecioMercado(porc);

    }


}
