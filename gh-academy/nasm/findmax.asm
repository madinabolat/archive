; rdi array rsi array length

do _cleanRegisters:
   xor rax, rax
   xor rcx, rcx

start_loop:
   cmp rcx, rsi
   jge end_loop
   mov rdx, [rdi+rcx*4]
   mov rbx, [rdx + rcx *4]
   cmp rbx, rdx
   jle max_element ; if rbx <= rdx
   cmp rbx, rsx
   jge next_element

max_element:
   mov rdi, rdx ; max el rdi = rdx
   inc rcx
   jmp start_loop

end_loop:
   mov rdi, 0
   ret




; C code:
int main() {
    int array[] = {10, 50, 30, 70, 50};
    int len = 5;
    int result;
    int counter;
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