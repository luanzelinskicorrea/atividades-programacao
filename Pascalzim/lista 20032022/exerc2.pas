//Luan Zelinski Corr�a - 3-54
//
//Exerc�cio 2:
//Dado o tamanho do lado de um quadrado, calcular a �rea e o per�metro do mesmo.
Program exerc2;
var
	l,a,p:real;
Begin
	write('Digite o valor do lado do quadrado: ');
	readln(l);
	
	a:=l*l;
	p:=l*4;
	
	writeln('O per�metro do quadrado �: ',p);
	writeln('A �rea do quadrado �: ',a);
	
	writeln();
	readkey(); 
End.