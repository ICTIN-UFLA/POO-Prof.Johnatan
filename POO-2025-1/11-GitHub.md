
# Tutorial: Versionamento de Código com GitHub e Eclipse

## Introdução

Olá, futuros engenheiros de software! Este tutorial foi desenvolvido especialmente para alunos de graduação em Engenharia de Software que estão começando a trabalhar com versionamento de código. O objetivo é apresentar de forma didática e prática como utilizar o GitHub integrado ao Eclipse para gerenciar versões de projetos Java.

O versionamento de código é uma habilidade essencial para qualquer desenvolvedor moderno. Ele permite:
- Acompanhar o histórico de alterações em um projeto
- Trabalhar colaborativamente sem perder o controle do código
- Experimentar novas funcionalidades sem comprometer o código principal
- Recuperar versões anteriores em caso de problemas

Neste tutorial, vamos criar um projeto simples de calculadora em Java, conectá-lo ao GitHub e explorar os principais conceitos e práticas de versionamento. Ao final, você terá uma compreensão sólida de como utilizar o Git e o GitHub em seus projetos acadêmicos e profissionais.

## Pré-requisitos

Antes de começar, certifique-se de que você possui:

1. **Eclipse para Java Developers (versão 2023-06)** instalado em seu computador
2. **Conta no GitHub** já criada
3. **Git** instalado em seu computador

Vamos começar nossa jornada pelo mundo do versionamento de código!

## Parte 1: Criação de um Projeto Java no Eclipse

Nesta primeira parte do tutorial, vamos criar um projeto Java simples no Eclipse que servirá como base para nosso aprendizado sobre versionamento de código.

### Passo 1: Iniciar o Eclipse

Abra o Eclipse 2023-06 em seu computador. Ao iniciar, você será solicitado a escolher um workspace (diretório onde seus projetos serão armazenados). Escolha um local de fácil acesso.

### Passo 2: Criar um Novo Projeto Java

1. No Eclipse, clique em **File > New > Java Project**
2. Na janela que se abre, dê o nome "CalculadoraJava" ao projeto
3. Mantenha as configurações padrão para JRE (Use default JRE)
4. Clique em **Finish**

![Criação de Projeto Java no Eclipse](tutorial_images/eclipse_novo_projeto.png)

### Passo 3: Criar um Pacote para o Projeto

1. No **Package Explorer** (painel à esquerda), clique com o botão direito sobre o projeto "CalculadoraJava"
2. Selecione **New > Package**
3. Nomeie o pacote como "com.tutorial.calculadora"
4. Clique em **Finish**

![Criação de Pacote Java](tutorial_images/eclipse_novo_pacote.png)

### Passo 4: Criar a Classe Principal da Calculadora

1. Clique com o botão direito sobre o pacote criado
2. Selecione **New > Class**
3. Nomeie a classe como "Calculadora"
4. Marque a opção "public static void main(String[] args)"
5. Clique em **Finish**

![Criação de Classe Java](tutorial_images/eclipse_nova_classe.png)

### Passo 5: Implementar a Classe Calculadora

Substitua o conteúdo do arquivo Calculadora.java pelo código abaixo:

```java
package com.tutorial.calculadora;

import java.util.Scanner;

/**
 * Classe Calculadora - Exemplo para tutorial de GitHub
 * Implementa operações básicas de uma calculadora
 */
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora Java ===");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        
        switch (opcao) {
            case 1:
                resultado = adicionar(num1, num2);
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
    
    /**
     * Realiza a adição de dois números
     */
    public static double adicionar(double a, double b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    /**
     * Realiza a multiplicação de dois números
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números
     */
    public static double dividir(double a, double b) {
        return a / b;
    }
}
```

### Passo 6: Executar o Projeto para Teste

1. Clique com o botão direito sobre a classe Calculadora.java
2. Selecione **Run As > Java Application**
3. Teste a calculadora inserindo valores e operações no console

Parabéns! Você criou com sucesso um projeto Java simples no Eclipse. Na próxima parte, vamos aprender como conectar este projeto a um repositório no GitHub.

## Parte 2: Criação e Conexão com Repositório GitHub

