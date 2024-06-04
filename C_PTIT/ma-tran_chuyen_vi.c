#include <stdio.h>

void nhap(int a[50][50], int *m, int *n) {

		scanf("%d%d", m, n);
	
	int i, j;
	for(i = 0; i < *m; i++) {
		for(j = 0; j < *n; j++) {
			scanf("%d", &a[i][j]);
		}
	}
}

void hienThi(int a[50][50], int m, int n) {
	int i, j;
	for(i = 0; i < m; i++) {
		for(j = 0; j < n; j++) {
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
}

void chuyenVi(int a[50][50], int m, int n, int b[50][50]) {
	int i, j;
	for(i = 0; i < n; i++) {
		for(j = 0; j < m; j++) {
			b[i][j] = a[j][i];
		}
	}
}

int main() {
	int a[#include <stdio.h>

void nhap(int a[50][50], int *m, int *n) {

		scanf("%d%d", m, n);
	
	int i, j;
	for(i = 0; i < *m; i++) {
		for(j = 0; j < *n; j++) {
			scanf("%d", &a[i][j]);
		}
	}
}

void hienThi(int a[50][50], int m, int n) {
	int i, j;
	for(i = 1; i < m; i++) {
		for(j = 1; j < n; j++) {
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
}

int main() {
	int x;
	scanf("%d", &x);
	int y=x;
	while(x--){
		
			int a[50][50], b[50][50];
	int m, n;
	nhap(a, &m, &n);
printf("Test %d:\n",y-x );
	hienThi(a, n, m);
	printf("\n");
	}

	
	return 0;
}
50][50], b[50][50];
	int m, n;
	nhap(a, &m, &n);
	chuyenVi(a, m, n, b);


	hienThi(b, n, m);
	
	return 0;
}

