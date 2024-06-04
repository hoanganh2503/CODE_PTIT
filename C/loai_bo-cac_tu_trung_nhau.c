#include <stdio.h>
#include <math.h>
#include <string.h>
const float pi = 3.141592653589793;
#define ll long long

int main()
{
	int i = 0, j, k, check[1005];
	char C[1005];
	fgets(C, 105, stdin);
	char S[1005][1005] = {};
	char *token = strtok (C, " \n");
	while (token != NULL)
	{
		strcpy(S[i], token);
		i++;
		token = strtok(NULL, " \n");
	}
	for (j = 0; j < i; j++)
	{
		if (j != i - 1)
		{
			for (k = j + 1; k < i; k++)
			{
				if (strcmp(S[j], S[k]) == 0)
				{
					if (check[j] >= 0)
					{
						printf ("%s ", S[j]);
						check[j] = -1;
					}
					check[k] = -1;
					//break;
				}
			}
			if (check[j] >= 0)
			{
				printf ("%s ", S[j]);
			}
		}
		else
		{
			if (check[j] >= 0)
			{
				printf ("%s ", S[j]);
			}
		}
	}
}
