#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

void chuyen(char *s){
     int i = 0;
     while(s[i] != 0){
         if(isalpha(s[i]))
         if(s[i] >= 97)
         s[i] -= 32;
         i++;
     }
}



int main(){
    int x;
    scanf("%d", &x);
    getchar();
    int a = x;
    int k = 1;
    while(a--){
        char s1[1000], s2[100], s3[1000];
        char *str1[100], *str2[100];
        int n = 0, m = 0;
        
        gets(s1); gets(s2);
        strcpy(s3, s1);
        chuyen(s1);
        chuyen(s2);

        char *p;
        p = strtok(s1, " ");
        while(p != NULL){
            str1[n++] = p;
            p = strtok(NULL, " ");
        }

        char *q;
        q = strtok(s3, " ");
        while(q != NULL){
            str2[m++] = q;
            q = strtok(NULL, " ");
        }
         int i;
        printf("Test %d: ", k);
        for( i = 0 ; i< n ; i++){
            if(strcmp(s2, str1[i])!=0)
            printf("%s ", str2[i]);
        }
  
        printf("\n");
        k++;
    }
    return 0;
}