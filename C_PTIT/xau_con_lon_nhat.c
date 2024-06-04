#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

int chuaxh(int *arr, int n, int x){
    int i;
    for( i = 0 ; i < n ; i++){
        if(arr[i] == x)
        return 1;
    }
    return 0;
}

int main(){
    char str[1000001];
    gets(str);
    int i, j = 0 ;
    int k =122;
    int n = strlen(str);
    while(j < n){
        char max = str[j];
    for(i = j ; i < n ; i++){
       if(str[i] > max){
           max = str[i];
           j = i;
       }
    }
    for( i = j ; i < n ; i++){
        if(str[i] == max){
            printf("%c", str[i]);
            j = i +1;
        }
    }
}
    return 0;
}