public class Industria {
    //atributos
    private String nombre;
    private int Empleados[];
    private double salarioBase;
    private String region;

//constructores
    public Industria(String nombre, int[] empleados, double salarioBase, String region) {
        this.nombre = nombre;
        this.Empleados = empleados;
        this.salarioBase = salarioBase;
        this.region = region;
    }
}