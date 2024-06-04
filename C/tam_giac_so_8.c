#include<stdio.h>
#include<math.h>

int main(){
	int n;
	scanf("%d", &n);
	int i, j, k =1;
	int arr[10][10];
	for(i = 1 ; i <= n ; i++){
		if(i%2 == 1){
			for(j = 1 ; j <= i ; j++){
				arr[i][j] = k;
				k++;
			}
		}
			else{
			for(j = i ; j >= 1 ; j--){
				arr[i][j] = k;
				k++;
			}
		}
	}
	for(i = 1 ; i <= n ; i++){
		for(j = 1 ; j <= i ; j++)
		printf("%d ", arr[i][j]);
		printf("\n");
	}
	return 0;
}


