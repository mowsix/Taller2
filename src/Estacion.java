import java.util.ArrayList;
import java.util.Random;

public class Estacion implements Punto2D {

    private int id;
    private double x;
    private double y;


    public int getId() {
        return id;
    }



    public Estacion(int id, double x, double y) {
        this.id=id;
        this.x = x;
        this.y = y;
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


    public static ArrayList<Estacion> crearEstaciones(int CantidadEstaciones){
        ArrayList<Estacion> Estaciones = new ArrayList<>();

        for (int i = 1; i<=CantidadEstaciones; i++){
            Random random = new Random();
            double coordenadaX = random.nextDouble() * 10.0;
            double coordenadaY = random.nextDouble() * 10.0;
            Estaciones.add(new Estacion(i,coordenadaX,coordenadaY));
        }

        /*
        for (Estacion Estacion:
             Estaciones) {
            System.out.println(Estacion);
        }
        */




        return Estaciones;
    }


    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Estacion " +id+ " X = "+x+" Y = "+y+"}\n");
    }
}
