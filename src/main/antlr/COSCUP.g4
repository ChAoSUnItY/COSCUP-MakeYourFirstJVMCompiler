grammar COSCUP;

context     :   statements+ ;
statements  :   assignment  ;

assignment  :   VAR ID EQ expressions;

expressions :   expressions PLUS expressions
            |   expressions MINUS expressions
            |   expressions STAR expressions
            |   expressions SLASH expressions
            |   number
            |   ID
            ;

number      :   DIGIT+          ;

DIGIT   :   ('0'..'9');

VAR     :   'var';
EQ      :   '=';
PLUS    :   '+';
MINUS   :   '-';
STAR    :   '*';
SLASH   :   '/';

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

SPACE : [ \t\r\n]+ -> skip ;