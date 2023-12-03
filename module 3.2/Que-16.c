// Write a program you have to make a summation of first and last Digit.
#include <stdio.h>
int main()
 {
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    int lastdigit = number % 10;
    int firstdigit = 0;
    
    while (number != 0) 
    {
        firstdigit = number % 10;
        number /= 10;
    }

    int sum = firstdigit + lastdigit;
    printf("sum of first and last digits: %d\n", sum);

    return 0;
}
