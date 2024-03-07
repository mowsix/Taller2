import java.util.ArrayList;
import java.util.Random;

public class Persona implements Punto2D {

    private int id;
    private double x;
    private double y;
    private Estacion estacionAsociada;

    public Persona(int id, double x, double y) {
        this.id= id;
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

    public static ArrayList<Persona> crearPersonas(int CantidadPersonas){
        ArrayList<Persona> Personas = new ArrayList<>();

        for (int i = 1; i<=CantidadPersonas; i++){
            Random random = new Random();
            double coordenadaX = random.nextDouble() * 10.0;
            double coordenadaY = random.nextDouble() * 10.0;
            Personas.add(new Persona(i,coordenadaX,coordenadaY));
        }

        for (Persona Persona:
                Personas) {
            System.out.println(Persona);
        }



        return Personas;
    }

    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Persona " +id+ " X = "+x+" Y = "+y+"}\n");
    }



}
