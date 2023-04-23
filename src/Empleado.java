import java.time.LocalDate;

public class Empleado
{
    private int legajo;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;

    public Empleado ()
    {

    }
    public Empleado (int legajo, String nombre, String apellido, String direccion, int anioNac,int mesNac,int diaNac)
    {
        this.fechaNacimiento = LocalDate.of(anioNac,mesNac,diaNac);
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    public Empleado (Empleado empleadito)
    {
        this.legajo = empleadito.legajo;
        this.direccion = empleadito.direccion;
        this.nombre = empleadito.nombre;
        this.apellido = empleadito.apellido;
        this.fechaNacimiento = empleadito.fechaNacimiento;
    }

    public int getLegajo()
    {
        return legajo;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return legajo == empleado.legajo;
    }

}
