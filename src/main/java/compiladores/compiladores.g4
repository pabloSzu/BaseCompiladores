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

//INCREMENTO O DISMINUCIÓN
MASMAS  : '++' ;  
MENOSMENOS  : '--' ;  

//TIPO DE DATOS
INT     : 'int' ;  
CHAR    : 'char' ;  
DOUBLE  : 'double' ;  
VOID    : 'void' ;  

//LETRAS O NUMEROS
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

//programa tiene instrucciones
programa: instrucciones ; 

//instrucciones tiene una instruccion, seguida de más instrucciones
instrucciones : instruccion instrucciones 
              |
              ;

//bloque es {instrucciones}
bloque : LA instrucciones LC 
       ;

/*
instrucción puede ser: - "declaración;" 
- "asignacion ; " 
- "ciclofor ; " 
- "ciclowhile" 
- "condif" 
- "funcion" 
- "llamada_funcion ; " 
- "bloque" 
*/
instruccion : declaracion PYC
            | asignacion PYC
            | ciclofor
            | ciclowhile
            | condif
            | funcion
            | llamada_funcion PYC
            | bloque
            ;

/*
 declaración es: 
 -"(char-int-etc) nombre_variable"
 -"(char-int-etc) nombre_variable asignacion_"
 */
declaracion : tipodato ID
            | tipodato ID asignacion_
            ;

/*
asignacion_ es:
- "= nombre_funcion()"
- "= operacion"
 */
asignacion_ : IGUAL llamada_funcion
      | IGUAL operacion
      ;

//tipo de datos
tipodato : INT
         | CHAR
         | DOUBLE
         | VOID
         ;

/*
asignacion es:
- "nombre_variable = nombre_funcion()"
- "nombre_variable = operacion"
 */
asignacion  : ID asignacion_
            ;

// "++"  o  "--"
masmas_menosmenos: MASMAS
     |MENOSMENOS;


//ciclofor : for(nombre_variable = 0 ; nombre_variable < 0 ; nombre_variable ++ )
ciclofor : FOR PA asignacion PYC operacion PYC ID masmas_menosmenos PC instruccion
         ;

//ciclowhile : while(nombre_variable < 0 )
ciclowhile : WHILE PA operacion PC instruccion
           ;

/*
condif es:
- " if( nombre_variable < 0) "
- " if( nombre_variable < 0) {...} else {...} "
 */
condif : IF PA operacion PC instruccion
       | IF PA operacion PC instruccion ELSE instruccion
       ;

//funcion es: tipo nombre_funcion ( parametros ) {...}
funcion : tipodato ID PA parametros PC bloque
        ;


//parametros es: ( int a, char b, ... )
parametros :  declaracion parametros
           |  COMA parametros
           |
           ;

//llamada_funcion es: nombre_funcion( argumentos )
llamada_funcion : ID PA argumentos PC
                ;

//argumentos es: (args, args, ...)
argumentos: ID argumentos
          | COMA argumentos
          |
          ;

//CICLO DE OPERACIONES LÓGICAS//////////////////////////////////////////////////////
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
//////////////////////////////////////////////////////////////////////////////////////


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
