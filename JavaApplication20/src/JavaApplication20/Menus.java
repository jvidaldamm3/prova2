/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication20;

/**
 *
 * @author palamos
 */
public class Menus{
    public static void sayHello(){
        System.out.println("Hello from Menus 2\n");
    }
    
    public static void sayBye(){
        System.out.println("Bye bye from Menus 2\n");
        sayWait();
    }
    
    private static void sayWait(){
        System.out.println("Wait from Menus 2\n");
    }
}


