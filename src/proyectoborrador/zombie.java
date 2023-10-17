/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Zombie extends Char implements Serializable{

    public Zombie(String nombre, String tipo, int resistencia, int golpe, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, aparicion, gif, gif2, campo);
    }

    

    @Override
    public String toString() {
        return "Zombie: " + getNombre() + "\n De tipo: " + getTipo() + 
               "\n Vida: " + getVida() + "\n Resistencia: " + getResistencia() +
                "\n Capacidad de golpe: " + getGolpe() + "\n Aparicion: " + getAparicion()
                + "\n Campo que ocupa: " + getCampo();
        
        
        
        
        
    }

    

    

    
    
    
    
}
