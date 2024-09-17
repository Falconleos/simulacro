package Service;

    import Model.*;

    import java.util.List;

public interface VehiculoService {

    void agregarVehiculos(List<Vehiculo> listaVehiculo);
    void showArray(List<Vehiculo>listaVehiculos);
    void actualizar(List<Vehiculo>listaVehiculos);
}
