#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

void sap_xep_giam_dan(int *arr, int n){
	int i, j;
	for(i = 0 ; i < n ; i++){
		for(j = i + 1 ; j < n ; j++){
			if(arr[i] > arr[j]){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
}// tang dan thi doi thanh dau <

int max(int *arr, int n){
	int i;
	int max = arr[0];//khoi tao gia tri max = vi tri bat ki cua mang
	for(i = 0 ; i < n ; i++){
		if(arr[i] > max)
		max = arr[i] ;// neu co gia tri nao > max thi gan max = gia tri do
	}
	return max;
}//min thi thay dau > bang dau <

int nguyento(int n){//bat buoc khai bao thu vien math.h
	int i;
	int count = 0;
	if(n < 2)
	return 0;//gia tri tra ve la 0 tuong ung khong phai snt, 1 la snt
	for(i = 2 ; i <=sqrt(n) ; i++){
		if(n%i== 0){
			return 0;
			break;
		}
	}
	return 1;
}

int fibonaci(int n){
	if(n == 0 )
	return 0;
	else if(n == 1|| n == 2)
	return 1;
	else return fibonaci(n-1)+ fibonaci(n-2);
}

int giaithua(int n){
	int i;
	if(n == 0 || n == 1)
	return 1;
	else
	return n*giaithua(n-1);
}

int UCLN(int a, int b){
	if(a < b){
		int tmp = a; 
		a = b;
		b= tmp;
	}
	if(b==0)
	return a;
	else return UCLN(b, a%b);
}

int BCNN(int a, int b){
	return a*b/UCLN(a, b);
}

int main(){
    printf("%d\n", fibonaci(8));
	printf("%d", UCLN(8, 13));
	
}
