grammar compiladores;


//comentar si uso el Debug ANTLR
@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;

//el punto indica que toma "cualquier caracter" ej: un espacio, un signo, etc. Cualquier caracter que no se tome en LETRA o DIGITO
//si hay un conflicto entre dos expresiones, se elige la que está más arriba
//primero conviene poner las más cortas y luego las mas largas, ej INT:'int' y luego INTERGER:'interger'


PA: '(';
PC: ')';

SUMA: '+';
INT : 'int';
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;


WP : [ \t\n\r] -> skip; 
OTRO : . ;


//si: simbolo incial-> le indicamos con "que" regla gramatical comenzar. Sería como el nodo inicial
si : s EOF ;


s : PA s PC s
  |
  ;


/*s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;
*/