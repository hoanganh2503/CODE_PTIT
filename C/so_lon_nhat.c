#include<stdio.h> 

int max(int *arr, int n){
	int max=arr[0];
	int i; 
	for(i=0 ; i< n; i++){
		if(arr[i]>max)
		  max=arr[i];
	}
	return max;
}
 
 
int main() {  
     int m; 
     scanf("%d",&m);
	  while(m--) {
	        int a;
	        scanf("%d", &a);
	        int arr[1000];
	        int i;
	        for(i=0 ; i < a ; i++){
	        	scanf("%ld", &arr[i]);
			}
			int k=max(arr, a);
			printf("%d\n", k);
			for(i=0 ; i < a ; i++){
				if(arr[i]==k)
	        	printf("%ld ", i);
			}
			printf("\n");
				}
	return 0; 
}

