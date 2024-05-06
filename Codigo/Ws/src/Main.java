public class Main {
    public static void main(String[] args) {

        Empresa Multinacional1 = new Empresa("BYD");

        //Instanciación de las industrias
        Industria Tecnologia = new Industria("SoftFactory", "Suramérica");
        Industria Finanzas = new Industria("SAP", "Norteamérica");
        Industria Manufactura = new Industria("Telares", "Asia");
        Industria Servicios = new Industria("Asesorías M&G", "Europa");

        //Agregar las industrias a la empresa
        Multinacional1.agregarIndustrias(Tecnologia);
        Multinacional1.agregarIndustrias(Finanzas);
        Multinacional1.agregarIndustrias(Manufactura);
        Multinacional1.agregarIndustrias(Servicios);

        //Instanciación de los empleados
        Desarrollador empleado1 = new Desarrollador("Luisa Hernandez", 224785632, "programador", 1000, 13, 2, "Intermedio", "Tecnología", "Python", "VSCode");
        Desarrollador empleado2 = new Desarrollador("Carlos Sánchez", 332145879, "Tester", 1200, 20, 1, "Avanzado", "Tecnología", "Java", "Eclipse");
        Financiero empleado3 = new Financiero("Ana García", 441298765, "Asesor", 900, 12, 2, "Intermedio", "Finanzas", "Personas", false);
        Financiero empleado4 = new Financiero("Juan Rodriguez", 553487621, "supervisor", 1100, 18, 3, "Avanzado", "Finanzas", "Empresas", true);
        Produccion empleado5 = new Produccion("Marco Perez",1212678665, "operario", 2000, 10,  2, "intermedio","Manufactura", "Resina", false);
        Produccion empleado6 = new Produccion("Pedro Marquez",114564561,"supervisor",1000,15,2,"Avanzado","Manufactura", "Madera", true);
        Negocio empleado7 = new Negocio("María Lopez", 664598734, "operario", 805, 11, 2, "Básico", "Servicios", "Nacional", false);
        Negocio empleado8 = new Negocio("Sofia Martinez", 773654890, "supervisor", 1085, 17, 1, "Intermedio","Servicios", "Internacional", true);

        //Agregar los empleados ya creados a cada industria
        Tecnologia.agregarEmpleados(empleado1);
        Tecnologia.agregarEmpleados(empleado2);
        Finanzas.agregarEmpleados(empleado3);
        Finanzas.agregarEmpleados(empleado4);
        Manufactura.agregarEmpleados(empleado5);
        Manufactura.agregarEmpleados(empleado6);
        Servicios.agregarEmpleados(empleado7);
        Servicios.agregarEmpleados(empleado8);

        //Obtención cantidad de empleados por industria
        System.out.println("Cantidad de empleados en Tecnologia: " + Tecnologia.obtenerEmpleadosPorIndustria());
        System.out.println("Cantidad de empleados en Finanzas: " + Finanzas.obtenerEmpleadosPorIndustria());
        System.out.println("Cantidad de empleados en Manufactura: " + Manufactura.obtenerEmpleadosPorIndustria());
        System.out.println("Cantidad de empleados en Servicios: " + Servicios.obtenerEmpleadosPorIndustria());
        System.out.println();

        //Obtención del salario individual
        System.out.println("Salario de " + empleado1.getNombre() + " $"+ empleado1.salarioEmpleado());
        System.out.println("Salario de " + empleado2.getNombre() + " $"+ empleado2.salarioEmpleado());
        System.out.println("Salario de " + empleado3.getNombre() + " $"+ empleado3.salarioEmpleado());
        System.out.println("Salario de " + empleado4.getNombre() + " $"+ empleado4.salarioEmpleado());
        System.out.println("Salario de " + empleado5.getNombre() + " $"+ empleado5.salarioEmpleado());
        System.out.println("Salario de " + empleado6.getNombre() + " $"+ empleado6.salarioEmpleado());
        System.out.println("Salario de " + empleado7.getNombre() + " $"+ empleado7.salarioEmpleado());
        System.out.println("Salario de " + empleado8.getNombre() + " $"+ empleado8.salarioEmpleado());
        System.out.println();

        //Obtención de la nómina mensual por industria
        System.out.println("Nómina mensual Tecnología: $" + Tecnologia.obtenerCostoNominaPorIndustria());
        System.out.println("Nómina mensual Finanzas: $" + Finanzas.obtenerCostoNominaPorIndustria());
        System.out.println("Nómina mensual Manufactura: $" + Manufactura.obtenerCostoNominaPorIndustria());
        System.out.println("Nómina mensual Servicios: $" + Servicios.obtenerCostoNominaPorIndustria());
        System.out.println();

        //Obtención de la información de los empleados
        System.out.println(empleado1.obtenerInformacionEmpleado());
        System.out.println(empleado3.obtenerInformacionEmpleado());
        System.out.println(empleado5.obtenerInformacionEmpleado());
        System.out.println(empleado7.obtenerInformacionEmpleado());
        System.out.println();

        //Obtención cantidad de empleados totales de la empresa
        Multinacional1.obtenerEmpleadosTotales();
        System.out.println();

        //Obtención de la nómina mensual total de la empresa
        Multinacional1.obtenerCostoNominaTotal();



    }
}