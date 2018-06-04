/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class AnimalThreads extends Thread{
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;
    
    public AnimalThreads(){}
    
    public AnimalThreads(String nombre,int x,int y, int limite,JLabel animal){
        this.nombre=nombre;
        this.x=x;
        this.y=y;
        this.limite=limite;
        this.animal=animal;
        
    }
    
    public void run(){
        for(int i=x;i<this.limite;i+=10){
            System.out.println(this.nombre + " Avanza ");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.nombre + " ha llegado a la meta");
        
        yield();
    }

}
