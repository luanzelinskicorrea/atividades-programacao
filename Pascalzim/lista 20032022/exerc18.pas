//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 18:
//Escreva um programa que permute o valor de duas vari�veis inteiras.
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
	
	writeln('A agora �: ',a);
	writeln('B agora �: ',b);
	  
End.