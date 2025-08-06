#include <stdio.h>

int main() {
    int array[] = {10, 50, 30, 70, 50};
    int len = 5;

    int max;

    for (int i = 0; i < len; i++){
        if (array[i]<=array[i+1]) {
            max = array[i+1];
        }
        else {
            array[i+1] = array[i];
            max = array[i+1];
        }
    }

    printf("max: %d",max);
    return 0;
}