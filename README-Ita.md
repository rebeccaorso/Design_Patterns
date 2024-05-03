# Design Patterns

## 1. Abstract Factory Method
**Definizione:**
Il pattern Abstract Factory fornisce un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare
le loro classi concrete. Questo pattern è particolarmente utile quando un sistema deve essere indipendente
da come i suoi prodotti vengono creati, composti e rappresentati.

**Esempio di utilizzo:**
Immagina di sviluppare un software di simulazione che può rappresentare diversi ambienti (terrestre, marino, aereo).
Utilizzando il pattern Abstract Factory, potresti definire un'interfaccia Factory con metodi per creare vari
tipi di animali e piante, e poi implementare diverse fabbriche concrete per ciascun ambiente, che sanno come creare
gli oggetti specifici di quell'ambiente.

## 2. Factory Method
**Definizione:**
Il pattern Factory Method definisce un'interfaccia per creare un oggetto, ma lascia che le sottoclassi decidano
quale classe istanziare. Questo pattern delega la responsabilità della creazione dell'istanza ad una sottoclasse,
promuovendo il loose coupling.

**Esempio di utilizzo:**
Un'applicazione di gestione documenti può utilizzare il Factory Method per creare diverse tipologie di documenti
(testo, grafici, presentazioni). Ogni tipo di documento avrà una sua classe concreta, e il metodo factory nella classe base
deciderà quale documento creare in base all'input dell'utente, isolando così il codice cliente dalle classi concrete dei documenti.

## 3. Builder
**Definizione:**
Il pattern Builder separa la costruzione di un oggetto complesso dalla sua rappresentazione,
permettendo la stessa costruzione per diverse rappresentazioni. Questo pattern è utile quando
un oggetto deve essere creato in vari passaggi e il processo di costruzione deve essere lo stesso per diverse rappresentazioni.

**Esempio di utilizzo:**
Pensa a un costruttore di auto che può creare diversi tipi di auto (sportiva, SUV, convertibile).
Utilizzando il Builder, il processo di costruzione di queste auto può essere standardizzato in diversi passaggi
(costruzione telaio, motore, interni) mentre i dettagli specifici di ogni tipo di auto vengono gestiti
tramite differenti builder concreti.

## 4. Chain of Responsibility
**Definizione:**
Il pattern Chain of Responsibility permette di passare la richiesta lungo una catena di gestori.
Ogni gestore decide se processare la richiesta o passarla al prossimo gestore nella catena.

**Esempio di utilizzo:**
In un sistema di helpdesk, una richiesta di assistenza può passare attraverso diversi livelli di supporto tecnico.
Ogni livello esamina la richiesta e decide se può gestirla o se passarla al livello successivo.
Questo evita di accoppiare il mittente della richiesta con il ricevitore specifico e distribuisce la responsabilità
tra diversi oggetti.

## 5. Command
**Definizione:**
Il pattern Command trasforma una richiesta in un oggetto indipendente che contiene tutta l'informazione necessaria
per eseguire l'azione.
Questo permette di parametrizzare i metodi con diverse richieste, ritardare o mettere in coda l'esecuzione di una richiesta,
e supportare operazioni annullabili.

**Esempio di utilizzo:**
In un'applicazione di home automation, comandi come accendere/spegnere le luci o regolare il termostato possono essere incapsulati
in oggetti comando. Questi comandi possono essere inviati da dispositivi diversi, come smartphone o tablet,
e possono essere schedulati o annullati secondo necessità.

## 6. Prototype Pattern
**Definizione:**
Il pattern Prototype permette di copiare oggetti esistenti senza rendere il codice dipendente dalle loro classi.
Ogni classe prototipata implementa l'interfaccia Prototype che fornisce un metodo per clonare se stessa.

**Esempio di utilizzo:**
In un gioco, invece di creare da zero ogni volta gli oggetti in una scena, un oggetto 'prototipo' può essere clonato
per creare copie identiche. Questo è particolarmente utile in scenari di gaming dove la creazione
e la distruzione di molti oggetti simili può essere dispendiosa in termini di prestazioni.

## 7. Memento Pattern
**Definizione:**
Il pattern Memento permette di salvare e ripristinare lo stato precedente di un oggetto senza rivelare
i dettagli della sua implementazione interna. Questo pattern è utile per implementare funzionalità come l'undo in applicazioni
che richiedono la possibilità di ritornare a stati precedenti.

**Esempio di utilizzo:**
Immagina di sviluppare un editor di testo che permette agli utenti di annullare le modifiche al testo.
Ogni volta che un utente fa una modifica significativa, lo stato dell'editor viene salvato in un oggetto memento.
Se l'utente desidera annullare le modifiche, l'editor può ripristinare lo stato da uno di questi oggetti memento,
ripristinando il testo allo stato precedente.

## 8. Mediator Pattern
**Definizione:**
Il pattern Mediator definisce un oggetto che centralizza la comunicazione complessa e le dipendenze tra oggetti collegati,
promuovendo un accoppiamento debole e prevenendo che gli oggetti si riferiscano direttamente l'uno all'altro.
Questo permette di gestire meglio le interazioni complesse e di migliorare la manutenibilità del codice.

