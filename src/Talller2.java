import java.util.Scanner;

public class Talller2 {


    public void asignarEstaciones(){

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

        //stacion.crearEstaciones(Integer.parseInt(String.valueOf(EstacionesBase)));
        Estacion.crearEstaciones(Integer.parseInt(input));
        Persona.crearPersonas(Integer.parseInt(input2));



    }
}


