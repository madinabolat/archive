// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int array[] = {10, 50, 30, 50, 50};
    int len = 5;
    int result;
    int counter;
    for (int i = 0; i < len; i++){
        printf("%d ", array[i]);
    }
    for (int i = 0; i < len; i++){
        if (array[i]>array[i+1]) {
            result = 0;
            break;
        }
        else {
            counter++;
        }
    }
    if (counter == 4){
        result = 1;
    }
    printf("result: %d",result);
    return 0;
}