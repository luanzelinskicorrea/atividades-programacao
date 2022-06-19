//Luan Zelinski Corrêa - 3-54
//
//Exercício 35:
//Escreva um programa que leia um número inteiro de 1 a 7 e informe o dia da semana
//correspondente, sendo domingo o dia de número 1. Se o número não corresponder a um
//dia da semana, mostre uma mensagem de erro.
Program exerc35;
var
	a:integer;
Begin
	write('Digite o número do dia da semana: ');
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