#include<stdio.h>
#include<math.h>
#include<string.h>


int demso(char *arr){
	int count=0;                                                    
	int i;
	int size=strlen(arr);
	for(i=0 ; i<size-1 ; i++){
		if(arr[i]>='0'&&arr[i]<='9')
		count++;
	}
	return count;
}
int demchu(char *arr){
	int count=0;                                                    
	int i;
	int size=strlen(arr);
	for(i=0 ; i<size-1 ; i++){
		if(arr[i]>=65&&arr[i]<=90||arr[i]>=97&&arr[i]<=122)
		count++;
	}
	return count;
}

int main() {

		
	char arr[1000];
    fgets(arr, 999, stdin);
    int size=strlen(arr);
    int a=demso(arr);
    int b=demchu(arr);
    printf("%d %d %d", b, a, size-1-a-b );
		
	
    

	
	return 0;
}
