#include<stdio.h>
#include<math.h>
int main(){ 
    int t;
     scanf("%d", &t);
      while(t--){
           double x1, y1, x2, y2, x3, y3, ab, bc, ac, k, a, b, c;
            scanf("%lf%lf%lf%lf%lf%lf", &x1, &y1, &x2, &y2, &x3, &y3);
             ab = sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
              bc = sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
               ac = sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
             a=ab;
             b=bc;
             c=ac; 
             k = sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4; 
             if (!(a >= b + c || b >= a + c || c >= a + b)){
                  printf("%.2lf\n", k);
                   }

                   else{ 
                       printf("INVALID\n");
                        }
    } 
}