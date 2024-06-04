#include <stdio.h>

int main()
{
	int x;
	scanf("%d", &x);
	int d=1;
	while(x--){
		    int a[100][100];
    int n;
    int i, j;
    scanf("%d", &n);
    int k = n*n;
    int hangdau = 0, cotdau = 0;
    int hangcuoi = n - 1, cotcuoi = n - 1;
    while (k >=1)
    {
        for (i = cotdau; i <= cotcuoi; i++)
        {
            a[hangdau][i] = k--;
        }
        ++hangdau;
        for ( i = hangdau; i <= hangcuoi; i++)
        {
            a[i][cotcuoi] = k--;
        }
        --cotcuoi;
        for ( i = cotcuoi; i >= cotdau; i--)
        {
            a[hangcuoi][i] = k--;
        }
        --hangcuoi;
        for ( i = hangcuoi; i >= hangdau; i--)
        {
            a[i][cotdau] = k--;
        }
        ++cotdau;
    }
    printf("Test %d:\n", d);
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < n; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    //printf("\n");
    d++;
	}

    return 0;
}

