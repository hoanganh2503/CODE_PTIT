#include<stdio.h>
#include<math.h>

int main(){
    int x;
    scanf("%d", &x);
    while(x--){
        double x1, y1, x2, y2, x3, y3;
    scanf("%lf%lf%lf%lf%lf%lf", &x1, &y1, &x2, &y2, &x3, &y3);
    double a, b, c;
    a = sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    b = sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
    c = sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));

    if(a + b <= c || b + c <= a || c + a <= b)
    printf("INVALID\n");
    else{
        double S;
        S =1.0*sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
    printf("%.2lf\n", S);
    }
    
    }
return 0;
}