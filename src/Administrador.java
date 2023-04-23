import java.util.Objects;

public class Administrador extends Empleado implements calculoSueldo
{
    private String area;

    public Administrador ()
    {
        super();
    }

    public Administrador(int legajo, String nombre, String apellido, String direccion, int anioNac, int mesNac, int diaNac, String area)
    {
        super(legajo, nombre, apellido, direccion, anioNac, mesNac, diaNac);
        this.area = area;
    }
    public Administrador (Empleado empleadito, String area)
    {
        super(empleadito);
        this.area = area;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }
    public double calculoSueldo ()
    {
        return 15;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Administrador{" +
                "area='" + area + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrador that = (Administrador) o;
        return Objects.equals(area, that.area);
    }

}
