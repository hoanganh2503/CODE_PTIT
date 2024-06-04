#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

const float pi = 3.141592653589793;
#define ll long long

int khongGiam(int A)
{
	int k, q;
	while (A != 0)
	{
		q = A % 100;
		k = q % 10;
		q = q / 10;
		if (k < q)
		{
			return 0;
		}
		A /= 10;
	}
	return 1;
}

void sapXep(ll a[], ll n, ll S[])
	{
	ll i, t, j;
	for (i = 0; i < n; i++)
		{
		for (j = i + 1; j < n; j++)
			{
			if (a[j] > a[i])
				{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				t = S[i];
				S[i] = S[j];
				S[j] = t;
				}
			}
		}
	}

int main()
{
	ll A, i, check, n = 0;
	ll D[100005] = {}, S[100005];
	while (scanf("%lld", &A) != -1)
	{
		if (khongGiam(A))
		{
			check = 1;
			for (i = 0; i < n; i++)
			{
				if (A == S[i])
				{
					check = 0;
					D[i]++;
					break;
				}
			}
			if (check)
			{
				S[n] = A;
				D[n] = 1;
				n++;
			}
		}
	}
	sapXep (D, n, S);
	for (i = 0; i < n; i++)
	{
		printf("%lld %lld\n", S[i], D[i]);
	}
}
