//. Sum of even numbers 
#include<stdio.h>
int main()
{
    int i, n, sum=0;

    printf("Enter numbers : ");
    scanf("%d", &n);

    for(i=2; i<=n; i+=2)
    {
        sum += i;
    }

    printf("Sum of even number = %d",sum);

    return 0;
}