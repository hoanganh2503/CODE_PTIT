#include<stdio.h>
#include<math.h>

int soKhongGiam(int n){
		int a=n%10;
		int b;
		n/=10;
		while(n>0){
			b=n%10;
			n/=10;
			if(a>=b)
			   return 0;
			a=b;
		}
		return 1;
	}


int main(){
	int x;
	scanf("%d", &x); 
	while(x>0){
		int a, b;
		scanf("%d%d", &a, &b);
		int j;
        int count=0;
		for(j=a; j<=b ; j++){
			if(soKhongGiam(j))
			count++;
		}
		printf("%d\n", count);
		x--;
	}
		
	return 0;
}
