/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatotkaca;

/**
 *
 * @author Amalia
 */
class Queue {
    LinkedList data = new LinkedList();
    int i           = 0;
    
    public void enqueue(String value) {
        data.addLast(value);
        i++;
    }
    
    public String dequeue() {
        i--;
        return data.removeFirst();
    }
    
    public int search(String value) {
        return data.search(value);
    }
    
    public String peek() {
        return data.getFirst();
    }
    
    public Boolean isempty() {
        if (0 == i) {
            return true;
        }
        return false;
    }
    
    public int getSize() {
        return i;
    }
    
    public void clear() {
        data    = new LinkedList();
        i       = 0;
    }
    
    public void print() {
        if (isempty()) {
            System.out.println("KOSONG !!!");
        } else {
            Node current = data.first;
            
            while(null != current) {
                System.out.printf("%s ", current.data);
                current = current.next;
                System.out.println();
            }
        }
    }
}