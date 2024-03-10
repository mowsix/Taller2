import java.util.ArrayList;
import java.util.Scanner;

public class Talller2 {


    public static void asignarEstaciones(int estaciones , int personas){
        ArrayList<Estacion> listaEstaciones= Estacion.crearEstaciones(estaciones);
        ArrayList<Persona>listaPersonas= Persona.crearPersonas(personas);

        double distanciaMinima= 100.0;
        for (Persona estaPersona:
             listaPersonas) {
            for (Estacion estaEstacion:
                 listaEstaciones) {
                double distancia= Math.sqrt((Math.pow((estaPersona.getX()-estaEstacion.getX()),2))+(Math.pow((estaPersona.getY()-estaEstacion.getY()),2)));
                if (distancia<distanciaMinima){
                    distanciaMinima=distancia;
                    estaPersona.setEstacionAsociada(estaEstacion.getId());
                }
            }
            distanciaMinima=100.0;
        }


        System.out.println("PERSONAS CON ESTACIONESSSSSSSS");
        for (Persona Persona:
                listaPersonas) {
            System.out.println(Persona);
        }
    }

    public void medirTiempo(){

    }




























    public static void main(String[] args) {


        System.out.println("Ingrese El numero de Estaciones: ");
        Scanner cantidadEstacionesBase = new Scanner(System.in);
        String input = cantidadEstacionesBase.nextLine();

        System.out.println("Ingrese El numero de Personas: ");
        Scanner cantidadPersonas = new Scanner(System.in);
        String input2 = cantidadPersonas.nextLine();

        int numeroEstaciones= Integer.parseInt(input);
        int numeropersonas= Integer.parseInt(input2);


        //Estacion.crearEstaciones(Integer.parseInt(input));
        //Persona.crearPersonas(Integer.parseInt(input2));

        asignarEstaciones(numeroEstaciones,numeropersonas);




    }
}