Nesta segunda parte do tutorial, vamos criar um repositório no GitHub e conectá-lo ao nosso projeto Java no Eclipse. Esta é uma etapa fundamental para começar a versionar o código.

### Passo 1: Criar um Repositório no GitHub

1. Acesse [github.com](https://github.com) e faça login na sua conta
2. No canto superior direito, clique no ícone "+" e selecione "New repository"
3. Preencha os campos:
   - Repository name: `CalculadoraJava`
   - Description (opcional): `Projeto de calculadora para tutorial de versionamento`
   - Visibilidade: Public (para que outros possam ver) ou Private (apenas para convidados)
4. Marque a opção "Initialize this repository with a README"
5. Clique em "Create repository"

![Criação de Repositório no GitHub](tutorial_images/github_novo_repo.png)

### Passo 2: Configurar o Git no Eclipse

Antes de conectar o Eclipse ao GitHub, precisamos garantir que o Git esteja configurado corretamente:

1. No Eclipse, vá para **Window > Preferences**
2. No painel esquerdo, expanda "Team" e selecione "Git" > "Configuration"
3. Clique em "Add Entry" e adicione:
   - Key: `user.name`
   - Value: seu nome de usuário do GitHub
4. Clique em "Add Entry" novamente e adicione:
   - Key: `user.email`
   - Value: seu email cadastrado no GitHub
5. Clique em "Apply and Close"

![Configuração do Git no Eclipse](tutorial_images/eclipse_git_config.png)

### Passo 3: Compartilhar o Projeto com o GitHub

Agora vamos conectar nosso projeto local ao repositório remoto:

1. No Package Explorer, clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Share Project**
3. Na janela que se abre, selecione "Git" e clique em "Next"
4. Marque "Use or create repository in parent folder of project"
5. Selecione o projeto e clique em "Create Repository"
6. Clique em "Finish"

![Compartilhamento de Projeto no Git](tutorial_images/eclipse_share_project.png)

### Passo 4: Adicionar Arquivos ao Controle de Versão

Após criar o repositório local, precisamos adicionar os arquivos ao controle de versão:

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Add to Index**
3. Todos os arquivos do projeto serão marcados para serem adicionados ao Git

![Adicionando Arquivos ao Git](tutorial_images/eclipse_add_to_index.png)

### Passo 5: Realizar o Primeiro Commit

Vamos agora criar o primeiro commit (ponto de salvamento) do nosso projeto:

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Commit**
3. Na janela que se abre:
   - Verifique se todos os arquivos estão selecionados
   - Escreva uma mensagem de commit descritiva, como "Versão inicial da calculadora"
   - Clique em "Commit"

![Primeiro Commit no Git](tutorial_images/eclipse_commit.png)

### Passo 6: Conectar ao Repositório Remoto

Agora vamos conectar nosso repositório local ao repositório remoto no GitHub:

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Remote > Push**
3. Na janela "Push Branch", clique em "Add all branches spec"
4. Na seção "Destination", clique em "Change" para adicionar o repositório remoto
5. Na janela "Select a Git Repository", clique em "Add Remote"
6. Preencha:
   - Name: `origin` (nome padrão para o repositório principal)
   - URI: a URL do seu repositório no GitHub (algo como `https://github.com/seu-usuario/CalculadoraJava.git`)
   - Host: será preenchido automaticamente
   - Repository path: será preenchido automaticamente
   - Protocol: HTTPS
   - Preencha seu usuário e senha do GitHub
7. Clique em "Finish", depois em "Save", e finalmente em "Next"
8. Clique em "Finish" para concluir o push

![Conectando ao Repositório Remoto](tutorial_images/eclipse_push.png)

### Passo 7: Verificar o Repositório no GitHub

1. Acesse seu repositório no GitHub
2. Você deverá ver todos os arquivos do projeto que acabou de enviar
3. Clique no arquivo `Calculadora.java` para verificar se o código está lá

Parabéns! Você acabou de conectar seu projeto local ao GitHub e realizou seu primeiro push. Na próxima parte, vamos explorar os conceitos fundamentais de versionamento de código.

## Parte 3: Conceitos Fundamentais de Versionamento

Nesta parte do tutorial, vamos explorar os conceitos essenciais de versionamento de código que todo desenvolvedor deve conhecer. Compreender esses conceitos é fundamental para utilizar o Git e o GitHub de forma eficaz.

### O que é Versionamento de Código?

O versionamento de código é um sistema que registra as mudanças feitas em um arquivo ou conjunto de arquivos ao longo do tempo, permitindo que você recupere versões específicas posteriormente. Para desenvolvedores de software, isso significa poder controlar as mudanças no código-fonte, experimentar novas funcionalidades sem afetar o código principal e colaborar com outros desenvolvedores.

### Conceitos Fundamentais

#### 1. Repositório

Um **repositório** (ou repo) é o local onde o Git armazena todo o histórico do seu projeto, incluindo todos os arquivos e suas versões.

- **Repositório Local**: Existe na sua máquina e contém todo o histórico do projeto e arquivos.
- **Repositório Remoto**: Hospedado em um servidor (como o GitHub) e permite a colaboração entre múltiplos desenvolvedores.

![Estrutura de Repositórios](tutorial_images/repositorios.png)

#### 2. Commit

Um **commit** representa um conjunto de alterações salvas no repositório. Cada commit:
- Tem um identificador único (hash)
- Inclui uma mensagem descritiva
- Registra o autor e a data
- Mantém um histórico das alterações feitas

Boas práticas para mensagens de commit:
- Seja claro e conciso
- Use o tempo presente ("Adiciona função" em vez de "Adicionou função")
- Explique o que e por que, não como
- Limite a primeira linha a 50 caracteres
- Separe assunto do corpo com uma linha em branco

![Estrutura de Commits](tutorial_images/commits.png)

#### 3. Push

O comando **push** envia seus commits do repositório local para o repositório remoto, tornando suas alterações disponíveis para outros desenvolvedores.

```
Repositório Local → Repositório Remoto (GitHub)
```

#### 4. Pull

O comando **pull** obtém as alterações do repositório remoto e as mescla com seu repositório local, atualizando seu código com as contribuições de outros desenvolvedores.

```
Repositório Remoto (GitHub) → Repositório Local
```

#### 5. Branch

Um **branch** (ramo) é uma linha independente de desenvolvimento que permite trabalhar em funcionalidades ou correções sem afetar o código principal.

- **Branch principal** (geralmente chamado `main` ou `master`): contém o código estável e funcional
- **Feature branches**: criados para desenvolver novas funcionalidades
- **Hotfix branches**: criados para corrigir bugs urgentes

Benefícios do uso de branches:
- Desenvolvimento paralelo de múltiplas funcionalidades
- Isolamento de código experimental
- Facilidade para testar e revisar alterações antes de integrá-las ao código principal

![Estrutura de Branches](tutorial_images/branches.png)

#### 6. Merge

O **merge** é o processo de combinar as alterações de um branch com outro, geralmente para integrar uma nova funcionalidade ao branch principal.

Tipos de merge:
- **Fast-forward**: quando não há commits novos no branch de destino
- **Recursive**: quando ambos os branches têm novos commits (cria um commit de merge)

![Processo de Merge](tutorial_images/merge.png)

#### 7. Clone

O comando **clone** cria uma cópia local de um repositório remoto, incluindo todos os arquivos, branches e histórico de commits.

```
Repositório Remoto (GitHub) → Novo Repositório Local
```

#### 8. Fork

Um **fork** é uma cópia pessoal de um repositório de outra pessoa no GitHub. Permite que você experimente livremente sem afetar o projeto original.

Diferença entre fork e clone:
- **Fork**: cria uma cópia do repositório na sua conta do GitHub
- **Clone**: cria uma cópia local de um repositório (seu ou de outra pessoa)

![Fork vs Clone](tutorial_images/fork_clone.png)

#### 9. Pull Request

Um **Pull Request** (PR) é uma solicitação para que o proprietário de um repositório incorpore suas alterações. É o mecanismo principal para colaboração no GitHub.

Fluxo típico:
1. Fork do repositório original
2. Clone do seu fork
3. Criação de um branch para suas alterações
4. Commit das alterações
5. Push para seu fork
6. Criação de um Pull Request para o repositório original

Na próxima parte, vamos aplicar esses conceitos na prática, realizando operações comuns de versionamento no nosso projeto de calculadora.

## Parte 4: Operações Práticas de Versionamento

Nesta parte do tutorial, vamos aplicar os conceitos que aprendemos, realizando operações comuns de versionamento no nosso projeto de calculadora. Vamos explorar como fazer commits, criar branches, realizar merges e muito mais.

### Fluxo de Trabalho Básico com Git

#### Passo 1: Modificar o Código

Vamos adicionar uma nova funcionalidade à nossa calculadora: o cálculo de potência.

1. No Eclipse, abra o arquivo `Calculadora.java`
2. Adicione um novo método para calcular potência:

```java
/**
 * Calcula a potência de um número elevado a outro
 */
public static double potencia(double base, double expoente) {
    return Math.pow(base, expoente);
}
```

3. Agora, modifique o método `main` para incluir esta nova operação:
   - Adicione uma nova opção no menu:
   ```java
   System.out.println("5 - Potência");
   ```
   - Adicione um novo case no switch:
   ```java
   case 5:
       resultado = potencia(num1, num2);
       System.out.println("Resultado da potência: " + resultado);
       break;
   ```

4. Salve o arquivo (Ctrl+S)

#### Passo 2: Verificar as Alterações

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Show in Repositories View**
3. Na visualização Git, expanda o projeto e clique em "Working Tree"
4. Você verá o arquivo modificado com um ícone de alteração

![Verificando Alterações no Git](tutorial_images/git_changes.png)

#### Passo 3: Realizar um Commit

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Commit**
3. Na janela que se abre:
   - Verifique se o arquivo modificado está selecionado
   - Escreva uma mensagem de commit descritiva: "Adiciona funcionalidade de potência"
   - Clique em "Commit"

#### Passo 4: Enviar as Alterações para o GitHub

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Push to Upstream**
3. Confirme as informações e clique em "Preview"
4. Verifique os detalhes e clique em "Push"
5. Acesse seu repositório no GitHub para confirmar que as alterações foram enviadas

### Trabalhando com Branches

#### Passo 1: Criar um Novo Branch

Vamos criar um branch para desenvolver uma nova funcionalidade: o cálculo de raiz quadrada.

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Switch To > New Branch**
3. Na janela que se abre:
   - Digite o nome do branch: `feature-raiz-quadrada`
   - Mantenha selecionado "Configure upstream for push and pull"
   - Clique em "Finish"

![Criando um Novo Branch](tutorial_images/new_branch.png)

#### Passo 2: Implementar a Nova Funcionalidade

1. No Eclipse, abra o arquivo `Calculadora.java`
2. Adicione um novo método para calcular raiz quadrada:

```java
/**
 * Calcula a raiz quadrada de um número
 */
public static double raizQuadrada(double numero) {
    return Math.sqrt(numero);
}
```

3. Modifique o método `main` para incluir esta nova operação:
   - Adicione uma nova opção no menu:
   ```java
   System.out.println("6 - Raiz Quadrada");
   ```
   - Adicione um novo case no switch:
   ```java
   case 6:
       resultado = raizQuadrada(num1);
       System.out.println("Raiz quadrada de " + num1 + ": " + resultado);
       break;
   ```

4. Salve o arquivo (Ctrl+S)

#### Passo 3: Commit no Branch de Funcionalidade

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Commit**
3. Na janela que se abre:
   - Verifique se o arquivo modificado está selecionado
   - Escreva uma mensagem de commit: "Adiciona funcionalidade de raiz quadrada"
   - Clique em "Commit"

#### Passo 4: Push do Branch para o GitHub

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Push Branch**
3. Na janela que se abre, clique em "Next"
4. Verifique as informações e clique em "Finish"

#### Passo 5: Mesclar o Branch com o Main

Agora que nossa funcionalidade está pronta e testada, vamos mesclá-la com o branch principal:

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Switch To > main** (ou master, dependendo do nome do seu branch principal)
3. Clique com o botão direito no projeto novamente
4. Selecione **Team > Merge**
5. Na janela que se abre:
   - Selecione o branch `feature-raiz-quadrada`
   - Clique em "Merge"

![Realizando um Merge](tutorial_images/merge_branch.png)

#### Passo 6: Push das Alterações Mescladas

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Push to Upstream**
3. Confirme as informações e clique em "Preview"
4. Verifique os detalhes e clique em "Push"

### Visualizando o Histórico de Commits

1. Clique com o botão direito no projeto "CalculadoraJava"
2. Selecione **Team > Show in History**
3. Na visualização de histórico, você verá todos os commits realizados, incluindo:
   - O commit inicial
   - O commit da funcionalidade de potência
   - O commit da funcionalidade de raiz quadrada
   - O commit de merge

![Histórico de Commits](tutorial_images/commit_history.png)

Na próxima parte, vamos aprender como adicionar colaboradores ao projeto e como lidar com conflitos de versão.

## Parte 5: Colaboração e Resolução de Conflitos

Nesta parte do tutorial, vamos aprender como adicionar colaboradores ao seu repositório, como cada um pode clonar o projeto e, principalmente, como identificar e resolver conflitos de versão que surgem durante o desenvolvimento colaborativo.

### Adicionando Colaboradores ao Repositório

#### Passo 1: Convidar Colaboradores no GitHub

1. Acesse seu repositório no GitHub
2. Clique na aba "Settings" (Configurações)
3. No menu lateral esquerdo, clique em "Collaborators" (Colaboradores)
4. Clique no botão "Add people" (Adicionar pessoas)
5. Digite o nome de usuário, nome completo ou email do colaborador
6. Selecione o usuário na lista e clique em "Add [nome] to this repository" (Adicionar [nome] a este repositório)

![Adicionando Colaboradores](tutorial_images/add_collaborators.png)

O colaborador receberá um email com o convite para participar do repositório. Ele precisará aceitar o convite para ter acesso.

#### Passo 2: Definir Permissões de Acesso (Opcional)

Para repositórios em organizações, você pode definir diferentes níveis de permissão:
- **Read**: pode visualizar e clonar o repositório
- **Triage**: pode gerenciar issues e pull requests
- **Write**: pode enviar alterações (push)
- **Maintain**: pode gerenciar o repositório sem acesso a configurações sensíveis
- **Admin**: acesso completo, incluindo configurações sensíveis

### Como Colaboradores Podem Clonar o Projeto

#### Passo 1: Obter a URL do Repositório

1. Na página principal do repositório no GitHub, clique no botão verde "Code"
2. Copie a URL HTTPS ou SSH (dependendo de como você configurou sua autenticação)

#### Passo 2: Clonar o Repositório no Eclipse

Para os colaboradores que acabaram de ser adicionados ao projeto:

1. Abra o Eclipse
2. Selecione **File > Import**
3. Expanda "Git" e selecione "Projects from Git"
4. Clique em "Next"
5. Selecione "Clone URI" e clique em "Next"
6. Cole a URL do repositório no campo URI
7. Preencha suas credenciais do GitHub e clique em "Next"
8. Selecione os branches que deseja clonar (geralmente "main" ou todos) e clique em "Next"
9. Escolha o diretório local onde o projeto será clonado e clique em "Next"
10. Selecione "Import existing Eclipse projects" e clique em "Next"
11. Verifique se o projeto está selecionado e clique em "Finish"

![Clonando um Repositório](tutorial_images/clone_repository.png)

### Visualizando Contribuições de Cada Desenvolvedor

#### No GitHub

1. Acesse seu repositório no GitHub
2. Clique na aba "Insights"
3. No menu lateral, você pode explorar:
   - **Contributors**: mostra quem contribuiu, quantos commits, adições e exclusões
   - **Commits**: histórico completo de commits
   - **Code frequency**: gráfico de adições e exclusões ao longo do tempo
   - **Dependency graph**: visualização das dependências do projeto

![Visualizando Contribuições no GitHub](tutorial_images/github_insights.png)

#### No Eclipse

1. Clique com o botão direito no projeto
2. Selecione **Team > Show in History**
3. Na visualização de histórico, você pode:
   - Ver todos os commits, incluindo autor, data e mensagem
   - Clicar em um commit para ver as alterações específicas
   - Filtrar por autor ou período

Para ver quem modificou uma linha específica:

1. Clique com o botão direito em um arquivo
2. Selecione **Team > Show Blame Annotation**
3. O Eclipse mostrará, para cada linha, quem foi o último a modificá-la e em qual commit

![Blame Annotation no Eclipse](tutorial_images/blame_annotation.png)

### Trabalhando com Conflitos de Versão

Os conflitos de versão ocorrem quando duas pessoas modificam a mesma parte de um arquivo e o Git não consegue determinar automaticamente qual versão deve prevalecer.

#### Simulando um Conflito

Vamos simular um cenário de conflito entre dois desenvolvedores:

##### Desenvolvedor 1 (Você):

1. No Eclipse, certifique-se de estar no branch principal (main)
2. Abra o arquivo `Calculadora.java`
3. Modifique o método de potência:
```java
/**
 * Calcula a potência de um número elevado a outro
 * Versão otimizada
 */
public static double potencia(double base, double expoente) {
    // Implementação otimizada para casos especiais
    if (expoente == 0) return 1;
    if (expoente == 1) return base;
    return Math.pow(base, expoente);
}
```
4. Salve o arquivo, mas **não faça commit ainda**

##### Desenvolvedor 2 (Simulado):

Para simular o outro desenvolvedor, vamos criar um branch temporário:

1. Clique com o botão direito no projeto
2. Selecione **Team > Switch To > New Branch**
3. Nomeie o branch como "dev2-temp" e clique em "Finish"
4. Agora, no branch "dev2-temp", abra o mesmo arquivo `Calculadora.java`
5. Modifique o mesmo método de potência, mas de forma diferente:
```java
/**
 * Calcula a potência de um número elevado a outro
 * Com validação de entrada
 */
public static double potencia(double base, double expoente) {
    // Adicionando validação de entrada
    if (base == 0 && expoente < 0) {
        throw new ArithmeticException("Não é possível calcular 0 elevado a expoente negativo");
    }
    return Math.pow(base, expoente);
}
```
6. Salve o arquivo
7. Faça commit das alterações com a mensagem "Adiciona validação ao método de potência"
8. Volte para o branch principal: **Team > Switch To > main**

##### Criando o Conflito:

1. No branch principal, faça commit das suas alterações com a mensagem "Otimiza método de potência"
2. Agora, tente mesclar o branch "dev2-temp": **Team > Merge**
3. Selecione o branch "dev2-temp" e clique em "Merge"
4. O Eclipse indicará que há um conflito que precisa ser resolvido

#### Resolvendo o Conflito

Quando ocorre um conflito, o Eclipse marca o arquivo com um ícone especial e adiciona marcadores no código:

```java
<<<<<<< HEAD
/**
 * Calcula a potência de um número elevado a outro
 * Versão otimizada
 */
public static double potencia(double base, double expoente) {
    // Implementação otimizada para casos especiais
    if (expoente == 0) return 1;
    if (expoente == 1) return base;
    return Math.pow(base, expoente);
}
=======
/**
 * Calcula a potência de um número elevado a outro
 * Com validação de entrada
 */
public static double potencia(double base, double expoente) {
    // Adicionando validação de entrada
    if (base == 0 && expoente < 0) {
        throw new ArithmeticException("Não é possível calcular 0 elevado a expoente negativo");
    }
    return Math.pow(base, expoente);
}
>>>>>>> dev2-temp
```

Para resolver o conflito:

1. Clique com o botão direito no arquivo com conflito
2. Selecione **Team > Merge Tool**
3. O Eclipse abrirá uma ferramenta de mesclagem com três painéis:
   - Esquerda: sua versão (HEAD)
   - Direita: versão do outro desenvolvedor
   - Centro: resultado final após a resolução

4. Você pode:
   - Clicar nos botões "Copy from left" ou "Copy from right" para escolher uma versão
   - Editar manualmente o painel central para combinar as alterações

5. Para este exemplo, vamos combinar as duas implementações:
```java
/**
 * Calcula a potência de um número elevado a outro
 * Versão otimizada com validação de entrada
 */
public static double potencia(double base, double expoente) {
    // Adicionando validação de entrada
    if (base == 0 && expoente < 0) {
        throw new ArithmeticException("Não é possível calcular 0 elevado a expoente negativo");
    }
    
    // Implementação otimizada para casos especiais
    if (expoente == 0) return 1;
    if (expoente == 1) return base;
    
    return Math.pow(base, expoente);
}
```

6. Após resolver o conflito, clique em "Apply" e feche a ferramenta de mesclagem
7. Faça commit das alterações mescladas: **Team > Commit**
8. Escreva uma mensagem descritiva: "Mescla otimizações e validações no método de potência"
9. Clique em "Commit" e depois faça push para o repositório remoto

![Resolvendo Conflitos no Eclipse](tutorial_images/resolve_conflict.png)

### Boas Práticas para Evitar Conflitos

1. **Comunicação constante**: Mantenha a equipe informada sobre quais arquivos você está modificando
2. **Pull frequente**: Faça pull regularmente para manter seu repositório local atualizado
3. **Commits pequenos e frequentes**: Evite grandes commits que modificam muitos arquivos
4. **Branches para funcionalidades**: Crie branches separados para cada funcionalidade
5. **Divisão clara de tarefas**: Evite que múltiplos desenvolvedores trabalhem no mesmo arquivo simultaneamente
6. **Arquitetura modular**: Projete seu código de forma modular para minimizar sobreposições

## Parte 6: Atividade Prática e Conclusão

Nesta última parte do tutorial, vamos consolidar o aprendizado com uma atividade prática completa e apresentar algumas dicas finais para o uso eficiente do Git e GitHub em seus projetos acadêmicos e profissionais.

### Atividade Prática: Projeto Colaborativo

#### Preparação do Projeto Modelo

Como professor, você pode preparar um projeto modelo para compartilhar com os alunos. Vamos criar um exemplo simples:

1. Crie um novo projeto Java no Eclipse chamado "CalculadoraColaborativa"
2. Crie um pacote "com.tutorial.calculadora"
3. Crie uma classe principal chamada "CalculadoraEquipe" com o seguinte código:

```java
package com.tutorial.calculadora;

import java.util.Scanner;

/**
 * Calculadora Colaborativa - Projeto para prática de Git/GitHub
 * 
 * Este projeto será modificado por todos os membros da equipe.
 * Cada aluno deve adicionar:
 * 1. Seu nome como colaborador nos comentários
 * 2. Uma nova operação matemática
 */
public class CalculadoraEquipe {
    
    // Lista de colaboradores
    // Adicione seu nome abaixo como comentário
    // Colaborador 1: Professor
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("=== Calculadora Colaborativa ===");
        System.out.println("Desenvolvida pela turma de Engenharia de Software");
        
        while (continuar) {
            exibirMenu();
            
            System.out.print("Escolha uma operação: ");
            int opcao = scanner.nextInt();
            
            if (opcao == 0) {
                continuar = false;
                System.out.println("Encerrando calculadora. Até mais!");
                continue;
            }
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            // Para operações que precisam de segundo número
            double num2 = 0;
            if (opcao != 5) { // Supondo que a opção 5 seja uma operação com um único número
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            }
            
            executarOperacao(opcao, num1, num2);
            
            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine(); // Consumir a quebra de linha
            scanner.nextLine(); // Aguardar Enter
        }
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\nOperações disponíveis:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        // Cada aluno adicionará uma nova operação aqui
        System.out.println("0 - Sair");
    }
    
    private static void executarOperacao(int opcao, double num1, double num2) {
        switch (opcao) {
            case 1:
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", 
                        num1, num2, adicao(num1, num2));
                break;
            case 2:
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", 
                        num1, num2, subtracao(num1, num2));
                break;
            case 3:
                System.out.printf("Resultado: %.2f * %.2f = %.2f\n", 
                        num1, num2, multiplicacao(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", 
                            num1, num2, divisao(num1, num2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            // Cada aluno implementará seu case aqui
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    // Implementação das operações básicas
    
    /**
     * Realiza a adição de dois números
     * @author Professor
     */
    public static double adicao(double a, double b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números
     * @author Professor
     */
    public static double subtracao(double a, double b) {
        return a - b;
    }
    
    /**
     * Realiza a multiplicação de dois números
     * @author Professor
     */
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números
     * @author Professor
     */
    public static double divisao(double a, double b) {
        return a / b;
    }
    
    // Cada aluno adicionará sua função aqui
}
```

4. Crie um repositório no GitHub para este projeto
5. Conecte o projeto local ao repositório remoto
6. Faça o commit inicial e push para o GitHub

