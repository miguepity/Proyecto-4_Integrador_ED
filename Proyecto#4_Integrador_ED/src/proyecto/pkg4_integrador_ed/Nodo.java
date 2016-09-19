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
public class Nodo {
    private String name;
    private int pareja; 
    Nodo next;

    public Nodo() {
    }

    public Nodo(String name, int pareja) {
        this.name = name;
        this.pareja = pareja;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPareja() {
        return pareja;
    }

    public void setPareja(int pareja) {
        this.pareja = pareja;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
