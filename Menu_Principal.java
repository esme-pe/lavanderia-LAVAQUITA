import java.util.Scanner;

public class Menu_Principal{
    static Scanner sc = new Scanner(System.in);

    //Espacio para funciones (minimo 5)

    public static void main(String args[]){
        int opMainMenu;
        int opContinuar;
        
        String nombre = "";
        String numcel = "";
        double peso = 0;
        String tiposervicio = "";
        String metodopago = "";
        
        do{
            System.out.println("LAVANDERIA LAVAQUITA");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1• Registrarse");
            System.out.println("2• Servicios");
            System.out.println("3• Reportes");
            System.out.println("4• Salir");
            opMainMenu = sc.nextInt();
            
            sc.nextLine(); 

            switch (opMainMenu){
                case 1: 
                        System.out.println("REGISTRO");
                        
                        do{
                           System.out.println(" Nombre del cliente ");
                            nombre = sc.nextLine();
                             if(nombre.length() < 3){
                               System.out.println("El nombre debe tener al menos 3 caracteres, vuelve a intentarlo.");
                             }
                        } while (nombre.length() < 3);

                        do{
                           System.out.println(" Numero de telefono ");
                            numcel = sc.nextLine();
                             if(numcel.length() < 10){
                              System.out.println("deben ser los 10 digitos del numero telefonico, vuelve a intentarlo.");
                             }
                        }while (numcel.length() < 10 );

                        do{
                            System.out.println(" Metodo de pago (Efectivo / Tarjeta)");
                            metodopago = sc.nextLine();
                            if(!metodopago.equalsIgnoreCase("Efectivo") && !metodopago.equalsIgnoreCase("Tarjeta")){
                                System.out.println("Dato incorrecto, vuelve a intentarlo.");
                            }
                        } while (!metodopago.equalsIgnoreCase("Efectivo") && !metodopago.equalsIgnoreCase("Tarjeta")); 

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
                        
                        break; 
                        
                case 2:
                        System.out.println("SERVICIOS");
                        
                        do{
                            System.out.println(" Tipo de servicio (Basico / Pesado) ");
                            tiposervicio = sc.nextLine();
                            if(!tiposervicio.equalsIgnoreCase("Basico") && !tiposervicio.equalsIgnoreCase("Básico") && !tiposervicio.equalsIgnoreCase("Pesado")){
                                System.out.println("Servicio no reconocido, vuelve a intentarlo.");
                            }
                        } while (!tiposervicio.equalsIgnoreCase("Basico") && !tiposervicio.equalsIgnoreCase("Básico") && !tiposervicio.equalsIgnoreCase("Pesado") );
                        
                        
                        do{ 
                            System.out.println(" Peso de la ropa (Kg) ");
                            if (sc.hasNextDouble()) {
                                peso = sc.nextDouble();   
                                if (peso <= 0) {
                                    System.out.println("El peso no puede ser cero o negativo, vuelve a intentarlo.");
                                }
                            } else {
                                System.out.println("No puedes ingresar letras, vuelve a intentarlo usando números.");
                                sc.nextLine(); 
                                peso = 0;
                            }
                        } while (peso <= 0);
                        
                        sc.nextLine();
                        

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
                        
                        break;

                case 3:
                        System.out.println("TICKET");
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Num. celular: " + numcel);
                        System.out.println("Peso de ropa: " + peso);
                        System.out.println("Tipo de servicio: " + tiposervicio);
                        System.out.println("Precio por kg: ");
                        System.out.println("Método de pago: " + metodopago);
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