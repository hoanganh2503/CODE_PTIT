#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
struct ds{
    char name[100];
    int lan_lap;
};
int check(char f[]){
	int n=strlen(f);
	int l=0, r=n-1;
	while(l<r)
	{
		if(f[l]!=f[r]) return 0;
		l++;
		r--;
	}
	return 1;
}
typedef struct ds ds;
int find(ds a[], int n, char tmp[]){
    for(int i=0; i<n; i++){
        if(strcmp(tmp, a[i].name)==0) return i;
    }
    return -1;
}
int main(){
    ds a[1005];
    int n=0;
    char tmp[1005];
    while((scanf("%s",tmp))!=-1){
        if(check(tmp)){
            int chi_so=find(a,n,tmp);
            if(chi_so==-1){
                strcpy(a[n].name,tmp);
                a[n].lan_lap=1;
                ++n;
            }else{
                a[chi_so].lan_lap+=1;
            }
        }
    }
    int max_len=0;
    for(int i=0;i<n;i++){
        if(max_len<strlen(a[i].name)) max_len=strlen(a[i].name);
	}
    for(int i=0;i<n;i++){
        if(strlen(a[i].name)==max_len){
            printf("%s %d\n",a[i].name, a[i].lan_lap);
        }
    }
    return 0;
}
