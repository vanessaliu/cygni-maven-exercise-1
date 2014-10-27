# cygni-maven-exercise-1

Detta är en övning i Maven skapad för Cygnis traineeprogram.

Main-branchen motsvarar "facit" i övningen, och branchen "initial" är utgångsläget.

## Förberedelser

Kolla att du har Maven och Java installerat, och klona ut projektet:

`git clone git@github.com:mthorsson/cygni-maven-exercise-1.git`

Checka sedan ut branchen "inital":

`git checkout initial`

Titta i `pom.xml` och lägg till dig själv i listan av utvecklare. Testa att bygga projektet:

`mvn clean package`

Se om du kan köra programmet i sin ursprungliga form:

`java -cp <path-till-jar> se.cygni.training.maven.App`

## Övning 1

Kör enhetstesterna med hjälp av Maven.

Maven har ett lokalt Repo på maskinen. Installera din artefakt där lokalisera filen i Repot.

## Övning 2

Byt ut vanliga spårutskrifter (System.out.println etc) mot användandet av en riktig logger. Då behövs ett
Maven-beroende till `SLF4J`. Använd en maven-property **${slf4j.version}** för att styra versionen i POM:en.

Tips: Artefakten som behövs heter `slf4j-simple`.

## Övning 3

Konfigurera `maven-compiler-plugin` så att projektet använder den senaste versionen, samt specificera Javas target-version
till 1.7.

Tips: Börja med att köra `mvn help:effective-pom` för att se vilken version som körs

## Övning 4

Förenkla distributionen och körandet av projektet! Använd `maven-assembly-plugin` för att skapa en körbar jar-fil

Kör applikationen med `java -jar target/exercise-1-1.0-SNAPSHOT-jar-with-dependencies.jar`

## Överkurs

Bryt ut klassen `StringGetter` till ett eget projekt. Bygg och installera. Lägg till ett beroende till projektet
i huvudprojektet.

Tips: Använd eventuellt `maven archetype`




