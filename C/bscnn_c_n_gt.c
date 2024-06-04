#include<stdio.h>
#include<math.h>
#define lli unsigned long long

lli UCLN (lli a, lli b) {
    lli tmp;
    while(b != 0) {
        tmp = a % b;
        a = b;
        b = tmp;
    }
    return a;
}
lli BCNN(lli a, lli b){
    return (a*b)/UCLN(a, b);
}

int main(){
    int x;
    scanf("%d", &x);
    while(x--){
        int n;
        scanf("%d", &n);
        lli tmp = 1;
        int i;
        for(i = 2; i <= n ; i++){
            tmp = BCNN(tmp, i);
        }
        printf("%lld\n", tmp);
    }
    return 0;
}
