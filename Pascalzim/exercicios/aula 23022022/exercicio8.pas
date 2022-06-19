Program exercicio8;

var salario,vendas:real;

Begin

write('Salário: ');
readln(salario);
writeln();

write('Vendas: ');
readln(vendas);
writeln();

if (vendas <= 1500) and (vendas >= 0) then
begin
salario := salario+(0.03*vendas);
write(salario);
writeln();
end;

if (vendas > 1500) and (vendas >= 0) then
begin
salario := salario+(0.08*vendas);
write(salario);
writeln();
end;

write('Digite uma letra para "encerrar" o algoritmo...');
readkey();
  
End.
