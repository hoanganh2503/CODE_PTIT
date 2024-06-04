#include<stdio.h>
#include<math.h>

int main() {
    int  n, m;
    int a=0;
    scanf("%d%d", &m, &n);
    int k, h;
 
    int i, j;
    for(i=1 ; i<=m ;i++){
        int h=1;
		for(j=1; j<=n;j++){
             if(j<=n-a)
            	printf("%c", 64+a+j-1);
			else{
				printf("%c", 64+n-1);

			}
			    
			}
			if(a<n-1)
		    a++;
	printf("\n");				
	}
	
	return 0;
}

