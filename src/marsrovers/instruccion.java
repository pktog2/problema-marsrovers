/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

/**
 *
 * @author yonmigongora@gmail.com
 */
public class instruccion {
    private String instruccion;

    public instruccion() {
    }

    public instruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }    
    
    /**
     * Retorna la siguiente instruccion de acuerdo a la posicion enviada
     *
     * @return 
     */
    public char obtenerInstruccion(int pos){
        return instruccion.charAt(pos);
    }

    @Override
    public String toString() {
        return this.instruccion;
    }
    
}
