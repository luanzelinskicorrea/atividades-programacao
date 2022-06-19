//Luan Zelinski Corrêa - 3-54
//
//Exercício 33:
//Escreva um algoritmo que leia 2 valores (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).
Program exerc33;
var
	x,y:real;
Begin
	write('O X é igual a: ');
	readln(x);
	write('O Y é igual a: ');
	readln(y);
	
	if ((x>0)and(y>0)) then
		begin
			writeln('Coordenadas do Quadrante 1');
		end
	else if ((x<0)and(y>0)) then
		begin
			writeln('Coordenadas do Quadrante 2');
		end
	else if ((x<0)and(y<0)) then
		begin
			writeln('Coordenadas do Quadrante 3');
		end
	else if ((x>0)and(y<0)) then
		begin
			writeln('Coordenadas do Quadrante 4');
		end
	else if ((x=0)and(y=0)) then
		begin
			writeln('Coordenadas do eixo (0,0)');
		end;
		
	writeln();
	readkey();
End.