# FiguryJava

Wykorzystując technikę kompozycji stwórz następujące klasy (język dowolny, w C++ użyj obiektów dynamicznych i przeciąż operator "<<" , nazwy 'toString/ToString' i 'String/string' w różnych językach zaczynają się od litery o różnej wielkości):
klasa Punkt reprezentująca punkt na płaszczyźnie ze współrzędnymi x i y. Powinna posiadać 3 konstruktory: domyślny, dwuparametrowy (int, int) i kopiujący.

klasa Linia składająca się z 2 punktów. Linia powinna posiadać 3 konstruktory: domyślny, dwuparametrowy (Punkt, Punkt) oraz kopiujący.

klasa Trojkąt skłądająca się z 3 linii.

klasa Czworokąt składająca się z 4 linii

klasa Obraz zawierająca przywatną kolekcję (tablicę, listę) figur - trójkątów i czworokątów oraz metody umożliwiające dodawanie nowych figur do kolekcji

W konstruktorze każdej z klas zbudowanych z obiektów innych klas (klas-kompozytów zbudowanych z klas-komponentów) powinno się budować również obiekty komponentów. Warto pamiętać przy tym, że w Javie/C# z jednego konstruktora danej klasy można wywołać inny konstruktor danej klasy, aby uniknąć duplikacji kodu.

Jakie parametry powinny przyjmować konstruktory Czworokąta i Trójkąta, aby zapewnić, że każdy z nich będzie spójny (tzn. ich linie będą się łączyć końcami) ?

Każda z klas powinna mieć

metodę 'przesun(int dx, int dy)', przy czym w klasach składających się z obiektów innych klas powinna ona wywoływać metody 'przesun' swoich obiektów składowych.

metodę 'String toString()' zwracające tekstową reprezentację danego obiektu, przy czym w klasach składających się z obiektów innych klas powinna ona wywoływać metody 'toString' swoich obiektów składowych.

W klasach powinno się oczywiście używać zasad hermetyzacji.
