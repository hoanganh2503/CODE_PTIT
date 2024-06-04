#include <stdio.h>
#include<string.h>
int khoangTrang(char c){
	return (c==' '||c=='\t');
}

int kiemtra(char *arr){
	int count=0;                                                    
	int i;
	int size=strlen(arr);
	for(i=0 ; i<size-1 ; i++){
		if(!khoangTrang(arr[i])&&khoangTrang(arr[i+1]) || !khoangTrang(arr[i])&& !khoangTrang(arr[i+1]) && i+1==size-1)
		count++;
	}
	return count;
}
int thuchien(char *arr){
	
    fgets(arr, 999, stdin);
    int a=kiemtra(arr);
    if(a>0)
    printf("%d\n", a);
}
int main() {
	int x;
	scanf("%d", &x);
	int y=x+1;
	char arr[10000];
	while(y--){
		#include <stdio.h>
#include<string.h>
int khoangTrang(char c){
	return (c==' '||c=='\t');
}

int kiemtra(char *arr){
	int count=0;                                                    
	int i;
	int size=strlen(arr);
	for(i=0 ; i<size-1 ; i++){
		if(!khoangTrang(arr[i])&&khoangTrang(arr[i+1]) || !khoangTrang(arr[i])&& !khoangTrang(arr[i+1]) && i+1==size-1)
		count++;
	}
	return count;
}
int thuchien(char *arr){
	
    fgets(arr, 999, stdin);
    int a=kiemtra(arr);
    if(a>0)
    printf("%d\n", a);
}
int main() {
	int x;
	scanf("%d", &x);
	int y=x+1;
	char arr[10000];
	while(y--){
		
	thuchien(arr);	
	
		
	}
    

	
	return 0;
}

	thuchien(arr);	
	
		
	}
    

	
	return 0;
}

