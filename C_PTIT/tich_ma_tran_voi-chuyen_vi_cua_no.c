#include <stdio.h> 
#include <math.h>
#define ll long long

int main() {
	int x;
	int z=1;
	scanf("%d", &x);
	while(x--){
		
	int  n, m;
	scanf("%d%d", &n, &m);
	int c ;
	if(m>n)
	c = m;
	else c = n;
	int arr[50][50];
	int b[50][50];
	int i, j, k;
	
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < m ; j++){
			scanf("%d", &arr[i][j]);
		}
	}
	for(i = 0 ; i < m ; i++){
		for(j = 0 ; j < n ; j++){
			b[i][j] = arr[j][i];
		}
	}
	printf("Test %d:\n", z);
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < n ; j++){
			long long sum = 0;
			for(k = 0 ; k < c ; k++){
				sum += arr[i][k]*b[k][j];
			}
			printf("%d ", sum);
		}
		printf("\n");
		
	}
	
	printf("\n");
	z++;
	}

return 0;	
}


