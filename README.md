<img width="1086" height="440" alt="captura pruebas" src="https://github.com/user-attachments/assets/ebbf096d-89d6-44db-980b-599c56927dce" />
**Ventajas de la realización de las pruebas en el ejercicio de gestión de biblioteca**

-  Validación temprana de la lógica de negocio

Al tener pruebas para cada flujo posible, estamos validando desde el inicio que:
Solo los usuarios válidos puedan realizar préstamos.
No se puedan prestar libros no disponibles.
El registro de préstamo se haga correctamente en condiciones óptimas.
Esto ayuda a detectar errores en etapas tempranas, lo que reduce costos y tiempo de desarrollo.

- Pruebas controladas gracias a los mocks
En este ejercicio, en lugar de depender de una base de datos real o de un sistema de autenticación externo, usamos mocks que simulan estas dependencias.
Esto permite:
Ejecutar pruebas rápidamente y en cualquier entorno.
Simular escenarios difíciles de reproducir en el sistema real, como:
Fallas en la base de datos.
Respuestas específicas de autenticación.
Libros disponibles o no disponibles según el ID.

- Mayor cobertura y confianza en el código

Hemos diseñado pruebas para todos los escenarios posibles, incluyendo casos límite como:
IDs negativos.
Usuario con ID muy grande (Integer.MAX_VALUE).
Libro con ID cero.
Esto asegura que el método prestarLibro maneje situaciones normales y excepcionales, y que no haya ramas lógicas sin validar.

- Documentación viva del comportamiento del sistema

Cada prueba actúa como una documentación ejecutable de cómo se espera que el sistema funcione.
Por ejemplo:
testPrestamoExitoso describe explícitamente el flujo ideal:
"Un usuario válido y un libro disponible deben resultar en un préstamo exitoso."
testUsuarioNoAutorizado documenta la regla de negocio:
"Un usuario no autorizado no puede prestar un libro."

- Facilita el mantenimiento y la evolución del sistema

Cuando se hagan cambios en el sistema, como agregar reglas nuevas (por ejemplo, límite de libros por usuario), las pruebas actuales:
Ayudarán a detectar regresiones si algo deja de funcionar.
Permitirán verificar rápidamente que la funcionalidad existente sigue correcta.
Reducirán el miedo a refactorizar el código.

- Simulación de un enfoque de pruebas Top-Down

Este ejercicio refleja un testing Top-Down, donde se prueba el sistema desde el nivel más alto (el flujo completo) mientras se simulan las dependencias con mocks.
Ventajas en este caso:
Permite probar el método prestarLibro sin necesidad de tener listas todas las capas inferiores (como una base de datos real).
Facilita el desarrollo incremental:
Primero se prueba la lógica principal.
Más adelante se reemplazan los mocks por implementaciones reales.

- Mejora en la calidad del código y diseño
  
El hecho de que BibliotecaSistema reciba dependencias como DatabaseMock y AuthMock fomenta un diseño desacoplado y flexible.
Esto sigue principios como:
Inversión de dependencias (D de SOLID):
La clase no depende de implementaciones concretas, sino de abstracciones.
Testabilidad:
El sistema se puede probar fácilmente porque las dependencias se pueden simular.
