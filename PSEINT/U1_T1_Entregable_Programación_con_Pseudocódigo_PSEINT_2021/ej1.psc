Proceso ej1
	
	Definir unidades Como Real
	Escribir "Introduzca el numero de unidades"
	Leer unidades
	Si  unidades <= 100 Entonces 
		Escribir unidades * 5.23
	SiNo
		Si unidades <= 1000 Entonces
			Escribir 100 * 5.23 + (unidades - 100) * 4.16
		SiNo
			Escribir  100 * 5.23 + (unidades - 101) * 4.16 + (unidades - 1000) * 5.23 / 2
		Fin Si
	Fin Si
FinProceso
