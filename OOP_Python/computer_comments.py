class Computer:
    """
    Beispielklasse zur Demonstration von
    - Konstruktor (__init__)
    - privaten / internen Attributen (_attribut)
    - Properties (Getter/Setter)
    - Methoden
    """

    ## Konstruktor
    def __init__(self, number_cores, ram_size, color):
        # interne Attribute (nicht direkt von außen benutzen)
        self._number_cores = number_cores
        self._ram_size = ram_size
        self._color = color
        self._is_on = False

    # -------------------------
    # Getter/Setter Properties
    # -------------------------

    # number_cores
    @property
    def number_cores(self):
        """Getter für number_cores"""
        return self._number_cores

    @number_cores.setter
    def number_cores(self, value):
        """Setter für number_cores"""
        if value < 1:
            raise ValueError("Ein Computer muss mindestens einen Kern haben.")
        self._number_cores = value

    @number_cores.deleter
    def number_cores(self):
        print("Attribut number_cores kann nicht gelöscht werden.")

    # ram_size
    @property
    def ram_size(self):
        return self._ram_size

    @ram_size.setter
    def ram_size(self, value):
        if value <= 0:
            raise ValueError("RAM muss größer als 0 sein.")
        self._ram_size = value

    # color
    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, value):
        self._color = value

    # is_on
    @property
    def is_on(self):
        """Gibt 'An' oder 'Aus' zurück."""
        return "An" if self._is_on else "Aus"

    @is_on.setter
    def is_on(self, value):
        """Erwartet True oder False."""
        self._is_on = bool(value)

    # -------------------------
    # Methoden
    # -------------------------

    def boot_up(self):
        print("Computer wird gestartet…")
        self.is_on = True

    def power_off(self):
        print("Computer wird ausgeschaltet…")
        self.is_on = False

    def restart(self):
        print("Starte neu…")
        self.power_off()
        self.boot_up()

    def display_status(self):
        print(
            f"Computer hat {self.number_cores} Kerne, "
            f"{self.ram_size} GB RAM, Farbe {self.color} "
            f"und ist momentan {self.is_on}."
        )

