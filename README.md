# cygni-maven-exercise-1

Detta är en övning i Maven skapad för Cygnis traineeprogram.

Main-branchen motsvarar "facit" i övningen, och branchen "initial" är utgångsläget.

## Förberedelser

Kolla att du har Maven och Java installerat, och klona ut projektet:

`git clone git@github.com:mthorsson/cygni-maven-exercise-1.git`

Checka sedan ut branchen "inital":

`git checkout initial`

Titta i `pom.xml` och lägg till dig själv i listan av utvecklare. Testa att bygga projektet:

`mvn package`

Se också om du kan köra programmet i sin ursprungliga form:

`java -cp <path-till-jar> se.cygni.training.maven.App`

Nu kan vi sätta igång!

## Övning 1

Maven har ett lokalt Repo på maskinen. Installera din artefakt där lokalisera filen i Repot.

## Övning 2

Konfigurera `maven-compiler-plugin` så att projektet använder den senaste versionen av plugnen, samt specificera
Javas target-version till 1.7. Default-target-version varierar med maven-version, men det är ofta äldre versioner.

Tips: Börja med att köra `mvn help:effective-pom` för att se vilken version som körs

## Övning 3

Byt ut vanliga spårutskrifter (System.out.println etc) mot användandet av en riktig logger. Då behövs ett
Maven-beroende till `SLF4J`. Använd en maven-property **${slf4j.version}** för att styra versionen i POM:en.

Tips: Artefakten som behövs heter `slf4j-simple`.

Nu har vi introducerat ett beroende i Maven och vi kan inte längre köra programmet rakt av med `java` vid kommandoprompten.
Då kan man i stället använda standardpluginen `maven-exec-plugin` för att köra (då kommer beroendena med på classpath):

`mvn clean compile exec:java -Dexec.mainClass="se.cygni.training.maven.App"`

## Övning 4

Förenkla distributionen och körandet av projektet ytterligare! Använd `maven-assembly-plugin` för att skapa en körbar jar-fil.
Jar-filen innehåller alla beroenden och blir helt "självförsörjande".

Sätt `descriptorRef` till `jar-with-dependencies` och se till så att jar:en byggs i samband med `package`-fasen.

Kör sedan applikationen från kommandoraden utan hjälp av Maven:

`java -jar target/exercise-1-1.0-SNAPSHOT-jar-with-dependencies.jar`

Ett alternativ till [maven-assembly-plugin](http://maven.apache.org/plugins/maven-assembly-plugin/) är
[maven-shade-plugin](http://maven.apache.org/plugins/maven-shade-plugin/).

## Överkurs

Bryt ut klassen `StringGetter` till ett eget projekt. Bygg och installera. Lägg till ett beroende till projektet
i huvudprojektet.

Tips: Använd eventuellt `maven archetype`

Du kan också testa att göra det till ett multimodul-projekt, där man refererer till underprojekt från ett topp-projekt.


