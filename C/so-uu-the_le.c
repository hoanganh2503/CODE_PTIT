#include<stdio.h>
#include<math.h>



int tongChuSo(long n){
	int chan=0, le=0, a;
	while(n>0){
	      a=n%10;
	      if(a%2==0)
	         chan++;
	       else
	        le++;
	    n/=10;
	}
	if(chan<le)
	    return 1;
	else
	    return 0;

}


int main(){
	int x;
	scanf("%d", &x);
	while(x--){
	long long a;
	scanf("%lld", &a);
	      if(tongChuSo(a))
		       printf("YES");
		  else
		       printf("NO"); 
	printf("\n");
	}
    
	return 0;
}


