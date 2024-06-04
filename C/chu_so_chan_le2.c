#include<stdio.h>

int main(){
    int test;
    scanf("%d",&test);
    while(test--){
        unsigned int a;
        int le=0;
        int chan=0;
        scanf("%d",&a);
        while(a>0){
        if(a%2==0){
            chan+=1;
        }else{
            le+=1;
        }
        a=a/10;
        }
        printf("%d %d\n",le,chan);
    }
}
