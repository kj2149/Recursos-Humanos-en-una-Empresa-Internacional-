
abstract class Empleado {
    private int idEmpleado;
    private String nombre;
    private String rol;
    private double salarioBase;
    private double bonificacion;
    private String nivelJerarquico;
    private int cantidadIdiomas;
    private String nivel;
    private String[] habilidadesTecnicas;


    public class Empleado(int idEmpleado, String nombre, String rol, double salarioBase, double boificacion,
                          String nivelJerarquico, int cantidadIdiomas, String nivel, String[] habilidadesTecnicas) {
        this.idEmpleado =idEmpleado;
        this.nombre =nombre;
        this.rol=rol;
        this.salarioBase =salarioBase;
        this.bonificacion=bonificacion;
        this.nivelJerarquico=nivelJerarquico;
        this.cantidadIdiomas=cantidadIdiomas;
        this.nivel=nivel;
        this.habilidadesTecnicas =habilidadesTecnicas;
    }
}