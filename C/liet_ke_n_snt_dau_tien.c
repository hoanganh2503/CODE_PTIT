#include<stdio.h>
#include<math.h>

int nguyento(int n){
	int i;
	if(n<=1)
	     return 0;
    else
        
        for(i=2; i<=sqrt(n) ; i++){
        	if(n%i==0)
        	   return 0;
		}
		return 1;
}

int main(){
	int n;
	scanf("%d", &n);
	int i;
	int dem=0;
	for(i=2;dem<n; i++){
     	if(nguyento(i)){
     		printf("%d\n", i); 
		dem++;	
		 }
	
		 }
	
    

	return 0;
}

