#include<stdio.h>
#include<math.h>

int nguyento(int n){
	if(n<=1)
	   return 0;
	else{
		int i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}		
}

void hienthi(int *b, int *dem, int n){
	int i;
	for(i=0 ; i <n  ; i++){
		printf("%d %d\n", b[i], dem[i]);
	}
}

int chuaXH(int *b, int n, int x){
	int i;
	for(i=0 ; i < n ; i++){
		if(b[i]==x)
		   return i;
	}
	return -1;
}

int main(){
	long long m;
	int a;
	int b[100];
	int dem[100];
	int h, j=0;
	scanf("%lld", &m);
	long long n=0;
	    while(m>0){
	    	n=10*n+m%10;
	    	m/=10;
		}
	
	
	           	while(n>0){
                   a=n%10;
                   h= chuaXH(b, j, a);
                   if(nguyento(a) && h==-1){
                   	b[j]=a;
                   	dem[j]=1;
                   	j++;
				   }if(h!=-1 && nguyento(a))
				       dem[h]++;
				       
				    n/=10;
		}
		hienthi(b, dem, j);
	
	return 0;
}


