# Inlamningsuppgift1

Fråga 1:

-Computer (Klass)

-Word(Klass)

-LongWord(Klass)

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

Command-Pattern kommer användas för att efterlikna assembly-koden vi kommer behöva använda oss av för att efterlikna en dator nere på maskinnivå. En klass skrivs för varje kommando, som i sin tur implementerar kommando-interfacet. Detta ger oss ett enkelt sätt att se exekveringshistorik.

Fråga 5:

Kan bli aktuellt för Word och LongWord, samt Memory och LongMemory.

Fråga 6:

Man bryter loss och flyttar upp metoder som kan behöva ändras till ett interface. Detta för att kunna modifiera eller byta ut algoritmer utan att behöva ändra övriga klasser. 

Fråga 7:

Additionen sker i klassen LongWord.

Fråga 8:


Fråga 9:

================================

factorial(5) med olika slags ord

0: Copy 5 to [0]

1: Copy 1 to [1]

2: Jump to 6 if [0] == 1

3: Multiply [1] and [0] into [1]

4: Add [0] and -1 into [0]

5: Jump to 2

6: Print [1]

7: Halt


120