**Esempio di utilizzo:**
Considera un'applicazione di controllo del traffico aereo. Invece che permettere che ogni aereo comunichi direttamente
con tutti gli altri (creando un sistema estremamente complesso), un mediatore – in questo caso,
la torre di controllo – gestisce tutte le comunicazioni. Gli aerei comunicano solo con la torre di controllo,
che poi dirige le azioni di ogni aereo, come quando e dove atterrare.

## 9. Template Method Pattern
**Definizione:**
Il pattern Template Method definisce il programma di un algoritmo in un metodo, posticipando alcuni passaggi all'esecuzione
da parte delle sottoclassi. Questo permette di ridefinire certi passaggi di un algoritmo senza cambiare
la struttura dell'algoritmo stesso.

**Esempio di utilizzo:**
Pensa a un framework di test automatizzato. Il Template Method può essere usato per definire una struttura di test standard,
dove il metodo template stabilisce il flusso di esecuzione del test (preparazione, esecuzione, pulizia).
Le sottoclassi specifiche di test possono poi personalizzare ogni passaggio concretizzando i metodi per la preparazione,
l'esecuzione effettiva del test e le operazioni di pulizia dopo il test.

## 10. Observer Pattern
**Definizione:**
Il pattern Observer stabilisce una relazione di tipo uno-a-molti tra oggetti, in modo che quando un oggetto cambia stato,
tutti i suoi dipendenti vengono notificati e aggiornati automaticamente. Questo pattern è particolarmente utile
per implementare sistemi distribuiti di notifica eventi, dove le modifiche a uno stato devono essere riflesse
in tempo reale in altri sistemi o componenti.

**Esempio di utilizzo:**
Considera un sistema di gestione del clima in un edificio intelligente. Sensori di temperatura (publishers)
monitorano costantemente l'ambiente e, in caso di variazioni significative, inviano aggiornamenti a vari dispositivi (observers),
come condizionatori d'aria e sistemi di riscaldamento, che si adeguano di conseguenza per mantenere una temperatura ottimale.
In questo modo, il sistema di controllo del clima può reagire dinamicamente alle condizioni ambientali senza
intervento umano diretto, assicurando comfort e efficienza energetica.

## 11. State Pattern
**Definizione:**
Il pattern State permette a un oggetto di modificare il suo comportamento quando cambia il suo stato interno.
Sembrerà come se l'oggetto cambiasse la sua classe. Questo pattern è utile per gestire situazioni complesse di cambiamento di stato,
riducendo la necessità di condizioni ramificate (if-else o switch) all'interno del codice.

**Esempio di utilizzo:**
Immagina di sviluppare un'applicazione per gestire il ciclo di vita di un ordine online.
L'ordine può trovarsi in vari stati come "In elaborazione", "Spedito", "Consegnato". Utilizzando il pattern State,
puoi definire una classe astratta OrderState con metodi come process(), ship(), e deliver().
Ogni stato concreto (es. ProcessingState, ShippedState, DeliveredState) implementerà questi metodi per gestire
le transizioni tra gli stati in maniera appropriata. Il contesto (es. la classe Order) mantiene un riferimento
allo stato corrente e delega le operazioni di stato agli oggetti di stato concreti, permettendo così di cambiare
il comportamento dell'ordine in base al suo stato attuale senza l'intervento diretto del codice cliente.

## 12. Strategy Pattern
**Definizione:**
Il pattern Strategy è un pattern comportamentale che permette di definire una famiglia di algoritmi,
incapsularli in una classe dedicata, e rendere gli oggetti intercambiabili all'interno di quel contesto.
Questo approccio permette di variare gli algoritmi indipendentemente dai clienti che ne fanno uso.

**Esempio di utilizzo:**
Immagina un'applicazione di e-commerce che necessita di implementare diverse strategie di calcolo delle tasse
a seconda del paese del cliente.
Con il pattern Strategy, puoi definire un'interfaccia TaxStrategy con un metodo calculateTax() e poi implementare diverse strategie
concrete per differenti contesti fiscali, come USTaxStrategy, EUTaxStrategy, e AsiaTaxStrategy.

## 13. Iterator Pattern
**Definizione:**
Il pattern Iterator fornisce un modo per accedere agli elementi di un oggetto aggregato sequenzialmente senza esporre
la sua rappresentazione sottostante. Questo pattern è particolarmente utile per gestire diverse modalità
di attraversamento di una collezione.

**Esempio di utilizzo:**
Considera una collezione di dati come un albero o un grafico. Utilizzando il pattern Iterator, puoi fornire un accesso uniforme
agli elementi di queste strutture dati complesse senza che il codice cliente debba gestire le differenze tra le varie strutture.
Ad esempio, potresti avere iteratori diversi come DepthFirstIterator e BreadthFirstIterator per navigare attraverso un grafo.

## 14. Visitor Pattern
**Definizione:**
Il pattern Visitor consente di separare un algoritmo dalla struttura degli oggetti su cui opera.
Questo pattern fornisce un modo per aggiungere nuove operazioni a classi esistenti senza modificarle.

