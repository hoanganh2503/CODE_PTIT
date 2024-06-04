package Lop_intset_2;
import java.util.*;
public class IntSet {
    public Set<Integer> set = new TreeSet<Integer>();

    public IntSet(int set[]) {
        Set<Integer> set1 = new TreeSet<Integer>();
        for(int it:set) set1.add(it);
        this.set = set1;
    }

    public IntSet intersection(IntSet s) {
        Set<Integer> set1 = new TreeSet<Integer>(s.set);
        Set<Integer> set2 = new TreeSet<Integer>(this.set);
        set2.retainAll(set1);
        int arr[] = new int[set2.size()];
        int i = 0;
        for(int it:set2) arr[i++] = it;
        return new IntSet(arr);
    }

    @Override
    public String toString() {
        String s = "";
        for(int it:this.set) s += Integer.toString(it) + " ";
        return s;
    }
}
