#include<stdio.h>
int foo(int *a,int *b) {
	int sum = *a + *b;
	*b = *a;
	return *a = sum - *b;
}
void main() {
	int i = 0 ,j = 1,k = 2,l;
	l = i++ || foo(&j,&k);
	printf("%d %d %d %d",i,j,k,l);
}
/*
Output : 1 2 1 1
*/
