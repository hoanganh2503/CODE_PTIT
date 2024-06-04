#include <stdio.h> 
#include <math.h>

void swap(int *a, int *b) {
     int temp = *a;
      *a = *b;
       *b = temp;
     } 
     
void sort(int a[],int b[], int c[], int s[], int n) {
     for (int i = 0; i < n - 1; i++) 
     for (int j = 0; j < n - i - 1; j++) 
     if (s[j] > s[j+1]) { 
         swap(&s[j],&s[j+1]); 
         swap(&a[j],&a[j+1]); 
         swap(&b[j],&b[j+1]); 
         swap(&c[j],&c[j+1]); 
         } 
         } 
void main() { 
    int n;
     scanf("%d", &n); 
     int a[n],b[n],c[n],s[n], p;
      for (int i = 0; i < n; i++) {
           scanf("%d%d%d", &a[i],&b[i],&c[i]);
            p = (a[i] + b[i] + c[i]) / 2;
             s[i] = sqrt(p*(p-a[i])*(p-b[i])*(p-c[i])); 
         } 
             sort(a,b,c,s,n);
              for (int i = 0; i < n; i++) {
                   printf("%d %d %d\n",a[i],b[i],c[i]); 
            } 
        }