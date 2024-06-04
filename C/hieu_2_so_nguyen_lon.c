#include<stdio.h>
#include<math.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

int ss(char *s1, char *s2){
	int i;
	for(i = 0 ; i < strlen(s1) ; i++){
		if(s1[i] < s2[i]){
			return 1;
			break;
		}
	}
	return 0;
}

int main(){
    int n;
    scanf("%d", &n);
    scanf("\n");
    while(n--){
        scanf("\n");
        char s1[501], s2[501], sum[501];
        gets(s1);
        gets(s2);
        
        int i, k, l = 0;
        int h[500] = {0};
        int a = strlen(s1), b = strlen(s2);
        long long x = a-b;
        if(x < 0 || ( x==0 && ss(s1, s2))){
        	char s3[501];
        	strcpy(s3, s1);
        	strcpy(s1, s2);
        	strcpy(s2, s3);
		}
        
        a= strlen(s1);
        for( i = 0 ; i <= a ; i++){
            if( s1[a-1-i] > 57 || s1[a-i-1] < 48)
            s1[a-1-i] = 48;
            if(s2[b-1-i]>57||s2[b-i-1] < 48)
            s2[b-1-i] = 48;

             k = h[i] + s1[a-1-i] - s2[b-1-i] + 48;
            if(k <= 47){
                k = k + 10;
                h[i+1] = -1;
            }
            sum[l] = k; 
            l++;
        }
       int count = 0;
       for(i = l-1 ; i >= 0 ; i--){
       	if(sum[i]!= 48){
       		count = 1;
       		k = i;
       		break;
		   }
	   }
//	   printf("%d", k);
        if(count == 0)
        printf("0");
        else{
        	for(i = k ; i >= 0 ; i--){
            printf("%c", sum[i]);
            }
		}
        
        printf("\n");
    }
    return 0;
}
