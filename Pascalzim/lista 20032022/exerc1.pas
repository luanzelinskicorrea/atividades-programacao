//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 1:
//Dado o tamanho da base e da altura de um ret�ngulo,
//calcular a sua �rea e o seu per�metro.
Program exerc1;
var
	h,b,p:real;
Begin
	write('Escreva a altura do ret�ngulo: ');
	readln(h);
	write('Escreva a base do ret�ngulo: ');
	readln(b);
	
	p:=((2*h)+(2*b));
	
	writeln('O per�metro do ret�ngulo �: ',p);
	
	writeln();
	readkey();
End.