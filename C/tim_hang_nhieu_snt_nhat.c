#include <stdio.h> 
#include <math.h>
#define ll long long

int nguyento(int n){
	int i;
	if(n < 2)
	return 0;
	else{
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}
		
		
}
void nhap(int arr[][50], int n){
	int i, j;
	for(i = 0 ; i < n; i++){
		for(j = 0 ; j < n ; j++){
			scanf("%d", &arr[i][j]);
		}
	}
}
int kiemtra(int arr[][50], int n){
	int count=0, count1 = 0;
	int i, j;
	for(i = 0 ; i < n ; i++){
		if(nguyento(arr[0][i]))
		count++;
	}
		
	for( i = 1 ; i < n ; i++){
		count1=0;
		for(j = 0 ; j < n ; j++){
		if(nguyento(arr[i][j]))
		count1++;	
		}
		if(count1 > count)
		count = count1;
	}
	
	return count;
}
void hienthi(int arr[][50], int n){
	int i, j;
	int x = 0;
	int a = kiemtra(arr, n);

	int count;
	for( i = 0 ; i < n ; i++){
		count =0;
		for(j = 0 ; j < n ; j++){
			if(nguyento(arr[i][j]))
		    count++;	
		}
			
		if(count == a){
			x=i;
		printf("%d\n", i+1);
		break;
		}
		}
		for(i  = 0 ; i < n ; i++){
			if(nguyento(arr[x][i]))
			printf("%d ", arr[x][i]);
		}
}


int main() {

	int  n;
	scanf("%d", &n);
	int arr[50][50];
    nhap(arr, n);
    //kiemtra(arr, n);
    hienthi(arr, n);

return 0;	
}
