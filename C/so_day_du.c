#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

int check(int *arr,char* str, int n){
    int i;
    if(str[0] == '0')
    return -1;
    for(i = 0 ; i < n ; i++){
        if(str[i]<'0' || str[i]>'9'){
            return -1;
            break;
        }
        int a = str[i] - 48;
             arr[a] = a;
    }
return 1;
}
void check1(int *arr,char* str, int n){
    int k = check(arr, str, n);
    if(k == -1)
    printf("INVALID\n");
    else{
        int i, h , count = 0;
        for(h = 0 ; h <= 9 ; h++){
            for(i = 0 ; i< n ; i++){
            if(arr[i] == h){
                count ++;
                break;
            }
            
             }
        }
        
        if(count == 10)
        printf("YES\n");
        else
        printf("NO\n");
    }
}
int main(){
    int x;
    scanf("%d", &x);
    getchar();
    int a = x;
    while(a--){
        char str[1000];
        gets(str);
        int n = strlen(str);
        int arr[100] = {0};
        check1(arr,str, n);
    }
}