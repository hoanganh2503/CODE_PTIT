#include<stdio.h>
#include<math.h>
#include<stdbool.h>
#define ll long long


bool nto(ll x){
 if(x < 2) return false;
 ll i;
 for( i = 2; i <= sqrt(x); i++)
  if(x%i==0)
  return false;
 return true;
}

 bool ktra(ll x){
 int tong = 0;
 bool cs = true;
 while(x > 0){
  int t = x % 10;
  if(t != 2 && t != 3 && t != 5 && t != 7)
   cs = false;
  tong = tong + t;
  x = x / 10;
 }
 if(nto(tong) && cs == true)
  return true;
 return false;
 }

int main(){
    int x;
    scanf("%d", &x);
    getchar();
    int a = x;
    while(a--){
        ll m, n;
        ll i;
        scanf("%lld%lld", &n, &m);
        int dem = 0;
 if( n >= m ){
  for( i = m; i <= n; i++){
   if( ktra(i) && nto(i) )
   dem++;
  }
   printf("%d\n", dem);
 }
 else{
  for( i = n; i <= m; i++){
   if( ktra(i) && nto(i) )
   dem++;
  }
   printf("%d\n", dem);
 }
        
    }
    return 0;
}
