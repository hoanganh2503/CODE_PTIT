#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

int main(){
    char str[1005];
    char *s1[1010], *s2[1000];
    char c;
     while (1) {
     	scanf ("%s%c", &strz, &c;
     	if(c == '\0')
     	break;
	 }
    int n = 0, max = 0, i, k = 0, j, l;
    char *p;

    p = strtok(str, " ");
    while(p != NULL){
    s1[n] = p;   
    int a = strlen(p);
    if(max < a)
    max = a;
    n++;
    p = strtok(NULL, " ");
    }
    for( i = 0 ; i < n ; i++){
       if(max == strlen(s1[i]))
       s2[k++] = s1[i];
    }
    for(i = 0 ; i < k ; i++){
        int count = 1;
        for(l =0 ; l < i ; l++){
            if(strcmp(s2[i], s2[l]) == 0)
            count = 0;
        }
        int dem = 1;
        if(count != 0){
             for(j = i+1 ; j < k ; j++){
            if(strcmp(s2[i], s2[j]) == 0)
            dem ++;
        }
         printf("%s %d %d\n", s2[i], max, dem);
        }
       
    }

return 0;
}
