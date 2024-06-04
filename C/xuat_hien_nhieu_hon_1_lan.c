#include<stdio.h>
#include<stdbool.h>
int main() {
	int n;
	scanf("%d",&n);
	int a[n];
	int i, j;
    bool check[100000];
	for(i=0; i<=n-1;i++) {
		scanf("%d", &a[i]);
        check[a[i]] = true;
	}
	int dem;
    bool ok = false;
	for( i=0; i<n-1; i++) {
        dem = 1;
        if(check[a[i]]){
		    for( j=i+1; j<n; j++) {
			    if(a[i] == a[j]){
				    dem++;
                    ok = true;
			    }		
		    }
        }
        check[a[i]] = false;
        if(dem>1){
            printf("%d ",a[i]);
	    }
    }
	if(!ok) 
        printf("0");
	return 0;
}

