grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

//PARENTESIS - CORCHETES - LLAVES
LA   : '{' ;  
LC   : '}' ;  
CA   : '[' ;  
CC   : ']' ;  
PA   : '(' ;  
PC   : ')' ;  

//SEPARADORESTA
PYC  : ';' ;  
COMA : ',' ;  

//IGUAL
IGUAL   : '=' ;  

//COMPARADORES
MENOR  : '<' ; 
MENORIGUAL: '<=';  
IGUALL  : '==';  
MAYOR  : '>' ;  
MAYORIGUAL: '>=';  
DISTINTO  : '!=';  


//OPERACIONES
SUMA  : '+' ;  
RESTA  : '-' ;  
MULT  : '*' ;  
DIV  : '/' ;  
MOD  : '%' ;  

//TIPO DE DATOS
INT     : 'int' ;  
CHAR    : 'char' ;  
DOUBLE  : 'double' ;  
VOID    : 'void' ;  

//LERYTAS O NUMEROS
ENTERO : DIGITO+;
DECIMAL : ENTERO'.'ENTERO;

//OPERACIONES LOGICAS
OR   : '||' ;  
AND  : '&&' ;  
NOT  : '!'  ;  

//CICLOS
IF   : 'if'|'IF' ;  
ELSE : 'else'|'ELSE' ; 
FOR  : 'for'|'FOR';  
WHILE: 'while'|'WHILE'; 

ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

WS : [ \n\t\r] -> skip ;
OTRO : . ;

s : programa;

programa: instrucciones ; 


instrucciones : instruccion instrucciones 
              |
              ;

bloque : LA instrucciones LC 
       ;

instruccion : declaracion PYC
            | asignacion PYC
            | ciclofor
            | ciclowhile
            | condif
            | funcion
            | llamada_funcion PYC
            | bloque
            ;

declaracion : tipodato ID
            | tipodato ID asign
            ;

asign : IGUAL llamada_funcion
      | IGUAL operacion
      ;

tipodato : INT
         | CHAR
         | DOUBLE
         | VOID
         ;

asignacion  : ID asign
            ;

ciclofor : FOR PA asignacion PYC operacion PYC ID asign PC instruccion
         ;

ciclowhile : WHILE PA operacion PC instruccion
           ;

condif : IF PA operacion PC instruccion
       | IF PA operacion PC instruccion ELSE instruccion
       ;

funcion : tipodato ID PA parametros PC bloque
        ;

parametros :  declaracion parametros
           |  COMA parametros
           |
           ;

llamada_funcion : ID PA argumentos PC
                ;

argumentos: ID argumentos
          | COMA argumentos
          |
          ;

operacion : opal ;

opal : disyuncion 
     |
     ;

disyuncion : conjuncion disy
           ;

disy : OR conjuncion disy
     |
     ;

conjuncion : comparaciones conj
           ;

conj : AND comparaciones conj
     |
     ;

comparaciones : expresion comp
              ;

comp : opcomp expresion comp
     |
     ;

opcomp : IGUALL
       | DISTINTO
       | MAYOR
       | MAYORIGUAL
       | MENOR
       | MENORIGUAL
       ;

expresion : termino exp;

exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV factor term
     | MOD factor term
     |
     ;

factor : f PA opal PC
       | f ENTERO
       | f DECIMAL
       | f ID
       ;

f : SUMA
  | RESTA
  | NOT
  |
  ;
