#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>
int main(){ 
   char s1[100], s2[100];
   gets(s1);
   gets(s2);
   printf("%lld", strcmp(s1, s2));
   
   return 0;
}
