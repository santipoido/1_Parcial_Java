public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("Poido");
        String rta = miEmpresa.agregarVehiculoPasajero("Nazi", EnumMarcas.DODGE, "AAA123", 200, 250000, 3, EnumCategoriaVehiculo.PREMIUM);
        System.out.println(rta);

        rta = miEmpresa.agregarVehiculoCarga("AAA", EnumMarcas.FORD, "AAA222", 200, 300000, 1000, EnumUnidadMedida.KGS);
        System.out.println(rta);

        rta = miEmpresa.agregarVehiculoEmpresarial("TEST", EnumMarcas.JEEP, "GLQ466", 140, 150000, 5, 2018);
        System.out.println(rta);

        System.out.println(miEmpresa.listarVehiculos());

        rta = miEmpresa.agregarChofer("MaxiV", "Pete", 3628373, 200);
        System.out.println(rta);

        rta = miEmpresa.agregarChofer("Bautista", "RuggieroHuevo", 3643743, 300);
        System.out.println(rta);

        System.out.println(miEmpresa.listarChoferes());

        rta = miEmpresa.agregarViaje(3643743, "AAA222", 200, "turquia", 200, 250);
        System.out.println(rta);

        System.out.println(miEmpresa.listarViajes());


        rta = miEmpresa.agregarVehiculoEmpresarial("Testeo", EnumMarcas.CHEVROLET, "BBB222", 100, 250000, 20, 2020);
        rta = miEmpresa.darMantenimiento("BBB222", 250, 300000, 20);
        System.out.println(rta);
        System.out.println("\n");
    }
}