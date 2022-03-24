grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;
//DIGITO = '0' | '1' | '2' | .... | '9' |    para no poner todos, escribimos  [0-9]  el guion significa que "va hasta.."
//SIGNOS : [-+*/]   el guion siempre debe ir al principio, si no lo toma como "metacaracter" - como en el caso [0-9]
//WP : [ /t/n/r]->skip;   epara saltear los espacios, saltos de linea
//SEQ : '3'[4-9] | '4'[0-5]    por ej: capto lo que vaya del 34 al 39 o del 40 al 45


NUMERO : DIGITO+ ;
OTRO : . ;
//el punto indica que toma "cualquier caracter" ej: un espacio, un signo, etc. Cualquier caracter que no se tome en LETRA o DIGITO

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;
