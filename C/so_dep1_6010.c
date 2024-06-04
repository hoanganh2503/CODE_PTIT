#include<stdio.h>
#include<string.h>
int main(){ 
    int k; 
    scanf("%d", &k);
    getchar();
    while(k--){
        char A[500];
        gets(A);
        int i, dem=0, dem1=0;
        for(i=0;i<strlen(A)-1;i++){
            if(A[i]%2!=0) 
                dem++; 
            if(A[i]!=A[strlen(A)-1-i])
            dem1++; 
            
        } 
        if(dem==0&&dem1==0) 
        printf("YES\n");
        else printf("NO\n")
        ; 
        
    } 
    
}
