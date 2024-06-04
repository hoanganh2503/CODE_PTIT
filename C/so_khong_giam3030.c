#include<stdio.h>
#include<math.h>

int soKhongGiam(int n){
		int a=n%10;
		int b;
		n/=10;
		while(n>0){
			b=n%10;
			n/=10;
			if(a<b)
			   return 0;
			a=b;
		}
		return 1;
	}


int main(){
	int x;
	scanf("%d", &x); 
	while(x>0){
		int n;
		scanf("%d", &n);
		int j;
		int b=pow(10, n-1);
		int c=pow(10, n);
		for(j=b; j<=c ; j++){
			if(soKhongGiam(j))
			printf("%d ", j);
		}
		printf("\n");
		x--;
	}
		
	return 0;
}

