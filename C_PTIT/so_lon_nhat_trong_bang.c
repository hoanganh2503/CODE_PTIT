#include <stdio.h>
#include <math.h>
#include <string.h>
const float pi = 3.141592653589793;
#define ll long long

int main()
{
	ll N, min1 = 100000000, min2 = 100000000;
	scanf ("%lld", &N);
	while (N--)
	{
		ll a, b;
		scanf ("%lld%lld", &a, &b);
		if (a < min1)
		{
			min1 = a;
		}
		if (b < min2)
		{
			min2 = b;
		}
	}
	printf ("%lld", min1 * min2);
}