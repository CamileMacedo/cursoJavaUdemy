package aulas.listsetmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aulas.celulares.CelPlus;

import java.util.Iterator;

public class Colections{

    public static void main(String[] args) {
        // List<Integer> list1 = new ArrayList<Integer>();

        // list1.add(10);
        // list1.add(160);
        // list1.add(1);
        // list1.add(null);
        // list1.add(null);
        // list1.add(160);
        // printList1(list1);

        Set<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(160);
        set1.add(1);
        set1.add(null);
        set1.add(null);
        set1.add(160);
        printSet1(set1);


        ListExample<Integer> example = new ListExample<Integer>();

        example.add(1);
        example.add(2);
        example.add(3);
        example.add(4);
        example.add(5);
        example.add(6);
        example.add(7);
        example.add(8);
        example.add(9);
        example.add(10);


        example.print();

        System.out.println("tamanho total array:" + example.getSize());
        

    }

    public static void printList1(List<Integer> list){
        int i;

        for(i = 0; i < list.size(); i++){
            System.out.println("List 1 - " + list.get(i));
        }

        for (Integer a: list) {

        }
    }


    public static void printSet1(Set<Integer> set1){
        Iterator<Integer> iterator = set1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}