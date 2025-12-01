class Computer:
    ## Attribute/Eigenschaften
    ## -> machen wir nicht hier oben, sonder im Initializer
    #number_cores = 0   # public
    #__ram_size = 0     # private
    #_color = None      # protected

    ## Konstruktor -> Initializer
    ## heißt immer __init__, nicht wie die Klasse (Vergleich Java)
    def __init__(self, number_cores, ram_size, color):
        self.number_cores = number_cores
        self.ram_size = ram_size
        self.color = color
        self.is_on = False

    ## Getter und Setter
    # -> gibt es so in Python eigentlich nicht
    # Realisierung nur wenn nötig über
    # Setter: @number_core.setter
    # Getter: @property

    # Äquivalient zum Getter in Java
    # wäre hier nicht nötig und würde einfach weggelassen werden
    @property
    def number_cores(self):
        return self._number_cores

    # Äquivalient zum Setter in Java
    @number_cores.setter
    def number_cores(self, value):
        self._number_cores = value

    @property
    def is_on(self):
        if self._is_on:
            return "An"
        else:
            return "Aus"

    @is_on.setter
    def is_on(self, value):
        self._is_on = value

    # Deleter - was passiert, wenn versucht wird, das Attribut zu löschen
    # NOTE:
    #  del c.number_cores
    @number_cores.deleter
    def number_cores(self):
        print("Attribut number_cores kann nicht gelöscht werden")


    ## Methoden/Funktionalitäten
    # boot_up()
    def boot_up(self):
        print("Computer wird gestartet")
        self.is_on = True


    # power_off()
    def power_off(self):
        print("Computer wird ausgeschaltet")
        self.is_on = False

    # restart()
    def restart(self):
        self.power_off()
        self.boot_up()


    # show_bluescreen()
    # display_status()
    def display_status(self):
        print(f"Computer hat {self.number_cores}, {self.ram_size} GB RAM und ist momentan {self.is_on}")