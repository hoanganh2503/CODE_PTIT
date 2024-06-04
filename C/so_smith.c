#include<stdio.h>
#include<math.h>

long long tongChuSo(long long n){
	int sum=0;
	while(n>0){
		sum+=n%10;
		n/=10;
	}
	return sum;
}



int main(){
	long long n;
	int a;
	scanf("%lld", &n);
    long long m=n;
	int j=2, dem=0;
	           		while(n>1){
			if(n%j==0){
				dem+=tongChuSo(j);
				n/=j;
			}
				
			else{
				       		j++;
			}
		}
		if(dem==tongChuSo(m))
		   printf("YES");
		else
		printf("NO");
	return 0;
}


