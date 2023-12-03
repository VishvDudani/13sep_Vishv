// WAP to find simple interest 
#include <stdio.h>
void main()
{
    float principal, rate, time, simpleinterest;

    printf("Enter the principal amount: ");
    scanf("%f", &principal);

    printf("Enter the rate of interest per year: ");
    scanf("%f", &rate);

    printf("Enter the time in years: ");
    scanf("%f", &time);

    simpleinterest = principal * rate * time / 100.0;


    printf("\nsimple interest: %.2f\n", simpleinterest);
}