**Esempio di utilizzo:**
Immagina di avere un sistema di gestione clienti in un contesto di assicurazioni.
il pattern Visitor permette a un oggetto di attraversare una lista di clienti e inviare loro messaggi
personalizzati riguardanti le assicurazioni.

## 15. Adapter Pattern
**Definizione:**
Il pattern Adapter permette a interfacce incompatibili di lavorare insieme.
Agisce come un ponte tra due interfacce incompatibili trasformando l'interfaccia di una classe esistente
in un'altra interfaccia attesa dai clienti.

**Esempio di utilizzo:**
Supponi di avere una nuova interfaccia per il rendering di grafici, ma una libreria esistente che offre funzionalità simili
con un'interfaccia diversa. Invece di riscrivere la libreria esistente, puoi utilizzare un adapter per far sì
che la libreria esistente lavori con la nuova interfaccia di rendering, consentendo così un'integrazione senza interruzioni.

## 16. Bridge Pattern
**Definizione:**
Il Bridge Pattern è un pattern strutturale che separa un'astrazione dalla sua implementazione,
permettendo che le due possano variare indipendentemente. È utilizzato per dividere una classe grande o un set di classi
strettamente correlate in due gerarchie separate - astrazione e implementazione - che possono essere sviluppate
 e modificate separatamente.

**Esempio di utilizzo:**

In un'applicazione di consegna di pizze, ci sono diversi tipi di pizze disponibili, ognuna con il proprio gusto unico,
e diversi tipi di ristoranti con stili di cucina differenti. Quando un ordine per una pizza viene effettuato, l'applicazione
utilizza il bridge pattern per garantire che la pizza venga composta secondo le preferenze del cliente e cucinata
 seguendo lo stile specifico del ristorante scelto. In questo modo, il bridge pattern facilita l'integrazione tra
 i diversi tipi di pizze e i vari stili di cucina dei ristoranti, consentendo una consegna efficiente e personalizzata.

## 17. Composite Pattern
**Definizione:**
Il Composite Pattern è un pattern strutturale che consente di trattare gruppi di oggetti e singoli oggetti in modo uniforme.
Questo pattern organizza gli oggetti in una struttura ad albero per rappresentare gerarchie parte-tutto.
Permette agli utenti di lavorare con singoli oggetti e composizioni di oggetti in modo uniforme.

**Esempio di utilizzo:**
Immagina di avere un sistema di gestione di box regalo con contiene oggetti singoli e altre scatole. Il Client crea
una scatola principale e aggiunge alcuni oggetti come libri e videogiochi, insieme a una scatola più piccola che contiene un libro.
Il prezzo totale di tutti gli oggetti all'interno della scatola principale viene quindi calcolato.
Il pattern Composite consente di trattare singoli oggetti e composizioni di oggetti allo stesso modo, semplificando
il codice e rendendo le operazioni uniformi su singoli oggetti e gruppi di oggetti.

## 18. Decorator Pattern
**Definizione:**
Il Decorator Pattern è un pattern strutturale che permette di aggiungere responsabilità aggiuntive agli oggetti
dinamicamente senza alterare la loro struttura tramite l'ereditarietà. Questo pattern fornisce un'alternativa flessibile
al derivare classi estese per estendere le funzionalità.

**Esempio di utilizzo:**
Immagina di avere un sistema di notifiche. Il decorator pattern permette di estendere le funzionalità dei vari social.
In questo modo, è possibile inviare notifiche attraverso vari canali senza modificare direttamente il codice.

## 19. Facade Pattern
**Definizione:**
Il Facade Pattern è un pattern strutturale che fornisce un'interfaccia unificata a un insieme di interfacce in un sottosistema.
Questo pattern definisce un'interfaccia di alto livello che rende il sottosistema più facile da usare.

**Esempio di utilizzo:**
Considera un sistema complicato per la gestione di dispositivi multimediali in un'automobile,
che include sottosistemi per l'audio, il video e la connettività Bluetooth. Un facade può offrire una semplice interfaccia
per avviare la musica, stoppare il video, o gestire chiamate, nascondendo la complessità e le dipendenze tra i sottosistemi.

## 20. Flyweight Pattern
**Definizione:**
Il Flyweight Pattern è un pattern strutturale che usa la condivisione per supportare grandi quantità di oggetti
a grana fine in modo efficiente. È particolarmente utile quando una grande parte dello stato di un oggetto
può essere condivisa e resa esterna allo stesso.

**Esempio di utilizzo:**
Immagina di sviluppare un'applicazione di grafica vettoriale. Il Flyweight Pattern può essere utilizzato per gestire
oggetti come pennelli e trame che sono utilizzati ripetutamente in più posizioni all'interno del disegno.
Invece di mantenere istanze separate di ogni pennello o texture, il Flyweight Pattern consente di condividere
questi oggetti tra gli elementi del disegno che li utilizzano, riducendo così l'uso della memoria e migliorando le prestazioni.
