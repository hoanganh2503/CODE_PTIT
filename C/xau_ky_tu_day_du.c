#include<stdio.h>
#include<string.h>

int main(){
	char str[50];
	gets(str);
	int i;
	int n = strlen(str);
	for( i = 0 ; i < n ; i++){
		printf("%d ", str[i]);
	}
	return 0;
}
