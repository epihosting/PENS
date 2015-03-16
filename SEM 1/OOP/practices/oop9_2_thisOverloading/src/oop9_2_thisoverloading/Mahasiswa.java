/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop9_2_thisoverloading;

/**
 *
 * @author Asus
 */

/*
 |------------------------------------------|
 |                mahasiswa                 |        
 |------------------------------------------|
 | - nrp : int                              |
 | - nama : String                          |
 |------------------------------------------|
 | + Mahasiswa()                            |
 | + Mahasiswa(nama : String)               |
 | + Mahasiswa(nrp : int , nama : String)   |
 |------------------------------------------|
 */
public class Mahasiswa {

    private int nrp;
    private String nama;

    public Mahasiswa() {
        this(0, "");
    }

    public Mahasiswa(String nama) {
        this(0, nama);
    }

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
}
