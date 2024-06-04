#include<stdio.h>

int main(){
    int a;
    scanf("%d", &a);
    int b;
    b=a/365;
    int c;
    c=(a%365)/7;
    int d;
    d= a-365*b-7*c;
    printf("%d %d %d", b, c, d);
    
    
	return 0;
}



