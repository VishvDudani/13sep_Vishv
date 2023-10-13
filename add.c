#include <stdio.h>
int main() 
{
    int num1, num2, ans;
 
    // Input
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    // Addition
    ans = num1 + num2;

    // Output
    printf("Ans = %d\n", ans);

    return 0;
}