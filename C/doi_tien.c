#include <stdio.h> 

int kt(int *arr, int n){
	int count =0;
	int i=0;
	while(n>0){
		if(n>=arr[i]){
			count+=n/arr[i];
			n%=arr[i];
		}else
		i++;
	}
	return count;
}

int main() {
	int x;
	scanf("%d", &x);
	while(x--){
		long n;
		scanf("%ld", &n);
	    int arr[9];
	    arr[0]=1000;
	    arr[1]=500;
	    arr[2]=200;
	    arr[3]=100;
	    arr[4]=50;
	    arr[5]=20;
	    arr[6]=10;
	    arr[7]=5;
	    arr[8]=2;
	    arr[9]=1;
	    
	    printf("%d", kt(arr, n));

	 printf("\n");
	}
	
return 0;	
}

