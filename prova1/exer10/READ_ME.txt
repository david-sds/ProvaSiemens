PROVA 1 - EXERCÍCIO 10:

Resolução no OnlineGDB: https://onlinegdb.com/HyanCEEOO

  Por conta do tipo String em Java ser imutável, acretido que seria impossível modificar a 
String sem a substituir. Importei a classe StringBuilder, que eu imagino que se assemelhe mais
a String das linguagens C e C++, as quais eu acho que esse exercício tenha sido pensado para.
  Para realizar a inversão, percorri a lista em ambas as direçoes em um laço de repedição,
da mesma maneira que fiz no teste de mesa abaixo, salvei os caracteres em cada uma das pontas
em duas variáveis char, e as troquei. Fiz esse processo até chegar na metade da String.
  A variavel que defini como metada varia se o tamanho da String é par ou impar, para evitar
que caracteres fossem deixados sem serem invertidos.

Teste de Mesa: 
abcdef
012345

length - 1 = 5;

length - 5 = 0;
length - 4 = 1;
length - 3 = 2;
length - 2 = 3;
length - 1 = 4;
length - 0 = 5;

PS. Acabei de realizar que poderia ter utilizado um char[].


