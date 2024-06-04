#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){ 
    int k; 
    scanf("%d", &k);
    getchar();
    int h=0;
    while(k-h>0){
        char A[500];
        gets(A);
        int i,  dem1=0;
        for(i=0;i<strlen(A)-1;i++){
            
            if(A[i]!=A[strlen(A)-1-i])
            dem1++; 
            
        } 
        
        int size=strlen(A);
        int sum=0;
        for(i=0; i<=size-1; i++){
        	sum+=A[i]-48;
		}
        
        if(dem1==0&&A[0]=='8'&&A[size-1]=='8'&&sum%10==0) 
        printf("YES\n");
        else printf("NO\n");
    
        
        h++;
    } 
    
}

