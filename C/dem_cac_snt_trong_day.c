#include<stdio.h>
#include<math.h>
long nguyento(long n){
	if(n<=1)
	   return 0;
	else{
		long i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}
	
		
}

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
	 	printf("%d xuat hien %d lan\n", b[i], dem[i]);
	 }
}

void xapsep(int *arr, int n){
	int i, j;
	for(i=0 ; i<n ; i++){
		for(j=n-1 ; j>i ;j--){
			if(arr[j]<arr[j-1]){
				int tmp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=tmp;
			}
		}
	}
}

int TH(int *arr, int n){
	int b[100];
	int dem[100];
	int i;
	int h, k, j=0;
	for(i=0 ; i<n ; i++){
		h=chuaXH(b, j, arr[i]);
		k=nguyento(arr[i]);
		if(h==-1&&k==1){
			b[j] = arr[i];
			dem[j] = 1;
			j++;
		}if(h!=-1&&k==1)
		     dem[h]++;
	}

	hienthi(b, dem, j);
}


int main() {
	int z;
	scanf("%d", &z);
    int y=z;
	while(z--){
	int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
    xapsep(arr, n);
    printf("Test %d:\n",y-z );
    TH(arr, n);
	}
    
	return 0;
}
