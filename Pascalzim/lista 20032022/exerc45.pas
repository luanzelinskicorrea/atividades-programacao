//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 45:
//Escreva um programa que leia 5 n�meros, e imprima a m�dia entre eles.
Program exerc45;
var
	a,b,c,d,e,f:real;
Begin
	write('Digite o valor de A: ');
	readln(a);
	write('Digite o valor de B: ');
	readln(b);
	write('Digite o valor de C: ');
	readln(c);
	write('Digite o valor de D: ');
	readln(d);
	write('Digite o valor de E: ');
	readln(e);
	
	f:=(a+b+c+d+e)/5;
	
	writeln('A m�dia dos valores �: ',f);
	
	writeln();
	readkey();  
End.