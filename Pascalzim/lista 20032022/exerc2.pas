//Luan Zelinski Corrêa - 3-54
//
//Exercício 2:
//Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.
Program exerc2;
var
	l,a,p:real;
Begin
	write('Digite o valor do lado do quadrado: ');
	readln(l);
	
	a:=l*l;
	p:=l*4;
	
	writeln('O perímetro do quadrado é: ',p);
	writeln('A área do quadrado é: ',a);
	
	writeln();
	readkey(); 
End.