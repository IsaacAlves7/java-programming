<a href="https://github.com/IsaacAlves7/java-programming"><img src="https://training.infnet.edu.br/wp-content/uploads/sites/18/2019/02/desenvolvedor-java.jpg"/></a>

# It's a repository of Java language ☕

> ☕ **Preparação**: Para este conteúdo, o aluno deverá dispor de um computador com acesso à internet, um web browser com suporte a HTML 5 (Google Chrome, Mozilla Firefox, Microsoft Edge, Safari, Opera etc.), um editor de texto ou IDE (VSCode etc.) e o software JDK, com a versão mais recente, instalado na sua máquina local.

<a href="https://github.com/IsaacAlves7/java-programming"><div align="center"><img src="https://sd.keepcalms.com/i/keep-calm-and-code-java-2.png" height="177"/></div></a>

- https://glysns.gitbook.io/java
- https://glysns.gitbook.io/java-basico/
- https://glysns.gitbook.io/spring-framework/

<!-- ![duke_badge](https://user-images.githubusercontent.com/61624336/183478203-20b992ae-b018-448a-bd56-e2fae9c5f7ae.svg) -->

# 🐒 Linguagem de programação
<div align="center"><img src="https://user-images.githubusercontent.com/61624336/112900537-065ce480-90ba-11eb-86f7-f9006445876a.png"></div>

Um **programa** é um conjunto de instruções, também conhecidas como **algoritmos**, que descrevem uma tarefa a ser realizada por um computador. O termo pode ser uma referência ao **código fonte**, escrito em alguma linguagem de programação, ou ao arquivo que contém a forma executável deste código fonte. Um programa torna um computador utilizável, sem ele um computador, mesmo o mais poderoso, nada mais é do que um objeto.

Os **computadores** são capazes de executar tarefas muito complexas, mas essa capacidade não lhes é inata. A natureza de um computador é bastante diferente. Ele só pode executar operações extremamente simples, por exemplo, um computador não pode avaliar o valor de uma função matemática complicada por si só, embora isto não esteja fora do âmbito das possibilidades num futuro próximo.

> Os **computadores contemporâneos** só podem avaliar os resultados de operações muito fundamentais, como adicionar ou dividir, mas podem fazê-lo muito rapidamente, e podem repetir estas ações virtualmente um qualquer número de vezes.

Imagine que quer saber a velocidade média que alcançou durante uma longa viagem. Sabe a distância, sabe o tempo, precisa da velocidade. Naturalmente, o computador será capaz de calcular isto, mas o computador não está ciente de coisas como distância, velocidade ou tempo. Portanto, é necessário instruir o computador a:

- Aceitar um número que represente a distância;
- Aceitar um número que represente o tempo de viagem;
- Dividir o valor anterior pelo último e armazenar o resultado na memória;
- Exibir o resultado (representando a velocidade média) num formato legível.

Estas quatro simples ações formam um **programa**. É claro que estes exemplos não são formalizados, e estão muito longe do que o computador pode compreender, mas são suficientemente bons para serem traduzidos para uma **linguagem** que o computador possa aceitar.

Uma **Linguagem (Language)**, nossa palavra-chave, é um meio (e uma ferramenta) para expressar e registar pensamentos. Há muitas linguagens ao nosso redor e algumas delas não requerem nem a fala nem a escrita, como a *linguagem corporal*; é possível expressar os seus sentimentos mais profundos com muita precisão sem dizer uma palavra.

Outra linguagem que usa diariamente é a sua *língua materna*, que usa para manifestar a sua vontade e para pensar na realidade. Os computadores também têm a sua própria linguagem, chamada **linguagem de máquina**, que é muito rudimentar.

### Machine code - Linguagem de máquina
O **código de máquina** ou **linguagem de máquina** é uma linguagem de programação de baixo nível, constituída por dígitos/bits binários que o computador lê e compreende, ou seja, é um conjunto de instruções executadas diretamente pela unidade de processamento central (CPU) de um computador. Cada instrução executa uma tarefa muito específica, como uma carga, um salto ou uma operação ALU em uma unidade de dados em um registrador ou memória da CPU. Todo programa executado diretamente por uma CPU é composto por uma série de tais instruções.

O **código de máquina numérico** pode ser considerado como a representação de nível ainda mais baixo de um programa de computador compilado e/ou montado ou como uma linguagem de programação primitiva e dependente de hardware. Embora seja possível escrever programas diretamente em código de máquina numérico, é tedioso e propenso a erros gerenciar bits individuais e calcular endereços numéricos e constantes manualmente. Portanto, raramente é feito hoje, exceto em situações que exigem otimização ou depuração extremas.

> 🙉 **Nota**: O código de máquina numérico não é o código ou linguagem de montagem, conhecida como **Assembly** ou Assembler, cujo é uma linguagem de programação de baixo-nível superior. 

[![machine](https://img.shields.io/badge/-machine_code-fff?style=social&logo=AirPlay-Video&logoColor=000000)](#)

```machine
010010101010010
010010100110100
010101100111010
010101010101011
010101010100101
010101010010111
```

> 🙉 **Nota**: as linguagens de máquina são desenvolvidas por humanos e não pela própria máquina.

> Um computador, mesmo o mais sofisticado tecnicamente, é desprovido até mesmo de um vestígio de **inteligência**. Esse é um assunto muito abordado quando estudamos para Inteligência Artifical e Machine Learning.

Pode-se dizer que é como um 🐵 *macaco* bem treinado - responde apenas a um conjunto pré-determinado de comandos conhecidos. Os comandos que reconhece são muito simples. Podemos imaginar que o computador responde a ordens como "pega nesse número, divide-o por outro e guarda o resultado".

Um conjunto completo de comandos conhecidos é chamado de **lista de instruções**, por vezes abreviado para **IL** (do inglês, **Instruction List**). Os diferentes tipos de computadores podem variar em função do tamanho das suas IL, e as instruções podem ser completamente diferentes em diferentes modelos.

Atualmente, nenhum computador é capaz de criar uma nova linguagem. No entanto, isso pode mudar em breve. Por outro lado, as pessoas também utilizam uma série de línguas muito diferentes, mas estas línguas desenvolveram-se naturalmente. Além disso, ainda estão a evoluir. São criadas novas palavras todos os dias e as palavras antigas desaparecem. Estas línguas são chamadas **linguagens naturais**.

Podemos dizer que cada linguagem (de máquina ou natural, não importa) é constituída pelos seguintes elementos:

- um **alfabeto**: um conjunto de símbolos utilizados para construir palavras de uma determinada linguagem (por exemplo, o alfabeto latino para inglês, o alfabeto cirílico para russo, o Kanji para japonês, etc.)
- um **lexis**: (ou seja, um dicionário) um conjunto de palavras que a linguagem oferece aos seus utilizadores (por exemplo, a palavra "computador" vem do dicionário de língua inglesa, enquanto que "cmoptrue" não; a palavra "chat" está presente tanto nos dicionários de inglês como de francês, mas os seus significados são diferentes)
- uma **sintaxe**: um conjunto de regras (formais ou informais, escritas ou sentidas intuitivamente) utilizadas para determinar se uma determinada sequência de palavras forma uma frase válida (por exemplo, "Eu sou uma pitão" é uma frase sintaticamente correta, enquanto "Eu uma pitão sou" não é)
- **semântica**: um conjunto de regras que determinam se uma determinada frase faz sentido (por exemplo, "Comi um donut" faz sentido, mas "Um donut comeu-me" não faz)

O **IL** é, de facto, **o alfabeto de uma linguagem de máquina**. Este é o conjunto mais simples e primário de símbolos que podemos utilizar para dar comandos a um computador. É a língua materna do computador.

Infelizmente, esta língua está muito longe de ser uma língua materna humana. Todos nós (tanto computadores como humanos) precisamos de algo mais, uma linguagem comum para computadores e humanos, ou uma ponte entre os dois mundos diferentes.

<img src="https://estacio.webaula.com.br/cursos/go0374/galeria/aula1/img/figura1.svg" align="right" height="377" title="Figura 1: Processo de compilação de um programa escrito na linguagem C">

> Precisamos de uma linguagem em que os humanos possam escrever os seus programas e uma linguagem que os computadores possam utilizar para executar os programas, uma linguagem que seja muito mais complexa do que a linguagem das máquinas e, no entanto, muito mais simples do que a linguagem natural.

Tais linguagens são muitas vezes chamadas **linguagens de programação de alto nível**. São pelo menos um pouco semelhantes aos naturais na medida em que utilizam símbolos, palavras e convenções legíveis para os seres humanos. Estas linguagens permitem aos seres humanos expressar comandos a computadores que são muito mais complexos do que os oferecidos pelas ILs.

Um *programa* escrito numa *linguagem de programação de alto nível* é chamado **source code**, também conhecido como *código-fonte* (em contraste com o *ee* executado por computadores). Da mesma forma, o ficheiro que contém o *source code* chama-se **source file**, també conhecido como *arquivo-fonte*.

A programação informática é o ato de compor os elementos da linguagem de programação selecionada pela ordem que provocará o efeito desejado. O efeito pode ser diferente em cada caso específico - depende da imaginação, conhecimento e experiência do programador.

É claro que tal composição tem de ser correta em muitos sentidos:

- **alfabeticamente** - um programa precisa de ser escrito num guião reconhecível, tal como romano, cirílico, etc.
- **lexicamente** - cada linguagem de programação tem o seu dicionário e é preciso dominá-lo; felizmente, é muito mais simples e menor do que o dicionário de qualquer língua natural;
- **sintaticamente** - cada linguagem tem as suas regras, e estas devem ser obedecidas;
- **semanticamente** - o programa tem de fazer sentido.

Infelizmente, um programador também pode cometer erros com cada um dos quatro sentidos acima referidos. Cada um deles pode fazer com que o programa se torne completamente inútil. 

Vamos supor que tenha escrito um programa com sucesso. Como persuadir o computador a executá-lo? Tem de transformar o seu programa em linguagem de máquina. Felizmente, a tradução pode ser feita pelo próprio computador, tornando todo o processo rápido e eficiente.

Há duas formas diferentes de transformar um programa de uma linguagem de programação de alto nível em linguagem de máquina:

- **COMPILAÇÃO** - o source program é traduzido uma vez (no entanto, este ato deve ser repetido sempre que modificar o source code) obtendo um ficheiro (por exemplo, um `ficheiro.exe` se o código se destinar a ser executado no MS Windows) contendo o machine code; agora pode distribuir o ficheiro por todo o mundo; o programa que executa esta tradução chama-se **compilador** ou **tradutor**;

- **INTERPRETAÇÃO** - você (ou qualquer utilizador do código) pode traduzir o source program cada vez que este tem de ser executado; o programa que executa este tipo de transformação chama-se **intérprete** ou **interpretador**, pois interpreta o código cada vez que se pretende executá-lo; também significa que não pode simplesmente distribuir o source code tal como está, porque o utilizador final também precisa do intérprete para o executar.

> 🍌 **Aprenda mais**: O interpretador converte para código de máquina, em tempo de execução. O compilador traduz o programa inteiro em código de máquina e o executa, gerando um arquivo que pode ser executado. O compilador gera um relatório de erros e o interpretador interrompe o processo na medida em que localiza um erro.

Devido a algumas razões muito fundamentais, uma linguagem de programação particular de alto nível foi concebida para se enquadrar numa destas duas categorias.

Há muito poucas linguagens que possam ser compiladas e interpretadas. Normalmente, uma linguagem de programação é projetada com este fator na mente dos seus construtores - será ela compilada ou interpretada?

Vamos assumir mais uma vez que escreveu um programa. Agora, existe como um **ficheiro de computador** (computer file): um programa de computador é na realidade um pedaço de texto, por isso o source code é normalmente colocado em **ficheiros de texto** (text files).

> 🙉 **Nota**: tem de ser **texto puro**, sem quaisquer decorações como diferentes fontes, cores, imagens embutidas ou outros suportes. Agora tem de invocar o intérprete e deixá-lo ler o seu source file.

O intérprete lê o source code de uma forma que é comum na cultura ocidental: de cima para baixo e da esquerda para a direita, porém há algumas exceções.

Em primeiro lugar, o intérprete verifica se todas as linhas subsequentes estão corretas (utilizando os quatro aspetos abordados anteriormente). Se o compilador encontrar um erro, termina o seu trabalho imediatamente. O único resultado, neste caso, é uma **mensagem de erro**.

O intérprete informá-lo-á onde se encontra o erro e o que o causou. No entanto, estas mensagens podem ser enganadoras, uma vez que o intérprete não é capaz de seguir exatamente as suas intenções, e pode detectar erros a alguma distância das suas verdadeiras causas.

Por exemplo, se tentar utilizar uma entidade com um nome desconhecido, causará um erro, mas o erro será descoberto no local onde tenta utilizar a entidade, e não onde o nome da nova entidade foi introduzido.

<img src="https://user-images.githubusercontent.com/61624336/194624188-26a61771-a2b5-4908-9307-0ef35bdcad68.png" align="right" height="177" title="Diagrama de funcionamento de um interpretador">

Por outras palavras, a razão real está normalmente localizada um pouco mais cedo no código, por exemplo, no local onde teve de informar o intérprete de que ia utilizar a entidade do nome.

Se a linha parecer boa, o intérprete tenta executá-la (nota: cada linha é normalmente executada separadamente, pelo que o trio "read-check-execute" pode ser repetido muitas vezes - mais vezes do que o número real de linhas no source file, uma vez que algumas partes do código podem ser executadas mais de uma vez).

É também possível que uma parte significativa do código possa ser executada com sucesso antes de o intérprete encontrar um erro. Este é um comportamento normal neste modelo de execução.

Pode perguntar agora: o que é melhor? O modelo "compilador" ou o modelo "intérprete"? Não há uma resposta óbvia. Se houvesse, um destes modelos já teria deixado de existir há muito tempo. Ambos têm as suas vantagens e as suas desvantagens.

<div align="center">
<table>
  <tr>
    <th colspan="2">Vantagens</th>
  </tr>
  <tr>
    <td><b>COMPILAÇÃO</b></td>
    <td><b>INTERPRETAÇÃO</b></td>
  </tr>
  <tr>
    <td>A execução do código traduzido é geralmente mais rápida;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Apenas o utilizador tem de ter o compilador - o end-user (utilizador final) pode usar o código sem ele;</td>
    <td>Pode executar o código assim que o concluir - não há fases adicionais de tradução;</td>
  </tr>
  <tr>
    <td>O código traduzido é armazenado utilizando linguagem de máquina - como é muito difícil de entender, as suas próprias invenções e truques de programação provavelmente permanecerão segredo.</td>
    <td>o código é armazenado usando linguagem de programação, não de máquina - isto significa que pode ser executado em computadores utilizando diferentes linguagens de máquina; não se compila o código separadamente para cada arquitetura diferente.</td>
  </tr>
</table>
</div>

<div align="center">
<table>
  <tr>
    <th colspan="2">Desvantagens</th>
  </tr>
  <tr>
    <td><b>COMPILAÇÃO</b></td>
    <td><b>INTERPRETAÇÃO</b></td>
  </tr>
  <tr>
    <td>A compilação em si pode ser um processo muito demorado - pode não ser capaz de executar o seu código imediatamente após qualquer alteração;</td>
    <td>Não espere que a interpretação aumente o seu código para alta velocidade - o seu código irá partilhar o poder do computador com o intérprete, pelo que não pode ser realmente rápido;
</td>
  </tr>
  <tr>
    <td>Tem de ter tantos compiladores quanto plataformas de hardware em que queira que o seu código seja executado.</td>
    <td>Tanto você como o end-user têm de ter o intérprete para executar o seu código.</td>
  </tr>
</table>
</div>

Hoje em dia, o desenvolvimento de sistemas se baseia em vários e diferentes paradigmas, tais como os listados a seguir:

- **Imperativo (Procedural)**: Segue sequências de comandos ordenados segundo uma lógica.
- **Funcional**: Trabalha com a divisão de problemas através de funções, que resolvem separadamente problemas menores e que, ao serem organizados, resolvem o problema como um todo.
- **Lógico**: Voltado ao desenvolvimento de problemas de lógica e usado em sistemas de inteligência computacional.
- **Orientado a Objetos (OO)**: Define um conjunto de classes para dividir o problema e realiza a interação entre as diferentes classes para também resolver o problema como um todo.

# 🐵 Sistemas Híbridos
O **processo híbrido** de implementação de uma linguagem de programação combina a execução rápida dos tradutores (compiladores) com a portabilidade dos interpretadores. O segredo é a geração de um código intermediário mais facilmente interpretável, porém não preso a uma plataforma (SO/Hardware).

Esse código intermediário não é específico para uma plataforma, possibilitando aos programas já compilados para esse código serem portados em diferentes plataformas, sem alterar e nem fazer nada. Para cada plataforma desejada devemos ter um interpretador desse código.

<blockquote>Duas importantes linguagens implementaram essa solução, com diferentes formas usando máquinas virtuais: <b>Python</b> e <b>Java</b>.</blockquote>

<h1>☕ Tecnologia Java</h1>

<div align="center"><img src="https://cdn.worldvectorlogo.com/logos/java-100-pure.svg" height="270"></div><br \>

**Java** é o ambiente computacional, ou plataforma, criada pela empresa estadunidense *Sun Microsystems*, e vendida para a *Oracle* depois de alguns anos. A plataforma permite desenvolver programas utilizando a linguagem de programação Java.

# ☕ History of Java Language
<div align="center"><img src="https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/120/apple/271/deciduous-tree_1f333.png" height="170" title="Oak, before of Java"><img src="https://cdn.worldvectorlogo.com/logos/java-duke.svg" height="170" title="Duke, the Java Mascot"><img src="https://cdn.worldvectorlogo.com/logos/java-1.svg" height="170"><img src="https://cdn.worldvectorlogo.com/logos/java.svg" height="170"></div><br \>

A tecnologia **Java** foi desenvolvida na década de 1990, a partir de um projeto pessoal de um funcionário da **Sun Microsystems**. A ideia inicial estava ligada à criação de uma linguagem de programação que pudesse ser utilizada em diferentes sistemas, alterando o paradigma de que uma aplicação só poderia ser desenvolvida para uso em um único ambiente de hardware e sistema operacional, como era bastante comum na época.

As grandes empresas desenvolviam suas aplicações voltadas para seu ambiente de hardware e software (sistema operacional - SO), e estas aplicações não eram capazes de serem executadas em diferentes plataformas, principalmente de outros fabricantes. Se analisarmos a linguagem C, criada junto com o sistema operacional UNIX, temos uma biblioteca muito vasta de funções, mas poucas são consideradas padrão para atender a diferentes sistemas; e, mesmo assim, uma aplicação compilada em um sistema operacional (ambiente) não pode ser executada em outro.

A linguagem Java rompeu este paradigma e passou a permitir que uma aplicação desenvolvida em um ambiente - hardware + software (SO) - possa ser executada em outro sem necessidade de qualquer outro procedimento. A Sun Microsystems, ao tomar conhecimento desta ideia, deu total apoio ao seu desenvolvimento e criou um grupo com 13 membros, liderado por James Gosling, que passaram a trabalhar exclusivamente neste projeto. A equipe foi batizada de “Green Team” e o grupo passou a trabalhar em um conjunto de escritórios fora das dependências físicas da Sun, e sem qualquer tipo de comunicação com a matriz, durante 18 meses para a concretização desta ideia.

Com a tecnologia Java, as aplicações passaram a ser portáveis de um sistema para o outro, sem nenhuma necessidade de alteração. Por isso, afirmamos que a portabilidade é uma das mais importantes características da linguagem Java.

Ainda naquela época, o grupo já havia antecipado uma nova onda na computação, na convergência entre dispositivos controlados digitalmente e computadores. Hoje em dia, percebemos bem isso quando analisamos um smartphone, um dispositivo digital que possui inúmeras funções de computadores; entre elas, podemos destacar a execução de aplicativos. Inicialmente, a linguagem foi batizada de **Oak**, pois o grupo tinha como vista da janela do escritório *um carvalho*. Posteriormente, a linguagem foi rebatizada como **Java**, em função do *gosto do grupo pelo tipo de café*. Por isso, temos como ícone da linguagem uma xícara de café com sua fumaça característica.

A linguagem é muito poderosa para o desenvolvimento de aplicações, seja para o desenvolvimento de aplicações menos sofisticadas ou para uso em dispositivos menos complexos que computadores, conhecidos como dispositivos inteligentes, tais como cafeteiras, micro-ondas, geladeiras e uma gama de outros dispositivos que possam ser controlados por software. A linguagem ainda é muito eficiente no desenvolvimento de sistemas de entretenimento doméstico, dando suporte a streaming de vídeo e televisão digital, que ainda não era tão desenvolvida na época.

A tecnologia Java permite ainda o desenvolvimento de todos os tipos de aplicações, indo do mais simples controle de um eletrodoméstico, passando por aplicações domésticas, comerciais, de automação, até o desenvolvimento de aplicações mais complexas, com comunicação de dados e aplicações para supercomputadores.

A linguagem Java teve início ao incorporar a tecnologia Java ao navegador de internet *Netscape navigator*, em sua versão de 1995. A tecnologia ganhou a aceitação do mercado e dos desenvolvedores, sendo uma das mais importantes linguagens de programação para o desenvolvimento de sistemas. São dezenas de milhões de desenvolvedores Java no mundo e, atualmente, esta tecnologia é encontrada em supercomputadores, servidores, desktops, notebooks, máquinas de cartões de crédito e débito, robôs, automóveis, jogos eletrônicos, bem como uma gama de dispositivos digitais, redes e demais tecnologias de programação. A linguagem Java ainda é a linguagem nativa para o desenvolvimento de aplicações para o Android (sistema operacional para smartphones).

A tecnologia Java foi totalmente gratuita por muito tempo, mas recentemente a Oracle, que passou a deter os direitos da linguagem após adquirir a Sun Microsystems, está licenciando o uso para empresas com custos. A empresa deve permitir o licenciamento gratuito somente para desenvolvedores avulsos que criam aplicações pessoais sem custo ou para simples aprendizado.

## Principais características e vantagens da tecnologia Java
- Orientada a objetos, com uma grande diversidade de bibliotecas de classes disponível;
- Independe de plataforma: write once, run everywhere ;
- Segurança - Mecanismos para sistemas livres de vírus, pacotes para criptografia;
- Simplicidade;
- Sintaxe dos comandos básicos segue o padrão do C;
- Sintaxe da parte OO bem mais simples que o C++;
- Internacionalização;
- Unicode: padrão que permite manipular textos de qualquer sistema de escrita;
- Robustez;
- Tratamento de exceções;
- JVM (Java Virtual Machine) impede que uma aplicação mal comportada paralise o sistema;
- Distribuída e multitarefa;
- Os programas podem utilizar recursos da rede com a mesma facilidade que acessam arquivos locais;
- Trabalha com diversos protocolos (TCP/IP, HTTP, FTP);
- Execução simultânea de múltiplas threads;
- Gerenciamento de memória;
- Memória virtual gerenciada pela JVM (Java Virtual Machine);
- Garbage collection (limpeza de memória);
- Desempenho;
- Mais rápida que linguagens de script, porém mais lenta que as linguagens compiladas puras;
- Hoje, os problemas de desempenho são resolvidos com compilação just-in-time.

# 🏗️ Sistema de implementação do Java
<div align="center"><img src="https://luizgustavoss.files.wordpress.com/2009/02/api_jse.png" height="377"></div><br />

De forma geral, entendemos que plataforma (ambiente de execução) é composta por hardware + software básico (sistema operacional).

A plataforma Java é definida apenas em software e possui dois componentes:

- **Máquina Virtual Java** (JVM - Java Virtual Machine);
- **Conjunto de bibliotecas que disponibilizam classes comuns**.

## API Java
<div align="center"><img src="https://user-images.githubusercontent.com/61624336/113073382-5e214b80-919f-11eb-8141-93ea67a402dc.png" height="377"></div>

"Diferentemente das linguagens convencionais, que são compiladas para código nativo, a linguagem Java é compilada para "bytecode" (gerando o <code>.class</code> ou <code>.jar</code>), que é executado por uma máquina virtual Java (JVM - Java Virtual Machine)."

<div align="center"><img src="https://user-images.githubusercontent.com/61624336/112760358-0b903580-8fcd-11eb-9e08-46f78186e835.png" height="170"><img src="https://user-images.githubusercontent.com/61624336/112760365-164aca80-8fcd-11eb-9d83-4b7ee0043b5f.jpg" height="170"></div>

O modelo inicial era interpretado. Já o atual trocou a etapa do interpretador por uma 2ª compilação (compilador JIT, isto é, just-in-time).

A tecnologia Java é composta por três plataformas:

<img src="https://cdn.worldvectorlogo.com/logos/jee-2.svg" height="177" align="right">

- **J2SE** ou **Java SE (Java Standard Edition)**: base da plataforma, inclui o ambiente de execução e as bibliotecas comuns;
- **J2EE** ou **Java EE (Java Enterprise Edition)**: versão voltada para o desenvolvimento de aplicações corporativas e aplicações web;
- **J2ME** ou **Java ME (Java Micro Edition)**: versão voltada para o desenvolvimento de aplicações móveis ou embarcadas.

## Ambiente de desenvolvimento
Existem os ambientes JDK e JRE para construir e executar uma aplicação Java.

## Java Development Kit (JDK)
Coleção de programas para, dentre outras tarefas, compilar e executar aplicações Java. Este é o kit necessário para o desenvolvedor, pois contém todo o suporte para a criação de aplicações em Java.

Exemplo:
- Javac (compilador Java);
- Javadoc (utilitário para documentação);
- Java;
- Outros.

## Java Runtime Environment (JRE)
<img src="https://user-images.githubusercontent.com/61624336/171005805-d123b7c1-89e6-492c-9d03-3dcafb40142e.png" align="right" height="177">

Kit com todos os programas necessários para executar aplicações Java. Faz parte do JDK, mas pode ser instalado separadamente para execução em máquinas clientes, uma vez que o JDK é voltado para os desenvolvedores. O JRE pode ser instalado separadamente e dá suporte somente a execução de aplicações ou jogos como o Minecraft, por isso é a versão mais indicada para instalação nas máquinas clientes que apenas executarão aplicações, não sendo responsáveis pelo seu desenvolvimento.

## Fases de um programa em linguagem Java
![img01](https://user-images.githubusercontent.com/61624336/112771689-6c3a6500-9003-11eb-8436-1bda07a25ea3.jpg)

O código de um programa Java é compilado apenas uma vez, gerando um código intermediário, o **bytecode**, que pode ser executado quantas vezes forem necessárias em qualquer ambiente que possua uma máquina virtual Java (JVM) disponível.

Inicialmente a tecnologia Java realizava uma interpretação completa do bytecode, mas atualmente o interpretador realiza uma compilação **just-in-time** (compila o bytecode para o ambiente onde ocorrerá a execução), permitindo aumentar o desempenho da aplicação.

<div align="center"><img src="https://aprendafazer.net/wp-content/uploads/2019/10/NetBeans-1.png" height="170"></div>

Para o desenvolvimento de aplicações em Java é comum o uso de ferramentas IDEs (Integrated Development Environment), que facilitam a codificação e a realização de testes, sendo as mais conhecidas:
  
- Eclipse;
- NetBeans;
- IntelliJ;
- BlueJ.

Você pode usar qualquer tipo de ambiente, se preferir um editor de texto como um bloco de notas ou um VSCode você precisa usar a extensão `.java`.

# ☕ Ambiente de programação
<div align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/9/98/Apache_NetBeans_Logo.svg" height="170">&nbsp;&nbsp;<img src="https://cdn.worldvectorlogo.com/logos/eclipse-11.svg" height="170"></div><br \>

Existem várias ferramentas para o desenvolvimento de sistemas utilizando a linguagem Java, mas os desenvolvedores têm preferência pelos IDEs **Netbeans** e **Eclipse**. Ambos são gratuitos e podem ser adquiridos pela internet através de download.

É importante que você já tenha instalado o JDK antes de instalar o seu IDE escolhido (Netbeans ou Eclipse). Assista o vídeo: 

## NetBeans
<div align="center"><a href="https://netbeans.apache.org/download/index.html"><img src="https://upload.wikimedia.org/wikipedia/commons/9/98/Apache_NetBeans_Logo.svg" height="170" title="Click to install!"></a></div>

Existem dois arquivos diferentes: o primeiro, com o source, contém os códigos fonte no Netbeans e não é o ideal para trabalharmos o desenvolvimento. A versão adequada para nós é a versão bin, que contém todos os códigos já compilados e prontos para a execução e desenvolvimento de projetos e aplicações Java.

## Eclipse
<div align="center"><a href="https://www.eclipse.org/downloads/"><img src="https://cdn.worldvectorlogo.com/logos/eclipse-11.svg" height="170" title="Click to install!"></a></div>

Você não precisa instalar as duas, pois ambas são concorrentes e desempenham as mesmas funcionalidades. A preferência é a critério do programador.

A linguagem Java possui uma base de construção semelhante à linguagem C e, por isso, boa parte de sua estrutura e sintaxe se assemelha a ela. Desta forma, programadores com conhecimento nesta linguagem tem grande facilidade com a sintaxe da linguagem Java. Outra importante semelhança está nas estruturas de controle de fluxo, que são construídas da mesma forma em ambas as linguagens.

<blockquote>Cuidado com as diferenças de versões no sistema operacional: se instalar o Java para 64 bits, você deverá usar um IDE (Netbeans ou Eclipse) de 64 bits. O mesmo para a versão de 32 bits: tanto o Java quanto o IDE deverão ser para 32 bits.</blockquote>

# 🤖 Primefaces
<div align="center"><img src="https://user-images.githubusercontent.com/61624336/192927385-5a585bf9-2cac-4344-89b4-f0d194cac6b5.svg" height="177"></div><br \>

# 🥛 Kotlin
<div align="center"><img src="https://cdn.worldvectorlogo.com/logos/kotlin-2.svg" height="177"></div><br \>

# 🗺️ Java RoadMap
![1643485463767](https://user-images.githubusercontent.com/61624336/155857899-572ed5c4-cdb1-4171-9865-b8a8de7f8377.jpg)
