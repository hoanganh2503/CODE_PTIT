#include <stdio.h>

int main()
{
	int n, i;
	scanf("%d", &n);
	int m[2*n-1];
	int a=n;
	while(a>=1)
	{
		for ( i = 1 ; i <= 2 * n - 1; i++)
		{
			if(i > n-a && i <= 2*n-1 - (n -a ))
				m[i]= a;
				printf("%d", m[i]);
		}
		a--;
		printf("\n");	
				
	}
	a+=2;
	while(a <= n)
	{
		for ( i = 1 ; i <= 2 * n - 1; i++)
		{
			if(i > n-a && i <= 2*n-1 - (n -a ))
				m[i]= a;
				printf("%d", m[i]);
		}
		a++;
		printf("\n");	
				
	}
	
	return 0;
}

