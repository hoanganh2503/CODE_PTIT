#include<stdio.h>

void hienthi(int *arr, int n){
	int i;
	for(i = 0 ; i < n ; i++){
		printf("%d ", arr[i]);
	}
}
void sx(int *arr, int n){
	int i, j;
	for( i = 0 ; i < n-1 ; i++){
		for(j = i+1 ; j < n ; j++){
			if(arr[i] > arr[j]){
			   int tmp = arr[i];
			   arr[i] = arr[j];
				arr[j]= tmp;
			}
		}
	}
	hienthi(arr, n);
	printf("\n");
}

int main(){
	int n;
	scanf("%d", &n);
	int arr[n+1];
	int i, j, k= 0;
	for( i = 0 ; i < n ; i++){
		scanf("%d", &arr[i]);
	}
	
	for(i = 1 ; i <= n ; i++){
		printf("Buoc %d: ", k++);
			sx(arr, i);	
	}
return 0;	
}
