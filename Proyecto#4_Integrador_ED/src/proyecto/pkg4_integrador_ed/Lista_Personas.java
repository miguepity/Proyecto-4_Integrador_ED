/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg4_integrador_ed;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Lista_Personas {
    static Nodo head;
    static int size = 0;

    public Lista_Personas() {
        head = new Nodo();
    }

    public boolean insert(String persona, int pareja, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        Nodo neo= new Nodo(persona,pareja);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            Nodo temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;       
    }
    

    public void setHead(Nodo head) {
        this.head = head;
    }

    public static Nodo get(int pos) {
        Nodo temp = head;
        Nodo node = temp;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            node = temp;
        }
        return node;
    }

    public void delete(int pos) {
        Nodo temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public String first() {
        return head.getName();
    }

    public void Print_Lista() {
        Nodo temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getName()+ "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getName()+ "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public static int getSize() {
        return size;
    }
}
