/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author student
 */
public class Mobil extends Kendaraan {
    public String bahanBakar;
    public int kapasitasMesin;

    public void setBahanBakar(String bb){
        this.bahanBakar = bb;
    }

    public String getBahanBakar(){
        return this.bahanBakar;
    }

    public void setKapasitasMesin(int km){
        this.kapasitasMesin = km;
    }

    public int getKapasitasMesin(){
        return this.kapasitasMesin;
    }
}
