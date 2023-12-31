package task1;

import java.util.HashSet;
import java.util.Set;

public class OperationsOnSet {
    public <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> set = new HashSet<>();
        for (T element : set1){
            if (set2.contains(element)){
                set.add(element);
            }
        }
        return set;
    }
}
