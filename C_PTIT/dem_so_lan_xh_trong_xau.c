#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

void chuyen(char* s){
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
    char *s[1000], *s1[1000];
    int arr[100];
    char *p;
    int i, j, k = 0, n=0;
   gets(str);
    chuyen(str);
    p = strtok(str, " ,.\t\n");
    while(p != NULL){
        s[n++] = p;
        p = strtok(NULL, " ,.\t\n");
    }

 
    for(i = 0 ; i < n ; i++){
        int count = 0;
       for(j = 0 ; j < i ; j++){
           if(strcmp(s[j], s[i])==0){
               count = 1;
               break;
           } 
       }
       if(count == 1)
       arr[j]++;
           else{
               s1[k] = s[i];
               arr[k] = 1;
               k++;
           }
           
    }

   for(i = 0 ; i < k ; i++){
        printf("%s %d\n", s1[i], arr[i]);
    }

return 0;
}
