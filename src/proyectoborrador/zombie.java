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
public class zombie extends Char implements Serializable{
    
    private arma objetivo = null;

    public zombie(String nombre, String tipo, int resistencia, int golpe, int nivel, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, nivel, aparicion, gif, gif2, campo);
    }

    @Override
    public String toString() {
        return "Zombie: " + getNombre() + "\n De tipo: " + getTipo() + 
               "\n Vida: " + getVida() + "\n Resistencia: " + getResistencia() +
                "\n Capacidad de golpe: " + getGolpe() + "\n Aparicion: " + getAparicion()
                + "\n Campo que ocupa: " + getCampo();
            
    }
    
    public void atacar(){
        if (this.getTipo().equals("Contacto")){
            
        }
        else if (this.getTipo().equals("MedianoA")){
            
        }
        else if (this.getTipo().equals("Aereo")){
            
        }
        else if (this.getTipo().equals("Choque")){
            
        }
    }

    public arma getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(arma objetivo) {
        this.objetivo = objetivo;
    }
       
}
