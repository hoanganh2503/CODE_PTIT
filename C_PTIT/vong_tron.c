#include<stdio.h>
#include<string.h>

long long giaithua(long long n){
			if(n == 0 || n == 1)
			return 1;
			return n*giaithua(n-1);
}

int main(){
	char str[53];
	gets(str);
	int i;
    int count = 0;
	for(i = 0 ; i < strlen(str)  ; i +=2){
		if(str[i] != str[i+1])
		count ++;
	}
	long long k;
	k = giaithua(count)/2*giaithua(count-2);
	printf("%lld", count);
}
