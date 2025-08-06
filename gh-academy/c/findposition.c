#include <stdio.h>

int main() {
    int array[] = {10, 20, 40, 30, 50};
    int len = 5;
    int x = 40;
    int position=-1;

    for (int i = 0; i < len; i++){
        if (array[i]==x) {
            position=i;
            break;
        }
        else {
            continue;
        }
    }
    
    printf("%d", position);
    return 0;
}