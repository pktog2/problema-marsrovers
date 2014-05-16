/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

import java.util.ArrayList;

/**
 *
 * @author cristianomichel
 */
public class origen {
    private int x;
    private int y;
    private char coordenada;
    private String instruccion;

    public origen() {
        
    }

    public origen(int x, int y, String coordenada, String instruccion) {
        this.x = x;
        this.y = y;
        this.coordenada = coordenada.charAt(0);
        this.instruccion = instruccion;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(char coordenada) {
        this.coordenada = coordenada;
    }
    
    public int longitudInstrucion(){
        return instruccion.toString().length();
    }

    public char obtenerInstruccion(int pos){
        return instruccion.charAt(pos);
    }    
    
    @Override
    public String toString() {
        return "X="+String.valueOf(this.x)+", Y="+String.valueOf(this.y)+", PC:"+this.coordenada+", Ins:"+this.instruccion;
    }

}
