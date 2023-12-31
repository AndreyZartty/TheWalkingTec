/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class Zombie extends Char implements Serializable{
    
    private Arma objetivo = null;
    private ArrayList<Thread> ataque = new ArrayList<Thread>();
    private JPanel GUI;
    private BorradorGUI frame;
    
    public Zombie(String nombre, String tipo, int resistencia, int golpe, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, aparicion, gif, gif2, campo);
        this.setNivel(1);
        setActivo(true);
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
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
        }
        else if (this.getTipo().equals("MedianoA")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
            
        }
        else if (this.getTipo().equals("Aereo")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
            
        }
        else if (this.getTipo().equals("Choque")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
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

    public Arma getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Arma objetivo) {
        this.objetivo = objetivo;
    }

    public ArrayList<Thread> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Thread> ataque) {
        this.ataque = ataque;
    }

    public JPanel getGUI() {
        return GUI;
    }

    public void setGUI(JPanel GUI) {
        this.GUI = GUI;
    }

    public BorradorGUI getFrame() {
        return frame;
    }

    public void setFrame(BorradorGUI frame) {
        this.frame = frame;
    }
    
    
    
       
}
