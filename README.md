# Doku und Notizen

## Primitive Datentypen in Java

Java hat 8 primitive Datentypen, die in vier Kategorien unterteilt werden können.

### Ganzzahlige Datentypen

#### byte
- **Größe:** 8 Bit (1 Byte)
- **Wertebereich:** -128 bis 127
- **Standardwert:** 0
- **Verwendung:** Speicherung von kleinen Zahlen, z.B. bei großen Arrays wo Speicher wichtig ist

```java
byte alter = 25;
byte temperatur = -10;
```

#### short
- **Größe:** 16 Bit (2 Bytes)
- **Wertebereich:** -32.768 bis 32.767
- **Standardwert:** 0
- **Verwendung:** Seltener verwendet, wenn int zu groß wäre

```java
short jahr = 2024;
short hoehe = 1500;
```

#### int
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** -2.147.483.648 bis 2.147.483.647
- **Standardwert:** 0
- **Verwendung:** Standard für Ganzzahlen, am häufigsten verwendet

```java
int einwohner = 1000000;
int punktzahl = 42;
```

#### long
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
- **Standardwert:** 0L
- **Verwendung:** Sehr große Zahlen, Zeitstempel, große Berechnungen

```java
long weltbevoelkerung = 8000000000L;
long millisekunden = System.currentTimeMillis();
```

**Hinweis:** Bei long-Literalen muss ein `L` am Ende stehen

### Gleitkommazahlen

