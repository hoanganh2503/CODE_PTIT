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

void hienthi(int *b, int *dem, int n){
	int i;
	int count=0;
		for(i=0 ; i<n ; i++){
			if(dem[i]>1){
				count++;
			}
		
	}
	printf("%d\n", count);
			for(i=0 ; i<n ; i++){
			if(dem[i]>1)

		printf("%d ", b[i]);
	}
	
}

int TH(int *arr, int n){
	int b[1000];
	int dem[1000];
	int i, j=0, k;
	for(i=0 ; i<n ; i++){
		k=chuaXH(b, j, arr[i]);
		if(k==-1){
			b[j]=arr[i];
			dem[j]=1;
			j++;
		}
		else
		   dem[k]++;
		
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

