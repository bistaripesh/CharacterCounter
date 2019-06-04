/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Util.Input;

/**
 *
 * @author Ripesh
 */
public class Engine {

    //it takes input form the Util.input through Scanner
    Input InputTaker = new Input();

    public int counter() {
        //String word takes input from Input class
        String word = InputTaker.input();

        int b = 0;// b is initialized as 0 so we can use this outside for loop
        for (int i = 0; word.charAt(i) != '/' && word.charAt(i + 1) != '0'; i++) {
            b = i;
        }
        System.out.println(b + 1);
        return b + 1;
        // this retuns the number of alphabets in string with spaces
    }

    public int counterWithoutSpace() {
        //String word takes input from Input class
        String word = InputTaker.input();

        String withOutSpace = word.replaceAll("\\s", "");
        int b = 0;// b is initialized as 0 so we can use this outside for loop
        for (int i = 0; withOutSpace.charAt(i) != '/' && withOutSpace.charAt(i + 1) != '0'; i++) {
            b = i;
        }
        System.out.println(b + 1);
        return b + 1;
        // this retuns the number of alphabets in string without spaces
    }
}
