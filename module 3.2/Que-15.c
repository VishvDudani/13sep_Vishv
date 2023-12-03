// Write a program make a summation of given number
#include <stdio.h>
int main() 
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    int sum = 0;
    int num1 = number;

    while (number != 0)
    {
        int digit = number % 10;  
        sum += digit;             
        number /= 10;             
    }

    printf("Original number: %d\n", num1);
    printf("Sum of digits: %d\n", sum);

    return 0;
}
