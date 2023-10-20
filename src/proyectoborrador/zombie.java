/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Lenovo
 */
public class zombie extends Char implements Serializable{
    
    private arma objetivo = null;
    private ArrayList<Thread> ataque = new ArrayList<Thread>();
    private JLabel labelZombie;

    public zombie(String nombre, String tipo, int resistencia, int golpe, int nivel, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, nivel, aparicion, gif, gif2, campo);
        posXY();
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
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread); 
        }
        else if (this.getTipo().equals("MedianoA")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread);
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
        else if (this.getTipo().equals("Choque")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo);
            ataque.add(thread);
            thread.run();
            ataque.remove(thread);
            ThreadExplosion threadE = new ThreadExplosion(this,objetivo);
            ataque.add(threadE);
            threadE.run();
            ataque.remove(threadE);
        }
    }
    
    public void posXY(){
        Random rand = new Random();
        int chooser = rand.nextInt(2);
        if (chooser == 0){ // X libre
            chooser = rand.nextInt(256);
            this.setPosX(chooser);
            chooser = rand.nextInt(2);
            if (chooser == 0){ //Y arriba
                this.setPosY(0);
            }else{ // Y abajo
                this.setPosY(255);
            }
        }else{ //Y libre
            chooser = rand.nextInt(256);
            this.setPosY(chooser);
            chooser = rand.nextInt(2);
            if (chooser == 0){ //X izquierda
                this.setPosX(0);
            }else{ // X derecha
                this.setPosX(255);
            }
            
        }
    }

    public arma getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(arma objetivo) {
        this.objetivo = objetivo;
    }

    public ArrayList<Thread> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Thread> ataque) {
        this.ataque = ataque;
    }
    
    
       
}
