#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

void chuyen(char *s){
    int i= 0, j;
    while(s[i] != 0){
        if(isalpha(s[i])){
            if(i == 0){
                if(s[i] >= 97)
            s[i] -= 32;
            }else{
                if(s[i] < 97)
            s[i] += 32;
            } 
        }
        i++;
    }
}

void chuyen1(char *s){
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
    while(x--){
        int n = 0;
        char str[1000];
        char *s[1000];
        gets(str);
        chuyen1(str);
        char *p;
        p = strtok(str, " \t");
        while(p!= NULL){
            if(n!= 0)
            chuyen(p);
            s[n++] = p;
            p = strtok(NULL, " \t");
        }

        int i;
        for(i = 1 ; i < n ; i++){
            
            if(i == n-1){
             printf("%s", s[i]);   
            }else
            printf("%s ", s[i]);
            
        }
        printf(", %s", s[0]);
        printf("\n");
    }
    return 0;
}