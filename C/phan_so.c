#include<stdio.h>
#include<math.h>

struct ps
{
    int tuso;
    int mauso;
};

int UCLN(int a, int b){
    if(a< b){
        int tmp = a; 
        a = b; 
        b = tmp;
    }
    if(b == 0)
    return a;
    if(a%b ==0) return b;
    return UCLN(b, a%b);
}
int BCNN(int a, int b){
        return a*b/UCLN(a, b);
}
void rutgon_dongquy(struct ps a, struct ps b){
    struct ps c, d, e, f;
    c.tuso = a.tuso/UCLN(a.mauso, a.tuso);
    c.mauso = a.mauso/UCLN(a.tuso, a.mauso);

     d.tuso = b.tuso/UCLN(b.mauso, b.tuso);
    d.mauso = b.mauso/UCLN(b.tuso, b.mauso);
    int msc = BCNN(c.mauso, d.mauso);
    int x = msc/d.mauso, y = msc/c.mauso;

    printf("%d/%d %d/%d\n", c.tuso*y, c.mauso*y, d.tuso*x, d.mauso*x);
    e.tuso = c.tuso*y+ d.tuso*x;
    e.mauso = c.mauso*y;
    int k = UCLN(e.tuso, e.mauso);
    printf("%d/%d\n", e.tuso/k, e.mauso/k);

    f.tuso = c.tuso*d.mauso;
    f.mauso = c.mauso*d.tuso;
    int l = UCLN(f.tuso, f.mauso);
    printf("%d/%d\n", f.tuso/l, f.mauso/l);
}   

int main(){
    int x;
    scanf("%d", &x);
    int k = 1;
    while(x--){
        struct ps a, b; 
    scanf("%d%d%d%d", &a.tuso, &a.mauso, &b.tuso, &b.mauso);
    printf("Case #%d:\n", k);
        k++;
    rutgon_dongquy(a, b);
    }
   

return 0;
}
