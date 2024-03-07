import java.util.ArrayList;

public class Persona implements Punto2D {
    private double x;
    private double y;
    private Estacion estacionAsociada;

    public Persona(double x, double y) {
        this.x = x;
        this.y = y;
        this.estacionAsociada = null; // Inicialmente no está asociada a ninguna estación
    }

    public Estacion getEstacionAsociada() {
        return estacionAsociada;
    }

    public void asignarEstacion(Estacion estacion) {
        //TODO compara esta Persona con la distancia que tiene con cada estacion existente y le asigna la mas cercana con metodo burbuja maximizado
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double distancia(Punto2D punto) {
        return 0;
    }

    public static ArrayList<Estacion> crearPersonas(int CantidadPersonas){
        ArrayList<Estacion> Personas = new ArrayList<>();

        return Personas;
    }



}
