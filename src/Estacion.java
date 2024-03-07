import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Estacion implements Punto2D {
    private double x;
    private double y;

    public Estacion(double x, double y) {
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

        for (int i = 0; i<=CantidadEstaciones; i++){
            Random random = new Random();
            double coordenadaX = random.nextDouble() * 10.0;
            double coordenadaY = random.nextDouble() * 10.0;
            Estaciones.add(new Estacion(coordenadaX,coordenadaY));
        }

        for (Estacion Estacion:
             Estaciones) {
            System.out.println(Estacion);
        }



        return Estaciones;
    }
}
