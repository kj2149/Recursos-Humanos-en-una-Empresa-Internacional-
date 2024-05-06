public class Financiero extends Empleado{

    private String tipoCuenta;
    private boolean expAnalistaFinanciero;

    public Financiero(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria, String tipoCuenta, boolean expAnalistaFinanciero) {
        super(nombre, idEmpleado, rol, salarioBase, bonificacion, cantidadIdiomas, nivel, industria);
        this.tipoCuenta = tipoCuenta;
        this.expAnalistaFinanciero = expAnalistaFinanciero;
    }

    public String analisisRiesgo(){
        return "¡Soy " + this.getNombre() + " y gestiono los análisis de riesgo!";
    }

    public String analisisInversiones(){
        return "¡Soy " + this.getNombre() + " y realizo los análisis de inversiones!";
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
                this.analisisRiesgo() + "\n" +
                this.analisisInversiones() + "\n";
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
