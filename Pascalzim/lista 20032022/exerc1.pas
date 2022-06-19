//Luan Zelinski Corrêa - 3-54
//
//Exercício 1:
//Dado o tamanho da base e da altura de um retângulo,
//calcular a sua área e o seu perímetro.
Program exerc1;
var
	h,b,p:real;
Begin
	write('Escreva a altura do retângulo: ');
	readln(h);
	write('Escreva a base do retângulo: ');
	readln(b);
	
	p:=((2*h)+(2*b));
	
	writeln('O perímetro do retângulo é: ',p);
	
	writeln();
	readkey();
End.