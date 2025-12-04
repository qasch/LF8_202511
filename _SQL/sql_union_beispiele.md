# SQL UNION

## Was ist UNION?

`UNION` kombiniert die Ergebnisse von zwei oder mehr `SELECT`-Abfragen zu einem Ergebnis. 

>[!NOTE]
> - Alle `SELECT`-Abfragen müssen die **gleiche Anzahl** an Spalten haben
> - Die Spalten müssen **kompatible Datentypen** haben
> - `UNION` entfernt automatisch **Duplikate** (nutze `UNION ALL` (ist schneller) um Duplikate zu behalten)
> - Die Spaltennamen werden aus der ersten Query übernommen  
> - `ORDER BY` kommt ganz am Ende (nach allen `UNION`s)  

## Beispiel 1: Weibliche und männliche Patienten in einer Liste

Eine Liste aller weiblichen und männlichen Patienten mit Label "Weiblich" bzw. "Männlich":

```sql
SELECT 
  first_name,
  last_name,
  'Weiblich' AS geschlecht
FROM patients
WHERE gender = 'F'

UNION

SELECT 
  first_name,
  last_name,
  'Männlich' AS geschlecht
FROM patients
WHERE gender = 'M';
```

## Beispiel 2: Patienten und Ärzte in einer Liste

Eine sortierte Liste mit allen Personen (Patienten und Ärzte), gruppiert nach Patient bzw. Arzt:

```sql
SELECT 
  first_name || ' ' || last_name AS name,
  'Patient' AS typ,
  city AS ort
FROM patients

UNION

SELECT 
  first_name || ' ' || last_name AS name,
  'Arzt' AS typ,
  'N/A' AS ort
FROM doctors
ORDER BY typ, name;
```
>[!NOTE]
> Da wir in der Tabelle `doctors` keine Ortsangabe haben, müssen wir hier eine *künstliche* Spalte erzeugen.

## Beispiel 3: Unterschied von UNION zu UNION ALL

```sql
-- UNION entfernt Duplikate
SELECT city FROM patients
UNION
SELECT city FROM patients;

-- UNION ALL behält alle Zeilen (auch Duplikate)
SELECT city FROM patients
UNION ALL
SELECT city FROM patients;
```
- **UNION:** Jede Stadt erscheint nur einmal  
- **UNION ALL:** Jede Stadt erscheint doppelt (schneller, da keine Duplikatsprüfung)

## Beispiel 4: Drei SELECTs - Verschiedene Altersgruppen

Eine Liste aller Patienten gruppiert nach Altersgruppen 0-17, 18-64 und 65+:

```sql
SELECT 
  first_name,
  last_name,
  birth_date,
  'Kind (0-17)' AS altersgruppe
FROM patients
WHERE (YEAR(CURRENT_DATE) - YEAR(birth_date)) < 18

UNION

SELECT 
  first_name,
  last_name,
  birth_date,
  'Erwachsener (18-64)' AS altersgruppe
FROM patients
WHERE (YEAR(CURRENT_DATE) - YEAR(birth_date)) BETWEEN 18 AND 64

UNION

SELECT 
  first_name,
  last_name,
  birth_date,
  'Senior (65+)' AS altersgruppe
FROM patients
WHERE (YEAR(CURRENT_DATE) - YEAR(birth_date)) >= 65
ORDER BY altersgruppe, last_name;
```
