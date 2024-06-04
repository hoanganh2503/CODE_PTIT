#include <stdio.h>
#include <math.h>
int main(){
 int t;
 scanf("%d",&t);
 while (t--){
 	int a;
 	scanf("%d",&a);
 	if(a==1||a==0||a==2||a==3){
		printf("YES\n");
	}
	else{
		int i=2;
		int j=3;
		while(j<a){
			int z=i;
			i=j;
			j=j+z;
		} 
		if(j!=a){
			printf("NO\n");
		}
		else printf("YES\n");
	}
 	
 }
}

