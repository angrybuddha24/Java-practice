package com.java.practice.datastructure.string;


public class EnumClass {
    public static void main(String[] args) {
       String sentence = "This is pavi";

       String[] array = sentence.split(" ");

       StringBuilder sb = new StringBuilder();
        System.out.println(array[2] + " outside for");
       for(int i = (array.length -1); i >=0; i --){
//           System.out.println(array[2] + " inside for");
           sb.append(" "+ array[i]);
       }

        System.out.println(sb.toString().trim());
    }
    }
//
////        int i = 1634, cube = 0, temp, rem;
////
////        //153
////temp = i;
////        while(i > 0){
////            rem = i%10;
//////            cube = cube + (i%10) * (i%10) * (i%10);
////            cube = cube + Math.pow(rem , 3);
////            System.out.println(cube);
////            i = i / 10;
////        }
////
////        System.out.println(cube);
////
////        if(cube == temp)
////            System.out.println("Armstrong");
////        else
////            System.out.println("Not Armstrong");
//
//
//        int number = 371, originalNumber, remainder, result = 0;
//
//        originalNumber = number;
//
//        while (originalNumber != 0)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, 3);
//            originalNumber /= 10;
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
//        // 0, 1, 1, 2, 3, 5,8, 13, 21
//
////        int f0 = 0, f1= 1 , temp;
////        System.out.println(f0);
////        System.out.println(f1);
////        for(int i = 2 ; i <= 10 ; i ++){
////            temp = f0 + f1;
////            f0 = f1;
////            f1= temp;
////            System.out.println(temp);
////        }
////        int number = 1234321, temp , sum =0;
////
////        temp = number;
////
////        while(number > 0){
////            sum = (sum* 10) + number % 10;
////            number = number / 10;
////        }
////
////        System.out.println(sum);
////
////        if(sum == temp)
////            System.out.println("Palindrome");
////        else
////            System.out.println("Not palindrome");
//    }
//}
////
//////public class Student {
//////    Private String name, class;
//////    public Student(name, class){
//////
//////    }
//////}
////
//////import java.util.*;
////
////import com.sun.source.tree.Tree;
////
////import java.util.Iterator;
////import java.util.TreeSet;
////
////public class EnumClass{
////public static void main(String[] args) {
////
////    //string reversal
////    //abc is not palindrome
////    //aba palindrome
////
////
////    String str = "abcba", temp = "";
////
////    StringBuilder sb = new StringBuilder(str);
////    sb.reverse();
////
////    System.out.println(sb);
////
////
////
//////    for(int i = str.length()-1; i >= 0 ; i --){
//////        temp =  temp + str.charAt(i);
//////    }
////
//////    System.out.println(temp);
////
////    if(str.equals(sb))
////        System.out.println("palindrome");
////    else
////        System.out.println("Not palindrome");
//////    TreeSet<String> treeSet = new TreeSet<>();
//////    treeSet.add("Pavi");
//////    treeSet.add("Karthick");
//////    treeSet.add("Prakriti");
//////    treeSet.add("Dhanush");
//////
//////    System.out.println(treeSet);
//////
//////    System.out.println(treeSet.headSet("Prakriti"));
//////
//////    System.out.println(treeSet.tailSet("Karthick"));
//////
//////    System.out.println(treeSet.subSet("Karthick", "Prakriti"));
////
//////    System.out.println(treeSet);
//////    TreeSet<String> ts1 = new TreeSet<>();
//////    ts1.add("Pavi1");
//////    ts1.add("Karthick1");
//////    treeSet.addAll(ts1);
//////
//////    System.out.println(treeSet);
//////
//////    treeSet.remove("Karthick1");
//////    System.out.println(treeSet);
//////
//////treeSet.removeAll(ts1);
//////    System.out.println(treeSet);
//////
//////    treeSet.removeIf(str -> str.contains("Dhanush"));
//////
//////    System.out.println(treeSet);
////
////    //    System.out.println(treeSet.descendingSet() + " decending Set");
//////    System.out.println(treeSet.headSet("Prakriti" , true));
//////    System.out.println(treeSet.headSet("Prakriti" , false));
//////
//////    System.out.println(treeSet.subSet("Karthick", true , "Prakriti" , false));
//////
//////    System.out.println(treeSet.tailSet("Pavi", true));
////
////
////
//////    System.out.println(treeSet.pollFirst());
//////
////////    Iterator itr = treeSet.iterator();
////////    while(itr.hasNext())
////////        System.out.println(itr.next());
//////
//////    Iterator itr = treeSet.descendingIterator();
//////    while(itr.hasNext())
//////        System.out.println(itr.next());
//////    TreeSet<Integer> ts1 = new TreeSet<>();
//////    ts1.add(24);
//////    ts1.add(27);
//////    ts1.add(1);
//////    ts1.add(1);
//////
//////    itr = ts1.descendingIterator();
//////    while(itr.hasNext())
//////        System.out.println(itr.next());
//////    System.out.println(ts1);
////
//////    TreeSet<Integer> ts = new TreeSet<>();
//////    ts.add(24);
//////    ts.add(27);
//////    ts.add(1);
//////    ts.add(1);
//////
//////    System.out.println(ts);
//////    System.out.println("Smallest element" + ts.pollFirst());
//////    System.out.println("Largest element" + ts.pollLast());
////////    System.out.println(ts.pollFirst());
//////    ts.clear();
//////    System.out.println(ts);
//////    System.out.println(ts.pollFirst());
//////    System.out.println(ts);
////
////}
////}
//////    LinkedHashSet<String> lhs = new LinkedHashSet<>();
//////    lhs.add("Pavi");
//////    lhs.add("Karthick");
//////    lhs.add("Prakriti");
//////    lhs.add("Dhanush");
//////    lhs.add("Dhanush");
//////
//////    LinkedList<String> ll = new LinkedList<>();
//////    System.out.println(ll.size());
//////    HashSet<String> hs = new HashSet<>();
//////    System.out.println(hs.size());
//////
//////
//////    LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
//////    lhs2.add("Pavi2");
//////    lhs2.add("Karthick2");
//////
//////    lhs.addAll(lhs2);
//////
//////    System.out.println(lhs);
//////    System.out.println(lhs2);
//////
//////lhs.remove("Dhanush");
//////
//////    System.out.println(lhs);
//////    lhs.removeAll(lhs2);
//////    System.out.println(lhs);
//////
//////    lhs.removeIf(str -> str.contains("Prakriti"));
//////
//////    System.out.println(lhs);
//////
////////    lhs.clear();
//////
//////    System.out.println(lhs);
//////
//////    System.out.println(lhs.size());
//////
//////
////////    Iterator itr = lhs.iterator();
////////    while(itr.hasNext())
////////        System.out.println(itr.next());
//////}
//////}
////////////
////////////import java.util.ArrayList;
////////////import java.util.Arrays;
//////////import java.util.Collections;
//////////import java.util.List;
//////////
//////////public class RoughBook {
//////////
//////////    public static void main(String[] args) {
//////////
//////////        int[] a = {100, 200, 300, 201, 500};
//////////        Arrays.sort(a);
//////////        System.out.println(a[a.length-2]);
//////////        List<Integer> integers = new ArrayList<>(Arrays.asList(2,8,5,6,0));
//////////        Collections.sort(integers);
//////////        for(int i:integers){
//////////            System.out.println(i);
//////////
//////////        }
//////////        integers.forEach(System.out::println);
//////////
//////////    }
//////////
//////////
//////////}
//////////
////////
////////import java.lang.reflect.Array;
//////////import java.util.Iterator;
////////import java.util.Iterator;
////////import java.util.LinkedList;
//////////import java.util.*;
//////////import java.util;
//////////import java.util.*;
////////
////////class RoughBook {
////////    public static void main(String[] args) {
//////////        ArrayList<String> arryList = new ArrayList<String>();   //explicit can be replaced by diamond operator
//////////        ArrayList<String> arryList = new ArrayList<>();
//////////        List<String> arryList = new ArrayList<>();  // we can use list interface functions aswell here
//////////        arryList.add("pavi");
//////////        arryList.add("Karthick");
//////////        arryList.add("Prakriti");
//////////        arryList.add(2);
////////
//////////        System.out.println(arryList + " print arryList");
//////////
//////////        Iterator<String> itr = arryList.iterator();
//////////
//////////        while (itr.hasNext())      //replace with enhanced for
//////////            System.out.println(itr.next() + " from itrerator");
////////
//////////        for (String s : arryList)
//////////            System.out.println(s + " before manipulation");
////////
//////////        System.out.println(arryList.get(0));
//////////        System.out.println((arryList.get(3)) + " here index is from 0 ");
////////
//////////        arryList.set(0, "Pavithra");
//////////        arryList.set(3, "Dhanushu");
////////
//////////        for(String s: arryList)
//////////            System.out.println(s);
//////////
//////////        Collections.sort(arryList);
//////////        System.out.println("After sort");
//////////        for(String s: arryList)
//////////            System.out.println(s);
//////////
//////////        Collections.sort(arryList,Collections.reverseOrder());
//////////        System.out.println("Reverse sort");
//////////        for(String s: arryList)
//////////            System.out.println(s);
//////////
//////////        // for integers
//////////        List<Integer> al2 = new ArrayList<>();
//////////        al2.add(24);
//////////        al2.add(27);
//////////        al2.add(1);
//////////
//////////        Collections.sort(al2);
//////////        for(int i: al2)
//////////            System.out.println(i);
//////////
//////////        Collections.sort(al2, Collections.reverseOrder());
//////////        for(int i: al2)
//////////            System.out.println(i);
////////
//////////        ListIterator<String> listItr = arryList.listIterator(arryList.size());
//////////        while(listItr.hasPrevious())
//////////            System.out.println(listItr.previous());
//////////
//////////        System.out.println("iterator");
//////////        Iterator<String> itr = arryList.iterator();
//////////        while(itr.hasNext())
//////////            System.out.println(itr.next());
////////
//////////        System.out.println((arryList.size()) + " size");
//////////        for(int i = 0; i < arryList.size(); i++){
//////////            System.out.println(arryList.get(i));
//////////        }
////////
//////////        arryList.forEach(anyVariable -> {
//////////            System.out.println(anyVariable);
//////////        });
//////////
//////////        Iterator itr = arryList.iterator();
//////////        itr.forEachRemaining(test ->{
//////////            System.out.println(test);
//////////        });
////////
//////////        List<String> al1 = new ArrayList<>();
//////////        al1.add("Pavi");
//////////        al1.add("Karthick");
//////////        al1.add("Prakriti");
//////////        al1.add("Dhanush");
//////////
//////////        al1.add(1, "Dhanush");
////////
//////////        al1.remove("Dhanush");  // removes the value from first index
////////
//////////        for(String str : al1)
//////////            System.out.println(str);
//////////
//////////        al1.remove(3);
//////////
//////////        for(String str: al1)
//////////            System.out.println(str);
//////////        System.out.println("******");
//////////        ArrayList<String> al2 = new ArrayList<>();
//////////        al2.add("pavi1");
//////////        al2.add("karthick1");
//////////////
//////////        al1.addAll(al2);
////////////
////////////        al1.forEach(variable ->{
////////////            System.out.println(variable);
////////////        });
//////////////
////////////        al1.removeAll(al2);
//////////
////////////        for(String str: al1)
////////////            System.out.println(str);
//////////        System.out.println(al1.isEmpty());
//////////        System.out.println("***");
//////////
////////////        al1.removeIf(variable ->
////////////            variable.contains("Dhanush")
////////////        );
//////////
//////////        al1.forEach(var ->
//////////            System.out.println(var)
//////////        );
//////////
//////////        al1.clear();
//////////        for(String str: al1)
//////////            System.out.println(str + " ****");
////////////
////////////        System.out.println(al1.isEmpty());
//////////
////////////
////////////        List<String> al3 = new ArrayList<>();
////////////        al3.add("Pavi2");
////////////        al3.add("karthick3");
////////////        al1.addAll(1,al3);
////////////        System.out.println("***");
////////////        al1.forEach(var ->{
////////////            System.out.println(var);
////////////        });
//////////
////////////        List<String> al1 = new ArrayList<>();
////////////        al1.add("Pavi");
////////////        al1.add("Karthick");
////////////
////////////        ArrayList<String> al2 = new ArrayList<>();
////////////        al2.add("Prakriti");
////////////        al2.add("Pavi");
////////////        al2.add("Karthick");
////////////
////////////        al1.retainAll(al2);
////////////
////////////        for(String str: al2)
////////////            System.out.println(str);
//////////
//////////
//////////        List<String> al = new ArrayList<>();
//////////        al.add("Pavi");
//////////        al.add("Karthick");
//////////        al.add("Prakriti");
//////////        al.add("Dhanush");
//////////
//////////        String[] thisIsArray = al.toArray(new String[al.size()]);
//////////
//////////        for(String str: thisIsArray)
//////////            System.out.println(str);
//////////
//////////        List<String> al2 = new ArrayList<>(Arrays.asList(thisIsArray));
//////////        System.out.println(al2);
////////
//////////
////////
//////////        al = Collections.unmodifiableList(al);
//////////
//////////        for(String str : al)
//////////            System.out.println((str));
//////////
//////////        al.clear();
////////
////////
//////////        al.add("Prakriti");
//////////
////////////        al.forEach(var ->
////////////            System.out.println(var)
////////////        );
//////////
//////////        Set<String> linkedHashSet = new LinkedHashSet<>(al);
////////////        System.out.println(linkedHashSet);
//////////
//////////        al = new ArrayList<>(new LinkedHashSet<>(al));
//////////
////////////        al = new ArrayList<>(linkedHashSet);
//////////        Iterator itr = al.iterator();
//////////        itr.forEachRemaining(var->
//////////                System.out.println(var));
////////
////////
//////////        List<Integer> al = new ArrayList<>();
//////////        al.add(24);
//////////        al.add(27);
//////////        al.add(1);
//////////        al.add(1);
//////////
//////////        al = new ArrayList<>(new LinkedHashSet<>(al));
//////////
//////////        al.forEach(var ->
//////////                System.out.println(var));
////////
////////
////////
//////////        ArrayList<String> al1 = new ArrayList<>();
//////////        al1.add("Pavi");
//////////        al1.add("Karthick");
//////////        al1.add("Dhanush");
//////////        al1.add("Prakriti");
//////////
//////////
//////////        ArrayList<String> al2 = new ArrayList<>();
//////////        al2.add("Pavi");
//////////        al2.add("Karthick");
//////////        al2.add("Prakriti");
//////////        al2.add("Dhanush");
//////////
//////////        System.out.println(al1.toString());
//////////        System.out.println(al1.toString().contentEquals(al2.toString()));
//////////        ArrayList<Integer> al1 = new ArrayList<>();
//////////        al1.add(24);
//////////        al1.add(27);
//////////        al1.add(1);
//////////        al1.add(0);
//////////
//////////
//////////        ArrayList<Integer> al2 = new ArrayList<>();
//////////        al2.add(24);
//////////        al2.add(27);
//////////        al2.add(1);
//////////        al2.add(1);
////////
//////////ArrayList<Integer> al3 = new ArrayList<>();
//////////        System.out.println(al2.contains(24));
//////////        for(int temp: al1){
//////////            if(al2.contains(temp)){
//////////                al3.add(temp);
//////////            }
//////////        }
////////
//////////        System.out.println(al3);
////////
////////
//////////        LinkedList<String> ll1 = new LinkedList<>();
//////////        ll1.add("Pavi");
//////////        ll1.add("Karthick");
//////////
//////////        ll1.add(2, "Prakriti");
//////////
//////////        System.out.println(ll1);
//////////        Iterator itr = ll1.iterator();
//////////        while(itr.hasNext())
//////////            System.out.println(itr.next());
//////////
//////////        LinkedList<String> ll2 = new LinkedList<>();
//////////        ll2.add("Dhanush");
//////////
//////////        ll1.addAll(ll2);
//////////        System.out.println(ll1 + " ll1" + ll2 + " ll2");
//////////
//////////        ll1.addAll(0,ll2);
//////////        System.out.println(ll1);
//////////
//////////        ll1.addFirst("First");
//////////        System.out.println(ll1);
//////////
//////////        ll1.addLast("Last");
//////////        System.out.println(ll1);
////////
////////
////////        LinkedList<String> ll = new LinkedList<>();
////////        ll.add("Pavi");
////////        ll.add("Karthick");
////////        ll.add("Prakriti");
////////        ll.add("Dhanush");
////////
//////////        Iterator itr = ll.iterator();
//////////        while(itr.hasNext())
//////////            System.out.println(itr.next());
////////
////////        System.out.println("----");
////////
////////        Iterator itr1 = ll.descendingIterator();
////////                while(itr1.hasNext())
////////                    System.out.println(itr1.next());
////////
////////////        ll.remove(3);
////////////
////////////        ll.remove(3);   //IndexOutOfBoundsException
////////////ll.remove("Dhanush");
////////////ll.remove("Dhanush");
//////////        LinkedList<String> ll1 = new LinkedList<>();
//////////        ll1.add("Pavi");
//////////        ll1.add("Karthick1");
//////////        ll1.add("Prakriti1");
//////////        ll1.add("Dhanush");
////////////        System.out.println(ll.removeAll(ll1));
//////////        System.out.println(ll);
//////////
//////////        ll.addAll(ll1);
//////////
//////////        System.out.println(ll);
//////////
////////////        ll.removeFirstOccurrence("Dhanush");
//////////ll.removeLastOccurrence("Dhanush");
//////////        System.out.println(ll);
//////////
//////////        ll.removeFirst();
//////////        ll.removeLast();
//////////
//////////        System.out.println(ll);
//////////
//////////        ll.clear();
//////////        System.out.println(ll);
//////////
//////////        ll.removeFirst();
//////////        System.out.println(ll); //No such element excception
//////////
//////////        ll.removeFirstOccurrence("sf");
//////////        System.out.println(ll);
////////
////////    }
////////}
//////
//////
//////
////////public class EnumClass{
////////    public enum Weekdays{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
////////
////////    public static void main(String [] args){
////////        System.out.println(Weekdays.values());
////////
////////        for(Weekdays w : Weekdays.values())
////////            System.out.println(w);
////////    }
////////}
//////
////////public class EnumClass{
////////    public enum Season { SUMMER, WINTER, FALL, SPRING}
////////
////////    public static void main(String[] args){
////////        for(Season s: Season.values())
////////            System.out.println(s);
////////
////////        System.out.println("value of " + Season.valueOf("SUMMER"));
//////////        System.out.println("Value of invalid" + Season.valueOf("INVALID"));
////////        System.out.println("Value of ordinal" + Season.valueOf("FALL").ordinal());
////////        System.out.println("Value of ordinal invalid " + Season.valueOf("ABC").ordinal());
////////    }
////////}
//////
//////
//////
////////public class EnumClass{
////////    enum SEASON{
////////        SUMMER, WINTER, FALL, SPRING;
////////    }
////////
////////    public static void main(String [] args){
////////        System.out.println(SEASON.SUMMER);
////////    }
////////}
////////enum SEASON{
////////    SUMMER, WINTER, FALL, SPRING;
////////}
////////public class EnumClass{
////////    public static void main(String[] args){
////////        System.out.println(SEASON.SUMMER);
////////        System.out.println(SEASON.valueOf("WINTER"));
////////        System.out.println(SEASON.valueOf("FALL").ordinal());
////////
////////        for(SEASON s: SEASON.values())
////////            System.out.println(s);
////////    }
////////}
//////
//////
//////
////////    enum Season{
////////        SUMMER, FALL, SPRING, WINTER;
////////
////////        public static void main(String[] args){
////////            System.out.println(Season.SPRING);
////////        }
////////    }
//////
////////enum Season {
////////    WINTER, SPRING, SUMMER, FALL;
////////    public static void main(String[] args) {
////////        Season s=Season.WINTER;
////////        System.out.println(s);
////////    }
////////}
//////
//////
////////public class EnumClass {
////////    public enum Season{
////////        SUMMER(5), WINTER(10), FALL(15), SPRING(20);
////////
////////        private int value;
////////        private Season(int value){
////////            this.value = value;
////////        }
////////    }
//////
////////    public static void main(String[] args){
////////        System.out.println(Season.valueOf("SUMMER"));
////////        for(Season s: Season.values()){
////////            System.out.println(s);
////////            System.out.println(s.value);
////////        }
////////    }
////////}
//////
//////
////////public class EnumClass{
////////    public enum Season{
////////        SUMMER, WINTER, FALL, SPRING;
////////    }
////////
////////    public static void main(String[] args){
////////        Season s = Season.SUMMER;
////////
////////        switch (Season.FALL){
////////            case FALL :
////////                System.out.println("Fall");
////////                break;
////////
////////            case SUMMER:
////////                System.out.println("Summer");
////////                break;
////////
////////            default:
////////                System.out.println("Default");
////////        }
////////    }
////////}
//////
//////
//////import java.lang.reflect.Array;
//////import java.util.ArrayList;
//////import java.util.HashSet;
//////import java.util.Iterator;
////////import java.util.*;
////////import java.util.*;
//////
//////class EnumClass{
//////    public static void main(String[] abc){
//////
//////        ArrayList<String> al = new ArrayList<>();
//////        al.add("Pavi");
//////        al.add("Karthick");
//////        al.add("Prakriti");
//////
//////        HashSet<String> hs = new HashSet<>(al);
//////        System.out.println(hs);
//////
//////        hs.add("Dhanush");
//////        System.out.println(hs);
//////
////////        HashSet<String> hs = new HashSet<>();
////////        hs.add("Pavi");
////////        hs.add("Karthick");
////////        hs.add("Prakriti");
////////        hs.add("Dhanush");
////////        hs.add("Dhanush");
//////
////////        HashSet<String> hs2 = new HashSet<>();
////////        hs2.add("Pavi2");
////////        hs2.add("Karthick2");
////////        hs2.add("prakriti2");
////////        hs2.add("Dhanush2");
////////
////////
////////        hs.addAll(hs2);
////////
//////////        System.out.println(hs);
//////////        System.out.println(hs2);
////////
////////        hs.remove("Dhanush2");
////////        hs.removeAll(hs2);
////////
////////        hs.removeIf(str -> str.contains("Dhanush"));
////////
////////        hs.clear();
////////        hs.clear();
//////
//////
////////        System.out.println(hs);
//////
////////        Iterator itr = hs.iterator();
////////        while(itr.hasNext())
////////            System.out.println(itr.next());
//////
////////        List<String> list = new ArrayList<>();
////////        list.add("Pavi");
////////        list.add("Karthick");
////////        list.add("Prakriti");
////////        list.add("Dhanush");
////////Collections.sort(list);
////////        String[] array = list.toArray(new String[(list.size())]);
////////
////////        System.out.println(array);
////////
////////        for(String s : list)
////////            System.out.println(s);
//////
//////
////////        String[] array = {"Pavi", "Karthick", "Prakriti", "Dhanush"};
//////////        array = Arrays.toString(array);
////////        List<String> list = new ArrayList<>(Arrays.asList(array));
////////        System.out.println(list);
//////
////////        for(String s: array)
////////            list.add(s);
////////            System.out.println(list);
////////
////////            System.out.println(array);
////////        System.out.println(Arrays.toString(array));
//////
//////
////////        List<String> al=new ArrayList<String>();
////////        al.add("Amit");
////////        al.add("Vijay");
////////        al.add("Kumar");
////////        al.add(1,"Sachin");
////////        ListIterator<String> itr=al.listIterator();
////////        System.out.println("Traversing elements in forward direction");
////////        while(itr.hasNext()){
////////
////////            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
////////        }
////////
////////        for(String s: al)
////////            System.out.println(s);
////////        System.out.println("Traversing elements in backward direction");
////////        while(itr.hasPrevious()){
////////
////////            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
////////        }
//////
//////
//////    }
//////}