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
public class Nodo_grupoPersonas {
    ArrayList personas;
    Nodo_grupoPersonas next;

    public Nodo_grupoPersonas() {
    }

    public Nodo_grupoPersonas(ArrayList personas) {
        this.personas = personas;
    }
    

    public Nodo_grupoPersonas getNext() {
        return next;
    }

    public void setNext(Nodo_grupoPersonas next) {
        this.next = next;
    }
    
    

}
