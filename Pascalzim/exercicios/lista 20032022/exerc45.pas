//Luan Zelinski Corrêa - 3-54
//
//Exercício 45:
//Escreva um programa que leia 5 números, e imprima a média entre eles.
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
	
	writeln('A média dos valores é: ',f);
	
	writeln();
	readkey();  
End.