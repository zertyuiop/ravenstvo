/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ученик
 */
import java.util.*;
public class Ravenstvo {

    /**
     * @param args the command line arguments
     */
    static Scanner reader=new Scanner(System.in); 
    public static void main(String[] args) {
        // TODO code application logic here
        int ch1 = reader.nextInt();
        int ch2 = reader.nextInt();
        int ch3 = reader.nextInt();
        if ((ch1 == ch2) && (ch1 == ch3))
            System.out.println("Все числа равны");
        if ((ch1 == ch3) && (ch1 > ch2))
            System.out.println("Первое и третье равны, второе меньше них");
        if ((ch1 == ch3) && (ch1 < ch2))
            System.out.println("Первое и третье равны, второе больше них");
        if ((ch1 == ch2) && (ch1 > ch3))
            System.out.println("Первое и второе равны, третье меньше них");
        if ((ch1 == ch2) && (ch1 < ch3))
            System.out.println("Первое и второе равны, третье больше них");
        if ((ch2 == ch3) && (ch1 > ch2))
            System.out.println("Второе и третье равны, первое больше них");
        if ((ch2 == ch3) && (ch1 < ch2))
            System.out.println("Второе и третье равны, первое меньше них");
        if ((ch1 > ch2) && (ch2 > ch3))
            System.out.println("Второе больше третьего, первое больше них");
        if ((ch1 > ch2) && (ch1 < ch3))
            System.out.println("Второе меньше первого, третье больше них");
        if ((ch1 < ch2) && (ch1 > ch3))
            System.out.println("Первое больше третьего, второе больше них");
        if ((ch1 < ch2) && (ch2 < ch3))
            System.out.println("Первое меньше второго, третье больше них");
        if ((ch3 < ch2) && (ch1 < ch3))
            System.out.println("Первое меньше третьего, второе больше них");
        if ((ch3 > ch2) && (ch1 > ch3))
            System.out.println("Второе меньше третьего, первое больше них");
        
    }

}
