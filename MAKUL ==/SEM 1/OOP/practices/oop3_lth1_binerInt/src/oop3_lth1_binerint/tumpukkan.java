/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3_lth1_binerint;

/**
 *
 * @author Asus
 */
class tumpukkan {
    private int ukuran;
    public int[] tumpukan;
    private int top;

    public tumpukkan(int s){
        ukuran = s;
        tumpukan = new int[ukuran];
        top = -1;
    }
    public void konbin(int b){
        if (b>1){
            konbin(b/2);
        }
        System.out.println(b%2);
    }

    public void push(int i) {
        tumpukkan[++top]=j;
    }
    
    public int pop(){
        return tumpukkan[top--];
    }
    
    public int peak(){
        return tumpukkan[top];
    }
    
    public boolean isEmpty(){
        return(top==-1);
    }
    
    public boolean isFull(){
        return(top==ukuran -1);
    }
    public void baca(){
        int i=top;
        while(i>0){
            System.out.println("");
            i--;
        }System.out.println("");
    }
}
    
