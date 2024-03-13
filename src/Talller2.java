import java.util.ArrayList;
import java.util.Scanner;

public class Talller2 {
    public static int tiempoDeEjecucion=0;

    public static void asignarEstaciones(int estaciones , int personas){
        Talller2.tiempoDeEjecucion=0;
        double distanciaMinima= 100.0;
        int contadorAccesos =0;

        ArrayList<Estacion> listaEstaciones= Estacion.crearEstaciones(estaciones);
        ArrayList<Persona>listaPersonas= Persona.crearPersonas(personas);

        for (Persona estaPersona:
             listaPersonas) {
            for (Estacion estaEstacion:
                 listaEstaciones) {
                contadorAccesos++;
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

        tiempoDeEjecucion=contadorAccesos;

    }



    public void medirTiempo(int numeroEstaciones, int numeroPersonas, int k){
        int promedioTiempo, mediciones=0;
        for (int i=0; i<=k; i++){
            asignarEstaciones(numeroEstaciones, numeroPersonas);
            mediciones+=tiempoDeEjecucion;
        }
        promedioTiempo=(mediciones/k);
        System.out.println("Con "+numeroEstaciones+" Estaciones y "+numeroPersonas+" El promedio de tiempo fue: "+promedioTiempo  );



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


