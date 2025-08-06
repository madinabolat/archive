; rdi array 
;rsi array length 
;rbx element to check

do _cleanRegisters:
   xor rax, rax
   xor rcx, rcx

start_loop:
   cmp rcx, rsi
   jge end_loop
   mov rdx, [rdi+rcx*4]
   cmp rbx, rdx
   je end_loop ; if rdx > rbx, then end_loop (array is not in ascending order)
   cmp rbx, rdx
   jne next_element

next_element: 
   inc rcx
   jmp start_loop



end_loop:
   ;rdx is a position, how to return it ? 
   ret

;if nothing is returned, return -1. 




; C code:
int main() {
    int array[] = {10, 50, 30, 30, 50};
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