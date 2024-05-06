public class Region {

    private String nombre;

    public Region(String nombre) {
        this.nombre = nombre;
    }

    public void compensacion(){

    }

    public void beneficios(){
        if (this.nombre == "Norteamérica"){
            System.out.println("Mejor plan de jubilación del empleador");
        } else if (this.nombre == "Suramérica") {
            System.out.println("Se ofrecerá un aumento del 10% al salario");
        } else if (this.nombre == "Europa") {
            System.out.println("Se ofrecerá un aumento del 10% al salario o vacaciones");
        }else {
            System.out.println("Se ofrecerá un aumento del 12% o vacaciones");
        }
    }

    public void retencionTalento(){
        if (this.nombre == "Norteamérica"){
            System.out.println("Se ofrecerá un aumento del 15% al salario");
        } else if (this.nombre == "Suramérica") {
            System.out.println("Se ofrecerá un aumento del 10% al salario");
        } else if (this.nombre == "Europa") {
            System.out.println("Se ofrecerá un aumento del 10% al salario o vacaciones");
        }else {
            System.out.println("Se ofrecerá un aumento del 12% o vacaciones");
        }
    }
}
