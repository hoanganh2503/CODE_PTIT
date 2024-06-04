#include<stdio.h>
#include<math.h>

int main() {
    int  n, m;
    int a=0;
    scanf("%d%d", &m, &n);
    int k, h;
    if(n>=m){
    	k=n;
    	h=m;
	}else{
		k=m;
		h=n;
		}
    int i, j;
    for(i=1 ; i<=m ;i++){
        int h=1;
		for(j=1; j<=n;j++){
			if(i==1)
			printf("%c", 97+k-1);
            else if(j<=a)
            	printf("%c", 97+k-j);
			else{
				printf("%c", 97+k-i);

			}
			    
			}
		a++;
	printf("\n");				
	}
	
	return 0;
}

