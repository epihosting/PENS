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
public class Sumur extends Container {

    public int volume;
    public int maxVolume;

    public Sumur() {
        super.volume = Integer.MAX_VALUE;
        super.maxVolume = Integer.MAX_VALUE;
    }

    @Override
    public void fill(Container con) {
        super.fill(con); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void empty() {
        super.empty(); //To change body of generated methods, choose Tools | Templates.
    }

}
