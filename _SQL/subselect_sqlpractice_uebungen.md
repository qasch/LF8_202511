# SQL Subselect Übungen

## Datenbank: sqlpractice.com/patients

>[!NOTE]
> Versuche alle Aufgaben gezielt mit Subselects zu lösen, auch wenn es für die eine oder andere Aufgabe eine andere Möglichkeit geben mag.

## Aufgabe 1
Finde alle Patienten, die größer sind als die durchschnittliche Körpergröße.

Zeige: `first_name`, `last_name`, `height`

## Aufgabe 2
Ermittle, welche Allergie am seltensten vorkommt (aber mindestens 1x), und zeige alle Patienten mit dieser Allergie.

Zeige: `first_name`, `last_name`, `allergies`

## Aufgabe 3
Finde alle Ärzte, die noch keinen Patienten betreut haben (keine Einträge in admissions).

Zeige: `first_name`, `last_name`, `specialty`

## Aufgabe 4
Zeige für jede Provinz den ältesten Patienten (frühestes Geburtsdatum).

Zeige: `province_id`, `first_name`, `last_name`, `birth_date`

## Aufgabe 5
Finde alle Patienten, die häufiger eingewiesen wurden als die durchschnittliche Anzahl an Admissions pro Patient.

Zeige: `patient_id`, `first_name`, `last_name`, Anzahl der Admissions

## Aufgabe 6
Zeige für jede Stadt den schwersten Patienten.

Zeige: `city`, `first_name`, `last_name`, `weight`

## Aufgabe 7
Finde alle Patienten, die von einem Psychiater (Specialty = 'Psychiatrist') behandelt wurden.

Zeige: `patient_id`, `first_name`, `last_name`

**Hinweis:** Verwende DISTINCT, um doppelte Einträge zu vermeiden.

## Aufgabe 8
Welche Städte haben mehr Patienten als der Durchschnitt aller Städte?

Zeige: `city`, Anzahl der Patienten

## Aufgabe 9
Finde die am häufigsten vorkommende Diagnose und zeige alle Patienten, die diese Diagnose haben.

Zeige: `first_name`, `last_name`, `diagnosis`

## Aufgabe 10
Finde alle Admissions, deren Aufenthaltsdauer länger war als der Durchschnitt.

Zeige: `patient_id`, `admission_date`, `discharge_date`, Aufenthaltsdauer in Tagen

**Hinweis:** Verwende `JULIANDAY()` zur Berechnung der Tage.

## Aufgabe 11 
Finde alle Ärzte, die mindestens einen Patienten mit einer Herz-Diagnose (enthält 'Heart' oder 'Cardiac') betreut haben.

Verwende EXISTS statt IN!

Zeige: `first_name`, `last_name`, `specialty`

## Aufgabe 12
Finde Patienten, die von einem Arzt behandelt wurden, der mehr Patienten betreut als der Durchschnitt aller Ärzte.

Zeige: `patient_id`, `first_name`, `last_name`

