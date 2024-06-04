#include <stdio.h> 



int main() {
	int a;
	scanf("%d", &a);
	int c=a;
	int arr[1000];
	int i=0, n=0;
	int b;
	while(a>0){
		b= a%2;
		arr[i++]=b;
		a/=2;
		n++;
	}
	if(c==0)
	printf("0");

   for(i = n-1 ; i >= 0 ; i--){
   	printf("%d", arr[i]);
   }
	
return 0;	
}



