/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author student
 */
public class Taksi extends Mobil {
    public int tarifAwal;
    public int tarifPerKm;

    public void setTarifAwal(int ta){
        this.tarifAwal = ta;
    }

    public int getTarifAwal(){
        return this.tarifAwal;
    }

    public void setTarifPerKm(int tpk){
        this.tarifPerKm = tpk;
    }

    public int getTarifPerKm(){
        return this.tarifPerKm;
    }
}
