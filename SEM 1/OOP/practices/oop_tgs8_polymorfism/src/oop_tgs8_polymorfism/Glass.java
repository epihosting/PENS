/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tgs8_polymorfism;

/**
 *
 * @author Asus
 */
public class Glass extends Container{
    public int volume;
    public int maxVolume;
    
    /*public Glass (){
        super.volume = 0;
        super.maxVolume = 0;
    }*/
    
    public Glass(int volume, int maxVolume) {
        super.volume = volume;
        super.maxVolume = maxVolume;
    }

}

