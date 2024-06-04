#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

void layso(int *arr, char *str){
    int i, j = 4;
    int n = strlen(str);
    for( i = n-1 ; i >= n-7 ; i--){
         if(str[i]>='0' && str[i]<='9'){
             int a = str[i] - 48;
             arr[j--] = a;
         }
    }
}
void check(int *arr){
        int i;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        if((arr[1] == arr[2] && arr[1] == arr[0]) && (arr[3] == arr[4]))
            count3 = 4;
        for( i = 0 ; i < 5 ; i++){
            if(arr[i] < arr[i+1])
            count1++;
            if(arr[i] == arr[i+1])
            count2++;
            if(arr[i] == 6 || arr[i] == 8)
            count4++;
        }
        
        if(count1 == 4 || count2 == 4 || count3 ==4 ||count4 ==5)
            printf("YES\n");
        else
        printf("NO\n");
        
}

int main(){
    int x;
    scanf("%d", &x);
    getchar();
    int a = x;
    while(a--){
        
        char str[100] ;
        gets(str);
        int arr[10] = {0};
        layso(arr, str);
        check(arr);
    
    }

    return 0;
}