#include <stdio.h> 
#define ll long long

void nhap(ll *arr, ll *b, int n){
	int i;
	for( i = 0 ; i < n ; i++){
		scanf("%lld%lld", &arr[i], &b[i]);
	}
}
void swap(ll *a, ll *b)
{
	ll x = *a;
	*a = *b;
	*b = x;
}
void xapxep(ll *a, ll *b, int n)
{
	ll i, j;
	for (i = 0; i < n-1;i++)
		for ( j = i + 1; j < n;j++)
		if (a[i]>a[j]){
			swap(&a[i], &a[j]);
			swap(&b[i], &b[j]);
		}
			
}


ll kiemtra(ll *arr, ll *b, int n){
	ll tg=arr[0] + b[0];
	int i;
	for( i = 1 ; i < n ; i++){
		if(tg < arr[i])
		tg=arr[i] + b[i];
		else
		tg += b[i];
	}
	return tg;
}



int main() {
	int x;
	scanf("%d", &x);
	ll arr[101];
	ll b[101];
	nhap(arr, b, x);
	xapxep(arr, b, x);
	//hienthi(arr, b, x);
	printf("%lld", kiemtra(arr, b, x));
	
return 0;	
}




