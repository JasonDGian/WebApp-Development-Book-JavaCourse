# Iteradores.

## 🔹 Bucles FOR
Un bucle `for` en Java es una estructura de control que permite ejecutar un bloque de código varias veces de forma repetitiva. Se utiliza especialmente cuando sabemos de antemano cuántas veces queremos repetir la ejecución de un código.

**Sintaxis**
```java
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```

**Ejemplo de uso.**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

## 🔹 Bucles WHILE DO
El bucle `while` ejecuta el bloque de código **mientras la condición se mantenga verdadera**. Si la condición es falsa desde el principio, el código nunca se ejecuta.
**No tiene por que ejecutar la lógica contenida en su bloque.**

**Sintaxis**
```java
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

**Ejemplo de uso.**
```java
int i = 1;
while (i <= 5) {
    System.out.println("Número: " + i);
    i++; // Incremento para evitar un bucle infinito
}
```


## 🔹 Bucles DO WHILE
El bucle `do while` ejecuta el bloque de código al menos una vez, sin importar si la condición es falsa. Después de la primera ejecución, 
sigue repitiéndose mientras la condición sea verdadera.

**Sintaxis**
```java
do {
    // Código que se ejecutará al menos una vez
} while (condición);
```

**Ejemplo de uso.**
```java
int i = 1;
do {
    System.out.println("Número: " + i);
    i++; // Incremento para evitar un bucle infinito
} while (i <= 5);
```

# 📌 Usa el tipo de bucle adecuado 🔄
Cada bucle tiene su propósito:
- `for`: Ideal cuando conoces el número exacto de iteraciones.
- `while`: Mejor cuando la condición depende de factores externos.
- `do while`: Útil cuando necesitas ejecutar el bloque al menos una vez.

# 📌 Usa `break` y `continue`.
- `break`: Termina el bucle completamente.
- `continue`: Salta la iteración actual y pasa a la siguiente.

```java
int[] numeros = {3, 7, 9, 12, 15};
int objetivo = 9;

for (int num : numeros) {
    if (num == objetivo) {
        System.out.println("Número encontrado: " + num);
        break; // Termina el bucle al encontrar el número
    }
}
```

>[!CAUTION]
>La instrucción `break` no está bien vista por muchos programadores. En su lugar se puede hacer uso de 'variable de control' o 'flags / banderas' que permiten mantener un control sobre la iteración de manera mas controlada.


