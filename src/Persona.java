import java.util.ArrayList;
import java.util.Random;

public class Persona implements Punto2D {

    private int id;
    private double x;
    private double y;

    private int estacionAsociada;

    public Persona(int id, double x, double y) {
        this.id= id;
        this.x = x;
        this.y = y;
        this.estacionAsociada = 0; // Inicialmente no está asociada a ninguna estación
    }

    public void setEstacionAsociada(int estacionAsociada) {
        this.estacionAsociada = estacionAsociada;
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
        return String.format("Persona " +id+ " X = "+x+" Y = "+y+" Estacion Asignada: "+ estacionAsociada+ "}\n");
    }



}
