public class VehiculoCarga extends Vehiculo implements IntMantenimiento{
    private int capacidadMax;
    private EnumUnidadMedida medida;

    public VehiculoCarga(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int capacidadMax, EnumUnidadMedida medida) {
        super(modelo, marca, patente, velRecomendada, kilometraje);
        this.capacidadMax = capacidadMax;
        this.medida = medida;
    }

    public VehiculoCarga(){}

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public EnumUnidadMedida getMedida() {
        return medida;
    }

    public void setMedida(EnumUnidadMedida medida) {
        this.medida = medida;
    }

    @Override //uso el super del tostring
    public String toString() {
        return super.toString() +
                "capacidadMax=" + capacidadMax +
                ", medida=" + medida +
                '}';
    }

    @Override
    public String mantenimiento(int velRecomendada, int kilometraje, int cantCarga) {
        setVelRecomendada(velRecomendada);
        setKilometraje(kilometraje);
        setCapacidadMax(cantCarga);
        return "Mantenimiento realizado con exito";
    }

    @Override
    public int getCantidad() {
        return this.capacidadMax;
    }
}
