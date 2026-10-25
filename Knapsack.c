
#include <stdio.h>

int main()
{
    int n, i, j;
    float w[10], p[10], r[10], temp;
    float capacity, profit = 0;

    printf("Enter number of items: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        printf("Enter weight and profit of item %d: ", i + 1);
        scanf("%f %f", &w[i], &p[i]);
        r[i] = p[i] / w[i];
    }

    printf("Enter knapsack capacity: ");
    scanf("%f", &capacity);

    for(i = 0; i < n - 1; i++)
    {
        for(j = i + 1; j < n; j++)
        {
            if(r[i] < r[j])
            {
                temp = r[i];
                r[i] = r[j];
                r[j] = temp;

                temp = w[i];
                w[i] = w[j];
                w[j] = temp;

                temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }

    for(i = 0; i < n; i++)
    {
        if(capacity >= w[i])
        {
            profit = profit + p[i];
            capacity = capacity - w[i];
        }
        else
        {
            profit = profit + r[i] * capacity;
            break;
        }
    }

    printf("Maximum profit = %.2f", profit);

    return 0;
}
