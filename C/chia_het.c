#include<stdio.h>
#include<math.h>
#define ll long long

ll gt(int n){
    if(n == 0 || n == 1)
    return 1;
    else
    return n*gt(n-1);
}

int main(){
    int a, b;
    scanf("%d%d", &a, &b);
    ll c = gt(a);
    ll d = pow(2, b);
    if(c%d == 0)
    printf("Yes");
    else
    printf("No");
}