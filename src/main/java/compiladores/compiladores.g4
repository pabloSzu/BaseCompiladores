grammar compiladores;

@header {
package compiladores;
}

fragment DIA : ('0'[1-9] | '1'[0-9] | '2'[0-9] | '3'[0-1]) ;
fragment MES : '/'('0'[02468] | '1'[02]) ;
fragment ANO :  '/'([1-2])([0-9])([0-9])([0-9]);

fragment HORA1 :  ( ('0'[89]) | ([1][0-2])  )':'([0-5][0-9])  ;
fragment HORA2 :  ( ('1'[89]) | ([2][01])  )':'(([0-2][0-9]) | '30')  ;
HORA_1 : HORA1 ;
HORA_2 : HORA2 ;


FECHA : (DIA)(MES)(ANO);


ID : ((FECHA)([ \t\r\n]+)(HORA_1)) | ((FECHA)([ \t\r\n]+)(HORA_2)); 

OTRO : . ;


s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
  | FECHA     { ; }         s
  | HORA_1   { ; }     s
  | HORA_2   { ; }     s
  | OTRO   { ; }     s
  | EOF 
  ;
