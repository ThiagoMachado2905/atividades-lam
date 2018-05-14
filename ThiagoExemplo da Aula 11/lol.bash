#!/bin/bash
read T
read T1
touch teste.txt
echo $T > teste.txt
Re=$(grep $T1 teste.txt)
if test -z $Re
then
	echo "Nao encontrado"
else
	echo "Ok"
fi
