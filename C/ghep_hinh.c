#include <stdio.h>
 
int main(){
    int a, b, c, d, e, f;
    scanf("%d%d%d%d%d%d", &a, &b, &c, &d, &e, &f);
    int max=a;
    if(max<b){max=b;}
    if(max<c){max=c;}
    if(max<d){max=d;}
    if(max<e){max=e;}
    if(max<f){max=f;}
    if(max==a){
        if(max==c+e&&d==f&d==a-b){printf("YES");
        return 0;}
        if(max==c+f&&d==e&d==a-b){printf("YES");
        return 0;}
        if(max==d+e&&c==f&c==a-b){printf("YES");
        return 0;}
        if(max==d+f&&c==e&c==a-b){printf("YES");
        return 0;}
    }
    else if(max==b){
        if(max==c+e&&d==f&d==b-a){printf("YES");
        return 0;}
        if(max==c+f&&d==e&d==b-a){printf("YES");
        return 0;}
        if(max==d+e&&c==f&c==b-a){printf("YES");
        return 0;}
        if(max==d+f&&c==e&c==b-a){printf("YES");
        return 0;}
        }
    else if(max==c){
        if(max==a+e&&b==f&b==c-d){printf("YES");
        return 0;}
        if(max==a+f&&b==e&b==c-d){printf("YES");
        return 0;}
        if(max==b+e&&a==f&a==c-d){printf("YES");
        return 0;}
        if(max==b+f&&a==e&a==c-d){printf("YES");
        return 0;}
    }
    else if(max==d){
        if(max==a+e&&b==f&b==d-c){printf("YES");
        return 0;}
        if(max==a+f&&b==e&b==d-c){printf("YES");
        return 0;}
        if(max==b+e&&a==f&a==d-c){printf("YES");
        return 0;}
        if(max==b+f&&a==e&a==d-c){printf("YES");
        return 0;}
    }
    else if(max==e){
        if(max==c+a&&d==b&d==e-f){printf("YES");
        return 0;}
        if(max==c+b&&d==a&d==e-f){printf("YES");
        return 0;}
        if(max==d+a&&c==b&c==e-f){printf("YES");
        return 0;}
        if(max==d+b&&c==a&c==e-f){printf("YES");
        return 0;}
    }
    else if(max==f){
        if(max==c+a&&d==b&d==f-e){printf("YES");
        return 0;}
        if(max==c+b&&d==a&d==f-e){printf("YES");
        return 0;}
        if(max==d+a&&c==b&c==f-e){printf("YES");
        return 0;}
        if(max==d+b&&c==a&c==f-e){printf("YES");
        return 0;}
    }
    printf("NO");
}