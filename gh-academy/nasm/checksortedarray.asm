; rdi array rsi array length

do _cleanRegisters:
   xor rax, rax
   xor rcx, rcx

start_loop:
   cmp rcx, rsi
   jge end_loop
   mov rdx, [rdi+rcx*4]
   mov rbx, [rdx + rcx *4]
   ; in this case, how do I compare 1st element and 2nd element? compares 1st and 1st, then 2nd and 3rd, but not 1st and 2nd
   cmp rbx, rdx
   jl end_loop ; if rdx > rbx, then end_loop (array is not in ascending order)
   cmp rbx, rsx
   jge next_element
   add rcx2


next_element: 
   inc rcx
   jmp start_loop



end_loop:
   mov , 0
   ret




; C code:
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