#include <stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>



int main() {
   char arr[2000006];
   fgets(arr, 2000005, stdin);
   int size= strlen(arr);
   printf("%d", size-2);
   return 0;
}
