grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

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
FLOAT    : 'float' ;  

//LETRAS O NUMEROS
ENTERO : DIGITO+;
DECIMAL : ENTERO'.'ENTERO;

//OPERACIONES LOGICAS
OR   : '||' ;  
AND  : '&&' ;  
NOT  : '!'  ;  

//CICLOS
IF_   : 'if'|'IF' ;  
ELSE_ : 'else'|'ELSE' ; 
FOR_  : 'for'|'FOR';  
WHILE_: 'while'|'WHILE_'; 

//RETURN
RETURN : 'return' ;

ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

WS : [ \n\t\r] -> skip ;
OTRO : . ;


programa: instrucciones ; 

instrucciones : instruccion instrucciones 
              |  bloque instrucciones
              |
              ;

bloque : LA instrucciones LC 
       ;


instruccion : declaracion PYC
            | asignacion PYC
            | iwhile
            | iif
            | ifor
            | funcion PYC
            | declaracion_funcion PYC
            | definicion_funcion
            | finalizar_con_return PYC
            ;

verificador : ID | ENTERO ;




declaracion :  tipo_de_datos asignacion_simple;

tipo_de_datos : INT 
              | DOUBLE 
              | FLOAT
              ;

asignacion_simple : ID IGUAL verificador
                  | ID IGUAL COMA asignacion_simple
                  | ID
                  | ID COMA asignacion_simple
                  ;
                  

asignacion : ID IGUAL opal ;

opal : exp ;

exp : term e ;

e : SUMA   term e
  | RESTA term e
  |
  ;

term : factor t ;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : ID
       | ENTERO
       | PA exp PC
       ;


logico_comp : OR 
            | AND
            ;

comparacion : MAYOR
            | MENOR 
            | MAYORIGUAL 
            | MENORIGUAL 
            | IGUALL 
            | DISTINTO 
            ;

comp : verificador logico_comp comp
     | verificador
     ;

bloque_estructuras_de_control : verificador comparacion verificador bloque_estructuras_de_control
                              | PA comp comparacion verificador  bloque_estructuras_de_control
                              | PA comp bloque_estructuras_de_control
                              | PC comparacion verificador bloque_estructuras_de_control
                              | PC logico_comp bloque_estructuras_de_control
                              | PC
                              | logico_comp bloque_estructuras_de_control
                              |
                              ; 

pos_pre_incremento : verificador SUMA SUMA 
                   | verificador MENOSMENOS
                   | MASMAS verificador
                   | MENOSMENOS verificador
                   ;


bloque_for : PA ( (declaracion | asignacion) PYC bloque_estructuras_de_control  PYC pos_pre_incremento ) PC ;


iwhile : WHILE_ PA bloque_estructuras_de_control PC bloque ;
  

iif : IF_ PA bloque_estructuras_de_control  PC bloque  ;


ifor : FOR_ bloque_for bloque ;


una_o_mas_variables : declaracion una_o_mas_variables
                    | declaracion
                    |
                    ; 

tipo_de_funcion : VOID ;

funcion : tipo_de_datos ID PA una_o_mas_variables PC
        | ID PA PC
        ;


declaracion_funcion : tipo_de_datos ID PA param_declaracion PC;
                    
definicion_funcion: tipo_de_datos ID PA param_definicion PC bloque;

param_declaracion : tipo_de_datos(ID | )
		              | tipo_de_datos (ID | ) COMA param_declaracion
                  |
		              ;

param_definicion : tipo_de_datos ID
		             | tipo_de_datos ID COMA param_definicion
                 |
	            	 ; 

finalizar_con_return : RETURN ( term | )  ;