abstract class Empleado{

    private int idEmpleado;
    private String nombre;
    private String rol;
    private double salarioBase;
    private int bonificacion;
    private String nivelJerarquico;
    private int cantidadIdiomas;
    private String nivel;
    private String industria;

    public Empleado(){

    }

    public Empleado(String nombre, int idEmpleado, String rol, double salarioBase, int bonificacion, int cantidadIdiomas, String nivel, String industria) {
        this.nombre =nombre;
        this.idEmpleado =idEmpleado;
        this.rol=rol;
        this.salarioBase =salarioBase;
        this.bonificacion=bonificacion;
        this.cantidadIdiomas=cantidadIdiomas;
        this.nivel=nivel;
        this.industria=industria;
    }

    public double salarioEmpleado(){
        double salario = salarioBase + (salarioBase * (bonificacion*0.01));
        return salario;
    }

    public String obtenerInformacionEmpleado(){
        return "Nombre: " + this.nombre + "\n" +
                "ID: " + this.idEmpleado + "\n" +
                "Rol: " + this.rol + "\n" +
                "Nivel: " + this.nivel + "\n" +
                "Industria: " + this.industria + "\n";
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public int getCantidadIdiomas() {
        return cantidadIdiomas;
    }

    public String getNivel() {
        return nivel;
    }

    public String getIndustria() {
        return industria;
    }
}