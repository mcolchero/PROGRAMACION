Proceso ej2
	Definir n Como Entero
	Definir invertido Como Entero
	Definir cifra Como Entero
	
	Escribir "Por favor, escribe un numero entero"
	Leer n
	invertido = 0
	Mientras n <> 0 Hacer
		cifra = n % 10
		Escribir Sin Saltar cifra
		n = trunc(n/10)
	FinMientras
	
	
FinProceso
