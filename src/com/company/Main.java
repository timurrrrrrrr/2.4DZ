package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbersA = new ArrayList<String>();
        ArrayList<String> numbersB = new ArrayList<String>();
        ArrayList<String> numbersC = new ArrayList<String>();

        System.out.println("ведите 5 слов");
        for (int i = 0; i < 5; i++) {
            numbersA.add(scanner.nextLine());
        }

        Iterator<String> iterator_1 = numbersA.iterator();
        while (iterator_1.hasNext()) {


        }

        System.out.println("Введите цифры");


        System.out.println(iterator_1.next());
        numbersC.add(numbersA.get(1));

        numbersC.add(numbersB.get(5));

        numbersC.add(numbersA.get(2));

        numbersC.add(numbersB.get(4));

        numbersC.add(numbersA.get(3));

        numbersC.add(numbersB.get(3));

        numbersC.add(numbersA.get(4));

        numbersC.add(numbersB.get(2));

        numbersC.add(numbersA.get(5));

        numbersC.add(numbersB.get(1));





        for (int i = 0; i < 5; i++) {
            numbersB.add(scanner.nextLine());
        }
        Iterator<String> iterator_2 = numbersB.iterator();
        while (iterator_2.hasNext()) {
            System.out.println(iterator_2.next());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        

        Iterator<String> iterator_3 = numbersC.iterator();
        while (iterator_3.hasNext()) {
            System.out.println(iterator_3.next());
        }
        System.out.println("_______");
        numbersC.sort(Comparator.comparing(String::length));
        Iterator<String> iterator_4 = numbersC.iterator();
        while (iterator_4.hasNext()) {
            System.out.println(iterator_4.next());


        }









    }
}
