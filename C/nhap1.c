#include <stdio.h>
#include <math.h>
#include<stdlib.h>
int main(){
	FILE *f;
	f = fopen("bai1.txt", "w");
	
	if(f == NULL){
		exit(1);
	}
	int n;
	scanf("%d", &n);
	fprintf(f, "%d ", n);
	fclose(f);
	return 0;
}


