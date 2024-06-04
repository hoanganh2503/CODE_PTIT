package Tong_da_thuc;

public class DaThuc {
    public String s, ans;
    public DaThuc(String s) {
        this.s = s;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public DaThuc cong(DaThuc o){
        String req = this.s + " + " + o.s;
        String str[] = req.split(" \\+ ");
        int arr[] = new int[10001];
        for(int it:arr) arr[it] = 0;
        for(String it:str){
            String s[] = it.split("\\*x\\^");
            arr[Integer.parseInt(s[1])] += Integer.parseInt(s[0]);
        }
        String s1 = "";
        for(int i = 10000 ; i >= 0 ; i--){
            if(arr[i] != 0){
                s1 += arr[i] + "*x^" + i + " + ";
            }
        }
        s1 = s1.substring(0, s1.length()-2);
        DaThuc ans = new DaThuc("fsf");
        ans.setAns(s1);
        return ans;
    }

    @Override
    public String toString() {
        return this.ans;
    }
}

