#include <stdio.h> 
#include <math.h>
#define ll long long
int nguyento(int n){
	int i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
		
}

void ngto(int *b, int n){
	int i;
	int j=0;
	int count = 0;
	for(i = 2 ; ; i++){
		if(nguyento(i)){
		count++;
		b[j++] = i;	
		}
		if(count == n*n)
		break;
	}
}

void gan(int arr[][50], int *b ,  int n){
	 int d = 0;
	 int gt=1;
	 int hang = n - 1 , cot = n-1;
	 int i, j = 0;
	 while(d <= n/2){
	 	for( i = d ; i <= cot ; i++)
	 	arr[d][i] = b[j++];
	 	for( i = d+1 ; i <= hang ; i++)
	 	arr[i][cot] = b[j++];
	 	for( i = cot -1 ; i >= d ; i--)
	 	arr[hang][i] = b[j++];
	 	for(i = hang - 1 ; i >= d+1 ; i--)
	 	arr[i][d] = b[j++];
	 	
	 	d++;
	 	hang--; cot--;
	 }
	 
}




void hienthi(int arr[][50], int n){
	int i, j;
	for(i = 0 ; i  < n ; i++){
		for( j = 0 ; j < n ; j++){
			printf("%d ", arr[i][j]);
		}
		printf("\n");
		
	}
}
void hienthi1(int *arr, int n){
	int i;
	for(i = 0 ; i< n*n ; i++){
		printf("%d ", arr[i]);
	}
}

int main() {
	int x;
	int z=1;
	scanf("%d", &x);
	while(x--){
	int  n;
	scanf("%d", &n);
	int arr[50][50];
    int b[100];
    ngto(b, n);
    gan(arr, b, n);
    printf("Test %d:\n", z);
	
    hienthi(arr, n);
    printf("\n");
    z++;
	}

return 0;	
}


