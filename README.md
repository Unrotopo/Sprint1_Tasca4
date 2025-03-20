# Projecte de Testing amb JUnit, AssertJ i TDD

## Descripció
Aquest projecte té com a objectiu implementar i provar funcionalitats en Java utilitzant JUnit, AssertJ i principis de TDD. 

### Requeriments
- Utilitzar un gestor de projectes (Maven o Gradle) per afegir les dependències necessàries.
- Crear les classes de tests al package de Test corresponent.
- Seguir el document de bones pràctiques detallat a l'Sprint 0 per complir les normes en les entregues dels repositoris de GitHub.
- Tot el codi ha d'estar escrit en anglès.

## Nivell 1: JUnit

### Exercici 1: Biblioteca
Crea una classe Java per gestionar una col·lecció de llibres en una biblioteca. Aquesta classe ha de permetre:
- Afegir llibres a la col·lecció.
- Recuperar la llista completa de llibres.
- Obtenir el títol d'un llibre donada una posició.
- Afegir un llibre en una posició específica.
- Eliminar un llibre per títol.

Verificacions amb JUnit:
- La llista de llibres no ha de ser nul·la després de crear un nou objecte.
- La mida de la llista ha de ser l'esperada després d'inserir diversos llibres.
- La llista ha de contenir un llibre específic en la seva posició correcta.
- No hi ha d'haver títols duplicats.
- S'ha de poder recuperar el títol d'un llibre segons la seva posició.
- Afegir un llibre ha de modificar correctament la llista.
- Eliminar un llibre ha de disminuir la mida de la llista.
- La llista ha de romandre ordenada alfabèticament després d'afegir o eliminar un llibre.

### Exercici 2: Càlcul de DNI
Crea una classe `CalculoDni` que calculi la lletra del DNI a partir del número.

Verificacions amb JUnit:
- Crea una classe de test parametritzada per validar el càlcul correcte amb 10 números de DNI predefinits.

### Exercici 3: Excepció ArrayIndexOutOfBoundsException
Crea una classe amb un mètode que llanci una `ArrayIndexOutOfBoundsException`.

Verificacions amb JUnit:
- Escriu un test que confirmi que l'excepció es llança quan correspon.

## Nivell 2: AssertJ

### Exercicis d'assertions
1. Verifica que el valor de dos objectes sencers és igual i diferent.
2. Comprova que dues referències a objectes són la mateixa i diferents.
3. Compara si dos arrays d'enters són idèntics.
4. 
   - Crea un `ArrayList` amb diferents tipus d'objectes.
   - Verifica l'ordre dels elements segons han estat inserits.
   - Comprova que la llista conté els objectes en qualsevol ordre.
   - Assegura que un objecte s'ha afegit només una vegada.
   - Confirma que la llista no conté un objecte que no s'ha afegit.
5. Crea un `Map` i verifica que conté una clau específica.
6. Provoca una `ArrayIndexOutOfBoundsException` i assegura que es detecta correctament.
7. Crea un objecte `Optional` buit i verifica que realment està buit.

## Nivell 3: TDD

### Exercici 1: Calculadora
- Crea una classe `CalculadoraTest` amb proves per sumar, restar, dividir i multiplicar.
- Executa les proves i assegura't que fallen inicialment.
- Implementa la classe `Calculadora` amb els mètodes especificats.
- Torna a executar les proves i verifica que passen correctament.
- Itera sobre el procés, refactoritzant el codi i millorant les funcionalitats segons el principi de TDD.

## Instal·lació i ús

1. Clona aquest repositori:
   ```sh
   git clone https://github.com/usuari/repository.git
   ```
2. Accedeix a la carpeta del projecte:
   ```sh
   cd repository
   ```
3. Importa el projecte en el teu IDE preferit (IntelliJ IDEA, Eclipse, VS Code, etc.).
4. Executa les proves amb Maven o Gradle:
   - Maven:
     ```sh
     mvn test
     ```
   - Gradle:
     ```sh
     gradle test
     ```

## Contribució

Les contribucions són benvingudes! Si vols millorar el projecte, fes un `fork`, crea una branca, i envia un `pull request`.

## Autor

Luis Portas Montero
