# 2016-06-09
Simulazione esame 2016-06-09 Punto B

Si consideri il database “formula1”, contenente informazioni su tutte le gare, i costruttori, i piloti ed i circuiti di Formula 1, estratto dai dati pubblicati sul sito http://ergast.com/mrd/

Si intende costruire un’applicazione JavaFX che permetta di interrogare tale base dati, e calcolare informazioni a proposito delle gare disputate.

L’applicazione dovrà svolgere le seguenti funzioni:

* Permettere all’utente di selezionare un l’anno di una stagione (tabella seasons) in cui si sia disputato un campionato. Dopo aver selezionato l’anno, l’utente può selezionare uno dei circuiti (tabella circuits) nei quali si sono disputate delle gare (races) nell’anno indicato. La tendina contenente l’elenco dei circuiti deve essere aggiornata automaticamente ogniqualvolta cambi l’anno selezionato. Alla pressione del tasto “Info Gara”, l’applicazione dovrà visualizzare le informazioni associati a tale gara (races) e l’elenco dei piloti (drivers) che vi hanno partecipato.

* Permettere all’utente di selezionare, dall’apposita tendina (aggiornata in seguito alla pressione di “Info Gara”), uno dei piloti partecipanti, e simulare una Fanta-gara di Formula 1 di tale pilota, che gareggi contro il sé stesso degli altri anni nel circuito selezionato. In altre parole, si simuli la presenza di tanti corridori, tutti corrispondenti allo stesso pilota, ciascuno dei quali corra con i tempi di giro (laptimes) che quel pilota ha ottenuto in ciascuno degli anni nei quali ha corso in tale circuito. Si dovrà simulare la sequenza di eventi di “passaggio dal via”, ed a ciascun passaggio si dovrà schedulare l’evento relativo al prossimo passaggio, tenendo conto del tempo di giro registrato dal pilota. In questa fanta-gara, qualora un pilota venga doppiato (ossia sia 2 giri indietro rispetto al primo), deve essere eliminato. Ad ogni giro si deve anche tenere traccia dell’ordine dei piloti in gara, ed assegnare un fanta-punto ogni volta che un pilota compie un sorpasso (cioè al giro successivo si trova ad una posizione migliore del giro precedente). Al termine della simulazione, si stampi la classifica dei fanta-punti ottenuti dai piloti (esclusi gli eliminati).

Nella realizzazione del codice, si lavori a partire dalle classi (Bean e DAO, FXML) ed il database contenuti nel progetto scaricabile. È ovviamente permesso aggiungere o modificare classi e metodi.
Tutti i possibili errori di immissione, validazione dati, accesso al database, ed algoritmici devono essere gestiti, non sono ammesse eccezioni generate dal programma.
