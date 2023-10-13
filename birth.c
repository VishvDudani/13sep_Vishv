#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter your current age: ");
    scanf("%d",&a);

    b=--a;
    printf("One year ago, your age : %d\n",b);

    c=++a;
    c=++a;
    printf("One year after, your age : %d\n",c);

    return 0;
}