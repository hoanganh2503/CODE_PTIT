#include<stdio.h>
#include<string.h>
#include<math.h>

struct matHang
{
    int ma;
    char name[100];
    char nhom[100];
    float gia_mua, gia_ban;
};

void swap(float *a, float *b){
    float tmp = *a;
    *a = *b;
    *b = tmp;
}

int main(){
    int x;
    scanf("%d", &x);
    struct matHang P[x+10];
    float arr[100];
    int i, j;
    for( i = 1 ; i <= x ; i++){
    	scanf("\n");
    	
    	P[i].ma = i;
    	gets(P[i].name);
    	scanf("\n");
    	gets(P[i].nhom);
    	scanf("%f%f", &P[i].gia_mua, &P[i].gia_ban);
    	
    	arr[i] = P[i].gia_ban - P[i].gia_mua;

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
  	  	 printf("%s ", P[P[i].ma].nhom);
    	 printf("%.2f\n", arr[P[i].ma]);
	}
    
return 0;
}


