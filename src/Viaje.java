public class Viaje {
    private int id;
    private static int cant = 1;
    private int dniConductor;
    private String patenteVehiculo;
    private int cantidadTransportada;
    private String destino;
    private int distancia;
    private int tarifa;

    public Viaje(int dniConductor, String patenteVehiculo, int cantidadTransportada, String destino, int distancia, int tarifa) {
        this.dniConductor = dniConductor;
        this.patenteVehiculo = patenteVehiculo;
        this.cantidadTransportada = cantidadTransportada;
        this.destino = destino;
        this.distancia = distancia;
        this.tarifa = tarifa;

        this.id = cant;
        cant++;
    }
    public Viaje(){}

    public int getId() {
        return id;
    }

    public int getCantidadTransportada() {
        return cantidadTransportada;
    }
    public void setCantidadTransportada(int cantidadTransportada) {
        this.cantidadTransportada = cantidadTransportada;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTarifa() {
        return tarifa;
    }
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }
    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public int getDniConductor(){
        return dniConductor;
    }
    public void setDniConductor(int dniConductor){
        this.dniConductor = dniConductor;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "id=" + id +
                ", dniConductor=" + dniConductor +
                ", patenteVehiculo='" + patenteVehiculo + '\'' +
                ", cantidadTransportada=" + cantidadTransportada +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", tarifa=" + tarifa +
                '}';
    }
}
