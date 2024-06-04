#include<stdio.h>
#include<string.h>
#include<math.h>

struct TS
{
    int ma;
    char name[100];
    char date[100];
    float mark1, mark2, mark3;
};

int main(){
    int x;
    scanf("%d", &x);
    struct TS P[x+10];
    float arr[100];
    int i, j;
    for( i = 1 ; i <= x ; i++){
    	scanf("\n");
    	
    	P[i].ma = i;
    	gets(P[i].name);
    	scanf("\n");
    	gets(P[i].date);
    	scanf("%f%f%f", &P[i].mark1, &P[i].mark2, &P[i].mark3);
    	
    	arr[i] = P[i].mark1 + P[i].mark2+ P[i].mark3;

    }
    
    for(i = 1 ; i <= x ; i++){
    	for( j = i+1 ; j <= x ; j++){
    		if(arr[i] < arr[j]){
    			int tmp = P[j].ma;
    			P[j].ma = P[i].ma;
    			P[i].ma = tmp;
			}
    		
		}
    }
    for( i = 1 ; i <= x ; i++){
    	 printf("%d ", P[i].ma);
    	 printf("%s ", P[P[i].ma].name);
  	  	 printf("%s ", P[P[i].ma].date);
    	 printf("%.2f\n", arr[P[i].ma]);
	}
    
return 0;
}

