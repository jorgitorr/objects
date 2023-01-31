/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_II.personas;


/**
 *
 * @author jorge
 */
public class Alumno {
    
    private String dni;
    private int edad;
    private int nota1T;
    private int nota2T;
    private int nota3T;

    public Alumno(String dni, int edad) {
        this.dni = dni;
        this.edad = edad;
        this.nota1T = -1;
        this.nota2T = -1;
        this.nota3T = -1;
    }

    public Alumno() {
        this("",0);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota1T() {
        return nota1T;
    }

    public void setNota1T(int nota1T) {
        this.nota1T = nota1T;
    }

    public int getNota2T() {
        return nota2T;
    }

    public void setNota2T(int nota2T) {
        this.nota2T = nota2T;
    }

    public int getNota3T() {
        return nota3T;
    }

    public void setNota3T(int nota3T) {
        this.nota3T = nota3T;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", edad=" + edad + ", nota1T=" + nota1T + ", nota2T=" + nota2T + ", nota3T=" + nota3T + '}';
    }
    
    public int notaFinal(){
        int notaFinal = -1;
        if(nota1T!=-1 && nota2T!=-1 && nota3T!=-1){
           notaFinal = (nota1T+nota2T+nota3T)/3;
        }
        return notaFinal;
    }
    
    public void informeAlumno(){
        System.out.println(dni);
        System.out.println(edad);
        System.out.println(nota1T);
        System.out.println(nota2T);
        System.out.println(nota3T);
        System.out.println(notaFinal());
    }
    
    
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setDni("68678768567A");
        a1.setEdad(12);
        a1.setNota1T(5);
        a1.setNota2T(5);
        a1.setNota3T(5);
        
        
        a1.informeAlumno();
        
    }
    
}
