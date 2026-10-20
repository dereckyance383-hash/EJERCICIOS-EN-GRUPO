Algoritmo Ejercicio3
    Definir nota1, nota2, nota3 Como Real
    Escribir "Ingrese la nota del primer corte (0.0 a 5.0):"
    Leer nota1
    Escribir "Ingrese la nota del segundo corte (0.0 a 5.0):"
    Leer nota2
    nota3 <- (3.0 - nota1 * 0.20 - nota2 * 0.20) / 0.60
    Si nota3 <= 0 Entonces
        Escribir "Con las notas actuales alcanza el minimo de 3.0 incluso con 0 en el tercer corte."
    SiNo
        Si nota3 <= 5.0 Entonces
            Escribir "Nota minima necesaria en el tercer corte: ", nota3
        SiNo
            Escribir "No es posible aprobar: necesita mas de 5.0 en el tercer corte."
        FinSi
    FinSi
FinAlgoritmo
