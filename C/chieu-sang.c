#include <stdio.h>
#include <math.h>

#define ll long long

int main()
{
	int N, M, K, i, j, r, t;
	int A, S[1005] = {0};
	scanf ("%d%d%d", &N, &M, &K);
	for (i = 0; i < M; i++)
	{
		scanf ("%d", &A);
		r = A;
		for (j = A; j <= (A + K); j++)
		{
			if (!S[j])
			{
				S[j] = 1;
			}
			if (!S[r])
			{
				S[r] = 1;
			}
			r--;
		}
	}
	r = 0;
	t = 0;
	for (i = 1; i <= N; i++)
	{
		if (!S[i])
		{
			t++;
		}
		else
		{
			if (t > 0)
			{
				if ((t % ((K * 2) + 1)) == 0)
				{
					r += (t / ((K * 2) + 1));
				}
				else
				{
					r += ((t / ((K * 2) + 1)) + 1);
				}
			}
			t = 0;
		}
		if (i == N)
		{
			if (t > 0)
			{
				if ((t % ((K * 2) + 1)) == 0)
				{
					r += (t / ((K * 2) + 1));
				}
				else
				{
					r += ((t / ((K * 2) + 1)) + 1);
				}
			}
		}
	}
	printf ("%d", r);
}
