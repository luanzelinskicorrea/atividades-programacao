//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 12:
//Fa�a um algoritmo que transforme uma velocidade fornecida em m/s pelo usu�rio para
//Km/h. Para tal, multiplique o valor em m/s por 3,6.
Program exerc12;
var
	a,b:real;
Begin
	writeln('O programa utiliza de "." para indicar v�rgulas, ent�o,');
	writeln('1.490 n�o � mil quatrocentos e noventa, mas sim, 149/100,');
	writeln('ou seja, 1,490');
	writeln();
	
	write('Diga-me a velocidade m�dia em m/s: ');
	readln(a);
	writeln();
	
	b:= a*3.6;
	
	write('A velocidade m�dia agora �: ',b,'Km/h');
	writeln();
	
	readkey();	  
End.