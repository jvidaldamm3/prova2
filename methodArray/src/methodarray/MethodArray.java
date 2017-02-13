/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodarray;


/**
 *
 * @author palamos
 */
public class MethodArray {
    

    /**
     * Per fer l'intercanvi de variables necessitem utilitzar arrays
     */
    public static void main(String[] args) {
        int a, b, res;
        
        a = 2;
        b = 5;
        res = suma(a,b);
        show(res);
        
        res = multiplica(a, b); // retorna el producte
        show(res); // mostra el valor per pantalla

        res = potencia(a,b);
        show(res);    
    }
    
    private static int suma(int a, int b){
        return a + b;
    }
    
    private static int multiplica(int a, int b){
        return a * b;
    }
    private static int potencia(int a, int b){
        int res = 1;
        
        for(int i = (int)b; i > 0; i--){
            res *= a;
        }
        
       return res;
    }
    
    private static void show(int a){
        System.out.println(a);
    }
    
}
