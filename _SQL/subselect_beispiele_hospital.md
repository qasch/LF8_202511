# Beispiele für Subselects 

Anhand von `hospital.db` auf https://www.sql-practice.com

## 1. Subselect in der WHERE-Klausel

### Aufgabe
Finde alle Patienten, die schwerer sind als der Durchschnitt aller Patienten.

### SQL-Query mit Subselect
```sql
SELECT 
    first_name, 
    last_name, 
    weight
FROM patients
WHERE weight > (SELECT AVG(weight) FROM patients);
```
#### Was passiert hier?

1. **Innerer SELECT (Subselect):**
   ```sql
   (SELECT AVG(weight) FROM patients)
   ```
   - Dieser wird **zuerst** ausgeführt
   - Berechnet das durchschnittliche Gewicht **aller** Patienten
   - Liefert **einen einzigen Wert** zurück (z.B. `75.5`)
   - Dieser Wert ist ein **skalarer Subselect** (einzelner Wert)

2. **Äußerer SELECT:**
   ```sql
   SELECT first_name, last_name, weight
   FROM patients
   WHERE weight > 75.5
   ```
   - Verwendet den Rückgabewert des Subselects
   - Filtert alle Patienten, deren Gewicht größer ist als der Durchschnitt
   - Gibt `first_name`, `last_name` und `weight` dieser Patienten aus

#### Ausführungsreihenfolge:

1. Berechne `AVG(weight)` → z.B. 75.5 kg
2. Ersetze Subselect durch Ergebnis: `WHERE weight > 75.5`
3. Führe äußeren `SELECT` mit diesem Kriterium aus

### Alternative Lösung (ohne Subselect)

In diesem speziellen Fall gibt es **keine einfache Alternative ohne Subselect**, da SQL nicht erlaubt, Aggregatfunktionen direkt in der WHERE-Klausel zu verwenden.

Das folgende Beispiel führt zu einem Fehler:

```sql
SELECT first_name, last_name, weight
FROM patients
WHERE weight > AVG(weight);
-- Fehler: "Aggregate functions are not allowed in WHERE"
```
## 2. Subselect in der FROM-Klausel (Derived Table)

### Aufgabe
Berechne die durchschnittliche Anzahl von Krankenhausaufenthalten pro Patient.

### SQL-Query mit Subselect
```sql
SELECT 
    ROUND(AVG(admission_count), 2) as durchschnittliche_aufenthalte
FROM (
    SELECT 
        patient_id, 
        COUNT(*) as admission_count
    FROM admissions
    GROUP BY patient_id
) as patient_aufenthalte;
```
#### Was passiert hier?

1. **Innerer SELECT (Derived Table):**
   ```sql
   SELECT patient_id, COUNT(*) as admission_count
   FROM admissions
   GROUP BY patient_id
   ```
   - Gruppiert alle Aufenthalte nach `patient_id`
   - Zählt für **jeden Patienten**, wie oft er aufgenommen wurde
   - Erstellt eine **temporäre Tabelle** mit zwei Spalten:
     - `patient_id`
     - `admission_count` (Anzahl der Aufenthalte)
   
2. **Äußerer SELECT:**
   ```sql
   SELECT ROUND(AVG(admission_count), 2)
   FROM patient_aufenthalte
   ```
   - Behandelt das Subselect wie eine **normale Tabelle** (Alias: `patient_aufenthalte`)
   - Berechnet den Durchschnitt der `admission_count`-Spalte
   - Rundet auf 2 Dezimalstellen

#### Ausführungsreihenfolge:

1. Erstellt eine temporäre Tabelle mit Aufenthalten (`admission_count`) pro Patient
2. Berechnt `AVG()` über diese temporäre Tabelle
3. Rundet das Ergebnis und gibt es aus

### Alternative Lösung (ohne Subselect in FROM)

**Mit zwei getrennten Queries:**
```sql
-- Query 1: Zähle Patienten
SELECT COUNT(DISTINCT patient_id) as anzahl_patienten FROM admissions;
-- Ergebnis: z.B. 50

-- Query 2: Zähle Gesamtaufenthalte
SELECT COUNT(*) as gesamt_aufenthalte FROM admissions;
-- Ergebnis: z.B. 137

-- Manuell: 137 / 50 = 2.74, z.B. in Programmiersprache
```
## 3. Subselect in der SELECT-Klausel (Scalar Subquery)

### Szenario
Zeige jeden Arzt mit der Anzahl der behandelten Patienten.

### SQL-Query mit Subselect

