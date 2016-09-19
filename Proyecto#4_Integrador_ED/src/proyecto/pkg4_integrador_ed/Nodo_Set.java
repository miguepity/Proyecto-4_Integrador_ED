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
public class Nodo_Set {
    Lista_grupoPersonas list_person;
    Nodo_Set next;

    public Nodo_Set() {
    }

    public Nodo_Set(Lista_grupoPersonas list_person) {
        this.list_person = list_person;
    }
    
    public Nodo_Set getNext() {
        return next;
    }

    public void setNext(Nodo_Set next) {
        this.next = next;
    }
    
    
}
