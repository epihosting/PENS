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
public class Container {

    public int volume;
    public int maxVolume;

    public void empty() {
        this.volume = 0;
    }

    public void fill(Container con) {
        //container bisa diisi
        if (this.volume < this.maxVolume) {
            //container pemasok masih punya air
            if (con.volume > (this.maxVolume - this.volume)) {
                con.volume -= (this.maxVolume - this.volume);
                this.volume = this.maxVolume;
            } else {
                this.volume = con.volume;
                con.volume -= con.volume;
            }
        }
    }

}
