#include<stdio.h>

int main(){
    long a, b;
    scanf("%ld%ld", &a, &b);
    if(b==0){
        printf("0");
    }else{
 
		printf("%ld\n", a+b);
    printf("%ld\n", a-b);
    printf("%ld\n", a*b);
    printf("%ld\n", a/b);
    printf("%ld\n", a%b);
    printf("%.2f", (float)a/b);
    }
    
    
	return 0;
}
