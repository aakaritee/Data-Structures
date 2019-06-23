// CMPS390
// ArrayPointer.c

#include <stdio.h>
void printMatrixRowMajor(int* a, int m, int n);
void printMatrixColMajor(int* a, int m, int n);
int main() {

	int x[3][4];
	int row, col;
	int* a;
	int count = 0;
	a = &x[0][0];

	for (int row = 0; row < 3; row++) {
		for (col = 0; col < 4; col++) {
			x[row][col] = count;
			count++;

		}
	}
	printf("Matrix row major fashion:\n");
	printMatrixRowMajor(&x[0][0], 3, 4);
	printf("Matrix column major fashion:\n");
	printMatrixColMajor(&x[0][0], 3, 4);

	return 0;

}

void printMatrixRowMajor(int* a, int m, int n) {
	for (int row = 0; row < m; row++) {
		for (int col = 0; col < n; col++) {
			*a = (row * n) + col;
			printf("%d ", *a);
		}
		printf("\n");
	}
}

void printMatrixColMajor(int* a, int m, int n) {
	for (int row = 0; row < n; row++) {
		for (int col = 0; col < m; col++) {
			*a = (col * n) + row;
			printf("%d ", *a);
		}
		printf("\n");
	}
}

