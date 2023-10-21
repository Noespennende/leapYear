For at maven skal kunne kjøre tester må man inkludere pluginen shurefire som er den git bruker til å kjøre
testene i repositoriet. Jeg la til disse dependansiesene i pom.xml

Så for at github actions skal vite hva den skal gjøre trenger den en .yml fil med instruksjoner.
Denne ligger i .github/workflows/ 

I min .yml fil som heter run-tests.yml er den satt op til å kjøre hver gang projektet pusher eller blir pullet.

Den er satt up til å kjøre på siste versjon av ubuntu og å bruke java versjon 19 i terminus på en x64 operativsystem.

Den er til slutt satt opp til å bygge maven prosjektet og deretter kjøre maven som igjen kjører testene i test filen.