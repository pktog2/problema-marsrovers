/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

/**
 *
 * @author yonmigongora@gmail.com
 */
public class coordenada {
    private static char[] puntos = {'N', 'E', 'S', 'O'};
    private char puntocardinal;

    public coordenada() {
        
    }
    /**
     * Retorna la posicion del caracter enviado.
     *
     * @return 
     */
    public int buscarPos(char car){
        int pos = -1;
        for (int i = 0; i < puntos.length; i++) {
            if(puntos[i] == car){
                pos = i;
            }
        }
        return pos;
    }
    
    /**
     * Retorna el siguiente punto cardinal de acuerdo a la posicion enviada.
     *
     * @return 
     */
    public char siguiente(int p){
        if(p<puntos.length-1){
            return puntos[p+1];
        }
        return puntos[0];
    }
    
    /**
     * Retorna el anterior punto cardinal de acuerdo a la posicion enviada.
     *
     * @return 
     */
    public char anterior(int p){
        if(p>0){
            return puntos[p-1];
        }
        return puntos[puntos.length-1];
    }

    public char getPuntocardinal() {
        return puntocardinal;
    }

    public void setPuntocardinal(char puntocardinal) {
        this.puntocardinal = puntocardinal;
    }
    
}
