//Luan Zelinski Corrêa - 3-54
//
//Exercício 22:
//Escreva um programa que leia um número e exiba o seu módulo.
Program exerc22;
var
	a,b:real;
Begin
	write('Digite o número para saber o módulo: ');
	readln(a);
	writeln();
	
	b:=a;
	
	if a<0 then
		begin		
			b:= a*-1;
			writeln('O módulo do número é:',b);
		end
	else
		begin
			writeln('O módulo do número é: ',b);
		end;
End.