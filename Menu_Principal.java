import java.util.Scanner;

public class Menu_Principal{
    static Scanner sc = new Scanner(System.in);
        static final double PRECIO_BASICO = 20.0;
        static final double PRECIO_PESADO = 35.0;
        static final double PORCENTAJE = 0.20; // 20% de descuento
        static final double IVA_PORCENTAJE = 0.16; //IVA
        static final double PESO_MINIMO = 5.0; //Peso minimo para aplicar descuento
    //Espacio para funciones (minimo 5)
    public static double obtenerPrecioPorKg(String tiposervicio){
        double precio = 0;
        if(tiposervicio.equalsIgnoreCase("Basico") || tiposervicio.equalsIgnoreCase("Básico")){
            precio = PRECIO_BASICO;
        } else if(tiposervicio.equalsIgnoreCase("Pesado")){
            precio = PRECIO_PESADO;
        }
        return precio;
    }
//calcula el subtotal multiplicando el peso por el precio por kg
    public static double calcularSubtotal(double peso, double precioPorKg){
        double subtotal = peso * precioPorKg;
        return subtotal;
    }

    public static double calcularDescuento(double subtotal, double peso){
        double descuento = 0;
        if(peso >= PESO_MINIMO){
            descuento = subtotal * PORCENTAJE;
        }
        return descuento;
    }

    public static double calcularIVA(double subtotal){
        double iva = subtotal * IVA_PORCENTAJE;
        return iva;
    }

    public static double calcularTotal(double subtotal, double descuento, double iva){
        double total = subtotal - descuento + iva;
        return total;
    }

    public static void main(String args[]){
        int opMainMenu;
        int opContinuar;
        
        String nombre = "";
        String numcel = "";
        double peso = 0;
        String tiposervicio = "";
        String metodopago = "";

        double precioPorKg = 0;
        double subtotal = 0;
        double descuento = 0;
        double iva = 0; 
        double total = 0;

        boolean registrado = false;
        boolean servicioActivo = false;

        int contadorServicios = 0;
        
        do{
            System.out.println("================================");
            System.out.println("LAVANDERIA LAVAQUITA");
            System.out.println("================================");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1• Registrarse");
            System.out.println("2• Servicios");
            System.out.println("3• Reportes");
            System.out.println("4• Salir");
            opMainMenu = sc.nextInt();
            
            sc.nextLine(); 

            switch (opMainMenu){
                case 1: 
                        System.out.println("================================");
                        System.out.println("REGISTRO");
                        System.out.println("================================");
                        
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

                        registrado = true;

                        do{
                            System.out.print("1• Continuar     ");
                            System.out.println("2• Volver");
                            opContinuar = sc.nextInt();
                            if(opContinuar > 2 || opContinuar <= 0){
                                System.out.println("Opcion erronea");
                            }
                        }while(opContinuar > 2 || opContinuar <= 0);
                        if(opContinuar == 2){
                            break;
                        }
                        
                        
                        
                case 2:
                        if(registrado == true){
                            System.out.println("================================");
                            System.out.println("SERVICIOS");
                            System.out.println("================================");
                        
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
                            precioPorKg = obtenerPrecioPorKg(tiposervicio);
                            subtotal = calcularSubtotal(peso, precioPorKg);
                            iva = calcularIVA(subtotal);
                            descuento = calcularDescuento(subtotal, peso);
                            total = calcularTotal(subtotal, descuento, iva);

                            servicioActivo = true;

                            do{
                                System.out.print("1• Continuar     ");
                                System.out.println("2• Volver");
                                opContinuar = sc.nextInt();
                                if(opContinuar > 2 || opContinuar <= 0 ){
                                    System.out.println("Opcion erronea");
                                }
                            }while(opContinuar > 2 || opContinuar <= 0);
                            if(opContinuar == 2){
                                break;
                            }
                        }else{
                            System.out.println("No estas registrado");
                            do{
                                System.out.println("1• Volver");
                                opContinuar = sc.nextInt();
                                    if(opContinuar != 1){
                                        System.out.println("Opcion erronea");
                                }
                            }while(opContinuar != 1);
                            break;
                        }
                        

                case 3:
                        if(servicioActivo == true){
                            System.out.println("================================");
                            System.out.println("TICKET");
                            System.out.println("================================");
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Num. celular: " + numcel);
                            System.out.println("Peso de ropa: " + peso + "kg");
                            System.out.println("Tipo de servicio: " + tiposervicio);
                            System.out.println("Precio por kg: $" + precioPorKg);
                            System.out.println("Método de pago: " + metodopago);
                            // mi parte de calculos 
                            System.out.println("Subtotal: $" + subtotal);
                            System.out.println("Descuento: -$" + descuento);
                            System.out.println("IVA: +$" + iva);
                            System.out.println("Total: $" + total);

                            nombre = "";
                            numcel = "";
                            peso = 0;
                            tiposervicio = "";
                            metodopago = "";

                            precioPorKg = 0;
                            subtotal = 0;
                            descuento = 0;
                            iva = 0; 
                            total = 0;

                            registrado = false;
                            servicioActivo = false;

                            contadorServicios ++;
                            
                            do{
                                System.out.println("1• Volver");
                                opContinuar = sc.nextInt();
                                if(opContinuar != 1){
                                    System.out.println("Opcion erronea");
                                }
                            }while(opContinuar != 1);
                            break;
                        }else{
                            System.out.println("No tienes un servicio activo");
                            do{
                                System.out.println("1• Volver");
                                opContinuar = sc.nextInt();
                                if(opContinuar != 1){
                                    System.out.println("Opcion erronea");
                                }
                            }while(opContinuar != 1);
                            break;
                        }


                case 4: 
                        System.out.println("--------------------------------");
                        System.out.println("Servicios realizados: " + contadorServicios);
                        System.out.println("¡Vuelva pronto!");break;
                default: System.out.println("Opcion erronea");
            }
        }while(opMainMenu != 4);
        sc.close();
    }
}