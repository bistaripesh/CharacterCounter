/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Helper.Engine;
import java.util.Scanner;

/**
 *
 * @author Ripesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engine en = new Engine();
        System.out.println("Enter Word");
        //this helps to counts spaces too
        // en.counter(); 
        //----------------------------------
        // this doesn't count spaces 
        en.counterWithoutSpace();
        System.out.println("Do you want to count again?");
    }
}
