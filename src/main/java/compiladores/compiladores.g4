grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO: [0-9];
ENTERO : DIGITO+ ;

fragment INT: 'int' ;
fragment DOUBLE: 'double' ;
fragment WHILE: 'while';
fragment IF: 'ifa';

fragment EQ : '=';
fragment OP : ('+'|'-'|'*'|'/');
fragment COMP : ('=='|'>'|'<'|);
fragment ESP: ' ';

OTRO : . ->skip;

INSTRUCCION : ( WHILEE | IFE );

WHILEE : WHILE ESP* '(' ESP* (LETRA|ENTERO) ESP* COMP ESP* (LETRA|ENTERO) ESP* ')' ESP* '{' ESP* INSTRUCCION+ ESP* '}';

IFE : IF ESP* '(' ESP* (LETRA|ENTERO) ESP* COMP ESP* (LETRA|ENTERO) ESP* ')' ESP* '{' ESP* INSTRUCCION+ ESP* '}';

DECLARACIONES : (DOUBLE | INT) ESP+ ( (LETRA ESP* EQ ESP* ENTERO ESP* ';' ESP*) | (LETRA ESP* (','|';' ) ESP*) )+ ; 

OPERACION : LETRA ESP* OP ESP* (LETRA | ENTERO ) ESP* ';'* ;

ASIGNACIONES : LETRA ESP* EQ ESP* (LETRA | ENTERO ) ESP* ';' ;

s : 
    INSTRUCCION { System.out.println( "Instruccion-> " + $INSTRUCCION.getText()); } s
    | DECLARACIONES { System.out.println( "Declaracion-> " + $DECLARACIONES.getText()); } s
    | ASIGNACIONES { System.out.println( "Asignación-> " + $ASIGNACIONES.getText()); } s
    | OPERACION { System.out.println( "Operacion-> " + $OPERACION.getText()); } s
    | EOF
    ;