/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosEjercicio_II.banco;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Cuenta {
    private int numCuenta;
    private int saldo;
    private int contrasenia;

    public Cuenta(int numCuenta, int saldo, int contrasenia) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.contrasenia = contrasenia;
    }

    public Cuenta() {
        this(0,0,0);
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + ", contrasenia=" + contrasenia + '}';
    }
    
    /**
     * recibe el dinero a ingresar o a retirar
     * @param dinero 
     */
    protected void modificar_saldo(double dinero){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Deseas ingresar o retirar el dinero?(ingresar/retirar)");
        String accion = sc.nextLine();
        if(accion.equalsIgnoreCase("ingresar")){
            saldo += dinero;
        }else if(accion.equalsIgnoreCase("retirar")){
            saldo -= dinero;
        }else{
            System.out.println("No se conoce la operación");
        }
    }
    
    private int generar_contrasenia(){
        Random rnd = new Random();
        contrasenia = rnd.nextInt(9999)+1000;
        return contrasenia;
    }
    
    public void modificar_cotrasenia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña actual: ");
        int nContrasenia = sc.nextInt();
        if(nContrasenia != contrasenia){
            System.out.println("Error. Las contrasenias no son iguales");
        }else{
            System.out.println("Introduce la nueva contrasenia: ");
            nContrasenia = sc.nextInt();
            contrasenia = nContrasenia;
            System.out.println("La contrasenia actual es: " + contrasenia);
        }
    }
    
    public boolean validar_contrasenia(int contrasenia){
        boolean iguales = false;
        if(this.contrasenia == contrasenia){
            iguales = true;
        }
        return iguales;
    }
    
    public void mostrar_datos(int contrasenia){
        if(this.contrasenia == contrasenia){
            System.out.println("numero cuenta: " + numCuenta);
            System.out.println("saldo: " + saldo);
        }
    }
    
    /*public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        System.out.println(c1.generar_contrasenia());
        c1.modificar_cotrasenia();
        System.out.println(c1.validar_contrasenia(7641));
    }*/
}
