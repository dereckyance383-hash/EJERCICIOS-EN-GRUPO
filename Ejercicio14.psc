Algoritmo Ejercicio14
    Definir totalSegundos, horas, minutos, segundos Como Entero
    Escribir "Ingrese el tiempo total en segundos:"
    Leer totalSegundos
    horas <- Trunc(totalSegundos / 3600)
    minutos <- Trunc((totalSegundos MOD 3600) / 60)
    segundos <- totalSegundos MOD 60
    Escribir "Horas: ", horas
    Escribir "Minutos: ", minutos
    Escribir "Segundos: ", segundos
FinAlgoritmo
