public class Negocio extends Empleado{

    private String tipoNegocio;
    private boolean expConsultoriaEmprensarial;

    public Negocio(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria, String tipoNegocio, boolean expConsultoriaEmprensarial) {
        super(nombre, idEmpleado, rol, salarioBase, bonificacion, cantidadIdiomas, nivel, industria);
        this.tipoNegocio = tipoNegocio;
        this.expConsultoriaEmprensarial = expConsultoriaEmprensarial;
    }

    public String analisisMercado(){
        return "¡Soy " + this.getNombre() + " y me encargo de los análisis de mercado!";
    }

    public String asesoramientoEstrategico(){
        return "¡Soy " + this.getNombre() + " y me realizo el asesoramiento estratégico!";
    }

    public Negocio(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria) {
        super(nombre, idEmpleado, rol, salarioBase, bonificacion, cantidadIdiomas, nivel, industria);
    }

    @Override
    public double salarioEmpleado() {
        return super.salarioEmpleado();
    }

    @Override
    public String obtenerInformacionEmpleado() {
        return "Nombre: " + this.getNombre() + "\n" +
                "ID: " + this.getIdEmpleado() + "\n" +
                "Rol: " + this.getRol() + "\n" +
                "Nivel: " + this.getNivel() + "\n" +
                "Industria: " + this.getIndustria() + "\n" +
                this.analisisMercado() + "\n" +
                this.asesoramientoEstrategico() + "\n";
    }

    @Override
    public int getIdEmpleado() {
        return super.getIdEmpleado();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getRol() {
        return super.getRol();
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public int getBonificacion() {
        return super.getBonificacion();
    }

    @Override
    public int getCantidadIdiomas() {
        return super.getCantidadIdiomas();
    }

    @Override
    public String getNivel() {
        return super.getNivel();
    }

    @Override
    public String getIndustria() {
        return super.getIndustria();
    }
}
