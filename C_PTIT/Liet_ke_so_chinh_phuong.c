#include<stdio.h>
#include<math.h>
	int main() {
		long a,b;
		scanf("%ld%ld", &a, &b);
		if (sqrt(a) == (long)sqrt(a)) 
		a = (long)sqrt(a);
		else 
		a = (long)sqrt(a) + 1;
		b = (long)sqrt(b);
		printf("%ld ""\n", b - a + 1);
		for(long i=a;i<=b;i++)
		{
			printf("%ld ""\n", i * i);
		}
}
