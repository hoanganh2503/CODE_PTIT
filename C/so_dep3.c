#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>

long nguyento(long n){
	long i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
		
}

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
        int count=0;
        for(i=0; i<=size-1; i++){
        	if(nguyento(A[i]-48)==0)
        	count++;
		}
        
        if(dem1==0&&count==0) 
        printf("YES\n");
        else printf("NO\n");
    
        
        h++;
    } 
    
}

