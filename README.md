# PasswordGenerator

El `PasswordGenerator` es una aplicación Java para generar contraseñas aleatorias. Cada contraseña está compuesta por una combinación de dígitos, letras mayúsculas y letras minúsculas. 

## Características

- Genera un número configurable de contraseñas.
- Cada contraseña tiene una longitud configurable.
- Las contraseñas incluyen dígitos (`0-9`), letras mayúsculas (`A-Z`) y letras minúsculas (`a-z`).

## Requisitos

- Java 8 o superior

## Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/tu_usuario/password-generator.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd password-generator
    ```

## Uso

Para ejecutar el generador de contraseñas, compila y corre la clase principal `PasswordGenerator` con los parámetros deseados. 

1. Compila el código:

    ```bash
    javac -d bin src/password/PasswordGenerator.java
    ```

2. Ejecuta el código:

    ```bash
    java -cp bin password.PasswordGenerator 5 8
    ```

   Aquí, `5` es el número de contraseñas a generar y `8` es la longitud de cada contraseña.

## Ejemplo de Salida

