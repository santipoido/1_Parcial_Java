public class VehiculoPasajero extends Vehiculo implements IntMantenimiento{
    private int cantPasajeros;
    private EnumCategoriaVehiculo categoriaVehiculo;

    public VehiculoPasajero(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int cantPasajeros, EnumCategoriaVehiculo categoriaVehiculo) {
        super(modelo, marca, patente, velRecomendada, kilometraje);
        this.cantPasajeros = cantPasajeros;
        this.categoriaVehiculo = categoriaVehiculo;
    }

    public VehiculoPasajero(){}

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public EnumCategoriaVehiculo getCategoriaVehiculo() {
        return categoriaVehiculo;
    }

    public void setCategoriaVehiculo(EnumCategoriaVehiculo categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }

    @Override //uso el super de tostring
    public String toString() {
        return super.toString() +
                "cantPasajeros=" + cantPasajeros +
                ", categoriaVehiculo=" + categoriaVehiculo +
                '}';
    }

    @Override
    public String mantenimiento(int velRecomendada, int kilometraje, int cantPasajeros) {
        setVelRecomendada(velRecomendada);
        setKilometraje(kilometraje);
        setCantPasajeros(cantPasajeros);
        return "Mantenimiento realizado con exito";
    }

    @Override
    public int getCantidad() {
        return this.cantPasajeros;
    }
}
