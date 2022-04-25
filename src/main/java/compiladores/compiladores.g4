grammar compiladores;

@header {
package compiladores;
}



//TIPOS DE DATOS
fragment INT : 'int';
fragment DOUBLE : 'double';
fragment CHAR : 'char';
fragment VOID : 'void';

//CIERRES y APERTURAS
fragment PA : '(' ; 
fragment PC : ')' ; 
fragment CA : '[' ; 
fragment CC : ']' ; 
fragment LA : '{' ; 
fragment LC : '}' ; 

//OPERACIONES 
fragment MAS : '+';
fragment MENOS : '-';
fragment POR : '*';
fragment DIVISION : '/';
fragment MOD  : '%' ;  

//ASIGNACIONES
fragment IGUAL : '=';

//CICLOS Y CONDICIONALES
fragment WHILE : 'while';
fragment IF : 'if';
fragment FOR : 'for';

//OPERACIONES LOGICAS Y BOOLEANOS
fragment OR : '||';
fragment AND : '&&';
fragment NOT : '!';

//COMPARADORES
fragment MAYOR : '>';
fragment MENOR: '<';
fragment IGUALIGUAL : '==';
fragment DISTINTOIGUAL : '!='; 
fragment MAYORIGUAL : '>=';
fragment MENORIGUAL : '<=';

//LETRAS Y DIGITOS
fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

//SIMBOLOS
fragment PYC  : ';' ;  //Punto y coma
fragment COMA : ',' ;  //Coma

//SKIPEAMOS: espacios y saltos de línea
WS : [\t\r\n ] -> skip; 
/* 
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
    ;*/