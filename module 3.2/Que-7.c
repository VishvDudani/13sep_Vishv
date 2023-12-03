// How many Even numbers are there
#include<stdio.h>
int main()
{
    int i, n;

    printf("Print even numbers : ");
    scanf("%d", &n);

    for(i=1; i<=n; i++)
    {
        if(i%2 == 0)
        {
            printf("%d\n", i);
        }
    }

    return 0;
}