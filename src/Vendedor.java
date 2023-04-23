import java.util.Objects;

public class Vendedor extends Empleado implements calculoSueldo
{
    private double montoVentaMensual;

    public Vendedor(double montoVentaMensual)
    {
        super();
        this.montoVentaMensual = montoVentaMensual;
    }

    public Vendedor(int legajo, String nombre, String apellido, String direccion, int anioNac, int mesNac, int diaNac, double montoVentaMensual)
    {
        super(legajo, nombre, apellido, direccion, anioNac, mesNac, diaNac);
        this.montoVentaMensual = montoVentaMensual;
    }
    public Vendedor (Empleado empleadito, double montoVentaMensual)
    {
        super(empleadito);
        this.montoVentaMensual = montoVentaMensual;
    }

    public double getMontoVentaMensual()
    {
        return montoVentaMensual;
    }

    public void setMontoVentaMensual(int montoVentaMensual)
    {
        this.montoVentaMensual = montoVentaMensual;
    }
    public double calculoSueldo ()
    {
        return this.montoVentaMensual * 0.3;
    }

    @Override
    public String toString()
    {
        return super.toString() +"Vendedor{" +
                "montoVentaMensual=" + montoVentaMensual +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return montoVentaMensual == vendedor.montoVentaMensual;
    }

}
