#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

const float pi = 3.141592653589793;
#define ll long long

struct Pokemon
{
    char ten[1005];
    ll a, b, S;
};

ll XuLi(ll a, ll b)
{
    ll t = 0;
    while (b >= a)
    {
        b -= a;
        b += 2;
        t++;
    }
    return t;
}

int main()
{
    ll T, i, max = -1, t = 0;
    scanf("%lld", &T);
    struct Pokemon P[T + 5], G;
    for (i = 1; i <= T; i++)
    {
        scanf("\n");
        gets(P[i].ten);
        scanf("%lld%lld", &P[i].a, &P[i].b);
        P[i].S = XuLi(P[i].a, P[i].b);
        t += P[i].S;
        if (P[i].S > max)
        {
            max = P[i].S;
        }
    }
    printf ("%lld\n", t);
    for (i = 1; i <= T; i++)
    {
        if (P[i].S == max)
        {
            printf ("%s", P[i].ten);
            break;
        }
    }
}