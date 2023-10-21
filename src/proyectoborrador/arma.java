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
public class Arma extends Char implements Serializable {
    private zombie objetivo = null;
    private ArrayList<Thread> ataque = new ArrayList<Thread>();
    

        super(nombre, tipo, resistencia, golpe, nivel, aparicion, gif, gif2, campo);
    public arma(String nombre, String tipo, int resistencia, int golpe, int nivel, int aparicion, String gif, String gif2, int campo) {
        
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
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread);
        }
        else if (this.getTipo().equals("MedianoA")){
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo);
            ataque.add(threadD);
            threadD.run();
            ataque.remove(threadD);
        }
        else if (this.getTipo().equals("Aereo")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread);
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo);
            ataque.add(threadD);
            threadD.run();
            ataque.remove(threadD);
        }
        else if (this.getTipo().equals("Impacto")){
            ThreadExplosion thread = new ThreadExplosion(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread);
        }
        else if (this.getTipo().equals("Multiple")){
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo);
            ThreadDisparo threadD1 = new ThreadDisparo(this,objetivo);
            ThreadDisparo threadD2 = new ThreadDisparo(this,objetivo);
            ataque.add(threadD);
            ataque.add(threadD1);
            ataque.add(threadD2);
            threadD.run();
            threadD1.run();
            threadD2.run();
            ataque.remove(threadD);
            ataque.remove(threadD1);
            ataque.remove(threadD2);
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

    public ArrayList<Thread> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Thread> ataque) {
        this.ataque = ataque;
    }
    
    
}
    

    
    
    
    

