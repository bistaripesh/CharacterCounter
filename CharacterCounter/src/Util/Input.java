/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author Ripesh
 */
public class Input {

    public String input() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine() + "/0";
        /* /0 looks very rare and to stop counting I took 
         reference as /0 to stop the loop in class Engine
         */
        return word;
    }
}
