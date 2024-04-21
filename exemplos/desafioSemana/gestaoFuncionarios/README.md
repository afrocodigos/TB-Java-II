# Sistema de Gestão de Funcionários

## Objetivo

Desenvolver um sistema de gestão de funcionários para uma empresa, contendo funcionários regulares, gerentes e diretores.
Tais funcionários devem ser modeladas como subclasses da super classe Funcionario.

## Características

- A classe Funcionario representa um funcionário genérico. Ela deve conter:
  - Atributos: nome; idade; salário.
  - Métodos: getters; setters; calcularSalario.
- As subclasses FuncionarioRegular, Gerente e Diretor devem herdar da classe Funcionario, modificando as funções abstratas de acordo com suas respectivas funções
- Os atributos e métodos das classes devem ser encapsulados de acordo com seus níveis de privacidade

## Como executar

Execute o arquivo [testaGestaoFuncionarios.java](.\application\testaGestaoFuncionarios.java)
