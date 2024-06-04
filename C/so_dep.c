#include<stdio.h>
#include<math.h>


long long catDoi(long long n){
	int a=n%10;
	    n/=10;
          while(n>10){
          	n/=10;
		  }
		  if(a==2*n||n==2*a)
		     return 1;
		  else
		     return 0;
}

long thuannghich(long n){
	int a;
	long k=n;
	long l=0;
	while(n>0){
		  a=n%10;
		  l=10*l+a;
		  n/=10;
	}
	if(l==k)
	   return 1;
	else
	return 0;
}

long long catDoi2(long long n){
	int a=n%10;
	    n/=10;
	    long long m=0;
          while(n>10){
          	m=10*m+n%10;
          	n/=10;
		  }
		  if(thuannghich(n))
		     return 1;
		  else
		     return 0;
}

int main(){
	int n;
	scanf("%d", &n);

	     while(n--){
	     	long long a;
	     	scanf("%lld", &a);
	           if(catDoi(a)&&catDoi2(2))
	                printf("YES");
	            else 
	                printf("NO");
	     	 printf("\n");  
		}
				

	return 0;
}


