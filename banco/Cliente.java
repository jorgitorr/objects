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
public class Cliente {
    private String dni;
    private int sueldo;
    private Cuenta cuenta;

    public Cliente(String dni, int sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
        this.cuenta = new Cuenta(0,0,Integer.parseInt(dni));
    }

    public Cliente() {
        this("",0);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", sueld=" + sueldo + ", cuenta=" + cuenta + '}';
    }
    
    public void ingresar_nomina(){
        Scanner sc = new Scanner(System.in);
        int nSueldo = sc.nextInt();
        sueldo += nSueldo;
    }
    
    public void sacar_dinero(String dni, int contrasenia){
        Scanner sc = new Scanner(System.in);
        int retirar;
        if(contrasenia==cuenta.getContrasenia()){
            System.out.println("¿Cuanto deseas retirar?");
            retirar = sc.nextInt();
            if(retirar<=sueldo){
                sueldo -= retirar;
            }else{
                System.out.println("el dinero a retirar es mayor que el dinero "
                        + "disponible");
            }
        }else{
            System.out.println("No es la contrasenia");
        }
    }
    
    /*public static void main(String[] args) {
        Cliente c1 = new Cliente("768768767",3000);
        c1.sacar_dinero("768768767", 768768767);
        System.out.println("el sueldo actual es de: " + c1.getSueldo());
    }*/
    
}
