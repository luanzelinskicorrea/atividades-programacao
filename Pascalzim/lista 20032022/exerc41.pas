//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 41:
//Escreva um programa que imprima todos os n�meros inteiros do intervalo fechado de 1 a
//100.
Program exerc41;
var
	n:array[0..99] of integer;
	i:integer;	
Begin
	for i:=0 to 99 do
		n[i]:= i+1;	
	for i:=0 to 99 do
		writeln(n[i]);
		n[i]:= i+1;
	
	writeln();	
	readkey();
End.