/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestContainer;

/**
 *
 * @author Asus
 */
public class Container {

    public int volume;
    public int maxVolume;

    public Container() {
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill(Container con) {
        int maxCon = con.volume;
        if (this.maxVolume < maxCon) {
            this.volume += this.maxVolume;
            maxCon -= this.maxVolume;
        } else {
            this.volume += maxCon;
        }
    }
}
