# Licznik Spójnych Składowych Grafu

Ten program Java (`Task3.jar`) służy do zliczania liczby spójnych składowych w niekierowanym grafie. Graf jest definiowany przez użytkownika poprzez podanie par wierzchołków (krawędzi). Program wykorzystuje algorytm przeszukiwania w głąb (DFS) do identyfikacji spójnych składowych.

---

## Funkcje

* **Zliczanie spójnych składowych:** Określana jest całkowita liczba odrębnych, połączonych ze sobą grup wierzchołków w grafie.
* **Dynamiczne tworzenie grafu:** Graf jest budowany na podstawie danych wejściowych od użytkownika.
* **Wykorzystanie DFS:** Algorytm DFS jest używany do efektywnego przemierzania wierzchołków i identyfikowania spójnych składowych.

---

## Jak uruchomić

Aby uruchomić ten program, wymagane jest zainstalowane środowisko **Java Runtime Environment (JRE)** w wersji 8 lub nowszej.

1.  **Pobierz plik JAR:** Należy pobrać plik `Task3.jar` z tego repozytorium.
2.  **Otwórz Terminal/Wiersz Poleceń:** Należy przejść do katalogu, w którym został zapisany plik `Task3.jar`.
3.  **Uruchom program:** Należy wpisać następującą komendę i nacisnąć Enter:

    ```bash
    java -jar Task3.jar
    ```

4.  **Wprowadź liczbę par:** Program wyświetli komunikat "Insert number of pairs:" i poprosi o podanie liczby krawędzi w grafie. Należy wprowadzić liczbę całkowitą i nacisnąć Enter.

    Przykład:
    ```
    Insert number of pairs:
    3
    ```

5.  **Wprowadź pary wierzchołków:** Program wyświetli komunikat "Insert pairs of nodes line by line:" i poprosi o wprowadzenie par wierzchołków, każda w osobnej linii. Wierzchołki w parze powinny być oddzielone spacją.

    Przykład (kontynuacja powyższego):
    ```
    Insert pairs of nodes line by line:
    1 2
    3 4
    2 3
    ```

    Dla powyższych danych wejściowych (3 pary: 1-2, 3-4, 2-3), wyjście programu będzie wynosić:

    ```
    1
    ```
    (ponieważ wszystkie wierzchołki: 1, 2, 3, 4 tworzą jedną spójną składową).

    Inny przykład:
    Wprowadź liczbę par: `2`
    Wprowadź pary wierzchołków:
    `1 2`
    `3 4`
    Wyjście: `2` (ponieważ istnieją dwie spójne składowe: {1,2} i {3,4}).

---

### Obsługa błędów

* W przypadku wprowadzenia pustego ciągu znaków, program wyświetli komunikat "Empty input".
* W przypadku wprowadzenia tekstu, który nie jest liczbą całkowitą, lub błędnego formatu pary wierzchołków, program zgłosi błąd "An exception occurred: java.lang.NumberFormatException: For input string: \"tekst\"".