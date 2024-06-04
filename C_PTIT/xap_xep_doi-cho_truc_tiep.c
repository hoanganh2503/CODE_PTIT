#include<stdio.h>

void swap(int *a, int *b){
	int tmp = *a;
	*a = *b; 
	*b = tmp;
}
void hienthi(int *arr, int n){
	int i;
	for(i = 0 ; i < n ; i++){
		printf("%d ", arr[i]);
	}
}

int main(){
	int n;
	scanf("%d", &n);
	int arr[n+1];
	int i, j, k= 1;
	for( i = 0 ; i < n ; i++){
		scanf("%d", &arr[i]);
	}
	for(i = 0 ; i < n ; i++){
		int count = 0;
		for( j = i ; j < n ; j++){
			if(arr[i] > arr[j]){
				count = 1;
				swap(&arr[i], &arr[j]);
			}
		}
		if(count == 1){
			printf("Buoc %d: ", k);
			hienthi(arr, n);
			k++;
			printf("\n");
		}
	}
return 0;	
}
