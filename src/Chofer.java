public class Chofer {
    private String nombre;
    private String apellido;
    private int dni;
    private double salarioPorKm;

    public Chofer(String nombre, String apellido, int dni, double salarioPorKm) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salarioPorKm = salarioPorKm;
    }

    public Chofer(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSalarioPorKm() {
        return salarioPorKm;
    }

    public void setSalarioPorKm(double salarioPorKm) {
        this.salarioPorKm = salarioPorKm;
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", salarioPorKm=" + salarioPorKm +
                '}';
    }
}
