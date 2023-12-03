// WAP to swap two numbers without using third variable
#include <stdio.h>
int main() 
{
    
    double num1, num2;
    printf("Enter the first number: ");
    scanf("%lf", &num1);
    printf("Enter the second number: ");
    scanf("%lf", &num2);

    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    printf("\nAfter swapping:\n");
    printf("num1 = %.2lf\n", num1);
    printf("num2 = %.2lf\n", num2);

    return 0;
}