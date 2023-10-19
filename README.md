# Quack Compiler

Este é o repositório oficial do compilador da linguagem Quack, que foi desenvolvido utilizando a ferramenta JavaCC. A linguagem Quack é uma linguagem de programação simples e educativa, e este compilador foi criado com o objetivo de ajudar a aprender sobre análise léxica e análise sintática.

## Pré-requisitos

Antes de usar o compilador Quack, você precisará ter o seguinte software instalado em sua máquina:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [JavaCC](https://javacc.github.io/javacc/)

## Compilação

Para compilar o código-fonte do compilador Quack, siga estas etapas:

1. Clone este repositório para a sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/quack-compiler.git
```
# Navegue até o diretório do projeto:
cd quack-compiler

# Compile o código-fonte com o seguinte comando:
javacc QuackParser.jj
# Isso gerará os arquivos Java necessários para o compilador.

# Compile os arquivos Java gerados:
javac *.java

# Uso
# Após compilar o código-fonte, você pode usar o compilador Quack da seguinte maneira:
java QuackParser arquivo_de_entrada.qk
# Substitua "arquivo_de_entrada.qk" pelo nome do arquivo Quack que você deseja compilar.

# Exemplos
# O diretório "exemplos" contém alguns programas de exemplo em Quack que você pode usar para testar o compilador.

# Contribuições
# Contribuições são bem-vindas! Se você encontrar problemas, desejar adicionar novos recursos ou melhorias, sinta-se à vontade para criar um pull request.

# Licença
# Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

# Divirta-se programando em Quack! 😃
