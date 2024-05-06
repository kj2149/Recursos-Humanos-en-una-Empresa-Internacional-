public class Empresa {

    private String nombre;
    private int cantidadIndustrias=0;
    private Industria[] industrias;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.industrias = new Industria[4];
    }

    public void agregarIndustrias(Industria industria){
        if (this.cantidadIndustrias <= industrias.length){
            this.industrias[cantidadIndustrias] = industria;
            cantidadIndustrias++;
        }else {
            System.out.println("-- No se permiten más industrias --");
        }
    }

    public void obtenerEmpleadosTotales(){
        int suma=0;

        for (int i=0; i<=3; i++){
            suma += industrias[i].obtenerEmpleadosPorIndustria();
        }
        System.out.println("Cantidad total de empleados en la empresa: "+suma);
    }

    public void obtenerCostoNominaTotal(){
        double suma=0;

        for (int i=0; i<=3; i++){
            suma += industrias[i].obtenerCostoNominaPorIndustria();
        }
        System.out.println("Nomina mensual total de la empresa: $"+suma);
    }
}