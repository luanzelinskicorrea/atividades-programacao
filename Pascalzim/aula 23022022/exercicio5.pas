Program exercicio5;

var em,vb,vn,vv:integer;

var pvb,pvn,pvv,x,y,z:real;
 
Begin

write('Digite o total de eleitores do município: ');
readln(em);

write('Digite o total de votos brancos: ');
readln(vb);

write('Digite o total de votos nulos: ');
readln(vn);

write('Digite o total de votos validos: ');
readln(vv);
writeln();

x := (vb * 100)/em;
y := (vn * 100)/em;
z := (vv * 100)/em;

writeln('O total de eleitores: ',em);
writeln('Porcentagem de votos brancos: ',x);
writeln('Porcentagem de votos nulos: ',y);
writeln('Porcentagem de votos validos: ',z);
writeln();

write('Aperte uma tecla pra "encerrar" o processo...');
readkey();
 
End.