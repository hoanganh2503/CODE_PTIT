#include<stdio.h>

int nhap(int *arr, int n){
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
void hienthi(int *b, int *dem, int n){
	 int i;
	 for(i=0 ; i< n ; i++){
	 	printf("%d %d\n", b[i], dem[i]);
	 }
}


int TH(int *arr, int n){
	int b[100];
	int dem[100];
	int i;
	int h, j=0;
	for(i=0 ; i<n ; i++){
		h=chuaXH(b, j, arr[i]);
		if(h==-1){
			b[j] = arr[i];
			dem[j] = 1;
			j++;
		}else
		     dem[h]++;
	}
	
	hienthi(b, dem, j);
}


int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
    TH(arr, n);
	return 0;
}

