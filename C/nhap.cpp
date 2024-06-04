#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
const float pi = 3.141592653589793;
#define int long long
#define wr(a) printf("%lld", a)
#define re(a) scanf("%lld", &a)
#define space printf(" ")
#define end printf("\n")
#define ignore scanf("\n")

struct word
{
    char tu[1005];
    int L;
    int soLuong;
};

void SWAP(struct word *A, struct word *B)
{
    char T[1005];
    strcpy(T, A->tu);
    strcpy(A->tu, B->tu);
    strcpy(B->tu, T);
    int t;
    t = A->L;
    A->L = B->L;
    B->L = t;
    t = A->soLuong;
    A->soLuong = B->soLuong;
    B->soLuong = t;
}

void sapXep(struct word A[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (A[i].L < A[j].L)
            {
                SWAP(&A[i], &A[j]);
            }
        }
    }
}
//char A[10000000005];
int main()
{
    struct word S[1005];
    int i, n = 0;
    //gets(A);
    //char *token = strtok(A, " ");
    char token[1005];
    while (scanf ("%s", &token) != -1)
    {
        int check = 1;
        for (i = 0; i < n; i++)
        {
            if (strcmp(S[i].tu, token) == 0)
            {
                S[i].soLuong++;
                check = 0;
                break;
            }
        }
        if (check)
        {
            strcpy(S[n].tu, token);
            S[n].L = strlen(token);
            S[n].soLuong = 1;
            n++;
        }
        //token = strtok(NULL, " ");
    }
    sapXep(S, n);
    i = 0;
    while (S[i].L == S[0].L)
    {
        printf("%s ", S[i].tu);
        wr(S[i].L);
        space;
        space;
        wr(S[i].soLuong);
        end;
        i++;
    }
  
}
