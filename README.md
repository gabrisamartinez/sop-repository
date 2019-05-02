### *Lista Comandos Terminal*

1. `echo "gabrielly gomes martinez."`

2. ` echo "gabrielly gomes martinez." > cliente01.txt`       
`less clientes01.txt`

3. `echo "praia grande" >> cliente01.txt`
`less clientes01.txt`
        
4. `  mkdir clientes`
`ls`

5. `mv cliente01.txt clientes`
`cd clientes`
`ls`

6. ` cp cliente01.txt cliente01.txt.bkp`
`ls`

7. `rm cliente01.txt `
`ls` 

8.  criar script 

        vi clientes.script

         #!/bin/bash
         echo "gabrielly gomes martinez."

         #cria o nome e  dentro dentro arquivo txt
         echo "gabrielly gomes martinez." > cliente01.txt
         less cliente01.txt

         #cria o nome da cidade que morei e bota na ultima linha
         echo "praia grande" >> cliente01.txt
         less cliente01.txt

         #cria um diretorio
         mkdir clientes
         #move o arq txt para clientes
         mv cliente01.txt clientes

         #entra dentro do arquivo
         cd clientes

         #copia um arquivo pra fazer um beckupzinho
         cp cliente01.txt cliente01.txt.bkp

         #remove o antigo
         rm cliente01.txt

9.` chmod +x clientes.script`
`rm -r clientes`
`./clientes.script`

10.`Executando a operação 	echo | cal hoje.txt`

> aparece o calendario com a marcação do dia atual, o operador | serve para filtrar

11. `wget https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt`

12. `grep Balneario cidades_sc.txt`

        Balneario Arroio do Silva
        Balneario Barra do Sul
        Balneario Camboriu
        Balneario Gaivota


13. `grep balneario cidades_sc.txt // não aparece nada porque ele é camelCase`

14. `grep "do Sul" cidades_sc.txt`

        Balneario Barra do Sul
        Bocaina do Sul
        Campo Belo do Sul
        Caxambu do Sul
        Cocal do Sul
        Formosa do Sul
        Guaruja do Sul
        Jaragua do Sul
        Lindoia do Sul
        Rio do Sul
        Santa Rosa do Sul
        Santiago do Sul
        Sao Bento do Sul
        Sao Cristovao do Sul
        Sao Francisco do Sul
        Sao Joao do Sul
        Timbe do Sul

        
15. `cat cidades_sc.txt | grep Balneario`

        Balneario Arroio do Silva
        Balneario Barra do Sul
        Balneario Camboriu
        Balneario Gaivota
        
16. `cat cidades_sc.txt | grep Balneario > balneario.txt`

17. `tar -c balneario.txt > compactado.tar`

18. `tar -xf compactado.tar`

### *Shell Script*

#### 1 Questao

        #!/bin/bash
        echo "Digite seu nome"
        read nome
        echo "bom dia $nome"
        
#### 2 Questao
        
        #!/bin/bash
        echo "Digite o primeiro numero"
        read primeiro
        echo "Digite o segundo numero"
        read segundo
        echo "a resposta é $[ $primeiro * $segundo]"

#### 3 Questao

        #!/bin/bash
        echo "Digite um numero"
        read numero
        if [ $numero -ge 0 ]; then 
                echo "Positivo"
        else
                echo "Negativo"
        fi
        
#### 4 Questao

        #!/bin/bash
        echo "Digite um numero"
        read numero
        y=1
        while [  $y -le 10  ]; do
           echo "$[$numero * $y]"
           y=$[ $y + 1 ]
        done
#### 5 Questao
        
        #!/bin/bash
        echo "Opcoes
        ----
        1: Calendario
        ----
        2: Arquivo do diretorio"
        read opcao

        if [ $opcao = 1 ]; then
                echo | cal
        else 
                echo | ls
        fi
