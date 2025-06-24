# Analizator Liczb

---

Ten program Java (`Task1.jar`) to proste narzędzie do analizy liczb całkowitych. Przyjmowane są ciągi liczb jako dane wejściowe, a następnie są one wyświetlane posortowane, zliczane, podawana jest liczba unikalnych wartości oraz znajdowana jest najmniejsza i największa liczba.

## Funkcje

* **Sortowanie i wyświetlanie:** Wyświetlane są wszystkie unikalne liczby w kolejności rosnącej.
* **Zliczanie:** Podawana jest całkowita liczba wprowadzonych wartości.
* **Liczba unikalnych:** Informowane jest, ile różnych liczb zostało wprowadzonych.
* **Wartość minimalna:** Znajdowana jest najmniejsza z wprowadzonych liczb.
* **Wartość maksymalna:** Znajdowana jest największa z wprowadzonych liczb.

## Jak uruchomić

Aby uruchomić ten program, wymagane jest zainstalowane środowisko **Java Runtime Environment (JRE)** w wersji 8 lub nowszej.

1.  **Pobierz plik JAR:** Należy pobrać plik `Task1.jar` z tego repozytorium.
2.  **Otwórz Terminal/Wiersz Poleceń:** Należy przejść do katalogu, w którym został zapisany plik `Task1.jar`.
3.  **Uruchom program:** Należy wpisać następującą komendę i nacisnąć Enter:

    ```bash
    java -jar Task1.jar
    ```

4.  **Wprowadź liczby:** Program wyświetli komunikat "Insert input numbers in line:" i poprosi o wprowadzenie ciągu liczb. Należy wprowadzić liczby oddzielone spacjami (np. `10 5 20 5 15`) i nacisnąć Enter.

    Przykład:
    ```
    Insert input numbers in line:
    10 5 20 5 15
    ```

    Wyjście programu będzie wyglądać mniej więcej tak:

    ```
    5 10 15 20
    count: 5
    distinct: 4
    min: 5
    max: 20
    ```

### Obsługa błędów

* W przypadku wprowadzenia pustego ciągu znaków, program wyświetli komunikat "Empty input".
* W przypadku wprowadzenia tekstu, który nie jest liczbą całkowitą, program zgłosi błąd "An exception occurred: java.lang.NumberFormatException: For input string: \"tekst\"".