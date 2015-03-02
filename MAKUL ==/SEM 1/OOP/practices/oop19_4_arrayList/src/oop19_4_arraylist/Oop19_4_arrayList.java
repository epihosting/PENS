/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop19_4_arraylist;
import java.util.*;
/**
 *
 * @author Asus
 */
public class Oop19_4_arrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bernadine");
        list.add("Elizabeth");
        list.add("Gene");
        list.add("Elizabeth");
        list.add("Clara");

        System.out.println(list);

        System.out.println("2 : " + list.get(2));
        System.out.println("0 : " + list.get(0));

        LinkedList queue = new LinkedList();
        queue.addFirst("Bernadine");
        queue.addFirst("Elizabeth");
        queue.addFirst("Gene");
        queue.addFirst("Elizabeth");
        queue.addFirst("Clara");

        System.out.println(queue);
        queue.removeLast();
        queue.removeLast();
        System.out.println(queue);
    }
}
