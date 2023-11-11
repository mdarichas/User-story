package task1;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(6);
        mySet1.add(2);
        mySet1.add(4);
        mySet1.add(5);

        Set<Integer> mySet2 = new HashSet<>();
        mySet2.add(6);
        mySet2.add(3);
        mySet2.add(5);
        mySet2.add(1);

        Set<Integer> uSet;
        OperationsOnSet method = new OperationsOnSet();


        System.out.print("\n\nunion:\n");
        uSet = method.union(mySet1, mySet2);
        for (Integer element : uSet){
            System.out.print(element + "  ");
        }

        System.out.print("\n\nintersect:\n");
        uSet = method.intersect(mySet1, mySet2);
        for (Integer element : uSet){
            System.out.print(element + "  ");
        }

    }
}
