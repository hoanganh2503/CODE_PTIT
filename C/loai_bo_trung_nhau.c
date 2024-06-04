#include<stdio.h>
#include<math.h>

void nhap(int *arr, int n){
	int i;
	for(i=0 ; i<n ; i++){
		scanf("%d", &arr[i]);
	}
}

int chuaXH(int *b, int n, int x){
	int i;
	for(i=0 ; i < n ; i++){
		if(b[i]==x)
		return i;
	}
	return -1;
}


void hienthi(int *b, int n){
	int i;
		for(i=0 ; i<n ; i++){
		printf("%d ", b[i]);
	}
}

void TH(int *arr, int n){
	int i;
	int b[100];
	int j=0;
	for(i=0 ; i < n ; i++){
		int h=chuaXH(b, j, arr[i]);
		if(h==-1){
			b[j]=arr[i];
			j++;
		}
	}
	hienthi(b, j);
}

int main() {

		 int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
    TH(arr, n);
    
	return 0;
}

