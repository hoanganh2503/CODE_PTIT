#include<stdio.h>
#include<math.h>

int main() {
    int  n, m;
    int a=0;
    char arr[100][100];
    scanf("%d%d", &m, &n);
    int k, h;
 
    int i, j;
    for(i=1 ; i<=m ;i++){
        int h=1;
		for(j=1; j<=n;j++){
             if(j<=n-a)
             arr[i][j]= 65+a+j-1;
            	
			else{
			 arr[i][j]= 65+n-1;

			}
			    
			}
			if(a<n-1)
		    a++;				
	}
	for(i=m; i>=1 ; i--){
		for(j=1 ;j<=n; j++){
			printf("%c", arr[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}


