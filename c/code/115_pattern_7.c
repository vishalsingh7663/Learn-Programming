#include<stdio.h>
int main() {
    int n;
    printf("Enter n :- ");
    scanf("%d",&n);
    for(int i=0;i<n;i++) {
        for(int j=0;j<=i;j++) {
            printf("%d", j+1);
        }
        printf("\n");
    }
}

/*

Output :-
Enter n :- 5
1
12
123
1234
12345

*/