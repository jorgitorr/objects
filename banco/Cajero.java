/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosEjercicio_II.banco;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seleccion, respuesta;
        Cliente cliente1 = new Cliente("987654", 1200);
        Cuenta cuenta1 = new Cuenta(123456789,1500,987654);
        //introduce la cuenta1 en el cliente1
        cliente1.setCuenta(cuenta1);
        
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("------------------");
        System.out.println("1. Consultar/Modificar Datos personales");
        System.out.println("2. Ingresar Nomina");
        System.out.println("3. Consultar Datos Bancarios");
        System.out.println("4. Sacar Dinero");
        System.out.println("5. Modificar Contrasenia");
        System.out.println("6. Salir");
        
        seleccion = sc.nextLine();
        
        while(!seleccion.equalsIgnoreCase("6")){
            switch(seleccion){
                case "1":
                    cliente1.getDni();
                    cliente1.getSueldo();
                    System.out.println("Quieres modificar los datos?(si)");
                    respuesta = sc.nextLine();
                    if(respuesta.equalsIgnoreCase("si")){
                        System.out.println("Introduce el nuevo dni: ");
                        String dni = sc.nextLine();
                        cliente1.setDni(dni);
                        System.out.println("Introduce el nuevo sueldo: ");
                        int sueldo = sc.nextInt();
                        cliente1.setSueldo(sueldo);
                    }
                    break;
                case "2":
                    System.out.println("Introduce el sueldo: ");
                    int sueldo = sc.nextInt();
                    cliente1.setSueldo(sueldo);
                    break;
                case "3":
                    System.out.println("Introduce la contrasenia");
                    int contrasenia = sc.nextInt();
                    if(cuenta1.validar_contrasenia(contrasenia)){
                        cuenta1.mostrar_datos(contrasenia);
                    }else{
                        System.out.println("Contrasenia erronea");
                    }
                    sc.nextLine();
                    break;
                case "4":
                    //por si he cambiado la contrasenia tengo que pedir los datos
                    System.out.println("Introduce tu dni");
                    String dni = sc.nextLine();
                    System.out.println("Introduce la contrasenia");
                    int contrasenia2 = sc.nextInt();
                    
                    System.out.println("Cuénto dinero deseas retirar");
                    int sueldoRetirar = sc.nextInt();
                    cliente1.sacar_dinero(dni, contrasenia2);
                    break;
                case "5":
                    cuenta1.modificar_cotrasenia();
                    break;
                case "6":
                    System.out.println("Salir...");
                    break; 
            }
            
            
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("------------------");
            System.out.println("1. Consultar/Modificar Datos personales");
            System.out.println("2. Ingresar Nomina");
            System.out.println("3. Consultar Datos Bancarios");
            System.out.println("4. Sacar Dinero");
            System.out.println("5. Modificar Contrasenia");
            System.out.println("6. Salir");
            seleccion = sc.nextLine();
        }
        
    }
}
