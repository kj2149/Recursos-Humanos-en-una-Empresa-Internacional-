public class Industria {
    private String nombre;
    private int cantidadEmpleados=0;
    private Empleado[] empleados;
    private String region;

    public Industria(String nombre, String region) {
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
        this.empleados = new Empleado[5];
        this.region = region;
    }

    public double obtenerCostoNominaPorIndustria(){
        double suma=0;
        int i=0;

        while (empleados[i] != null && i < cantidadEmpleados){
            suma += empleados[i].salarioEmpleado();
            i++;
        }
        return suma;
    }

    public void agregarEmpleados(Empleado empleado){
        if (this.cantidadEmpleados <= empleados.length){
            this.empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
        }else {
            System.out.println("-- No se permiten más empleados --");
        }
    }

    public int obtenerEmpleadosPorIndustria(){
        int i=0;
        while (empleados[i] != null && i < cantidadEmpleados){
            i++;
        }
        return i;
    }
}