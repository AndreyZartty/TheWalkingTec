/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package proyectoborrador;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class Char {
    private String nombre;
    private String tipo;
    private int vida = 100;
    private int resistencia;
    private int golpe;
    private int aparicion;
    private ArrayList historial;
    private String gif;
    private String gif2;
    
    public Char() {
       historial = new ArrayList();
    }

    public Char(String nombre,String tipo, int resistencia, int golpe, int aparicion, String gif, String gif2) {
        this.tipo = tipo;
        this.resistencia = resistencia;
        this.golpe = golpe;
        this.aparicion = aparicion;
        this.gif = gif;
        this.gif2 = gif2;
    }

    

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getGolpe() {
        return golpe;
    }

    public int getAparicion() {
        return aparicion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public void setAparicion(int aparicion) {
        this.aparicion = aparicion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getHistorial() {
        return historial;
    }

    public String getGif() {
        return gif;
    }

    public String getGif2() {
        return gif2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHistorial(ArrayList historial) {
        this.historial = historial;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public void setGif2(String gif2) {
        this.gif2 = gif2;
    }

    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Char{" + "nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + ", resistencia=" + resistencia + ", golpe=" + golpe + ", aparicion=" + aparicion + ", historial=" + historial + ", gif=" + gif + ", gif2=" + gif2 + '}';
    }
    
   
    
    
    
}
