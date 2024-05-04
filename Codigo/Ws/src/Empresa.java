public class Empresa {
    //atributos
    private String nombre;
    private int cantidadEmpleados;
    private String industrias[];
    private String distribucionGeografica;

    //constructor
    public Empresa(String nombre, int cantidadEmpleados, String industrias[], String distribucionGeografica) {
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
        this.industrias = industrias;
        this.distribucionGeografica = distribucionGeografica;
    }

    //metodos
    public int obtenerEmpleadosTotales(){
        return cantidadEmpleados;


    }

    public double calcularCostoNominaTotal(double salario){
        return cantidadEmpleados * salario;

    }

    public String DistribucionGeografica() {
        return distribucionGeografica;
    }
}