//Luan Zelinski Corrêa - 3-54
//
//Exercício 18:
//Escreva um programa que permute o valor de duas variáveis inteiras.
Program exerc18;
var
	a,b,c:integer;
Begin
	write('Digite o valor de A: ');
	readln(a);
  write('Digite o valor de B: ');
	readln(b);
	
	writeln();
	
	c:=0;
	c:=b;
	b:=a;
	a:=c;
	
	writeln('A agora é: ',a);
	writeln('B agora é: ',b);
	  
End.