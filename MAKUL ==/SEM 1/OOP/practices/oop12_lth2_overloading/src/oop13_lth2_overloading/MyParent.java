/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop13_lth2_overloading;

/**
 *
 * @author Asus
 */
public class MyParent {

    int x, y;

    MyParent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addMe(int x, int y) {
        return this.x + x + y + this.y;
    }

    public int addMe(MyParent myPar) {
        return addMe(myPar.x, myPar.y);
    }
}
