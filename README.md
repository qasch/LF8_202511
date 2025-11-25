# Primitive Datentypen in Java

Java hat 8 primitive Datentypen, die in vier Kategorien unterteilt werden können.

## Ganzzahlige Datentypen

### byte
- **Größe:** 8 Bit (1 Byte)
- **Wertebereich:** -128 bis 127
- **Standardwert:** 0
- **Verwendung:** Speicherung von kleinen Zahlen, z.B. bei großen Arrays wo Speicher wichtig ist

```java
byte alter = 25;
byte temperatur = -10;
```

### short
- **Größe:** 16 Bit (2 Bytes)
- **Wertebereich:** -32.768 bis 32.767
- **Standardwert:** 0
- **Verwendung:** Seltener verwendet, wenn int zu groß wäre

```java
short jahr = 2024;
short hoehe = 1500;
```

### int
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** -2.147.483.648 bis 2.147.483.647
- **Standardwert:** 0
- **Verwendung:** Standard für Ganzzahlen, am häufigsten verwendet

```java
int einwohner = 1000000;
int punktzahl = 42;
```

### long
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
- **Standardwert:** 0L
- **Verwendung:** Sehr große Zahlen, Zeitstempel, große Berechnungen

```java
long weltbevoelkerung = 8000000000L;
long millisekunden = System.currentTimeMillis();
```

**Hinweis:** Bei long-Literalen muss ein `L` am Ende stehen

## Gleitkommazahlen

### float
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** Ca. ±3.4 × 10³⁸ (6-7 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0f
- **Verwendung:** Kommazahlen mit einfacher Genauigkeit, wenn Speicher wichtig ist

```java
float preis = 19.99f;
float pi = 3.14159f;
```

**Hinweis:** Bei float-Literalen muss ein `f` am Ende stehen!

### double
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** Ca. ±1.7 × 10³⁰⁸ (15 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0
- **Verwendung:** Standard für Kommazahlen, präzisere Berechnungen

```java
double pi = 3.141592653589793;
double ergebnis = 12.5 / 3.0;
```

## Zeichen

### char
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

## Boolesche Werte

### boolean
- **Größe:** Nicht festgelegt (JVM-abhängig, meist 1 Bit)
- **Wertebereich:** `true` oder `false`
- **Standardwert:** false
- **Verwendung:** Wahrheitswerte, Bedingungen, Flags

```java
boolean istAktiv = true;
boolean hatBestanden = false;
boolean istGroesser = (5 > 3);  // true
```

## Vergleichstabelle

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

## Wichtige Hinweise

1. **Standardtypen:** Wenn du nichts anderes angibst, ist eine Ganzzahl ein `int` und eine Kommazahl ein `double`.

2. **Casting:** Von kleineren zu größeren Typen geht automatisch (implizit), von größeren zu kleineren musst du explizit casten.

3. **Overflow:** Wenn ein Wert zu groß für den Typ ist, "läuft er über":
   ```java
   byte b = 127;
   b++;  // Ergebnis: -128 (Overflow!)
   ```

4. **Genauigkeit:** Für präzise Finanzberechnungen solltest du `BigDecimal` statt `float` oder `double` verwenden, da Gleitkommazahlen Rundungsfehler haben können.
