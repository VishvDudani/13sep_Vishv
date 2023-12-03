// WAP to find area of circle, rectangle and triangle 
#include<stdio.h>
void main()
{

    float radius, length, width, base, height,rectangle,triangle;

    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    printf("Enter the length of the rectangle: ");
    scanf("%f", &length);
    printf("Enter the width of the rectangle: ");
    scanf("%f", &width);

    printf("Enter the base of the triangle: ");
    scanf("%f", &base);
    printf("Enter the height of the triangle: ");
    scanf("%f", &height);

    radius = 3.14159 * radius * radius;
    rectangle = length * width;
    triangle = 0.5 * base * height;


    printf("\nArea of Circle: %f\n",radius);
    printf("Area of Rectangle: %f\n",rectangle);
    printf("Area of Triangle: %f\n", triangle);
}
