
#include <stdio.h>

int a[10][10], n;

int queen(int row)
{
    int i, j, k;

    if(row == n)
        return 1;

    for(i = 0; i < n; i++)
    {
        int safe = 1;

        for(j = 0; j < row; j++)
        {
            if(a[j][i] == 1)
                safe = 0;
        }

        for(j = row-1, k = i-1; j >= 0 && k >= 0; j--, k--)
            if(a[j][k] == 1)
                safe = 0;

        for(j = row-1, k = i+1; j >= 0 && k < n; j--, k++)
            if(a[j][k] == 1)
                safe = 0;

        if(safe)
        {
            a[row][i] = 1;

            if(queen(row+1))
                return 1;

            a[row][i] = 0;
        }
    }

    return 0;
}

int main()
{
    int i, j;

    printf("Enter N: ");
    scanf("%d", &n);

    if(queen(0))
    {
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                printf("%d ", a[i][j]);

            printf("\n");
        }
    }
    else
        printf("No solution");

    return 0;
}
