// WAP to make simple calculator (operation include Addition, Subtraction, Multiplication, Division, modulo) 
#include <stdio.h>
int main() 
{
  char op;
  int one, two;
  printf("Enter an operator (+, -, *, /): ");
  scanf("%c", &op);
  printf("Enter two numbers: ");
  scanf("%d %d", &one , &two);

  switch (op) {
    case '+':
      printf("%d + %d = %d", one, two, one + two);
      break;
    case '-':
      printf("%d - %d = %d", one, two, one - two);
      break;
    case '*':
      printf("%d * %d = %d", one, two, one * two);
      break;
    case '/':
      printf("%d / %d = %d", one, two, one / two);
      break;
    case '%':
      printf("%d % %d = %d", one, two , one % two);
    default:
      printf("Error! operator is not correct");
  }
  return 0;
}
