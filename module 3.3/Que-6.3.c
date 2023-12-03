// WAP to make multiplication of two matrix using 2-D Array 
#include <stdio.h>
void multiplymatrix(int m1,int n1,int m2,int n2,int mat1[m1][n1],int mat2[m2][n2],int result[m1][n2]) {
    if (n1 != m2) {
        printf("Invalid matrix dimensions for multiplication.\n");
        return;
    }

    for (int i = 0; i < m1; i++) {
        for (int j = 0; j < n2; j++) {
            result[i][j] = 0;
            for (int k = 0; k < n1; k++) {
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}
void displaymatrix(int m, int n, int mat[m][n]) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d\t", mat[i][j]);
        }
        printf("\n");
    }
}
void main() {
    int m1, n1, m2, n2;

    printf("Enter the number of rows and columns for the first matrix: ");
    scanf("%d %d", &m1, &n1);
    printf("Enter the number of rows and columns for the second matrix: ");
    scanf("%d %d", &m2, &n2);
    int mat1[m1][n1], mat2[m2][n2], result[m1][n2];
    printf("Enter the elements of the first matrix:\n");
    for (int i = 0; i < m1; i++) {
        for (int j = 0; j < n1; j++) 
        {
            scanf("%d", &mat1[i][j]);
        }
    }
    printf("Enter the elements of the second matrix:\n");
    for (int i = 0; i < m2; i++) {
        for (int j = 0; j < n2; j++) 
        {
            scanf("%d", &mat2[i][j]);
        }
    }
    multiplymatrix(m1, n1, m2, n2, mat1, mat2, result);
    printf("\nMatrix 1:\n");
    displaymatrix(m1, n1, mat1)
    printf("\nMatrix 2:\n");
    displaymatrix(m2, n2, mat2);
    printf("\nProduct of the matrices:\n");
    displaymatrix(m1, n2, result);
}