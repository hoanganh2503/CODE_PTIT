#include<stdio.h>
#include<math.h>

int main(){
    int n, m;
    scanf("%d%d", &n , &m);
	    int i, j;
    int a=0;
    for(i=1 ; i<=n ;i++){
    	for(j=1 ; j<= m-a; j++){
			printf("%d", i+j-1);
	}
	int b;
	if(i<m){
		b=m-1;
	}else
	    b=i-1;
	for(j=m ; j> m-a ; j--){
			printf("%d", b);
			b--;
	}
	
	printf("\n");
	if(a<m-1){
		a++;	
	}

    }
	
	return 0;
}

