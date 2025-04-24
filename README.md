# Projeto - Cálculo de Salário com Hora Extra

Este projeto em Java calcula o salário total de um trabalhador, considerando horas extras. O programa recebe o número de horas trabalhadas no mês e o valor pago por hora. Se o trabalhador trabalhar mais de 160 horas no mês, ele receberá 1.5x o valor da hora extra.

## Funcionalidade

O programa solicita que o usuário insira:
1. A quantidade de horas trabalhadas no mês.
2. O valor pago por hora de trabalho.

Em seguida, o programa calcula o salário total, considerando:
- O valor normal para as primeiras 160 horas trabalhadas.
- O valor adicional de 50% (hora extra) para as horas que excederem as 160 horas.

### Exemplo:

- Se o trabalhador trabalhou 170 horas no mês e recebe R$ 10 por hora, o cálculo será:
  - Para as 160 horas normais: 160 * 10 = R$ 1.600.
  - Para as 10 horas extras (com adicional de 50%): 10 * 10 * 1.5 = R$ 150.
  - O salário total será: R$ 1.600 + R$ 150 = R$ 1.750.

## Como Funciona

1. O programa solicita o número de horas trabalhadas no mês e o valor pago por hora.
2. Se as horas trabalhadas forem superiores a 160, as horas extras são calculadas com um adicional de 50%.
3. O salário total é calculado e exibido.

  ```bash
Digite quantas horas voce trabalhou por mes: 170
Digite quanto voce ganha por hora: 10
Salario total: 1750.0
