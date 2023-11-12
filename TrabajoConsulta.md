# Programación Funcional y Reactiva
## Higher Order Funtions

**Trabajo de Consulta**

**Objetivos**:

- Aplicar los conocimientos sobre funciones de orden superior.
- Enviar una función como parámetro.

### Descripción:

**Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese
método estable lo siguiente:**

Utilizando los conceptos expuestos anteriormente debe:
1. Crear una función con nombre (integracion) que use el método de Simpson para
   calcular el valor aproximado de cualquier función . Se recomienda analizar lo
   siguiente:
    ```math
   - El tipo de dato que devolverá la función integracion
   
   - ¿Cuáles son los parámetros que recibe la función?

    ```
    
2. Aproxima el valor de las siguientes integrales definidas usando la función integracion creada en el primer paso.

   ```latex
    \[ \int_{3}^{5} (-x^2 + 8x - 12) \, dx \approx 7.33 \]
    ```
   2.\[ \int_{0}^{2} (3x^2) \, dx \approx 8 \]
   3.\[ \int_{-1}^{1} (x + 2x^2 - x^3 + 5x^4) \, dx \approx 3.333 \]
   4.\[ \int_{1}^{2} \frac{2x + 1}{x^2 + x} \, dx \approx 1.09861 \]
   5.\[ \int_{0}^{1} e^x \, dx \approx 1.71828 \]
   6.\[ \int_{2}^{3} \frac{1}{\sqrt{x-1}} \, dx \approx 0.828427 \]
   7.\[ \int_{0}^{1} \frac{1}{1 + x^2} \, dx \approx 0.785398 \]

   ```
   



3. Calcula el error que se presenta en cada aproximación. El error es igual al valor
absoluto de la resta entre el valor esperado y el valor obtenido, así:
   ```math
   |valorEsperado -valorObtenido|
   ```
   Para calcular el error, debes elaborar una función que haga el cálculo respectivo.
