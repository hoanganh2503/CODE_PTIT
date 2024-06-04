package Phan_so;

public class PS {
   private long ts, ms;

   public PS(long ts, long ms) {
        this.ts = ts;
        this.ms = ms;
   } 

   public long getTS(){
        return this.ts;
   }
   public long getMS(){
        return this.ms;
   }

   public long UCLN(long a, long b) {
        if(b == 0) return a;
        return UCLN(b, a%b);
   }

   public String printAnser(long x){
        return this.ts/x + "/" + this.ms/x;
   }

}
