### *Lista Comandos Terminal*

1. `echo "gabrielly gomes martinez."`

2. ` echo "gabrielly gomes martinez." > cliente01.txt
less clientes01.txt`

3. `echo "praia grande" >> cliente01.txt
less clientes01.txt` 
4. `  mkdir clientes
ls`

5. ` mv cliente01.txt clientes
cd clientes
ls`

6. ` cp cliente01.txt cliente01.txt.bkp
ls`

7. `rm cliente01.txt 
ls` 

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

9.` chmod +x clientes.script
rm -r clientes
./clientes.script`

10.`Executando a operação 	echo | cal hoje.txt
  aparece o calendario com a marcação do dia atual, o operador | serve para filtrar`

11. `wget https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/
raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt`

12. `grep Balneario index.html`

        <td id="file-cidades_sc-txt-LC26" class="blob-code blob-code-inner js-file-line">Balneario Arroio do Silva</td>
        <td id="file-cidades_sc-txt-LC27" class="blob-code blob-code-inner js-file-line">Balneario Barra do Sul</td>
        <td id="file-cidades_sc-txt-LC28" class="blob-code blob-code-inner js-file-line">Balneario Camboriu</td>
        <td id="file-cidades_sc-txt-LC29" class="blob-code blob-code-inner js-file-line">Balneario Gaivota</td>

13. `grep balneario index.html // não aparece nada porque ele é camelCase`

14. `grep "do Sul" index.html`

        <td id="file-cidades_sc-txt-LC27" class="blob-code blob-code-inner js-file-line">Balneario Barra do Sul</td>
        <td id="file-cidades_sc-txt-LC38" class="blob-code blob-code-inner js-file-line">Bocaina do Sul</td>
        <td id="file-cidades_sc-txt-LC54" class="blob-code blob-code-inner js-file-line">Campo Belo do Sul</td>
        <td id="file-cidades_sc-txt-LC63" class="blob-code blob-code-inner js-file-line">Caxambu do Sul</td>
        <td id="file-cidades_sc-txt-LC68" class="blob-code blob-code-inner js-file-line">Cocal do Sul</td>
        <td id="file-cidades_sc-txt-LC89" class="blob-code blob-code-inner js-file-line">Formosa do Sul</td>
        <td id="file-cidades_sc-txt-LC103" class="blob-code blob-code-inner js-file-line">Guaruja do Sul</td>
        <td id="file-cidades_sc-txt-LC134" class="blob-code blob-code-inner js-file-line">Jaragua do Sul</td>
        <td id="file-cidades_sc-txt-LC148" class="blob-code blob-code-inner js-file-line">Lindoia do Sul</td>
        <td id="file-cidades_sc-txt-LC219" class="blob-code blob-code-inner js-file-line">Rio do Sul</td>
        <td id="file-cidades_sc-txt-LC231" class="blob-code blob-code-inner js-file-line">Santa Rosa do Sul</td>
        <td id="file-cidades_sc-txt-LC234" class="blob-code blob-code-inner js-file-line">Santiago do Sul</td>
        <td id="file-cidades_sc-txt-LC236" class="blob-code blob-code-inner js-file-line">Sao Bento do Sul</td>
        <td id="file-cidades_sc-txt-LC240" class="blob-code blob-code-inner js-file-line">Sao Cristovao do Sul</td>
        <td id="file-cidades_sc-txt-LC242" class="blob-code blob-code-inner js-file-line">Sao Francisco do Sul</td>
        <td id="file-cidades_sc-txt-LC246" class="blob-code blob-code-inner js-file-line">Sao Joao do Sul</td>
        <td id="file-cidades_sc-txt-LC268" class="blob-code blob-code-inner js-file-line">Timbe do Sul</td>
        
15. `cat index.html | grep Balneario`

        <td id="file-cidades_sc-txt-LC26" class="blob-code blob-code-inner js-file-line">Balneario Arroio do Silva</td>
        <td id="file-cidades_sc-txt-LC27" class="blob-code blob-code-inner js-file-line">Balneario Barra do Sul</td>
        <td id="file-cidades_sc-txt-LC28" class="blob-code blob-code-inner js-file-line">Balneario Camboriu</td>
        <td id="file-cidades_sc-txt-LC29" class="blob-code blob-code-inner js-file-line">Balneario Gaivota</td>`
        
16. `cat index.html | grep Balneario > balneario.txt`

17. `tar -c balneario.txt > compactado.tar`

18. `tar -x -f compactado.tar`
