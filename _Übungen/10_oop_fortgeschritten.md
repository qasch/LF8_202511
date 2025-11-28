# OOP-Übungen (fortgeschritten, didaktisch geführt)

Diese Übungen vertiefen Vererbung, Polymorphie, abstrakte Klassen, Interfaces und Komposition. Jede Aufgabe enthält konkrete Umsetzungsschritte und manuelle Checks, damit Lernende ihr Ergebnis sofort prüfen können.

## Übung 1: Vererbung und Überschreiben mit sinnvollen Defaults
- Erstelle eine Basisklasse `TierBasis` mit geschützten Attributen `name` und `geschwindigkeit` (double) sowie Methoden `bewegeDich()` und `beschreibe()`. `bewegeDich()` soll einen generischen Satz ausgeben.
- Leite `HundTier` und `VogelTier` ab. Überschreibe `bewegeDich()` so, dass Hund „läuft“ und Vogel „fliegt“ meldet; passe `beschreibe()` an, sodass die konkrete Tierart genannt wird.
- Füge Konstruktoren hinzu, die `name` und `geschwindigkeit` setzen; setze Mindestgeschwindigkeit 0.1, falls weniger übergeben wird.
- Manueller Check: Lege ein Array `TierBasis[]` mit beiden Unterklassen an, iteriere und rufe `bewegeDich()` sowie `beschreibe()` auf. Prüfe, dass die richtige Überschreibung ausgeführt wird (Polymorphie sichtbar).

## Übung 2: Abstrakte Klasse und Template-Methode
- Definiere eine abstrakte Klasse `Bestellung` mit Attributen `betragBrutto` und `kunde` sowie den Methoden `berechneNetto()`, `druckeBeleg()` (fertige Methode) und der abstrakten Methode `berechneSteuer()`.
- Implementiere zwei Unterklassen `Inlandsbestellung` (19 % Steuer) und `EUBestellung` (7 %). `berechneNetto()` soll immer `betragBrutto - berechneSteuer()` nutzen.
- `druckeBeleg()` soll Reihenfolge vorgeben: Netto berechnen, Steuer ausgeben, Brutto ausgeben. (Template-Methode-Prinzip.)
- Manueller Check: Erzeuge je eine Bestellung, rufe `druckeBeleg()` auf und kontrolliere, ob die Steuerberechnung je nach Klasse variiert.

## Übung 3: Interfaces für Fähigkeiten kombinieren
- Lege Interfaces `Fliegbar` (Methode `fliegen()`), `Schwimmbar` (`schwimmen()`) und `LautGeben` (`lautGeben()`) an.
- Erstelle Klassen `Ente`, `Pinguin`, `Fledermaus` mit passenden Implementierungen:
  - `Ente` kann alle drei Fähigkeiten, `Pinguin` schwimmt und gibt Laut, `Fledermaus` fliegt und gibt Laut.
- Schreibe eine Utility-Methode `testeFaehigkeiten(Object o)`, die mittels `instanceof` prüft, welche Interfaces vorliegen, und die jeweiligen Methoden aufruft.
- Manueller Check: Rufe `testeFaehigkeiten()` mit Instanzen aller drei Klassen auf und beobachte, dass nur vorhandene Fähigkeiten ausgeführt werden.

## Übung 4: Komposition statt Vererbung
- Erstelle Klassen `Motor` (Attribute: `ps`, `typ`) und `Fahrzeug` mit Attributen `marke`, `modell` und einer Referenz auf `Motor`.
- `Fahrzeug` besitzt Methoden `beschreibe()` (gibt alle Daten aus) und `tauscheMotor(Motor neu)`, die den Motor ersetzt.
- Vermeide Vererbung zwischen `Fahrzeug` und `Motor`; sie stehen in einer „hat-einen“-Beziehung.
- Manueller Check: Erzeuge ein Fahrzeug mit einem Motor, beschreibe es, tausche den Motor gegen ein stärkeres Modell und beschreibe erneut.

## Übung 5: Polymorphe Sammlung und gemeinsame Oberklasse
- Definiere eine abstrakte Klasse `Form` mit Methode `double flaeche()` und `String name`.
- Implementiere `Kreis` (Attribut `radius`) und `RechteckForm` (Attribute `breite`, `hoehe`).
- Lege eine `ArrayList<Form>` an, füge beide Formen hinzu und summiere die Gesamtfläche in einer Schleife über die gemeinsame Oberklasse.
- Manueller Check: Berechne die Summe und kontrolliere die Einzelwerte per Hand, um sicherzugehen, dass Polymorphie korrekt greift.

## Übung 6: Zustandskapselung und defensive Setter
- Erstelle eine Klasse `Bankkonto` mit privaten Feldern `kontonummer` (final), `kontostand` (double) und `kontoinhaber`.
- Konstruktor setzt Kontonummer und Inhaber; Startsaldo 0.0. Methoden: `einzahlen(double betrag)`, `abheben(double betrag)` (nur, wenn Deckung vorhanden), `zeigeStand()`.
- Verhindere negative Beträge in beiden Methoden; gib eine klare Fehlermeldung aus, falls die Eingabe ungültig ist.
- Manueller Check: Simuliere Ein- und Auszahlungen; versuche einen zu hohen Abhebebetrag und prüfe, dass der Saldo unverändert bleibt.
