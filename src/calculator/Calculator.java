/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Think
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Operations ops = new Operations();
        System.out.println("1 + 2 = " + ops.add(1, 2));
    }

    
}
