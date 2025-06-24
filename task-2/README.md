# Analizator Par Liczb Sumujących się do 13

Ten program Java (`Task2.jar`) służy do znajdowania wszystkich par liczb całkowitych z podanego ciągu wejściowego, które sumują się do **13**. Program jest zaprojektowany do obsługi duplikatów i wyświetla znalezione pary w posortowanej kolejności.

---

## Funkcje

* **Wyszukiwanie par:** Identyfikowane są wszystkie pary liczb (x, y) z danych wejściowych, dla których $x + y = 13$.
* **Obsługa duplikatów:** Jeśli liczba występuje wielokrotnie, każda z jej instancji jest brana pod uwagę przy tworzeniu par.
* **Sortowanie wyników:** Znalezione pary są sortowane według pierwszej liczby.

---

## Jak uruchomić

Aby uruchomić ten program, wymagane jest zainstalowane środowisko **Java Runtime Environment (JRE)** w wersji 8 lub nowszej.

1.  **Pobierz plik JAR:** Należy pobrać plik `Task2.jar` z tego repozytorium.
2.  **Otwórz Terminal/Wiersz Poleceń:** Należy przejść do katalogu, w którym został zapisany plik `Task2.jar`.
3.  **Uruchom program:** Należy wpisać następującą komendę i nacisnąć Enter:

    ```bash
    java -jar Task2.jar
    ```

4.  **Wprowadź liczby:** Program wyświetli komunikat "Insert input numbers in line:" i poprosi o wprowadzenie ciągu liczb. Należy wprowadzić liczby oddzielone spacjami (np. `1 5 8 12 7 6 6 0 13`) i nacisnąć Enter.

    Przykład:

    ```
    Insert input numbers in line:
    1 5 8 12 7 6 6 0 13 6
    ```

    Wyjście programu dla powyższego przykładu będzie wyglądać tak:

    ```
    0 13
    1 12
    5 8
    6 7
    6 7
    6 7
    ```

---

### Obsługa błędów

* W przypadku wprowadzenia pustego ciągu znaków, program wyświetli komunikat "Empty input".
* W przypadku wprowadzenia tekstu, który nie jest liczbą całkowitą, program zgłosi błąd "An exception occurred: java.lang.NumberFormatException: For input string: \"tekst\"".