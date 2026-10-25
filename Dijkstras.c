
#include <stdio.h>

int main()
{
    int a[10][10], d[10], v[10], p[10];
    int n, s, i, j, u, min;

    scanf("%d", &n);

    for(i=0; i<n; i++)
        for(j=0; j<n; j++)
            scanf("%d", &a[i][j]);

    scanf("%d", &s);

    for(i=0; i<n; i++)
    {
        d[i]=999;
        v[i]=0;
        p[i]=-1;
    }

    d[s]=0;

    for(i=0; i<n; i++)
    {
        min=999;
        u=-1;

        for(j=0; j<n; j++)
            if(!v[j] && d[j]<min)
                min=d[j], u=j;

        if(u==-1) break;
        v[u]=1;

        for(j=0; j<n; j++)
            if(a[u][j]>0 && !v[j] &&
               d[u]+a[u][j]<d[j])
            {
                d[j]=d[u]+a[u][j];
                p[j]=u;
            }
    }

    for(i=0; i<n; i++)
    {
        printf("Distance to %d = %d\nPath: ", i, d[i]);

        int path[10], k=0, x=i;

        while(x!=-1)
        {
            path[k++]=x;
            x=p[x];
        }

        for(j=k-1; j>=0; j--)
            printf("%d ", path[j]);

        printf("\n");
    }

    return 0;
}
