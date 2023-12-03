// Write a program to find out the max from given number
#include<stdio.h>
void main()
{
    int a,b,max;

    printf("enter a number=");
    scanf("%d",&a);
    printf("entere a number=");
    scanf("%d",&b);

    max = a>b ? a:b;
    printf("%d is largest",max);
}