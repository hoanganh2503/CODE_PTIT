#include<stdio.h>
#include<math.h>

void nhap(int *arr, int n){
	 int i; 
	 for(i = 0 ;i < n ; i++){
	 	scanf("%d", &arr[i]);
	 }
}
int max(int *arr, int n){
	int max=arr[0];
	int i;
	for(i = 0 ; i < n ; i++){
		if(arr[i]>max)
		max = arr[i];
	}
	return max;
}

int chuaxh( int *b, int n, int x){
	int i;
	for(i = 0 ; i < n ; i++){
		if(b[i]==x){
			return i;
		break;	
		}
	
	}
	return -1;
}
void hienthi(int *b, int *dem , int n){
	 int max1 = max(dem, n);
	 int i; 
	 for(i = 0 ; i < n ; i++){
	 	if(dem[i]==max1)
	 	printf("%d ", b[i]);
	 }
}

int kt(int *arr, int n){
	int b[1000];
	int dem[1000];
	int i; 
	int j=0;
	int k;
	for(i = 0 ; i < n ; i++){
		k=chuaxh(b, j, arr[i]);
		if(k== -1){
			b[j]=arr[i];
			dem[j]=1;
			j++;
		}else
		  dem[k]++;
		
	}
	hienthi(b, dem ,j);
}

int main(){
	int x;
	scanf("%d", &x);
	while(x--){
		int n;
		scanf("%d", &n);
		int arr[10000];
		nhap(arr, n);
		kt(arr, n);
		printf("\n");
	}
    
	return 0;
}






