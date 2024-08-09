
package quiz1sistemasg2;


import java.io.StringReader;
import java.util.Scanner;


public class App {
    
    public static void main(String[] args) {
        
        //Solicitud de tipo de vehiculo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo que estacionó: ");
        String tipoVehiculo = sc.nextLine();
        sc.nextLine();
        
        //Control de tipo de vehiculo
        if(tipoVehiculo != "C" || tipoVehiculo != "M" || tipoVehiculo != "B"){
            System.out.println("Tipo de vehiculo invalido, Asegurese de ingresar el tipo de vehiculo correctamente.");
            return;
        }

        //Solicitud de numero de horas de permanencia
        System.out.println("Ingrese el numero de horas que permaneció el vehiculo: ");
        int nHoras = sc.nextInt();
        sc.nextLine();

        //Solicitar si es estudiante
        System.out.println("El usuario es estudiante?");
        int esEstudiante = sc.nextInt();

        //Control si es estudiante
        if (esEstudiante != "1" || esEstudiante != "2"){
            System.out.println("Datos incorrectos, Asegurese de responder bien: 1: Es estudiante y 2: No es estudiante");
            return;
        }

        System.out.println(calcularValorHora);
       

    }

    /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    public static String calcularValorHora(String tipoVehiculo, int nHoras){
        int valorAdicional = 0;
        int valorHora = 0;
        int valorIn = 0;
        int valorFin = 0;

        switch(tipoVehiculo){

            case "C": 

                if(nHoras <= 3){
                
                valorHora = 5000;
                valorIn = valorHora * nHoras;
                return valorIn;
                break; 

                }else if(nHoras > 3){
                    valorAdicional = (nHoras - 3) * 2000; 
                    valorFin = valorAdicional + (valorHora * nHoras);
                    return valorFin;  
                    break; 
                } 

             case "M": 
                if(nHoras <= 3){
                  
                valorHora = 3000;
                valorIn = valorHora * nHoras;
                return valorIn;
                break; 

                   }else if(nHoras > 3){
                        valorAdicional = (nHoras - 3) * 2000;
                        valorFin = valorAdicional + (valorHora * nHoras);
                        return valorFin; 
                        break; 
                  }

            case "B": 
              if(nHoras <= 3){
                
                valorHora = 1000;
                valorIn = valorHora * nHoras;
                return valorIn;
                break; 
              
                }else if(nHoras > 3){
                    valorAdicional = (nHoras - 3) * 2000;
                    valorFin = valorAdicional + (valorHora * nHoras);
                    return valorFin;
                    break; 
                }

            default: 



        }
           
    }

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
        public static int calcularDescuento(int valorTotal, int esEstudiante, int nHoras, int valorDescuento){
            
            try {
                
                if(nHoras >= 4 && esEstudiante == 1){

                    valorDescuento = (valorFin * 0.30) * 0.5;
                    valorTotal = valorFin - valorDescuento;
                    return valorTotal;
                    break;

                }   else if(nHoras >= 4 && esEstudiante == 2){

                    valorDescuento = valorFin * 0.30;
                    valorTotal = valorFin - valorDescuento;
                    return valorTotal;
                    break;

                    } else if(nHoras < 4 && esEstudiante == 1){

                        valorDescuento = valorFin * 0.5;
                        valorTotal = valorFin - valorDescuento;
                        return valorTotal;
                        break;

                    }   

            } catch (Exception e) {
                return -1;
            }

        }
        
    }

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    
    public static String calcularFactura(int nHoras, int valorDescuento){

         System.out.println();


    }


    //------------------------------------------------------------------


