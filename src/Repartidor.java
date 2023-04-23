public class Repartidor implements calculoSueldo
{
    private int kiloMetroRecorrido;
    private String nombre;
    private String apellido;

    public Repartidor()
    {

    }
    public Repartidor (int kiloMetroRecorrido,String nombre, String apellido)
    {
        this.kiloMetroRecorrido = kiloMetroRecorrido;
        this.nombre = nombre;
        this.apellido =  apellido;
    }
    public double calculoSueldo ()
    {
        return kiloMetroRecorrido * 3;
    }
}
