package Ui;

    import Enums.TipoVehiculo;
    import Model.*;
    import Service.VehiculoServiceImpl;

    import java.util.ArrayList;
    import java.util.List;

public class Menu {

    VehiculoServiceImpl vehiculoService1 = new VehiculoServiceImpl();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public void iniciarMenu(){

        vehiculoService1.agregarVehiculos(listaVehiculos);
        vehiculoService1.showArray(listaVehiculos);
        vehiculoService1.actualizar(listaVehiculos);
    }

}
