/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tgs8_polymorfism_2;

/**
 *
 * @author Asus
 */
public class Container {

    public int volume;
    public int maxVolume;

    public Container() {
    }

    public void empty(int nol) {
        this.volume = nol;
    }

    public void fill(Container obj) {
        int max = obj.volume;
        if (max > this.maxVolume) {
            this.volume += this.maxVolume;
            obj.volume += this.maxVolume;
        }else{
            this.volume+=obj.volume;
        }
    }
}
