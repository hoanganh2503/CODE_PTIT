package Lop_intset;
import java.util.*;
public class IntSet {
    private int[] arr;
    
    public IntSet(int[] arr) {
        this.arr = arr;
    }

    public IntSet union(IntSet a){
        Set<Integer> s1 = new TreeSet<Integer>();
        for(int it : a.arr) s1.add(it);
        for(int it : this.arr) s1.add(it);
        int arr[] = new int[s1.size()];
        int i = 0;
        for(int it : s1) arr[i++] = it;
        return new IntSet(arr);
    }

    @Override
    public String toString() {
        String s = "";
        for(int it:this.arr) s += Integer.toString(it) + " ";
        return s;
    }
}
