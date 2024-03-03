grammar antlr;
prog : stat* EOF;
stat : expr ';'
     | ID '=' expr
     | 'if' expr ';'
     ;
SL_COMMENT: '//' .*? '\n' ->skip ;
expr : expr('*' | '/') expr
     | expr('+' | '-') expr
     | '('expr')'
     | ID
     | INT
     ;


SEMI : ';' ;
ASSIGN : '=' ;
IF : 'if' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LPAREN : '(' ;
RPAREN : ')' ;
ML_COMMENT: '/*' .*? '*/' ->skip ;

ID : [a-zA-Z][a-zA-Z0-9]* ;
INT : '0' | [1-9][0-9]*;
WS: [ \t\n\r]+ -> skip;