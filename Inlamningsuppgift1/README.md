# Inlamningsuppgift1

Fråga 1:

-Computer (Klass)

-Word(Klass)

-LongWord(Klass)

-Factorial (Klass)

-Program (Klass)

-Value (Interface)

-Memory (Klass)

-LongMemory(Klass)

-Address(Klass)

Fråga 2:

Man skulle kunna ha med Add som metoder i t.ex klasserna Sum eller Factorial, men då hade vi behövt duplicera koden för varje ny klass vi velat skriva, därför är det bättre att ha den i en superklass som vi istället "extendar". Likaså hade det varit en dum idé att lägga in den i Standardklassen 'Math', då vår önskade metod inte håller samma "scope" som de andra metoderna i Math.

Fråga 3:

Paketen som borde finnas är 'Computer' och 'Commands'. Vi vill hålla alla "dator"-relaterade saker i ena klassen, t.ex hur vi hanterar olika längder på ord och minnesallokering. Medan vi i 'Commands' har beskrivit de olika kommandon som vi kommer att använda oss av, så som 'Add' och 'Jump', alltså vår "assembly-kod".

Fråga 4:

Comman-Pattern kommer användas för att efterlikna assembly-koden vi kommer behöva använda oss av för att efterlikna en dator nere på maskinnivå. En klass skrivs för varje kommando, som i sin tur implementerar kommando-interfacet. Detta ger oss ett enkelt sätt att se exekveringshistorik.

Fråga 5:


Fråga 6:


Fråga 7:


Fråga 8:


Fråga 9:

