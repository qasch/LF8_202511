# Statische Methoden

## Übung 1: Einfache Berechnungen

Erstelle eine Klasse `Rechner` mit folgenden statischen Methoden:

```java
// TODO: Implementiere folgende Methoden
public static int addiere(int a, int b)
public static int multipliziere(int a, int b)
public static double durchschnitt(int a, int b, int c)
```

**Testcode:**
```java
System.out.println(Rechner.addiere(5, 3));        // Soll 8 ausgeben
System.out.println(Rechner.multipliziere(4, 7));  // Soll 28 ausgeben
System.out.println(Rechner.durchschnitt(10, 20, 30)); // Soll 20.0 ausgeben
```

---

## Übung 2: String-Helfer

Erstelle eine Klasse `StringHelfer` mit folgenden statischen Methoden:

```java
// TODO: Implementiere folgende Methoden
public static boolean istPalindrom(String text)
public static int zaehleVokale(String text)
public static String umdrehen(String text)
```

**Testcode:**
```java
System.out.println(StringHelfer.istPalindrom("anna"));     // true
System.out.println(StringHelfer.istPalindrom("hallo"));    // false
System.out.println(StringHelfer.zaehleVokale("Hallo"));    // 2
System.out.println(StringHelfer.umdrehen("Java"));         // "avaJ"
```

---

## Übung 3: Temperatur-Konverter

Erstelle eine Klasse `TemperaturKonverter` mit statischen Methoden zur Umrechnung:

```java
// TODO: Implementiere folgende Methoden
public static double celsiusZuFahrenheit(double celsius)
public static double fahrenheitZuCelsius(double fahrenheit)
public static double celsiusZuKelvin(double celsius)
```

**Formeln:**
- Celsius → Fahrenheit: `(celsius * 9/5) + 32`
- Fahrenheit → Celsius: `(fahrenheit - 32) * 5/9`
- Celsius → Kelvin: `celsius + 273.15`

**Testcode:**
```java
System.out.println(TemperaturKonverter.celsiusZuFahrenheit(0));    // 32.0
System.out.println(TemperaturKonverter.fahrenheitZuCelsius(32));   // 0.0
System.out.println(TemperaturKonverter.celsiusZuKelvin(0));        // 273.15
```

---

## Übung 4: Array-Helfer

Erstelle eine Klasse `ArrayHelfer` mit folgenden statischen Methoden:

```java
// TODO: Implementiere folgende Methoden
public static int findeMaximum(int[] array)
public static int findeMinimum(int[] array)
public static double berechneSchnitt(int[] array)
public static boolean enthaelt(int[] array, int wert)
```

**Testcode:**
```java
int[] zahlen = {5, 2, 8, 1, 9, 3};
System.out.println(ArrayHelfer.findeMaximum(zahlen));      // 9
System.out.println(ArrayHelfer.findeMinimum(zahlen));      // 1
System.out.println(ArrayHelfer.berechneSchnitt(zahlen));   // 4.666...
System.out.println(ArrayHelfer.enthaelt(zahlen, 8));       // true
System.out.println(ArrayHelfer.enthaelt(zahlen, 7));       // false
```

---

## Übung 5: Zahlen-Prüfer

Erstelle eine Klasse `ZahlenPruefer` mit folgenden statischen Methoden:

```java
// TODO: Implementiere folgende Methoden
public static boolean istGerade(int zahl)
public static boolean istPrimzahl(int zahl)
public static boolean istPositiv(int zahl)
```

**Testcode:**
```java
System.out.println(ZahlenPruefer.istGerade(4));        // true
System.out.println(ZahlenPruefer.istGerade(7));        // false
System.out.println(ZahlenPruefer.istPrimzahl(7));      // true
System.out.println(ZahlenPruefer.istPrimzahl(8));      // false
System.out.println(ZahlenPruefer.istPositiv(-5));      // false
```

---

## Bonus-Übung: Passwort-Validator

Erstelle eine Klasse `PasswortValidator` mit einer statischen Methode:

```java
// TODO: Implementiere diese Methode
public static boolean istSicher(String passwort)
```

Ein Passwort ist sicher, wenn:
- Es mindestens 8 Zeichen lang ist
- Es mindestens eine Ziffer enthält
- Es mindestens einen Großbuchstaben enthält
- Es mindestens einen Kleinbuchstaben enthält

**Testcode:**
```java
System.out.println(PasswortValidator.istSicher("Hallo123"));   // true
System.out.println(PasswortValidator.istSicher("hallo"));      // false
System.out.println(PasswortValidator.istSicher("HALLO123"));   // false
```

---

## Tipps zur Umsetzung

1. **Statische Methoden** werden mit dem Schlüsselwort `static` deklariert
2. Sie werden über den **Klassennamen** aufgerufen, nicht über Objekte
3. Statische Methoden können **keine Instanzvariablen** verwenden
4. Perfekt für **Hilfsfunktionen** und **Utility-Klassen**

**Beispiel-Struktur:**
```java
public class MeineKlasse {
    public static int meineMethode(int parameter) {
        // Deine Implementierung hier
        return ergebnis;
    }
}
```

Viel Erfolg beim Üben! 🚀
