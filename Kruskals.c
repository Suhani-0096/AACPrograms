#include <stdio.h>

int main()
{
    int a[10][10], parent[10];
    int n, i, j, min, u, v, cost = 0, edges = 0;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix:\n");
    for(i = 0; i < n; i++)
        for(j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    for(i = 0; i < n; i++)
        parent[i] = i;

    while(edges < n - 1)
    {
        min = 999;

        for(i = 0; i < n; i++)
            for(j = i + 1; j < n; j++)
                if(a[i][j] != 0 && a[i][j] < min)
                {
                    min = a[i][j];
                    u = i;
                    v = j;
                }

        int x = u, y = v;

        while(parent[x] != x)
            x = parent[x];

        while(parent[y] != y)
            y = parent[y];

        if(x != y)
        {
            printf("%d - %d = %d\n", u, v, min);
            cost += min;
            parent[x] = y;
            edges++;
        }

        a[u][v] = a[v][u] = 0;
    }

    printf("Minimum cost = %d", cost);
    return 0;
}