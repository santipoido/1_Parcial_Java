public abstract class Vehiculo {
    private String modelo;
    private EnumMarcas marca;
    private String patente;
    private int velRecomendada;
    private int kilometraje;

    public Vehiculo(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.velRecomendada = velRecomendada;
        this.kilometraje = kilometraje;
    }
    public Vehiculo(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EnumMarcas getMarca() {
        return marca;
    }

    public void setMarca(EnumMarcas marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getVelRecomendada() {
        return velRecomendada;
    }

    public void setVelRecomendada(int velRecomendada) {
        this.velRecomendada = velRecomendada;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", patente='" + patente + '\'' +
                ", velRecomendada=" + velRecomendada +
                ", kilometraje=" + kilometraje +
                ", ";
    }
}
