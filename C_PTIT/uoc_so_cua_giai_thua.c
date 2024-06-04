#include<stdio.h>
#include<math.h>
long check(long n,int p){
    long  a=0;
    for(long i=p;i<=n;i*=p){
        a+=n/i;
    }
    return a;
}
int main(){
    int x;
    scanf("%d", &x);
    getchar();
    int a  = x;
    while(a--){
        long N;
    int p;
    scanf("%ld%d",&N,&p);
    printf("%ld\n",check(N,p));
    }
    return 0;
}