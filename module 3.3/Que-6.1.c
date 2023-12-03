//WAP to make addition of two matrix using 2-D Array 
#include <stdio.h>
void addmatrix(int m, int n, int mat1[m][n], int mat2[m][n], int result[m][n]) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            result[i][j] = mat1[i][j] + mat2[i][j];
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
    int m, n;

    printf("Enter the number of rows and columns for the matrices: ");
    scanf("%d %d", &m, &n);

    int mat1[m][n], mat2[m][n], result[m][n];

    printf("Enter the elements of the first matrix:\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &mat1[i][j]);
        }
    }
    printf("Enter the elements of the second matrix:\n");
    for (int i = 0; i < m; i++) 
    {
        for (int j = 0; j < n; j++) 
        {
            scanf("%d", &mat2[i][j]);
        }
    }
    addmatrix(m, n, mat1, mat2, result);

    printf("\nMatrix 1:\n");
    displaymatrix(m, n, mat1);

    printf("\nMatrix 2:\n");
    displaymatrix(m, n, mat2);

    printf("\nSum of the matrices:\n");
    displaymatrix(m, n, result);
}