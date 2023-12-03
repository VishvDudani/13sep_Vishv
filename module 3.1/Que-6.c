// WAP to convert years into days and days into years 
#include <stdio.h>
void main()
{
    int choice,day,year;

    printf("Choose conversion:\n");
    printf("1. Years to Days\n");
    printf("2. Days to Years\n");
    printf("Enter your choice (1 or 2): ");
    scanf("%d", &choice);

    switch (choice) 
    {
        case 1:
            printf("Enter the number of years: ");
            scanf("%d", &year);

            day = year*365;
            printf("%d years is approximately %d days.\n",year,day);
            break;

        case 2:
            printf("Enter the number of days: ");
            scanf("%d", &day);

            year = day/365;
            printf("%d days is approximately %d years.\n",day,year);
            break;

        default:
            printf("Invalid choice.\n");
    }
}
