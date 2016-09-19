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
public class Lista_grupoPersonas {
    static Nodo_grupoPersonas head;
    static int size = 0;

    public Lista_grupoPersonas() {
        head = new Nodo_grupoPersonas();
    }

    public boolean insert(ArrayList personas, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        Nodo_grupoPersonas neo= new Nodo_grupoPersonas(personas);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            Nodo_grupoPersonas temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;
        
    }
    
    public void setHead(Nodo_grupoPersonas head) {
        this.head = head;
    }

    public static Nodo_grupoPersonas get(int pos) {
        Nodo_grupoPersonas temp = head;
        Nodo_grupoPersonas node = temp;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            node = temp;
        }
        return node;
    }

    public void delete(int pos) {
        Nodo_grupoPersonas temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_grupoPersonas temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public ArrayList first() {
        return head.personas;
    }

    public void Print_Lista() {
        Nodo_grupoPersonas temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.personas.get(cont)+ "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.personas.get(cont)+ "]");
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
