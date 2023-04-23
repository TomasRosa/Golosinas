import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero del ejercicio que desea ver. ");
        System.out.println("1. Buscar por legajo. ");
        System.out.println("2. Contar empleados. ");
        System.out.println("3. Ver listado (ver empleados). ");
        System.out.println("4. Eliminar empleados por legajo.");
        System.out.println("5.Calcular sueldo de todos (incluyendo repartidores)");

        CuerpoDeTrabajo empresa = gestionarEmpresa();

        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Ingresa el legajo de el empleado que deseas buscar. (1.2.3.4)");
                int legajo = scan.nextInt();

                Empleado empleadito = empresa.buscarPorLegajo(legajo);

                if(empleadito == null)
                {
                    System.out.println("El legajo que acabas de ingresar no existe! ");
                }
                else
                {
                    System.out.println("Empleado: ");
                    System.out.println(empleadito.toString());
                }
                break;
            }
            case 2:
            {
                System.out.println("Total empleados: ");
                empresa.contarTotalEmpleados();
                break;
            }
            case 3:
            {
                empresa.devolverListado();
                break;
            }
            case 4:
            {
                System.out.println("Ingresa el legajo del empleado que deseas eliminar. ");
                int legajo = scan.nextInt();

                empresa.eliminarPorLegajo(legajo);

                System.out.println("Empleados luego de haber eliminado 1: ");
                empresa.devolverListado();
                break;
            }
            case 5:
            {
                RepartidoresEnvoltorio repartidores = gestionarRepartidores();

                double sueldoRepartidores = repartidores.calcularSueldoTotalRepartidores();
                double sueldoCuerpoDeTrabajo = empresa.calcularSueldoTotalAdministradoresYVendedores();
                double total = sueldoRepartidores + sueldoCuerpoDeTrabajo;
                System.out.println("Total a pagar en terminos de sueldo (repartidores,administradores,vendedores) " + total);
                break;
            }
        }
    }
    public static CuerpoDeTrabajo gestionarEmpresa ()
    {
        Empleado empleadito1 = new Empleado(1,"Santiago","Blanco","Constitucion",2003,05,22);
        Empleado empleadito2 = new Empleado(2,"Lauti","Ruiz","Lebensonh",2004,7,20);
        Empleado empleadito3 = new Empleado(3,"Tomas","Rosa","Waikiki",2003,10,10);
        Empleado empleadito4 = new Empleado(4,"Luquitas","Gomez","San Martin",2003,02,24);

        Administrador administrador1 = new Administrador(empleadito1,"Finanzas");
        Administrador administrador2 = new Administrador(empleadito2,"Logistica");
        Vendedor vendedor1 = new Vendedor(empleadito3,29000);
        Vendedor vendedor2 = new Vendedor(empleadito4,26000);

        CuerpoDeTrabajo empresa = new CuerpoDeTrabajo();

        empresa.agregarEmpleado(administrador1);
        empresa.agregarEmpleado(administrador2);
        empresa.agregarEmpleado(vendedor1);
        empresa.agregarEmpleado(vendedor2);

        return empresa;
    }
    public static RepartidoresEnvoltorio gestionarRepartidores ()
    {
        Repartidor repartidor1 = new Repartidor(90,"Juan","Hernandez");
        Repartidor repartidor2 = new Repartidor(110,"Alfonso","Lopez");

        RepartidoresEnvoltorio repartidores = new RepartidoresEnvoltorio();

        repartidores.repartidores.add(repartidor1);
        repartidores.repartidores.add(repartidor2);

        return repartidores;

    }

}