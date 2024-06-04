#include <stdio.h>
#include<string.h>
#include<stdlib.h>

void xoa(char *arr, int pos, int len){
	int i;
	int size=strlen(arr);
	for(i=pos ; i<=size-len  ; i++){
		 arr[i]=arr[i+len];
	}
	
}
void th(char *arr , char *b){
	int size=strlen(arr);
	int i;
	int len =strlen(b);
	for(i=0 ; arr[i]!='\0'; i++){
		if(strstr(&arr[i], b)==&arr[i]){
			xoa(arr, i, len);
			i--;
		}
		 
	}
}

int main() {
    char arr[1000];
    char b[100];
    fgets(arr, 999, stdin);
    fgets(b, 99, stdin);
    int len = strlen(b);
    if(len>0)
    b[len-1]='\0';
    int size=strlen(arr);
    if(size>0)
    arr[size-1]='\0';
    th(arr, b);
    puts(arr);
	  	
	return 0;
}

