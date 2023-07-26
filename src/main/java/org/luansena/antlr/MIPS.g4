grammar MIPS;

program: statement+ EOF;

statement: instruction | label;


instruction: add_instruction
          | sub_instruction
          | addi_instruction
          | lw_instruction
          | sw_instruction
          // Adicione mais regras para outras instruções MIPS
          ;

label: ID ':';

add_instruction: 'add' register ',' register ',' register ;
sub_instruction: 'sub' register ',' register ',' register ;
addi_instruction: 'addi' register ',' register ',' immediate ;
lw_instruction: 'lw' register ',' immediate '(' register ')' ;
sw_instruction: 'sw' register ',' immediate '(' register ')' ;

register: '$zero' | '$at' | '$v0' | '$v1' | '$a0' | '$a1' | '$a2' | '$a3' | '$t0' | '$t1' | '$t2' | '$t3' | '$t4' | '$t5' | '$t6' | '$t7' | '$t8' | '$t9' | '$s0' | '$s1' | '$s2' | '$s3' | '$s4' | '$s5' | '$s6' | '$s7' | | '$k0' | '$k1' | '$gp' | '$sp' | '$fp' | '$ra';

immediate: ('0x' HEX_NUMBER | DEC_NUMBER);

HEX_NUMBER: '0' [xX] [0-9a-fA-F]+;
DEC_NUMBER: [0-9]+;

ID: [a-zA-Z]+;

WS: [ \t\r\n]+ -> skip;