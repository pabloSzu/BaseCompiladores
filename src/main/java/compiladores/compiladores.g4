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

fragment EQ : '=';
fragment COMP : ('=='|'>'|'<'|);
fragment ESP: ' ';

OTRO : . ->skip;

INSTRUCCION : ( DECLARACIONES  | ASIGNACIONES | WHILEE );

WHILEE : WHILE ESP* '(' ESP* (LETRA|ENTERO) ESP* COMP ESP* (LETRA|ENTERO) ESP* ')' ESP* '{' ESP* INSTRUCCION+ ESP* '}';

DECLARACIONES : (DOUBLE | INT) ESP+ ( (LETRA ESP* EQ ESP* ENTERO ESP* ';' ESP*) | (LETRA ESP* (','|';' ) ESP*) )+ ; 

ASIGNACIONES : LETRA ESP* EQ ESP* (LETRA | ENTERO ) ESP* ';'* ;

s : 
    INSTRUCCION { System.out.println( $INSTRUCCION.getText()); } s
    |
    ;