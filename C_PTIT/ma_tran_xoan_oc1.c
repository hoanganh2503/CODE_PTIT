#include <stdio.h>

int main()
{
    int a[100][100];
    int n;
    int i, j;
    scanf("%d", &n);
    int k = 1;
    int hangdau = 0, cotdau = 0;
    int hangcuoi = n - 1, cotcuoi = n - 1;
    while (k <= n * n)
    {
        for (i = cotdau; i <= cotcuoi; i++)
        {
            a[hangdau][i] = k++;
        }
        ++hangdau;
        for ( i = hangdau; i <= hangcuoi; i++)
        {
            a[i][cotcuoi] = k++;
        }
        --cotcuoi;
        for ( i = cotcuoi; i >= cotdau; i--)
        {
            a[hangcuoi][i] = k++;
        }
        --hangcuoi;
        for ( i = hangcuoi; i >= hangdau; i--)
        {
            a[i][cotdau] = k++;
        }
        ++cotdau;
    }
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < n; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
