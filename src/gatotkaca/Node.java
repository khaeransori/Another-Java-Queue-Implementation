/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatotkaca;

/**
 *
 * @author Amalia
 */
public class Node {
    Node next;
    String data;
    
    public Node() {
        data = null;
    }
    
    public Node(String value) {
        data = value;
    }
    
    public void setNext(Node n) {
        next = n;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setData(String d) {
        data = d;
    }
    
    public String getData() {
        return data;
    }
}