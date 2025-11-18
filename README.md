# Proyecto Integrador – Optimización de Ingresos Usando Funciones Cuadráticas

Este proyecto implementa una aplicación en **Java**, desarrollada con Programación Orientada a Objetos (POO), que resuelve un problema de **optimización de ingresos** mediante una **función cuadrática**.  
El sistema permite definir un problema, construir la función matemática, calcular su derivada, identificar el punto óptimo (máximo o mínimo) y mostrar un resultado final estructurado.

#  Objetivo del Proyecto
Modelar un problema real (como ventas de licencias de software) con una función del tipo:  
f(x) = a·x – b·x²
y determinar el **extremo óptimo** (máximo o mínimo) usando derivadas.  
El programa está diseñado para presentar el problema, solicitar parámetros, construir la función, calcular el valor óptimo y mostrarlo al usuario.
El proyecto sigue un diseño estructurado, separado en clases independientes:

# Clase: ProblemaOptimizacion
Representa el problema de optimización que se va a resolver.
**Atributos:**
- `nombreProblema : String`
- `descripcion : String`
- `unidadX : String`
- `unidadY : String`
- `funcion : Funcion`
- `resultado : ResultadoOptimización`
**Constructor:**
- `ProblemaOptimizacion(nombre : String, descripcion : String, unidadX : String, unidadY : String)`
**Métodos:**
- `solicitarParametros() : void`  
  Solicita o establece los parámetros necesarios para construir la función.

- `resolver() : void`  
  Llama a la función y calcula el extremo (máximo o mínimo), guardando el resultado en `resultado`.

- `mostrarDescripcion() : void`  
  Muestra en pantalla la información del problema (nombre, descripción, unidades).

- `mostrarResultado() : void`  
  Muestra en pantalla el resultado de la optimización almacenado en `resultado`.

#  Clase: Funcion
Representa una **función polinómica** compuesta por varios términos.

**Atributos:**
- terminos : Termino[]  
- numeroTerminos : int  

**Métodos:**
- `evaluar(x)` → calcula f(x)  
- `derivadaPrimera()` → devuelve una nueva función  
- `derivadaSegunda()` → devuelve una nueva función  
- `encontrarExtremo()` → devuelve un ResultadoOptimización según la segunda derivada  

Esta clase encapsula todo el proceso matemático

## Clase: **Término**
Representa un término de un polinomio:
**Atributos:**
- coeficiente : double  
- exponente : int  
**Métodos:**
- getters y setters de coeficiente y exponente  
Ejemplo de términos:
- `a·x` → coeficiente = a, exponente = 1  
- `–b·x²` → coeficiente = –b, exponente = 2  
##  Clase : ResultadoOptimizacion
Almacena el resultado final del cálculo.

**Atributos:**
- xOptimo : double  
- valorOptimo : double  
- tipoExtremo : TipoExtremo  
**Métodos:**
- getXOptimo()  
- getValorOptimo()  
- getTipoExtremo()  
Esta clase permite entregar un resultado limpio, legible y bien encapsulado.

##  Enumeración: TipoExtremo
Define qué tipo de extremo se encontró:
- **MAXIMO**  
- **MINIMO**
  
 # Flujo  del Programa
1. El programa inicia en la clase **Proyecto** (método main).  
2. Se crea un objeto `ProblemaOptimización`.  
3. Se solicita información del problema y parámetros (a, b).  
4. Se construye la función cuadrática usando objetos `Termino`.  
5. La clase `Función`:
   - calcula la derivada primera  
   - calcula la derivada segunda  
   - identifica el punto crítico  
   - determina si es máximo o mínimo  
6. Se crea un objeto `ResultadoOptimizacion` con:
   - x óptimo  
   - valor óptimo  
   - tipo de extremo  
7. Se muestra el resultado en consola.
 #  Estructura del Proyecto

src/main/java/ec/educacion/espoch/proyectointegrador/
│
├── ProyectoIntegrador.java → Clase principal (main)
│
├── clases/
│ ├── ProblemaOptimización.java
│ ├── Funcion.java
│ ├── Termino.java
│ └── ResultadoOptimización.java
│
└── enumeraciones/
└── TipoExtremo.java

# El programa imprime casos como algo similar a:
PROBLEMA: Optimización de ingresos
Descripción: Empresa que vende licencias...
Unidad de X: licencias
Unidad de Y: ingresos monetarios
