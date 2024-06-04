#include<stdio.h>
#include<math.h>



int main(){
	int n;
	scanf("%d", &n);
	int m=n;
	if(n==1||n==2)
	   printf("Yes");
	else{
		 n=n-2;
		 int a, b;
		  scanf("%d%d", &a, &b);
		  int c=a;
		  int d=b;
		  int count1=0, count2=0;
	     while(n--){
		        scanf("%d%d", &a, &b);
		        if(c==a||c==b)
		          count1++;
		         if(d==a||d==b)
		          count2++;
     	}
	if(count1==m-2||count2==m-2){
		printf("Yes");
	}else
	    printf("No");
    
	}
	
	return 0;
}


