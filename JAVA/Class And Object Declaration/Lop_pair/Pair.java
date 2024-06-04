package Lop_pair;

public class Pair<T1, T2> {
    private int T1, T2;

    public Pair(int T1, int T2) {
        this.T1 = T1;
        this.T2 = T2;
    }

    public boolean isPrime(){
        if(check(this.T1) && check(this.T2)) return true;
        return false;
    }

    public static boolean check(int T1) {
        if( T1 < 2) return false;
        if(T1 == 2) return true;
        if(T1 %2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(T1); i++){
            if(T1 % i == 0) return false;
        }
        return true;
    }

    public String toString() {
        return (this.T1 + " " + this.T2);
    }
}
