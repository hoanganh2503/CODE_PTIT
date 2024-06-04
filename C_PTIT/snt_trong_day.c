#include<stdio.h>
#include<math.h>

long nguyento(long n){
	if(n<=1)
	   return 0;
	else{
		long i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}
	
		
}

int main(){
	int n;
	scanf("%d", &n);

	     while(n--){
	     	int a;
	     	int arr[10000];
	     	scanf("%d", &a);
	          int i;
	          for(i=1 ; i <= a ; i++){
	          	scanf("%d", &arr[i]);
			  }
			  for(i=1 ; i <= a ; i++){
	          	if(nguyento(arr[i]))
	          	   printf("%d ", arr[i]);
			  }
	     	 printf("\n");  
		}
				

	return 0;
}


