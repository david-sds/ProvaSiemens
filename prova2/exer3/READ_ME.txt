PROVA 2 - EXERCÍCIO 3:
[Resolução no OnlineGDB](https://onlinegdb.com/rkD9diE_O)

  Para auxiliar os testes do código realizei um simples teste de mesa, adicionando e removendo
os caractéres de acordo com a necessidade. Fazendo isso determinei quatro veriifcações que utilizei,
as quais foram:
  - Verificar se a soma do tamanho das String's é maior ou igual ao número de mudanças permitidas (k). 
      Se for maior, sempre será possível a conversão, portanto retorno 'sim'.
      Se for menor:
  - Verificar se o número de mudanças disponíveis k era maior que o número de mudanças necessárias.
      Se não for suficiente, retorno 'não'
      Se for suficiente:
  - Verificar se há verificações excedentes:
      Se não há, retorno 'sim'
      Se há:
  - Verificar se o número de verificações excedente é par.
      Se for par retorno 'sim', pois, posso remover e adicionar novamente o ultimo char até acabarem os k's excedentes.
      Se for ímpar retorno 'não', pois, sempre terminará com o k = 1.
      
