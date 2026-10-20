Algoritmo Ejercicio9
    Definir precioTarifa, precioPagado, porcentaje Como Real
    Escribir "Ingrese el precio de tarifa:"
    Leer precioTarifa
    Escribir "Ingrese el precio pagado:"
    Leer precioPagado
    Si precioTarifa > 0 Entonces
        porcentaje <- ((precioTarifa - precioPagado) / precioTarifa) * 100
        Escribir "Porcentaje descontado: ", porcentaje, "%"
    SiNo
        Escribir "El precio de tarifa debe ser mayor que cero."
    FinSi
FinAlgoritmo
