/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author cristianomichel
 */
public class Console {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<origen> lista = new ArrayList<>();
        int num1, num2, num3 ,num4, num5;
        String cad1, cad2, opcion;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido ");
    	System.out.print("Ingrese las coordenadas superiores: ");
    	num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        System.out.println("**************");
        System.out.print("Numero de ROVERS : ");
        num5 = teclado.nextInt();
        for (int i = 0; i < num5; i++) {
            System.out.println("**************");
            System.out.print("Ingrese la primera linea: ");
            num3 = teclado.nextInt();
            num4 = teclado.nextInt();
            cad1 = teclado.next();
            System.out.print("Ingrese la segunda linea: ");
            cad2 = teclado.next();
            origen o = new origen(num3, num4, cad1, cad2);
            lista.add(o);
        }
        System.out.println("**************");
        System.out.println("Respuesta:");
        mostrarRes(ejecutar(lista));
        opcion = teclado.next();
        
    }
    
    public static void mostrarRes(ArrayList<origen> destino){
        for (int i = 0; i < destino.size(); i++) {
            System.out.print(destino.get(i).getX()+" "+destino.get(i).getY()+" "+destino.get(i).getCoordenada());
            System.out.println();
        }
    }

    public static ArrayList<origen> ejecutar(ArrayList<origen> origen){
        char caracter=' ';
        coordenada c;
        int pos=-1, sum;
        //ArrayList<origen> destino = null;
        for(int i = 0; i < origen.size(); i++){
            
            for (int j = 0; j < origen.get(i).longitudInstrucion(); j++) {
                caracter = origen.get(i).obtenerInstruccion(j);
                switch (origen.get(i).obtenerInstruccion(j)) {
                    case 'L':    // 90° a la izquierda misma posicion
                        c = new coordenada();
                        pos = c.buscarPos(origen.get(i).getCoordenada());
                        origen.get(i).setCoordenada(c.anterior(pos));
                    break;
                    case 'R':    // 90° a la derecha misma 
                        c = new coordenada();
                        pos = c.buscarPos(origen.get(i).getCoordenada());
                        origen.get(i).setCoordenada(c.siguiente(pos));
                    break;
                    case 'M':    // Avanzar
                        if(origen.get(i).getCoordenada()=='N'){
                            sum = origen.get(i).getY() + 1;
                            origen.get(i).setY(sum);
                        }
                        if(origen.get(i).getCoordenada()=='E'){
                            sum = origen.get(i).getX() + 1;
                            origen.get(i).setX(sum);
                        }
                        if(origen.get(i).getCoordenada()=='S'){
                            sum = origen.get(i).getY() - 1;
                            origen.get(i).setY(sum);
                        }
                        if(origen.get(i).getCoordenada()=='O'){
                            sum = origen.get(i).getX() - 1;
                            origen.get(i).setX(sum);
                        }
                    break;
                }
            }
        }  
        return origen;
    }
    
}
