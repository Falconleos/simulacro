package Service;

import Model.*;
import Enums.TipoVehiculo;

import java.util.List;

public class VehiculoServiceImpl {

    public void agregarVehiculos(List<Vehiculo> listaVehiculos) {

        listaVehiculos.add(new AutoCarrera("F1", 1000000.0, TipoVehiculo.AUTODECARRERA, null, 1, 450.0));
        listaVehiculos.add(new AutoUrbano("Fiesta", 5000.0, TipoVehiculo.AUTOMOVIL, 4, 5));
        listaVehiculos.add(new Motocicleta("Hayabusa", 100000.0, TipoVehiculo.MOTOCICLETA, 1000.0));
        listaVehiculos.add(new Utilitario("Transit", 40000.0, TipoVehiculo.UTILITARIO, 3.0, 2.0));
    }

    public void showArray(List<Vehiculo> listaVehiculos) {

        for (Vehiculo vehiculo : listaVehiculos) {

            System.out.println(vehiculo.toString());

        }

    }

    public void actualizar(List<Vehiculo> listaVehiculos) {

        for (Vehiculo vehiculo : listaVehiculos) {


            System.out.println("modelo: " + vehiculo.getNombreModelo() +
                    "\nPrecio original:" + vehiculo.getPrecioMercado());

            if (vehiculo.getTipoVehiculo() == TipoVehiculo.AUTODECARRERA) {
                vehiculo.updatePrice(20);
            } else if (vehiculo.getTipoVehiculo() == TipoVehiculo.AUTOMOVIL) {
                vehiculo.updatePrice(15);
            } else if (vehiculo.getTipoVehiculo() == TipoVehiculo.MOTOCICLETA) {
                vehiculo.updatePrice(5);
            } else if (vehiculo.getTipoVehiculo() == TipoVehiculo.UTILITARIO) {
                vehiculo.updatePrice(10);
            }

            System.out.println("precio actualizado: " + vehiculo.getPrecioMercado());

        }


    }


}
