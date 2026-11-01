package lavanderia_LAVAQUITA;
import java.util.Scanner;

public class Menu_Principal {
    static Scanner sc = new Scanner(System.in);

    //Espacio para funsiones (minimo 5)





    public static void main(String[] args){
        //aqui se declararán las variables de los datos
        int opMainMenu;
        int opMetodoPago;
        int opContinuar;
        int opServicio;
        do{
            System.out.println("LAVANDERIA LAVAQUITA");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1• Registrarce");
            System.out.println("2• Sercicios");
            System.out.println("3• Reportes");
            System.out.println("4• Salir");
            opMainMenu = sc.nextInt();
            switch (opMainMenu){
                case 1: 
                        System.out.println("REGISTRO");
                        System.out.println("Nombre: ");
                        //Pedir variable con scanner y validarla
                        System.out.println("Num. de celular: ");
                        //Pedir variable con scanner y validarla
                        System.out.println("Metodo de pago: ");
                        System.out.println("1• Efectivo");
                        System.out.println("2• Tarjeta");
                        opMetodoPago = sc.nextInt();
                        //Pedir variable con scanner y validarla
                        do{
                            System.out.println("1• Continuar");
                            System.out.println("2• Volver");
                            opContinuar = sc.nextInt();
                            if(opContinuar > 2 || opContinuar == 0){
                                System.out.println("Opcion erronea");
                            }
                        }while(opContinuar > 2 || opContinuar == 0);
                        if(opContinuar == 2){
                            break;
                        }
                        
                case 2:
                        System.out.println("SERVICIOS");
                        System.out.println("Peso de la ropa: ");
                        //Pedir variable con scanner y validarla
                        System.out.println("Tipo de servicio: ");
                        System.out.println("1• Lavado básico");
                        System.out.println("2• Lavado pesado");
                        opServicio = sc.nextInt();
                        //Pedir variable con scanner y validarla
                        //En este espacio se realizaran los calculos necesarios para el pedido (Subtotal, descuentos, IVA, total, etc)
                        do{
                            System.out.println("1• Continuar");
                            System.out.println("2• Volver");
                            opContinuar = sc.nextInt();
                            if(opContinuar > 2 || opContinuar == 0){
                                System.out.println("Opcion erronea");
                            }
                        }while(opContinuar > 2 || opContinuar == 0);
                        if(opContinuar == 2){
                            break;
                        }
                case 3:
                        //Falta asignar las variables que se mostrarán
                        System.out.println("TICKET");
                        System.out.println("Nombre: ");
                        System.out.println("Num. celular: ");
                        System.out.println("Peso de ropa: ");
                        System.out.println("Tipo de servicio: ");
                        System.out.println("Precio por kg: ");
                        System.out.println("Método de pago: ");
                        System.out.println("Subtotal: ");
                        System.out.println("Descuento: ");
                        System.out.println("IVA: ");
                        System.out.println("Total: ");
                        do{
                            System.out.println("1• Volver");
                            opContinuar = sc.nextInt();
                            if(opContinuar != 1){
                                System.out.println("Opcion erronea");
                            }
                        }while(opContinuar != 1);
                        break;
                case 4: System.out.println("¡Vuelva pronto!");break;
                default: System.out.println("Opcion erronea");
            }
        }while(opMainMenu != 4);
        sc.close();
    }
}
