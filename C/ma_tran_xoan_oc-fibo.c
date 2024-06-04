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

void fibo(int *b, int n){
	int i;
	b[0]=0;
	b[1]=1;
	b[2]=1;
	int count = 0;
	for(i = 2 ; ; i++){
		b[i] = b [i-1] + b[i-2];
		count++;

		
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

	int  n;
	scanf("%d", &n);
	int arr[50][50];
    int b[100];
    fibo(b, n);
    gan(arr, b, n);

	
    hienthi(arr, n);
   

return 0;	
}


