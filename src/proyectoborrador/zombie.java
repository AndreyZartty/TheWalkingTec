/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.awt.Image;

/**
 *
 * @author Lenovo
 */
public class zombie extends Char{

    public zombie(String nombre,String tipo, int resistencia, int golpe, int aparicion, String gif, String gif2) {
        super(nombre, tipo, resistencia, golpe, aparicion, gif, gif2);
    }

    @Override
    public String toString() {
        return "Zombie: " + getNombre() + "\n De tipo: " + getTipo() + 
               "\n Vida: " + getVida() + "\n Resistencia: " + getResistencia() +
                "\n Capacidad de golpe: " + getGolpe() + "\n Aparicion: " + getAparicion();
        
        
        
        
        
    }

    

    

    
    
    
    
}
