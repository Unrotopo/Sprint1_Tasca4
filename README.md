# Projecte de Test amb JUnit, AssertJ i TDD

## Descripció
Aquest projecte consisteix en la implementació i verificació de funcionalitats mitjançant tests automatitzats utilitzant JUnit, AssertJ i la metodologia TDD.


## Nivell 1: JUnit
### Exercici 1: Biblioteca
Implementa una classe per gestionar una col·lecció de llibres amb les funcionalitats següentes:
- Afegir llibres a la col·lecció.
- Recuperar la llista de llibres.
- Obtenir el títol d'un llibre per la seva posició.
- Afegir un llibre en una posició específica.
- Eliminar un llibre per títol.

**Verificacions amb JUnit:**
- La llista de llibres no ha de ser nul·la després de crear un nou objecte.
- La mida de la llista ha de ser correcta després d'inserir llibres.
- La llista ha de contenir un llibre en la seva posició correcta.
- No hi ha d'haver títol de llibres duplicats.
- La llista ha de romandre ordenada alfabèticament.

### Exercici 2: Càlcul de la lletra del DNI
Crea una classe `CalculoDni` que calculi la lletra del DNI i un test JUnit per verificar-ne el funcionament amb 10 valors predefinits.

### Exercici 3: Excepcions
Implementa una classe que llanci una `ArrayIndexOutOfBoundsException` i crea un test per verificar-ho.

## Nivell 2: AssertJ
Implementa i prova les següents assercions:

- **Exercici 1:** Verificar que dos objectes sencers són iguals i que no ho són.
- **Exercici 2:** Comprovar que dues referències a objectes són la mateixa i que no ho són.
- **Exercici 3:** Comparar dos arrays d'enters.
- **Exercici 4:**
  - Verificar l'ordre dels objectes en un `ArrayList`.
  - Verificar que conté els objectes en qualsevol ordre.
  - Comprovar que un objecte apareix una sola vegada.
  - Comprovar que un objecte no afegit no apareix a la llista.
- **Exercici 5:** Comprovar que un `Map` conté una `key` afegida.
- **Exercici 6:** Llençar una `ArrayIndexOutOfBoundsException` i verificar l'excepció.
- **Exercici 7:** Verificar que un `Optional` està buit.

## Nivell 3: TDD
### Exercici 1: Calculadora
Implementa una classe `Calculadora` seguint la metodologia TDD:

1. Crea la classe de test `CalculadoraTest`.
2. Escriu les proves per a sumar, restar, dividir i multiplicar.
3. Executa les proves (haurien de fallar inicialment).
4. Implementa la classe `Calculadora`.
5. Torna a executar les proves fins que passin.
6. Refactoritza i repeteix el cicle per millorar el codi.



## Com executar les proves
Si utilitzes **Maven**, executa:
```sh
mvn test
```
Si utilitzes **Gradle**, executa:
```sh
gradle test
```

## Autor
Aquest projecte ha sigut desenvolupat per Luis Portas Montero.

