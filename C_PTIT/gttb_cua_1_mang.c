#include <stdio.h>
#include<math.h>


int main() {
   int arr[1000];
   int i; 
   int n;
   scanf("%d", &n);
   for(i=1 ; i<=n ;i++){
   	scanf("%d", &arr[i]);
   }
   int sum=0;
   for(i=1 ; i<=n ;i++){
   	sum+=arr[i];
   }
   printf("%.3f", (float)sum/n);
	return 0;
}

