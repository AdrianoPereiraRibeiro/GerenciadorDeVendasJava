# Sistema de Vendas em Java

Este projeto implementa um sistema de vendas simples em Java. Ele permite cadastrar produtos e realizar vendas.

## 🔧 Requisitos

- Java JDK 11 ou superior
- Um editor de código (recomendado: VSCode ou NetBeans)

## ▶️ Como Executar

1. Compile os arquivos Java e depois execute:
javac src/*.java
java -cp src Main

 
---

### 📄 relatorio.txt (Relatório Explicativo)


RELATÓRIO EXPLICATIVO – SISTEMA DE VENDAS

1. CENÁRIO ESCOLHIDO
O sistema desenvolvido representa uma loja fictícia onde é possível cadastrar produtos e realizar vendas.

2. DESCRIÇÃO FUNCIONAL
O sistema funciona via terminal (modo texto). Ao executar o programa, o usuário tem acesso a um menu com as seguintes opções:

- Cadastrar produto (nome, preço)
- Cadastrar venda ()
- Mostrar Itens (seleciona cliente e produtos)
- Sair

Todos os dados são armazenados em memória (não há persistência em arquivos ou banco de dados, por simplicidade).

3. JUSTIFICATIVA DAS ESCOLHAS

- **Armazenamento em memória** foi adotado para simplificar a lógica e manter o foco no fluxo de vendas.
- A separação de responsabilidades em classes (`Produto`, `Venda`, `GerenciadorVendas`) garante organização e facilita futuras melhorias.
- Esse programa foi escolhido por ser algo utíl e relativamente simples de visualizar em uma situação real.

Este sistema tem foco didático, ideal para introduzir conceitos de orientação a objetos e lógica de programação.

![Captura de tela 2025-04-23 064829](https://github.com/user-attachments/assets/17347f20-8b40-4de0-af88-b108a9b8957d)
