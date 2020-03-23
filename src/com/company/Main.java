package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Коллекции
        Collections
        List-ы (Списки)
        Set-ы (Множества)
        Map-ы (Словари, ассоц. массивы)

        В Java: A
        (List-ы): ArrayList, LinkedList, Vector, Stack, Queue
        (Set-ы): HashSet, TreeSet, SortedSet
        (Map-ы): HashMap, TreeMap, SortedMap, HashTable

         */
        List<Integer> bb = new ArrayList<>();
        ArrayList<String> cc = new ArrayList<>();
      //  List<Integer> vv = new List<>();

        Scanner scan = new Scanner(System.in);
        //while(true) {
         //   String str = scan.nextLine();
         //   if(!str.isEmpty()) {
         //       bb.add(Integer.parseInt(str));
         //   } else {
         //       break;
          //  }
        //}
      //  for(Integer i: bb) {
          //  System.out.print(i + " ");
      //  }
        System.out.println();
        bb.add(0,900);
        for(Integer i: bb) {
            System.out.print(i + " ");
        }
        bb.add(0,900);

        ArrayList<Integer> abc = new ArrayList<>();
        Collections.addAll(abc, 6,7,8,108,4448);

        Integer[] x = {3,4,5};
        List<Integer> v = Arrays.asList(x);

        List<Integer> q = new ArrayList<>();
        q.add(3);
        q.add(6);
        Integer[] u = q.toArray(new Integer[q.size()]);

        /*
        Вводятся значения числовые - ArrayList (четные числа - вначало, нечетные в конец)
         */

        /* ArrayList vs LinkedList */

        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
/*
        long start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add begin: "+ (end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add begin: "+ (end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add end:  "+ (end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add end: "+ (end-start));


        start = System.nanoTime();
        for(int i=50000;i<120000;i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get middle:  "+ (end-start));

        start = System.nanoTime();
        for(int i=50000;i<120000;i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get middle: "+ (end-start));

        */

        ArrayList<Integer> mmm = new ArrayList<>();
        mmm.add(5);
        mmm.add(5);
        mmm.add(15);
        mmm.add(52);
        mmm.add(-4);

        Collections.sort(mmm);
        //Arrays.sort();
        System.out.println(mmm);

        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student("Ivanov",44));
        student.add(new Student("Petrov",12));
        student.add(new Student("Sidor",23));
        student.add(new Student("DDD",22));
        student.add(new Student("PPP",29));

       /* Comparator<Student> sort_by_age = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
                //return s1.getAge()-s2.getAge();
            }
        };*/

        Collections.sort(student);
        System.out.println(student);


    }
}
