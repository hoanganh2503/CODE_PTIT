#include <stdio.h> 
#define ll long long

int main() {
	int x;
	scanf("%d", &x);
	while(x--){
		int arr[201];
		int chan=0, le=0;
		int i;
		int n=0;
		char c;
		for( i = 0 ; ; i++){
		scanf("%d%c", &arr[i], &c);
		n++;
		if(c == '\n'){
			break;
		}
		
	    }
		for(i = 0; i < n ; i++){
			if(arr[i]%2==0)
			chan++;
			else
			le++;
			
		}
		if(n%2 == 0 && chan > le)
		printf("YES");
		else if(n % 2 == 1 && le > chan)
		printf("YES");
		else
		printf("NO");
		
		printf("\n");
	}
	
return 0;	
}




