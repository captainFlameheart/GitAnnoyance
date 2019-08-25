/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitannoyance;

/**
 *
 * @author jonat
 */
public class GitAnnoyance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args[0].equals("Hello World")) {
            System.out.println("Ah that's a classic!");
        }
        if (args[0].equals("Hello")) {
            System.out.println("Hi!");
        }
        if (args[0].equals("Bye")) {
            System.out.println("Die!");
        }
    }

}
