#include <stdio.h>

struct Student
{
    int id;
    float marks;
};

union Data
{
    int id;
    float marks;
};

int main()
{
    struct Student s;
    union Data d;

    // Structure
    s.id = 101;
    s.marks = 85.5;

    printf("Structure:\n");
    printf("ID = %d\n", s.id);
    printf("Marks = %.2f\n", s.marks);

    // Union
    d.id = 101;
    printf("\nUnion:\n");
    printf("ID = %d\n", d.id);

    d.marks = 85.5;
    printf("Marks = %.2f\n", d.marks);

    return 0;
}