/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatotkaca;

/**
 *
 * @author Amalia
 */
public class LinkedList {
    Node first;
    
    public void addFirst(String value) {
        Node baru = new Node(value);
        baru.setNext(first);
        first = baru;
    }
    
    public String getFirst() {
        return first.getData();
    }
    
    public String removeFirst() {
        Node tmp    = first;
        first       = first.getNext();
        return tmp.getData();
    }
    
    public String getLast() {
        Node tmp    = first;
        while(null != tmp.getNext()) {
            tmp = tmp.getNext();
        }
        return tmp.getData();
    }
    
    public void addLast(String value) {
        Node baru   = new Node(value);
        Node tmp    = first;
        if (null == first) {
            addFirst(value);
        } else {
            while(null != tmp.getNext()) {
                tmp = tmp.getNext();
            }
            
            tmp.setNext(baru);
        }
    }
    
    public String removeLast() {
        Node tmp = first;
        String x;
        if (null == first) {
            return null;
        } else if (null == first.getNext()) {
            return removeFirst();
        } else {
            while(null != tmp.getNext().getNext()) {
                tmp = tmp.getNext();
            }
            x = tmp.getNext().getData();
            tmp.setNext(null);
            return x;
        }
    }
    
    public void addAfterFirst(String value) {
        Node baru = new Node(value);
        baru.setNext(first.getNext());
        first.setNext(baru);
    }
    
    public void addBerforeLast(String value) {
        Node tmp    = first;
        Node baru   = new Node(value);
        while(null != tmp.getNext().getNext()) {
            tmp.getNext();
            baru.setNext(tmp.getNext());
            tmp.setNext(baru);
        }
    }
    
    public int search(String value) {
        Node tmp    = first;
        int i       = 0;
        while(null != tmp) {
            if (value == tmp.getData()) {
                return i;
            } else {
                tmp = tmp.getNext();
                i++;
            }
        }
        return -1;
    }
}
