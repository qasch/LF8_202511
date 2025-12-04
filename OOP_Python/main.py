from computer import Computer

c = Computer(4, 16, "pink")

c.display_status()
c.__ram_size = 18
c.display_status()
c._Computer__ram_size = 18
c.display_status()

del c.number_cores
