#include <stdio.h> 

void nhap(int *arr, int n){
	int i; 
	for(i =  0  ; i  <  n ; i ++){
		scanf("%d", &arr[i]);
	}
}

void timViTri(int *arr, int n, int *start, int *end, int *count){
	 int j = 0;
	 start[j] =0 ; 
	 int i;
	 for(i = 0 ; i < n-1 ; i++){
	 	if(arr[i]>=arr[i+1]){
	 		end[j] = i;
	 		j++;
	 		start[j] = i+1;
		 }
	 }
	 end[j++] = n - 1 ;
	 *count = j;
}

void hienthi(int *arr, int start, int len){
	int i;
	for(i = start; i < start +len ; i++){
		printf("%d ", arr[i]);
	}
	printf("\n");
}

int timmax(int *start, int *end, int n){
	int max = end[0] - start[0] + 1 ; 
	int i; 
	for(i = 1 ; i < n ; i++){
		int length = end[i] - start[i] +1 ;
		if(length >  max)
		max = length ;
	}
	return max;
}

void ketqua(int *arr, int n, int *start, int *end , int count){
	int max =  timmax(start, end, count);
	int len;
	int i;

	
		
		printf("%d\n", max);
	for(i = 0 ; i < count ; i++){
		len = end[i]  -  start[i]  +  1;
		
		if(len == max){
			
		 hienthi(arr, start[i], len);
		 
		}
		
	}
}
int main() {
	int x;
	scanf("%d", &x);
	int z=1;
	while(x--){
	 int n;
	 	
	 scanf("%d", &n);
	 int arr[101];
	 int start[101];
	 int end[101];
	 nhap(arr, n);
	 int count;
	 timViTri(arr, n, start, end, &count);
	 printf("Test %d:\n", z);
	 ketqua(arr, n, start, end, count);
	 z++;
	 printf("\n");
	}
	
return 0;	
}