#### float
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** Ca. ±3.4 × 10³⁸ (6-7 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0f
- **Verwendung:** Kommazahlen mit einfacher Genauigkeit, wenn Speicher wichtig ist

```java
float preis = 19.99f;
float pi = 3.14159f;
```

**Hinweis:** Bei float-Literalen muss ein `f` am Ende stehen!

#### double
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** Ca. ±1.7 × 10³⁰⁸ (15 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0
- **Verwendung:** Standard für Kommazahlen, präzisere Berechnungen

```java
double pi = 3.141592653589793;
double ergebnis = 12.5 / 3.0;
```

### Zeichen

#### char
- **Größe:** 16 Bit (2 Bytes)
- **Wertebereich:** 0 bis 65.535 (Unicode-Zeichen)
- **Standardwert:** '\u0000' (Null-Zeichen)
- **Verwendung:** Einzelne Zeichen speichern

```java
char buchstabe = 'A';
char ziffer = '7';
char unicode = '\u0041';  // Unicode für 'A'
```

**Hinweis:** Zeichen werden in einfachen Anführungszeichen geschrieben.

### Boolesche Werte

#### boolean
- **Größe:** Nicht festgelegt (JVM-abhängig, meist 1 Bit)
- **Wertebereich:** `true` oder `false`
- **Standardwert:** false
- **Verwendung:** Wahrheitswerte, Bedingungen, Flags

```java
boolean istAktiv = true;
boolean hatBestanden = false;
boolean istGroesser = (5 > 3);  // true
```

### Vergleichstabelle

| Typ | Größe | Wertebereich | Standardwert | Beispiel |
|-----|-------|--------------|--------------|----------|
| byte | 8 Bit | -128 bis 127 | 0 | `byte b = 100;` |
| short | 16 Bit | -32.768 bis 32.767 | 0 | `short s = 1000;` |
| int | 32 Bit | -2³¹ bis 2³¹-1 | 0 | `int i = 42;` |
| long | 64 Bit | -2⁶³ bis 2⁶³-1 | 0L | `long l = 1000L;` |
| float | 32 Bit | ±3.4 × 10³⁸ | 0.0f | `float f = 3.14f;` |
| double | 64 Bit | ±1.7 × 10³⁰⁸ | 0.0 | `double d = 3.14;` |
| char | 16 Bit | 0 bis 65.535 | '\u0000' | `char c = 'A';` |
| boolean | ~1 Bit | true/false | false | `boolean b = true;` |

### Wichtige Hinweise

1. **Standardtypen:** Wenn du nichts anderes angibst, ist eine Ganzzahl ein `int` und eine Kommazahl ein `double`.

2. **Casting:** Von kleineren zu größeren Typen geht automatisch (implizit), von größeren zu kleineren musst du explizit casten.

3. **Overflow:** Wenn ein Wert zu groß für den Typ ist, "läuft er über":
   ```java
   byte b = 127;
   b++;  // Ergebnis: -128 (Overflow!)
   ```

4. **Genauigkeit:** Für präzise Finanzberechnungen solltest du `BigDecimal` statt `float` oder `double` verwenden, da Gleitkommazahlen Rundungsfehler haben können.

## Casting (Typumwandlung):

### Implizites Casting (Widening Conversion)
Das passiert automatisch, wenn wir von einem "kleineren" zu einem "größeren" Datentyp konvertieren. Java macht das selbst, weil dabei keine Informationen verloren gehen:

```java
int ganzeZahl = 42;
double kommaZahl = ganzeZahl;  // automatisch von int zu double
```
Die Hierarchie sieht so aus: byte → short → int → long → float → double

### Explizites Casting (Narrowing Conversion)
Das müssen wir selbst angeben, wenn wir von einem "größeren" zu einem "kleineren" Datentyp konvertieren. Hier können Daten verloren gehen:

```java
double kommaZahl = 42.7;
int ganzeZahl = (int) kommaZahl;  // Ergebnis: 42 (Nachkommastellen weg!)
```
Wir müssen den Zieltyp in Klammern vor den Wert schreiben. Weitere Beispiele:

```java
long großeZahl = 1000L;
int kleinereZahl = (int) großeZahl;  // explizit nötig

double d = 99.9;
byte b = (byte) d;  // explizit, Datenverlust möglich
```
**Wichtig**: Bei explizitem Casting können Werte "abgeschnitten" werden oder sich unerwartet verhalten, wenn sie außerhalb des Wertebereichs des Zieltyps liegen. Deshalb verlangt Java hier, dass wir es explizit hinschreiben - als Bestätigung, dass wir wissen, was wir tun.

## Scanner in Java - Kurzanleitung

Die `Scanner`-Klasse ermöglicht es, Benutzereingaben von der Konsole zu einzulesen.

## Grundlegende Verwendung

### 1. Import und Erstellung

```java
import java.util.Scanner;

public class BeispielProgramm {
public static void main(String[] args) {
// Objekt der Klasse Scanner mit Namen input erstellen
Scanner input = new Scanner(System.in);

// ... hier verwenden wir den Scanner (s.u.)

// Scanner am Ende schließen
input.close();
}
}
```

### Strings einlesen

```java
System.out.print("Gib deinen Namen ein: ");
String name = scanner.nextLine();  // Liest die ganze Zeile inkl. Leerzeichen

System.out.print("Gib ein Wort ein: ");
String wort = scanner.next();  // Liest nur bis zum ersten Leerzeichen
```

### Zahlen einlesen

```java
System.out.print("Gib eine Ganzzahl ein: ");
int zahl = scanner.nextInt();

System.out.print("Gib eine Kommazahl ein: ");
double kommazahl = scanner.nextDouble();

System.out.print("Gib einen Byte-Wert ein: ");
byte kleinZahl = scanner.nextByte();

System.out.print("Gib eine lange Zahl ein: ");
long langeZahl = scanner.nextLong();
```

### Boolesche Werte einlesen

```java
System.out.print("Ja oder Nein? (true/false): ");
boolean antwort = scanner.nextBoolean();
```

## Vollständiges Beispiel

```java
import java.util.Scanner;

public class BenutzerDaten {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Wie heißt du? ");
String name = scanner.nextLine();

System.out.print("Wie alt bist du? ");
int alter = scanner.nextInt();

System.out.print("Wie groß bist du (in Metern)? ");
double groesse = scanner.nextDouble();

System.out.println("\n--- Deine Angaben ---");
System.out.println("Name: " + name);
System.out.println("Alter: " + alter + " Jahre");
System.out.println("Größe: " + groesse + " m");

scanner.close();
}
}
```

## Häufige Fehler und Lösungen

### Problem: nextLine() nach nextInt() oder nextDouble()

```java
// FALSCH - überspringt die nextLine()-Eingabe
int alter = scanner.nextInt();
String name = scanner.nextLine();  // Wird übersprungen

// RICHTIG - extra nextLine() zum "Aufräumen"
int alter = scanner.nextInt();
scanner.nextLine();  // Entfernt den Zeilenumbruch
String name = scanner.nextLine();  // Funktioniert jetzt
```

**Grund:** `nextInt()` liest nur die Zahl, nicht den Zeilenumbruch. Dieser bleibt im Puffer und wird von `nextLine()` sofort eingelesen.

### Problem: Falsche Eingabe (InputMismatchException)
>[!NOTE]
> Exceptions mit `try catch` besprechen wir noch...

```java
// Fehlerabsicherung mit try-catch
try {
System.out.print("Gib eine Zahl ein: ");
int zahl = scanner.nextInt();
System.out.println("Deine Zahl: " + zahl);
} catch (Exception e) {
System.out.println("Fehler: Keine gültige Zahl!");
}
```

### Problem: Scanner nicht geschlossen

```java
// Besser: try-with-resources (automatisches Schließen)
try (Scanner scanner = new Scanner(System.in)) {
String eingabe = scanner.nextLine();
System.out.println("Du hast eingegeben: " + eingabe);
}  // Scanner wird automatisch geschlossen
```

## Übersicht der Scanner-Methoden

| Methode | Rückgabetyp | Beschreibung |
|---------|-------------|--------------|
| `next()` | String | Liest das nächste Wort (bis Leerzeichen) |
| `nextLine()` | String | Liest die ganze Zeile |
| `nextInt()` | int | Liest eine Ganzzahl |
| `nextDouble()` | double | Liest eine Kommazahl |
| `nextFloat()` | float | Liest eine Float-Zahl |
| `nextLong()` | long | Liest eine Long-Zahl |
| `nextByte()` | byte | Liest einen Byte-Wert |
| `nextShort()` | short | Liest einen Short-Wert |
| `nextBoolean()` | boolean | Liest true/false |
| `hasNext()` | boolean | Prüft, ob weitere Eingabe vorhanden |
| `hasNextInt()` | boolean | Prüft, ob nächste Eingabe ein int ist |

## Tipps

1. **Immer schließen:** Nicht vergessen, `scanner.close()` am Ende aufzurufen.
2. **Puffer leeren:** Nach `nextInt()`, `nextDouble()` usw. ein zusätzliches `scanner.nextLine()` verwenden, bevor wir wieder eine ganze Zeile einlesen.
3. **Eingaben validieren:** Wir verwenden `hasNextInt()`, `hasNextDouble()` usw., um zu prüfen, ob die Eingabe dem erwarteten Typ entspricht.
4. **Nur ein Scanner:** Wir erstellen für `System.in` nur einen Scanner pro Programm, sonst kann es zu Problemen kommen.


## Arrays

### Wichtige Eigenschaften

- Arrays haben eine **feste Größe**, die bei der Erstellung festgelegt wird
- Arrays sind **nullbasiert** (Index beginnt bei 0)
- `ArrayIndexOutOfBoundsException` wird geworfen bei Zugriff auf einen ungültigem Index
- Arrays sind **Objekte** in Java
- Standard-Werte: `0` für Zahlen, `false` für boolean, `null` für Objekte
- Arrays können mit `==` auf Referenzgleichheit geprüft werden, nutze `Arrays.equals()` für Inhaltsvergleich

### Array-Deklaration und Initialisierung

```java
// Deklaration - wir sagen, dass es das Array gibt
int[] zahlen;
String[] namen;

// Initialisierung - wir bestimmen die Anzahl der Elemente 
// und weisem jeden Element einen initialen Wert (je nach 
// verwendetem Datentyp) zu
// bei Intgern ist es 0
// bei Doubles ist es 0.0
// bei Booleans ist es false
// bei Strings ist es null
// ...

// Deklaration mit Größe
// in Java haben Arrays eine feste Grösse, die im Nachhinein
// nicht mehr geändert werden kann
int[] zahlen = new int[5];

// Deklaration mit Werten
int[] zahlen = {1, 2, 3, 4, 5};
String[] namen = {"Anna", "Bob", "Carl"};

// Alternative Syntax (weniger gebräuchlich)
int zahlen[] = new int[5];
```

## Zugriff auf Array-Elemente

```java
int[] zahlen = {10, 20, 30, 40, 50};

// Lesen
int ersteZahl = zahlen[0];  // 10
int letzteZahl = zahlen[4];  // 50

// Schreiben
zahlen[2] = 99;  // Array ist jetzt {10, 20, 99, 40, 50}

// Array-Länge
int laenge = zahlen.length;  // 5
```

## Mehrdimensionale Arrays

```java
// 2D-Array (Matrix)
int[][] matrix = new int[3][4];  // 3 Zeilen, 4 Spalten

// 2D-Array mit Werten
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Zugriff
int wert = matrix[1][2];  // 6 (Zeile 1, Spalte 2)

// 3D-Array
int[][][] cube = new int[3][3][3];
```

## Array durchlaufen

```java
int[] zahlen = {1, 2, 3, 4, 5};

// For-Schleife
for (int i = 0; i < zahlen.length; i++) {
    System.out.println(zahlen[i]);
}

// Enhanced For-Loop (For-Each)
for (int zahl : zahlen) {
    System.out.println(zahl);
}

// 2D-Array durchlaufen
int[][] matrix = {{1, 2}, {3, 4}};
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(matrix[i][j]);
    }
}
```

## Wichtige Array-Methoden (java.util.Arrays)

```java
import java.util.Arrays;

int[] zahlen = {5, 2, 8, 1, 9};

// Sortieren
Arrays.sort(zahlen);  // {1, 2, 5, 8, 9}

// Array ausgeben
System.out.println(Arrays.toString(zahlen));

// Array kopieren
int[] kopie = Arrays.copyOf(zahlen, zahlen.length);
int[] teilKopie = Arrays.copyOfRange(zahlen, 1, 4);

// Array füllen
Arrays.fill(zahlen, 0);  // Alle Elemente auf 0 setzen

// Arrays vergleichen
boolean gleich = Arrays.equals(zahlen, kopie);

// Binäre Suche (Array muss sortiert sein!)
int index = Arrays.binarySearch(zahlen, 5);
```
