public class Produccion extends Empleado{

    private String materialProduccion;
    private boolean exProcesoManufactura;

    public Produccion(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria, String materialProduccion, boolean exProcesoManufactura) {
        super(nombre, idEmpleado, rol, salarioBase, bonificacion, cantidadIdiomas, nivel, industria);
        this.materialProduccion = materialProduccion;
        this.exProcesoManufactura = exProcesoManufactura;
    }

    public String disenioProducto(){
        return "¡Soy " + this.getNombre() + " y trabajo en diseño de productos!";
    }

    public String sistemasManufactura(){
        return "¡Soy " + this.getNombre() + " y manejo sistemas de manufactura!";
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
                this.disenioProducto() + "\n" +
                this.sistemasManufactura() + "\n";
    }
}
