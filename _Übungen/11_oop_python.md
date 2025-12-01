# OOP in Python

## Übung 1 – Abstrakte Klassen & abstrakte Methoden

1. Erstelle eine abstrakte Klasse `Device` mit den abstrakten Methoden:
   - `start()` (abstrakt)
   - `shutdown()` (abstrakt)

>[!NOTE]
> In Python werden abstrakte Klassen über das `abc`-Modul umgesetzt, welches importiert werden muss. Zusätzlich müssen abstrakte Methoden mit dem Decorator `@abstractmethod` gekennzeichnet werden:
```python
   from abc import ABC, abstractmethod
   ...
   @abstractmethod
   def my_abstract_method(self):
       pass
   ```

2. Lasse `Computer` von `Device` erben und implementiere beide Methoden.
3. Teste, ob du eine Instanz der Klasse `Device` bzw. `Computer` erzeugen kannst.

## Übung 2 – Methoden überschreiben (Overriding)

1. Erstelle eine Klasse `GamingComputer`, die von `Computer` erbt.
2. Überschreibe:
   - `boot_up()` → zusätzlich soll ausgegeben werden: *"RGB-Beleuchtung aktiviert"*
   - `display_status()` → zusätzlich soll ausgegeben werden: *"Gaming-Modus: Aktiv"*
3. Verwende `super()` um das Verhalten zu erweitern.

## Übung 3 – Methoden überladen (Overloading)

>[!NOTE]
> Python hat **kein echtes Overloading** wie Java.
> Wir können diese Verhalten aber durch Angabe von Default-Argumenten oder `*args` bzw. `**kwargs` implementieren.

1. Versuche, einen weiteren Initializer zu erstellen, so dass ein Computer auch wie folgt initialisiert werden kann, also ohne Angabe expliziter Argumente:
```python
c = Computer()
```
2. Implementiere eine Methode `install_software()` in `Computer`, die folgende Aufrufe erlaubt:

```python
c.install_software("LibreOffice")
c.install_software("Firefox", "Thunderbird", "VS Code")
c.install_software(["KeePass", "GIMP"])
```
>[!NOTE]
> Nutze `*args` bzw. prüfe, ob eine Liste übergeben wurde.

## Übung 4 – Abstrakte Klasse + Überschreiben + Polymorphie

### Aufgaben
1. Erstelle `NetworkDevice` (abstrakt) mit:
   - `connect()`  
   - `disconnect()`
2. Erstelle `Router` und `Switch`, beide überschreiben die Methoden.
3. Funktion:
   ```python
   def test_connection(device: NetworkDevice):
       device.connect()
       device.disconnect()
   ```
4. Übergib Router und Switch.

## Übung 5 – Projektaufgabe (Kombination aller Themen)

### Aufgaben
1. Erstelle abstrakte Klasse `SmartDevice`:
   - `turn_on()` (abstrakt)
   - `turn_off()` (abstrakt)
   - `status()` (konkret)
2. Leite ab:
   - `SmartPhone`
   - `SmartWatch`
   - `SmartHomeHub`
3. Jede Klasse:
   - überschreibt min. eine Methode
   - erweitert min. eine Methode mit `super()`
4. Bonus:
   Implementiere polymorphes Verhalten mit „Overloading-Effekt“:
   ```python
   send_message("Hallo")
   send_message("Hallo", "Alice")
   send_message(["A", "B", "C"])
   ```
5. Testprogramm erstellen.

