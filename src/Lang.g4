grammar Lang;

COMPIL : 'compil';



AO : '{';
AF : '}';

PO : '(';
PF : ')';

START : 'start';
PV : ';';
VG : ',';

INT : 'intCompil';
FLOAT : 'floatCompil';
STRING : 'stringCompil';

PLUS  : '+';
MOINS : '-';
MUL : '*';
DIV : '/';


ENTIER : [0-9]+;
REEL : '-'?[0-9]+('.'[0-9]+)?;

GRT : '>';
LSS : '<';
EQ : '==';
NEQ : '!=';

AFF : '=';

IF : 'if';
THEN : 'then';
ELSE : 'else';

DO : 'do';
WHILE: 'while';

READ : 'scanCompil';
PRINT : 'printCompil';

COMMENT_S : '//'~[\r\n]* -> skip;
COMMENT_M : '/*'.+?'*/' -> skip;


NOM_PROGRAMME : [A-Z][A-Za-z0-9]*;
ID : [A-Za-z][A-Za-z0-9]*;

WS : [ \r\t\n]+ -> skip ;


root : COMPIL NOM_PROGRAMME PO PF AO declaration START body AF EOF;

declaration: type list_id PV declaration_b ||;
declaration_b : declaration |  type list_id PV ||;
type : INT | FLOAT | STRING;
list_id : ID VG list_id | ID;


instruction : affectation PV;

affectation : ID AFF formule;

formule : operand operator formule_body| operand;
formule_body : formule | PO formule_p;
formule_p : formule PF | formule PF operator formule_body;



operand : ENTIER | REEL | ID;
operator : PLUS | MOINS | DIV | MUL;



body: instruction;





