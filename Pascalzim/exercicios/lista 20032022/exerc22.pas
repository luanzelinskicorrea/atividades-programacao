//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 22:
//Escreva um programa que leia um n�mero e exiba o seu m�dulo.
Program exerc22;
var
	a,b:real;
Begin
	write('Digite o n�mero para saber o m�dulo: ');
	readln(a);
	writeln();
	
	b:=a;
	
	if a<0 then
		begin		
			b:= a*-1;
			writeln('O m�dulo do n�mero �:',b);
		end
	else
		begin
			writeln('O m�dulo do n�mero �: ',b);
		end;
End.