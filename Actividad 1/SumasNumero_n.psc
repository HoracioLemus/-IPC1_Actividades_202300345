Funcion cadena = Sumatoria(texto, repeticiones)
	cadena = ""
	Para iterador <- 1 Hasta repeticiones Con Paso 1 Hacer
		cadena = cadena + texto
		
	FinPara
FinFuncion

Algoritmo SumasNumero_n
	Escribir "Ingresa el numero n del cual quieres saber su sumatoria:"
	leer n
	Para iterador <- 1 Hasta n Con Paso 1 Hacer
		
		operar <- ConvertirATexto(total) +  Sumatoria(" + ", 1)
		operar2 <- ConvertirATexto(iterador) + Sumatoria(" = ", 1)
		total = total + iterador
		Escribir operar + operar2 + ConvertirATexto(total)
	Fin Para
	
FinAlgoritmo