```sql
SELECT 
    d.first_name, 
    d.last_name, 
    d.specialty,
    (SELECT COUNT(*) 
     FROM admissions a
     WHERE a.attending_doctor_id = d.doctor_id) as anzahl_patienten
FROM doctors d
ORDER BY anzahl_patienten DESC;
```
#### Was passiert hier?

1. **Äußerer SELECT:**
   ```sql
   SELECT d.first_name, d.last_name, d.specialty, ...
   FROM doctors d
   ```
   - Iteriert über **jeden Arzt** in der `doctors`-Tabelle
   - Für **jede Zeile** wird der Subselect erneut ausgeführt

2. **Innerer SELECT (Korrelierter Subselect):**
   ```sql
   (SELECT COUNT(*) 
    FROM admissions a
    WHERE a.attending_doctor_id = d.doctor_id)
   ```
   - Wird für **jeden Arzt individuell/erneut** ausgeführt
   - Zählt alle Einträge in `admissions`, wo `attending_doctor_id` mit der aktuellen `doctor_id` übereinstimmt
   - Gibt **einen einzelnen Wert** zurück (z.B. `7`)
   - **Korreliert** bedeutet: Bezieht sich auf die äußere Query (`d.doctor_id`)

#### Ausführungsreihenfolge (für jeden Arzt):
1. Für Dr. Walls (doctor_id = 1):
    - Subselect wird ausgeführt: `COUNT(*) FROM admissions WHERE attending_doctor_id = 1;`
  
2. Für Dr. Green (doctor_id = 2)
    - Subselect wird ausgeführt: `COUNT(*) FROM admissions WHERE attending_doctor_id = 2;`
  
3. Für Dr. Tregre (doctor_id = 3)
    - Subselect wird ausgeführt: `COUNT(*) FROM admissions WHERE attending_doctor_id = 3;`

### Alternative Lösung (mit JOIN und GROUP BY)

```sql
SELECT 
    d.first_name, 
    d.last_name, 
    d.specialty,
    COUNT(a.patient_id) as anzahl_patienten
FROM doctors d
LEFT JOIN admissions a ON d.doctor_id = a.attending_doctor_id
GROUP BY d.doctor_id, d.first_name, d.last_name, d.specialty
ORDER BY anzahl_patienten DESC;
```

#### Vergleich: Subselect vs. JOIN

| Aspekt | Subselect in SELECT | LEFT JOIN + GROUP BY |
|--------|---------------------|----------------------|
| **Lesbarkeit** | Intuitiv: "Für jeden Arzt, zähle..." | Komplexer: JOIN + Gruppierung |
| **Performance** | Langsamer bei vielen Zeilen (N+1 Problem) | Schneller bei großen Datenmengen |
| **Ärzte ohne Patienten** | Zeigt `0` automatisch | Braucht `LEFT JOIN` + `COUNT(a.patient_id)` |
| **Erweiterbarkeit** | Schwierig für mehrere Zählungen | Einfacher für komplexe Aggregationen |

## Wann sollten wir welchen Subselect-Typ verwenden?

### 1. WHERE-Subselect
Filterung basierend auf aggregierten Werten oder anderen Berechnungen.

**Typische Anwendungsfälle:**

- "Alle X, die größer/kleiner als der Durchschnitt sind"
- "Alle X, die in einer bestimmten Menge enthalten sind" (`IN`)
- "Alle X, für die Y existiert" (`EXISTS`)

### 2. FROM-Subselect (Derived Table)
Vorberechnete Zwischenergebnisse, die weiter verarbeitet werden.

**Typische Anwendungsfälle:**

- Aggregationen von Aggregationen (z.B. Durchschnitt von COUNT-Werten)
- Komplexe Berechnungen, die in mehreren Schritten erfolgen
- "Pivot"-ähnliche Operationen

### 3. SELECT-Subselect (Scalar Subquery)
Zusätzliche Spalten mit berechneten Werten pro Zeile.

**Typische Anwendungsfälle:**

- "Für jedes X, berechne Y aus einer anderen Tabelle"
- Zählungen oder Summen pro Zeile
- Wenn JOIN + GROUP BY zu komplex wird

## Beispielaufgaben:

1. **WHERE:** Finde alle Patienten, die größer sind als die durchschnittliche Körpergröße.
2. **FROM:** Berechne das durchschnittliche Gewicht pro Stadt, aber zeige nur Städte, die über dem Gesamtdurchschnitt liegen.
3. **SELECT:** Zeige jeden Patienten mit der Anzahl seiner Krankenhausaufenthalte (auch wenn er 0 hat).
