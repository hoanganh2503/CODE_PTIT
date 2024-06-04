#include<stdio.h>
int main() {
	int i, j;
    int n;
    scanf("%d", &n);
    int m=n-1;
    for( i=1;i<=n+m;i++){ 
        for( j=1;j<= n+m;j++){
            if(j<=m) printf("~");
            else{ printf("*");
            } 
            
        } printf("\n");
        m--;
        } 
        return 0;
        }
