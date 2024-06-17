# ProcessoSeletivo_DIO
Criando Um Pequeno Sistema Para Validação de Processo Seletivo

A princípio segui a lógica de definir a "Classe Candidato" na qual cada candidato deve ter um nome e um número de cursos realizados.
Depois parti para implementação da Lógica de Comparação afim de determinar o vencedor, comparando o número de cursos realizados de cada candidato.

Explicação do Código:
> A classe Candidato encapsula os dados de cada candidato.

> ValidacaoProcessoSeletivo é a classe principal que demonstra como utilizar a classe Candidato.

>Usei Collections.sort com um Comparator personalizado para ordenar os candidatos pelo número de cursos realizados em ordem decrescente (reversed()).

> O candidato na posição 0 da lista ordenada é considerado o vencedor.

> Por fim, o codigo imprime o nome do vencedor e a quantidade de cursos realizados.

Essa foi a ideia para ilustrar a criação de um sistema simples em Java para validar um processo seletivo baseado no número de cursos realizados pelos candidatos que nesse caso a vencedora do processo seletivo é Maria, pelo maior  número de cursos realizados, que foram 5.


