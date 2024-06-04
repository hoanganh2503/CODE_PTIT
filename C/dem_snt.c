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

int ChuSoNguyenTo(int n){
    int a;
    while(n>0){
           a= n%10;    		
		   if(nguyento(a)==0)
		   return 0;
		   n/=10;
	}
	    return 1;
}
	


int main(){
	int x;
	scanf("%d", &x);
	while(x>0){
		int a, b;
    scanf("%d%d", &a, &b);
    int i;
    int count=0;
    for(i=a; i<= b ; i++){
    	if(nguyento(i)&&ChuSoNguyenTo(i)){
    		count++;
		}
    	
	    } 
	    printf("%d\n", count);
	    x--;
	}
    
		
	return 0;
}

