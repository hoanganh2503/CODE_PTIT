#include<stdio.h>
#include<string.h>
#include<ctype.h>

 struct DT{
    char heso;
    char somu;
};

int main(){
    int x;
    scanf("%d", &x);
    scanf("\n");
    while(x--){
        char s1[1000], s2[1000];
        gets(s1);
        //gets(s2);
        int i, n = 0, k = 0;
        struct DT p[200];
        char result[100];
        char *str;
        for(i = 0 ; i <= strlen(s1) ; i++){
             if(isdigit(str[i])){ 
            result[n] = str[i];
            n++;
            result[n] = '\0';
            }
             else if(n){
                 int l = 0;
                 for(i = 0 ; i <= strlen(result) ; i++){
                        l = l*10 + result[i] - 48;
                 }
                 str[k] = l;
                 n = 0;
                 k++;
             }
        }
        for(i = 0 ; i < k ; i++){
            printf("%d ", str[i]);
        }
    }
}
