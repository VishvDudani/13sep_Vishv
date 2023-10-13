#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter a number a =");
    scanf("%d",&a);
    printf("enter a number b =");
    scanf("%d",&b);
    printf("enter a number c =");
    scanf("%d",&c);

    if(a>b)
    {
        if(a>c)
        {
            printf("a is largest");
        }
    }
    if(b>c)
    {
        if(b>a)
        {
            printf("b is largest");
        }
    }
    if(c>b)
    {
        if(c>a)
        {
            printf("c is largest");
        }
    }
    return 0;
}