// WAP to print Fibonacci series up to given numbers
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number of terms for Fibonacci series: ");
    scanf("%d", &n);

    int firstTerm = 0, secondTerm = 1;

    printf("Fibonacci series up to %d terms:\n", n);
    for (int i=1 ;i<=n ;i++) 
    {
        printf("%d ", firstTerm);

        int nextTerm = firstTerm + secondTerm;

        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
    return 0;
}