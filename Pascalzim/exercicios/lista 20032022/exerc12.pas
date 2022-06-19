//Luan Zelinski Corrêa - 3-54
//
//Exercício 12:
//Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário para
//Km/h. Para tal, multiplique o valor em m/s por 3,6.
Program exerc12;
var
	a,b:real;
Begin
	writeln('O programa utiliza de "." para indicar vírgulas, então,');
	writeln('1.490 não é mil quatrocentos e noventa, mas sim, 149/100,');
	writeln('ou seja, 1,490');
	writeln();
	
	write('Diga-me a velocidade média em m/s: ');
	readln(a);
	writeln();
	
	b:= a*3.6;
	
	write('A velocidade média agora é: ',b,'Km/h');
	writeln();
	
	readkey();	  
End.