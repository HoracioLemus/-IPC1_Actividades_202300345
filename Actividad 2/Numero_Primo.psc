Algoritmo Numero_Primo
	Escribir 'Ingresa un Número y te dire si es primo: '
	Leer n
	Escribir 'El numero ingresado es: ', n, ' Procedere a verificar si es Primo' // se solicita el numero y se guarda en n
	Si n<=1 Entonces
		Escribir 'El numero ', n, ' no es primo' // si n es menor o igual que 1 no es necesario hacer la prueba
	SiNo
		prueba <- 'si'
		Para i<-2 Hasta rc(n) Hacer // variable que indica si el numero es o no primo
			Si n MOD i==0 Entonces // rango en la que se realiza la prueba - rc(n) opera la raiz de n
				prueba <- 'no'
			FinSi // si el residuo de la división es 0, entonces n es divisible por i, por lo que no es primo
		FinPara
		Si prueba='no' Entonces
			Escribir 'El numero ', n, ' no es primo' // se comprueba si paso la prueba
		SiNo
			Escribir 'El numero ', n, ' es primo'
		FinSi
	FinSi
FinAlgoritmo
