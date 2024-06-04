#include<stdio.h>
#include<math.h>

long long catDoi(long long n){
	int a;
	long long m=0;
	while(n>0){
		a=n%10;
		if(a==0||a==8||a==9){
			a=0;
			}	
		else if(a==1){
			a=1;
			}
		else{
			return 0;
			break;
		    }
		m=10*m+a;   
		  n/=10;    
	}
	return m;
}

int main(){
	int n;
	scanf("%d", &n);

	     while(n--){
	     	long long a;
	     	scanf("%lld", &a);
	     	long long c=a;
	     	long long x, y=0;
	     	while(a>0){
	     		x=a%10;
	     		y=10*y+x;
	     		a/=10;
			 }
			 int count=0;
			 while(c>0){
			 	x=c%10;
			 	if(x==0){
			 		count++;n
				 }else
			 	      break;
			 }
			 long long d=pow(10, count);
	     	long long b=catDoi(y);
	     	if(b==0)
	     	   printf("INVALID");
	     	else
	     	   printf("%lld", b*d);
	     	 printf("\n");  
		}
				

	return 0;
}
