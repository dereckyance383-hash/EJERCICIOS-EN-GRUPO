Algoritmo Ejercicio10
    Definir precio, iva Como Real
    Escribir "Ingrese el precio del articulo antes del IVA:"
    Leer precio
    // Se usa 19% como supuesto; el enunciado no especifica la tarifa.
    iva <- precio * 0.19
    Escribir "IVA (19%): $", iva
    Escribir "Precio con IVA: $", precio + iva
FinAlgoritmo
