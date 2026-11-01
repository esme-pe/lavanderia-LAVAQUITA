import java.util.Scanner;

public class LavanderiaLaVaquita {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
    String nombre = "";
    String numcel = "";
    double peso = 0;
    String tiposervicio = "";
    String metodopago = "";
    
    System.out.println(" LAVANDERIA LAVAQUITA ");

    do{
        System.out.println(" Nombre del cliente ");
        nombre = in.nextLine();

    } while (nombre.equals(""));

    do{
        System.out.println(" Numero de telefono ");
        numcel = in.nextLine();

    }while (numcel.length() < 10 );

    do{
        System.out.println(" Peso de la ropa (Kg) ");
        peso = in.nextDouble();   
    } while (peso <= 0);
     
    in.nextLine();

    do{
        System.out.println(" Tipo de servicio (Basico / Pesado) ");
        tiposervicio = in.nextLine();
    } while (!tiposervicio.equalsIgnoreCase("Basico") && !tiposervicio.equalsIgnoreCase("básico") && !tiposervicio.equalsIgnoreCase("Pesado") );

    do{
        System.out.println(" Metodo de pago (Efectivo / Tarjeta");
        metodopago = in.nextLine();
    } while (!metodopago.equalsIgnoreCase("Efectivo") && !metodopago.equalsIgnoreCase("Tarjeta"));   
    System.out.println("Hola " + nombre +  " tus datos fueron capturados correctamente.");

    }
  }
