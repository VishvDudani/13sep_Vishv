#include<stdio.h>
void main()
{
    int i=1, j=1,row = 5;


    for(i=1;i<=row;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",j%2);
        }
        printf("\n");
    }
}
