#!/bin/bash

function_terminate() {
	rm -rf bank-service/
	exit
}

function_showOptionsMenu() {
	clear
	option=0
	while [[ $option  -ne 3 ]]; do
		echo "

		----------------------------------------------------------

		███╗   ███╗███████╗███╗   ██╗██╗   ██╗
		████╗ ████║██╔════╝████╗  ██║██║   ██║
		██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║
		██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║
		██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝
		╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ 

		-----------------------------------------------------------
	
		1. Ver saldo.
		2. Ver extrato.
		3. Sair.

		Digite sua opção: "
		read user_option
		option=$user_option

		if [ $option -eq 1 ]; then
			saldo=`cat bank-service/$nome_usuario/saldo.txt`
			echo "Seu saldo é: R$ $saldo"
		elif [ $option -eq 2]; then
			extrato=`cat bank-service/$nome_usuario/extrato.txt`
			echo "Seu extrato: $ $extrato"
		fi 
	done

	function_terminate

}

echo "Bem vindo ao
_____________________________________________________________


██████╗  █████╗ ███╗   ██╗ ██████╗ ██████╗ 
██╔══██╗██╔══██╗████╗  ██║██╔════╝██╔═══██╗
██████╔╝███████║██╔██╗ ██║██║     ██║   ██║
██╔══██╗██╔══██║██║╚██╗██║██║     ██║   ██║
██████╔╝██║  ██║██║ ╚████║╚██████╗╚██████╔╝
╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝

_____________________________________________________________
digite o nome que contém na conta bancária: "
read nome_usuario

mkdir bank-service
mkdir bank-service/$nome_usuario


wget  -O bank-service/user.txt "https://raw.githubusercontent.com/leandersonandre/shell-script/master/lista_usuarios.txt" 

echo "Buscando informações..."

cat bank-service/user.txt

if [ `cat bank-service/user.txt | grep $nome_usuario | wc -l` -ne 0 ]; then

	if [[ $nome_usuario = 'lisbon' || $nome_usuario = 'Lisbon' ]]; then

		echo "Buscando saldo do usuário..." 		
		wget 'https://github.com/leandersonandre/shell-script/blob/master/lisbon.tar.gz?raw=true' -o bank-service/lisbon.tar.gz
		tar -zxf bank-service/lisbon.tar.gz -C bank-service/$nome_usuario/
		echo "Download completo." 
		function_showOptionsMenu

	elif [ $nome_usuario = 'newyork' || $nome_usuario = 'Newyork' || $nome_usuario = 'NewYork']; then
		wget 'https://github.com/leandersonandre/shell-script/blob/master/newyork.tar.gz?raw=true' -o bank-service/newyork.tar.gz
		tar -zxf bank-service/newyork.tar.gz -C bank-service/$nome_usuario/
		echo "Download completo." 
		function_showOptionsMenu
	
	elif [ $nome_usuario = 'london' || $nome_usuario = 'London' ]; then
		wget 'https://github.com/leandersonandre/shell-script/blob/master/london.tar.gz?raw=true' -o bank-service/london.tar.gz
		tar -zxf bank-service/london.tar.gz -C bank-service/$nome_usuario/
		echo "Download completo." 
		function_showOptionsMenu

	fi

else
	echo " Usuário $nome_usuario não encontrado."
	function_terminate
fi 


