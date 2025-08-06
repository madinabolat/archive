NULL EQU 0 
STD_OUTPUT_HANDLE EQU -11

extern _GetStdHandle@4
extern _WriteConsole@20
extern _ExitProcess@4

global Start

section .data
    num1 dd 4
    num2 dd 8
    result dd 0
    output_msg db "The sum is: %d", 0  

section .text

Start:
    mov eax, [num1]
    add eax, [num2]
    mov [result], eax
    push dword [result]
    push output_msg
    call _WriteConsole@20
    add esp, 8  
    call _ExitProcess@4
