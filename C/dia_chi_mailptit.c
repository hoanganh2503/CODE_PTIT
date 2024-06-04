#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

void chuyen(char *s){
     int i = 0;
     while(s[i] != 0){
         if(isalpha(s[i]))
         if(s[i] < 97)
         s[i] += 32;
         i++;
     }
}


int main(){
    char str[1000];
    char *s[100];
    gets(str);
    chuyen(str);
    char *p;
    int n = 0;
    p = strtok(str, " \t");
    while(p!=NULL){
        s[n++] = p;
        p = strtok(NULL, " \t");
    }

    int i, j;
    for( i = 0 ; i < n ; i++){
        if(i != n-1){
            char tmp[10];
            strcpy(tmp, s[i]); 
            printf("%c", tmp[0]);
        }
        else
        printf("%s", s[i]);
    }
    printf("@ptit.edu.vn");
    return 0;
}