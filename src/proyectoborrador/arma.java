/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.io.Serializable;



/**
 *
 * @author Lenovo
 */
public class arma extends Char implements Serializable {
    
    private zombie objetivo = null; 

    public arma(String nombre, String tipo, int resistencia, int golpe, int nivel, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, nivel, aparicion, gif, gif2, campo);
    }


    @Override
    public String toString() {
        return "Arma: " + getNombre() + "\n De tipo: " + getTipo() + 
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
        else if (this.getTipo().equals("Impacto")){
            
        }
        else if (this.getTipo().equals("Multiple")){
            
        }
        else if (this.getTipo().equals("Bloque")){
            
        }
    }

    public zombie getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(zombie objetivo) {
        this.objetivo = objetivo;
    }
    
    
}
    

    
    
    
    

