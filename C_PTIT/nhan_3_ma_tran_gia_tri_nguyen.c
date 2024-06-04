#include<stdio.h>

void nhap(long long a[][100], int m, int n) {
	int i, j;
	for(i = 0; i < m; i++){
		for(j = 0; j < n; j++){
			scanf("%lld", &a[i][j]);
		}
	}
}

void xuat(long long a[][100], int m, int n) { 
	int i, j;
	for(i = 0; i < m; i++){
		for(j = 0; j < n; j++){
			printf("%lld  ", a[i][j]);
		}
		printf("\n");
	}
}

void tich(long long a[][100], long long b[][100], long long c[][100], int m, int n, int k) {
	int i, j, l;
	for(i = 0; i < m; i++) {
		for(j = 0; j < k; j++) {
			for(l = 0; l < n; l++) {
				c[i][j] += a[i][l] * b[l][j];
			}
		}
	}
}

int main() { 
	long long a[100][100], b[100][100], h[100][100], c[100][100] = {0}, e[100][100]={0};
	int m, n, p, q;
	scanf("%d%d%d%d", &m, &n, &p, &q);
	nhap(a, m, n);
	nhap(b, n, p);
	nhap(h, p, q);
    tich(a, b, c, m, n, p);
	tich(c, h, e, m, p, q);
	xuat(e, m, q);
	
	return 0;
}
