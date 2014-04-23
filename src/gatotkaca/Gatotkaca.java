/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatotkaca;

import java.util.Scanner;

/**
 *
 * @author Amalia
 */
public class Gatotkaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input   = new Scanner(System.in);
        Queue sd   = new Queue();
        Queue smp  = new Queue();
        Queue sma  = new Queue();
        
        sd.enqueue("Khaer");
        sd.enqueue("Ansori");
        
        smp.enqueue("Nurul");
        smp.enqueue("Amalia");
        smp.enqueue("Dewi");
        
        sma.enqueue("gatotkaca");
        sma.enqueue("labs");
        sma.enqueue("mahabarata");
        
        sd.print();
        
        smp.print();
        
        sma.print();
        
        sd.dequeue();
        sd.print();
    }
}
