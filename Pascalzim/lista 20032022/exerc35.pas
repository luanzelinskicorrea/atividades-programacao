//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 35:
//Escreva um programa que leia um n�mero inteiro de 1 a 7 e informe o dia da semana
//correspondente, sendo domingo o dia de n�mero 1. Se o n�mero n�o corresponder a um
//dia da semana, mostre uma mensagem de erro.
Program exerc35;
var
	a:integer;
Begin
	write('Digite o n�mero do dia da semana: ');
	readln(a);
	writeln();
	
	if((a=1)or(a=7)) then
		begin
			writeln('Final de semana, descansar?');
		end
	else if((a>=2)and(a<7)) then
		begin
			writeln('Dia de semana, trabalhar?');
		end
	else
		begin
			writeln('O queeeeeeeeee?');	
		end;
	
	writeln();
	readkey();	  
End.