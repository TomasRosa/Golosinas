import java.util.ArrayList;

public class RepartidoresEnvoltorio
{
    ArrayList<Repartidor> repartidores;

    public RepartidoresEnvoltorio ()
    {
        this.repartidores = new ArrayList<Repartidor>();
    }
    public double calcularSueldoTotalRepartidores ()
    {
        double sueldo = 0;

        for(Repartidor repartidorcito: this.repartidores)
        {
            sueldo = sueldo + repartidorcito.calculoSueldo();
        }
        return sueldo;
    }
}
