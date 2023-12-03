//*Display This Information using printf 1. Your Name 2. Your Birth date 3. Your Age 4. Your Address
#include<stdio.h>
void  main()
{
    int a,b;
    char nm, add;
    printf("enter name =");
    scanf(" %c", &nm);
    printf("Enter your DOB: ");
    scanf("%d",a);
    printf("enter your age =");
    scanf("%d",b);
    printf("Enter your address: ");
    scanf(" %c", &add);
}