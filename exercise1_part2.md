# Exercise 1 - Part 2: Git Commands

## Verwendete Git-Befehle
* **`git clone <url>`**: Lädt ein Repository von GitHub auf den lokalen Rechner herunter.
* **`git config`**: Legt globale Benutzereinstellungen wie Name und E-Mail-Adresse fest.
* **`git add <datei>`**: Schiebt Dateien in den Staging-Bereich (den Zwischenspeicher für den nächsten Commit).
* **`git commit -m "..."`**: Speichert die Änderungen dauerhaft als neue Version im lokalen Repository ab.
* **`git status`**: Zeigt den aktuellen Status der Dateien an (z.B. welche neu, verändert oder noch ungetrackt sind).

## Beobachtung zu .gitignore
Nachdem die Datei `.gitignore` erstellt und mit `*.html` und `*.pdf` befüllt wurde, sind diese Dateien bei `git status` komplett aus der Liste der "Untracked files" verschwunden. Git ignoriert sie nun vollständig.