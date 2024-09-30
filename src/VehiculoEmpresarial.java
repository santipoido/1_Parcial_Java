public class VehiculoEmpresarial extends Vehiculo {
    private int cantButacas;
    private int añoAdquisicion;

    public VehiculoEmpresarial(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int cantButacas, int añoAdquisicion) {
        super(modelo, marca, patente, velRecomendada, kilometraje);
        this.cantButacas = cantButacas;
        this.añoAdquisicion = añoAdquisicion;
    }

    public VehiculoEmpresarial(){}

    public int getCantButacas() {
        return cantButacas;
    }

    public void setCantButacas(int cantButacas) {
        this.cantButacas = cantButacas;
    }

    public int getAñoAdquisicion() {
        return añoAdquisicion;
    }

    public void setAñoAdquisicion(int añoAdquisicion) {
        this.añoAdquisicion = añoAdquisicion;
    }

    @Override //uso el super del tostring
    public String toString() {
        return super.toString() +
                "cantButacas=" + cantButacas +
                ", añoAdquisicion=" + añoAdquisicion +
                '}';
    }
}
