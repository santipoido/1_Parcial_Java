import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombreEmpresa;
    private List<Vehiculo> listaVehiculos;
    private List<Chofer> listaChoferes;
    private List<Viaje> listaViajes;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaVehiculos = new ArrayList<Vehiculo>();
        this.listaChoferes = new ArrayList<Chofer>();
        this.listaViajes = new ArrayList<Viaje>();
    }

    public Empresa(){}

    public int buscarVehiculo(String patente) {
        int pos = -1;
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v = listaVehiculos.get(i);
            if(v.getPatente().equals(patente)){
                pos = i;
            }
        }
        return pos;
    }

    public int buscarConductor(int dni) {
        int pos = -1;
        for (int i = 0; i < listaChoferes.size(); i++) {
            Chofer c = listaChoferes.get(i);
            if(c.getDni() == dni){
                pos = i;
            }
        }
        return pos;
    }

    public int buscarViaje(int id) {
        int pos = -1;
        for (int i = 0; i < listaViajes.size(); i++) {
            Viaje v = listaViajes.get(i);
            if(v.getId() == id){
                pos = i;
            }
        }
        return pos;
    }

    public String agregarVehiculoPasajero(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int cantPasajeros, EnumCategoriaVehiculo categoriaVehiculo){
        if (buscarVehiculo(patente) == -1){
            VehiculoPasajero vehiculoPasajero = new VehiculoPasajero(modelo, marca, patente, velRecomendada, kilometraje, cantPasajeros, categoriaVehiculo);
            listaVehiculos.add(vehiculoPasajero);
            return "Vehiculo cargado correctamente";
        }
        return "El vehiculo ya existe en el sistema";
    }

    public String agregarVehiculoCarga(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int capacidadMax, EnumUnidadMedida medida){
        if (buscarVehiculo(patente) == -1){
            VehiculoCarga vehiculoCarga = new VehiculoCarga(modelo, marca, patente, velRecomendada, kilometraje, capacidadMax, medida);
            listaVehiculos.add(vehiculoCarga);
            return "Vehiculo cargado correctamente";
        }
        return "El vehiculo ya existe en el sistema";
    }

    public String agregarVehiculoEmpresarial(String modelo, EnumMarcas marca, String patente, int velRecomendada, int kilometraje, int cantButacas, int añoAdquisicion){
        if (buscarVehiculo(patente) == -1){
            VehiculoEmpresarial vehiculoCarga = new VehiculoEmpresarial(modelo, marca, patente, velRecomendada, kilometraje, cantButacas, añoAdquisicion);
            listaVehiculos.add(vehiculoCarga);
            return "Vehiculo cargado correctamente";
        }
        return "El vehiculo ya existe en el sistema";
    }


    public String quitarVehiculo(String patente){
        if (buscarVehiculo(patente) != -1){
            listaVehiculos.remove(buscarVehiculo(patente));
            return "Vehiculo eliminado correctamente";
        }
        return "El vehiculo no existe";
    }


    public String listarVehiculos(){
        StringBuilder rta = new StringBuilder();
        for (int i = 0; i < listaVehiculos.size(); i++) {
            rta.append(listaVehiculos.get(i).toString()).append("\n");
        }
        return rta.toString();
    }

    public String verVehiculoPorPatente(String patente){
        int pos = buscarVehiculo(patente);
        return listaVehiculos.get(pos).toString();
    }

    public String darMantenimiento(String patente, int x, int y, int z){
        int pos = buscarVehiculo(patente);
        if (pos != -1){
            if (listaVehiculos.get(pos) instanceof IntMantenimiento){
                ((IntMantenimiento) listaVehiculos.get(pos)).mantenimiento(x, y, z);
                return "Mantenimiento correctamente";
            }else{
                return "El vehiculo no puede realizar mantenimiento";
            }
        }
        else{
            return "El vehiculo no existe";
        }
    }

    public String agregarChofer(String nombre, String apellido, int dni, double salarioPorKm){
        int pos = buscarConductor(dni);
        if (pos == -1){
            Chofer c = new Chofer(nombre, apellido, dni, salarioPorKm);
            listaChoferes.add(c);
            return "Chofer cargado correctamente";
        }
        return "El chofer ya existe en el sistema";
    }

    public String quitarChofer(int dni){
        int pos = buscarConductor(dni);
        if (pos != -1){
            return listaChoferes.get(pos).toString();
        }
        return "El chofer no existe";
    }

    public String listarChoferes(){
        StringBuilder rta = new StringBuilder();
        for (int i = 0; i < listaChoferes.size(); i++) {
            rta.append(listaChoferes.get(i).toString()).append("\n");
        }
        return rta.toString();
    }

    public String verConductorPorDni(int dni){
        int pos = buscarConductor(dni);
        if (pos != -1){
            return listaChoferes.get(pos).toString();
        }
        return "El conductor no existe";
    }

    public String agregarViaje(int dniConductor, String patenteVehiculo, int cantidadTransportada, String destino, int distancia, int tarifa){
        int posConductor = buscarConductor(dniConductor);
        int posVehiculo = buscarVehiculo(patenteVehiculo);
        if (posConductor != -1 && posVehiculo != -1){
            if(listaVehiculos.get(posVehiculo) instanceof IntMantenimiento && ((IntMantenimiento)listaVehiculos.get(posVehiculo)).getCantidad()>=cantidadTransportada) {
                Viaje v = new Viaje(dniConductor, patenteVehiculo, cantidadTransportada, destino, distancia, tarifa);
                return "Viaje agregado correctamente";
            }
        }
        return "El viaje no pudo ser agregado";
    }

    public String listarViajes(){
        StringBuilder rta = new StringBuilder();
        for (int i = 0; i < listaViajes.size(); i++) {
            rta.append(listaViajes.get(i).toString()).append("\n");
        }
        return rta.toString();
    }

    public String verInfoViajePorID(int id){
        int posViaje = buscarViaje(id);
        String rta;
        if (posViaje != -1){
            Viaje v = listaViajes.get(posViaje);
            Chofer c = listaChoferes.get(buscarConductor(v.getDniConductor()));
            Vehiculo vc = listaVehiculos.get(buscarVehiculo(v.getPatenteVehiculo()));
            rta = v.toString() + c.toString() + vc.toString();
            return rta;
        }
        return "El viaje no existe";
    }

    public String calcularTiempo(int id){
        int pos = buscarViaje(id);
        if(pos != -1){
            Viaje v = listaViajes.get(pos);
            Vehiculo vc = listaVehiculos.get(buscarVehiculo(v.getPatenteVehiculo()));

            float tiempo = (float)v.getDistancia()/(float)vc.getVelRecomendada();

            return "El viaje tarda: "+tiempo+"\n";
        }
        return "Viaje no encontrado";
    }

    public String calcularPagoConductor(int id){
        int pos = buscarViaje(id);
        if(pos != -1){
            Viaje v = listaViajes.get(pos);
            Chofer c = listaChoferes.get(buscarConductor(v.getDniConductor()));

            float pago = (float)v.getDistancia() * (float)c.getSalarioPorKm();

            return "El pago es: "+pago+"\n";
        }
        return "El viaje no existe";
    }

    public String calcularRecaudacion(){
        int recaudacion = 0;
        for(int i = 0; i < listaViajes.size(); i++){
            recaudacion = listaViajes.get(i).getTarifa();
        }
        return "Recaudación: " + recaudacion;
    }
}
