#include<stdio.h>
void main()
{
    int i,j,row=5;
    char c='A';

    for(i=1;i<=row;i++)
    {
        for(j=1; j<=i; j++)
        {
            printf("%3c",c); 
            c++;
        }
        printf("\n");
    }
}