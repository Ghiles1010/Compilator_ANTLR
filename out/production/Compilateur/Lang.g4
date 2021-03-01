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


NOM_PROGRAMME : [A-Z][A-Za-z0-9_]*;
ID : [A-Za-z][A-Za-z0-9_]*;

WS : [ \r\t\n]+ -> skip ;

// Global program
root : COMPIL NOM_PROGRAMME PO PF AO declaration START body AF EOF;

// Declaration part
declaration: type list_id PV declaration ||;
type : INT | FLOAT | STRING;
list_id : ID VG list_id | ID;

// operands and operators
operand : ENTIER | REEL | ID;
operator : PLUS | MOINS | DIV | MUL;

// Expressions
formule : operand operator formule| PO formule_pf| operand;
formule_pf : formule PF | formule PF operator formule;

// Affectation
affectation : ID AFF formule;

// Comparator
comparator : GRT | LSS | EQ | NEQ ;

// Condition
condition : formule comparator formule;

// If Else statements
if_ : IF PO condition PF THEN AO body AF else_;
else_ : || ELSE AO body AF;

// Do While
do_ : DO AO body AF WHILE PO condition PF;

// instruction
instruction : affectation PV | if_ | do_;

// Body
body: instruction body ||;