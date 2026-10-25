#include <stdio.h>

int main()
{
    int a[10][10], indeg[10] = {0};
    int n, i, j, k;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix:\n");

    for(i = 0; i < n; i++)
        for(j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    for(j = 0; j < n; j++)
        for(i = 0; i < n; i++)
            indeg[j] += a[i][j];

    printf("Topological order: ");

    for(k = 0; k < n; k++)
    {
        for(i = 0; i < n; i++)
        {
            if(indeg[i] == 0)
            {
                printf("%d ", i);
                indeg[i] = -1;

                for(j = 0; j < n; j++)
                    if(a[i][j] == 1)
                        indeg[j]--;

                break;
            }
        }
    }

    return 0;
}