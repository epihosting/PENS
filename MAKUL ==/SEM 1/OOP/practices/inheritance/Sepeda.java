/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author student
 */
public class Sepeda extends Kendaraan {
    public int jmlSadel;
    public int jmlGir;

    public void setJmlSadel(int js){
        this.jmlSadel = js;
    }

    public int getJmlSadel(){
        return this.jmlSadel;
    }

    public void setJmlGir(int jg){
        this.jmlGir = jg;
    }

    public int getJmlGir(){
        return this.jmlGir;
    }
}
