public class Desarrollador extends Empleado{

    private String lenguajeProgramacion;
    private String entornoDesarrollo;

    public Desarrollador(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria, String lenguajeProgramacion, String entornoDesarrollo) {
        super(nombre, idEmpleado, rol, salarioBase, bonificacion, cantidadIdiomas, nivel, industria);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.entornoDesarrollo = entornoDesarrollo;
    }

    public String desarrolloSoftware(){
        return "¡Soy " + this.getNombre() + " y trabajo en desarrollo de software!";
    }

    public String mantenimientoCodigo(){
        return "¡Soy " + this.getNombre() + " y realizo mantenimiento al código!";
    }

    @Override
    public String getIndustria() {
        return super.getIndustria();
    }

    @Override
    public String getNivel() {
        return super.getNivel();
    }

    @Override
    public int getCantidadIdiomas() {
        return super.getCantidadIdiomas();
    }

    @Override
    public int getBonificacion() {
        return super.getBonificacion();
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public String getRol() {
        return super.getRol();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getIdEmpleado() {
        return super.getIdEmpleado();
    }

    @Override
    public String obtenerInformacionEmpleado() {
        return "Nombre: " + this.getNombre() + "\n" +
                "ID: " + this.getIdEmpleado() + "\n" +
                "Rol: " + this.getRol() + "\n" +
                "Nivel: " + this.getNivel() + "\n" +
                "Industria: " + this.getIndustria() + "\n" +
                this.desarrolloSoftware() + "\n" +
                this.mantenimientoCodigo() + "\n";
    }

    @Override
    public double salarioEmpleado() {
        return super.salarioEmpleado();
    }
}
