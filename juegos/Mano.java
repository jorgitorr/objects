/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_II.juegos;

/**
 *
 * @author jorge
 */
public class Mano {

    private int tamanio;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    
    public Mano() {
        tamanio = 3;
        carta1 = new Carta();
        carta2 = new Carta();
        carta3 = new Carta();
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public void mostrarCarta(int numero){
        if(numero==1){
            System.out.println(carta1);
        }else if(numero == 2){
            System.out.println(carta2);
        }else if(numero == 3){
            System.out.println(carta3);
        }
    }
    
    public void setCarta(int numero){
        if(numero==1){
            carta1.setNumero();
            carta1.setPalo();
        }else if(numero==2){
            carta2.setNumero();
            carta2.setPalo();
        }else if(numero==3){
            carta3.setNumero();
            carta3.setPalo();
        }else{
            System.out.println("La carta no existe");
        }
    }

    @Override
    public String toString() {
        return "Mano{" + "tamanio=" + tamanio + ", carta1=" + carta1 + ", carta2=" + carta2 + ", carta3=" + carta3 + '}';
    }
    
    public void pedirMano(){
        setCarta(1);
        setCarta(2);
        setCarta(3);
    }
    
    public void mostrarMano(){
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta3.mostrarCarta();
    }
    
    public void manoGanadora(Mano mano){
        System.out.println("La mano ganadora es: ");
        //numCartaR : cuenta el numero de cartas rojas de la carta que llama al metodo
        //numCartaParamR : cuenta el numero de cartas rojas de la carta que le pasas por parametro
        int numCarta, numCartaParam;
        int numCartasR = 0, numCartaParamR = 0;
        
        //suma los números de las cartas
        numCarta = this.carta1.getNumero() + this.carta2.getNumero() 
                + this.carta3.getNumero();
        
        numCartaParam = mano.carta1.getNumero() + mano.carta2.getNumero() 
                + mano.carta3.getNumero();
        
        //muestra el ganador 
        if(numCarta>numCartaParam)
            this.mostrarMano();
        else if(numCarta<numCartaParam)
            mano.mostrarMano();
        else{//caso de empate, compara las dos manos
            //carta1 
            if(this.carta1.getPalo()=='c'||
               this.carta1.getPalo()=='r'){
                numCartasR++;
            }else if(mano.carta1.getPalo()=='c'||
                    mano.carta1.getPalo()=='r'){
                numCartaParamR++;
            }
            //carta2
            if(this.carta2.getPalo()=='c'||
               this.carta2.getPalo()=='r'){
                numCartasR++;
            }else if(mano.carta2.getPalo()=='c'||
                    mano.carta2.getPalo()=='r'){
                numCartaParamR++;
            }
            //carta3
            if(this.carta3.getPalo()=='c'||
               this.carta3.getPalo()=='r'){
                numCartasR++;
            }else if(mano.carta3.getPalo()=='c'||
                    mano.carta3.getPalo()=='r'){
                numCartaParamR++;
            }
            
            //muestra el ganador por palo
            if(numCartasR>numCartaParamR)
                this.mostrarMano();
            else
                mano.mostrarMano();
            
        }
    }
    
}
