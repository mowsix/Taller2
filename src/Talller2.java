import java.util.ArrayList;
import java.util.Scanner;

public class Talller2 {

    //Elaborado por:
    // Santiago Gallego Henao
    // Sebastián Forero Duque
    // Sebastián Villa Vargas
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

        /*
        PARA IMPRIMIR LAS PERSONAS UNA VEZ YA TENGAN ASIGNADA UNA ESTACION
        System.out.println("PERSONAS CON ESTACIONES");
        for (Persona Persona:
                listaPersonas) {
            System.out.println(Persona);
        }
        */
        tiempoDeEjecucion=contadorAccesos;
    }



    public static void medirTiempo(int numeroEstaciones, int numeroPersonas, int k){

        long inicio = System.currentTimeMillis();
        double promedioTiempo, mediciones=0;
        for (int i=0; i<k; i++){

            //System.out.println("TIEMPO DE EJECUCION  "+tiempoDeEjecucion );
            asignarEstaciones(numeroEstaciones, numeroPersonas);
            mediciones+=tiempoDeEjecucion;
        }
        long fin = System.currentTimeMillis();

        promedioTiempo=fin - inicio;
        System.out.println("Con "+numeroEstaciones+" Estaciones y "+numeroPersonas+" Personas, El promedio de tiempo fue: "+promedioTiempo/1000);//para que sea en segundos

    }






    public static void main(String[] args) {

        //PARA HACER 1 SOLA SIMULACION CON ESTACIONES Y PERSONAS INGRESADAS POR CONSOLA:
        /*
        System.out.println("Ingrese El numero de Estaciones: ");
        Scanner cantidadEstacionesBase = new Scanner(System.in);
        String input = cantidadEstacionesBase.nextLine();

        System.out.println("Ingrese El numero de Personas: ");
        Scanner cantidadPersonas = new Scanner(System.in);
        String input2 = cantidadPersonas.nextLine();
        int numeroEstaciones= Integer.parseInt(input);
        int numeropersonas= Integer.parseInt(input2);


        asignarEstaciones(numeroEstaciones,numeropersonas);*/
        //MEDICIONES PARA 10 ESTACIONES
        System.out.println("\n=====MEDICIONES PARA 10 ESTACIONES======");
        medirTiempo(10,1000,10);
        medirTiempo(10,5000,10);
        medirTiempo(10,20000,10);
        medirTiempo(10,50000,10);
        medirTiempo(10,75000,10);
        medirTiempo(10,100000,10);

        //MEDICIONES PARA 50 ESTACIONES
        System.out.println("\n=====MEDICIONES PARA 50 ESTACIONES======");
        medirTiempo(50,1000,10);
        medirTiempo(50,5000,10);
        medirTiempo(50,20000,10);
        medirTiempo(50,50000,10);
        medirTiempo(50,75000,10);
        medirTiempo(50,100000,10);


        //MEDICIONES PARA 100 ESTACIONES
        System.out.println("\n=====MEDICIONES PARA 100 ESTACIONES======");
        medirTiempo(100,1000,10);
        medirTiempo(100,5000,10);
        medirTiempo(100,20000,10);
        medirTiempo(100,50000,10);
        medirTiempo(100,75000,10);
        medirTiempo(100,100000,10);

    }
}


