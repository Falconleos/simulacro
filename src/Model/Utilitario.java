package Model;

import Enums.TipoVehiculo;

public class Utilitario extends Vehiculo{

    private Double cantKgMax;
    private Double altura;


    public Utilitario(String nombreModelo, Double precioMercado, TipoVehiculo tipoVehiculo, Double cantKgMax, Double altura) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.cantKgMax = cantKgMax;
        this.altura = altura;
    }

    public Utilitario() {
    }

    public Double getCantKgMax() {
        return cantKgMax;
    }

    public void setCantKgMax(Double cantKgMax) {
        this.cantKgMax = cantKgMax;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                super.toString() +
                "cantKgMax=" + cantKgMax +
                ", altura=" + altura +
                '}';
    }


}
