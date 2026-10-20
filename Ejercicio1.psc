Algoritmo Ejercicio1
    Definir valorHora, horas, salarioTotal, retencion, salarioNeto Como Real
    Escribir "Ingrese el valor de la hora:"
    Leer valorHora
    Escribir "Ingrese las horas trabajadas:"
    Leer horas
    salarioTotal <- valorHora * horas
    retencion <- salarioTotal * 0.05
    salarioNeto <- salarioTotal - retencion
    Escribir "Salario total: $", salarioTotal
    Escribir "Retencion del 5%: $", retencion
    Escribir "Salario neto: $", salarioNeto
FinAlgoritmo
