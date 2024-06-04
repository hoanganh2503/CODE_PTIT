#include<stdio.h> 

void nhap(int *b, int a){
	int i;
	for(i=0 ; i<a ; i++){
		scanf("%d", &b[i]);
	}
}

void hienthi(int *b, int a){
	int i;
		for(i=a-1 ; i>=0 ; i--){
		printf("%d ",b[i]);
	}
}
 
 
int main() {  
   int a;
   scanf("%d", &a);
   int b[1000];
   nhap(b, a);
   hienthi(b ,a);
   
   return 0; 
}
