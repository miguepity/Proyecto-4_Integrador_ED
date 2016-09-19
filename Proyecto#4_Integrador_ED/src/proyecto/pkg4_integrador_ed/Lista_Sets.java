/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg4_integrador_ed;

import java.util.ArrayList;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Lista_Sets {
    static Nodo_Set head;
    static int size = 0;

    public Lista_Sets() {
        head = new Nodo_Set();
    }

    public boolean insert(Lista_grupoPersonas list_personas, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        Nodo_Set neo= new Nodo_Set(list_personas);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            Nodo_Set temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;
        
    }
    
    public void setHead(Nodo_Set head) {
        this.head = head;
    }

    public static Nodo_Set get(int pos) {
        Nodo_Set temp = head;
        Nodo_Set node = temp;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            node = temp;
        }
        return node;
    }

    public void delete(int pos) {
        Nodo_Set temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Set temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Lista_grupoPersonas first() {
        return head.list_person;
    }

    public void Print_Lista() {
        Nodo_Set temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.list_person.get(cont)+ "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.list_person.get(cont)+ "]");
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
