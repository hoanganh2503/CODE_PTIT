#include<stdio.h>
#include<math.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

int main(){
    int n;
    scanf("%d", &n);
    scanf("\n");
    while(n--){
        scanf("\n");
        char s1[501], s2[501], sum[501];
        gets(s1);
        gets(s2);
        int a = strlen(s1), b = strlen(s2);
        int i, l = 0;
        int h[500] = {0};
        int c;
        if(a < b)
        c = b;
        else c = a;
        for( i = 0 ; i < c ; i++){
            if( s1[a-1-i] > 57 || s1[a-i-1] < 48)
            s1[a-1-i] = 48;
            if(s2[b-1-i]>57||s2[b-i-1] < 48)
            s2[b-1-i] = 48;

            int k = h[i] + s1[a-1-i] + s2[b-1-i] - 48;
            if(k >= 58){
                k = k - 10;
                h[i+1] = 1;
            }
            sum[l] = k; 
            l++;
        }
        if(h[l-1] == 1){
            sum[l] = 49;
        l++;
        }
        
        for(i = l-1 ; i >= 0 ; i--){
            printf("%c", sum[i]);
        }
        printf("\n");
    }
    return 0;
}