import java.util.ArrayList;
public class CuerpoDeTrabajo
{
    ArrayList<Empleado> empleados;

    public CuerpoDeTrabajo()
    {
        this.empleados = new ArrayList<Empleado>();
    }
    public Empleado buscarPorLegajo (int legajo)
    {
        Empleado empleadoARetornar = null;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito.getLegajo() == legajo)
            {
                empleadoARetornar = empleadito;
            }
        }
        return empleadoARetornar;
    }
    public int contarVendedoresEnArrayList ()
    {
        int contadorVendedores = 0;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                contadorVendedores++;
            }
        }
        return contadorVendedores;
    }
    public int contarAdministradoresEnArrayList()
    {
        int contadorAdministradores = 0;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Administrador)
            {
                contadorAdministradores++;
            }
        }
        return contadorAdministradores;
    }
    public void contarTotalEmpleados ()
    {
        int empleadosVendedores = contarVendedoresEnArrayList();
        int empleadosAdministradores = contarAdministradoresEnArrayList();
        int empleadosTotales = empleadosAdministradores + empleadosVendedores;

        System.out.println("En total hay: " + empleadosTotales);
        System.out.println(empleadosVendedores + " son vendedores.");
        System.out.println(empleadosAdministradores + " son administradores.");

    }
    public void devolverListado ()
    {
        for(Empleado empleadito: this.empleados)
        {
            System.out.println(empleadito.toString());
        }
    }
    public void eliminarPorLegajo(int legajo)
    {
        int i = 0;

        while(i < this.empleados.size())
        {
            Empleado empleadito = this.empleados.get(i);
            if(empleadito.getLegajo() == legajo)
            {
                this.empleados.remove(i);
            }
            else
            {
                i++;
            }
        }
    }
    public double calcularSueldoVendedores ()
    {
        double sueldo = 0;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                sueldo = sueldo + ((Vendedor) empleadito).calculoSueldo();
            }
        }
        return sueldo;
    }
    public double calcularSueldoAdministradores ()
    {
        double sueldo = 0;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Administrador)
            {
                sueldo = sueldo + ((Administrador) empleadito).calculoSueldo();
            }
        }
        return sueldo;
    }
    public double calcularSueldoTotalAdministradoresYVendedores ()
    {
        double sueldoAdministradores = calcularSueldoAdministradores();
        double sueldoVendedores = calcularSueldoVendedores();
        double sueldosTotales = sueldoVendedores + sueldoAdministradores;

        return sueldosTotales;
    }
    public void agregarEmpleado (Empleado empleado)
    {
        this.empleados.add(empleado);
    }

}
