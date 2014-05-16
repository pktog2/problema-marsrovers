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
public class instruccion {
    private String instruccion;

    public instruccion() {
    }

    public instruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
    public char obtenerInstruccion(int pos){
        return instruccion.charAt(pos);
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
    @Override
    public String toString() {
        return this.instruccion;
    }
    
}
