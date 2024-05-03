# Design Patterns (ita in fondo)

# Design Patterns

## 1. Abstract Factory Method
**Definition:**
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern is particularly useful when a system needs to be independent of how its products are created, composed, and represented.

**Example Usage:**
Imagine developing a simulation software that can represent different environments (land, sea, air). Using the Abstract Factory pattern, you could define a Factory interface with methods to create various types of animals and plants, and then implement different concrete factories for each environment, each knowing how to create objects specific to that environment.

## 2. Factory Method
**Definition:**
The Factory Method pattern defines an interface for creating an object but lets subclasses decide which class to instantiate. This pattern delegates the responsibility of object instantiation to a subclass, promoting loose coupling.

**Example Usage:**
A document management application can use the Factory Method to create different types of documents (text, charts, presentations). Each type of document will have its concrete class, and the factory method in the base class will decide which document to create based on user input, thus isolating client code from concrete document classes.

## 3. Builder
**Definition:**
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction for different representations. This pattern is useful when an object needs to be created in multiple steps, and the construction process needs to be the same for different representations.

**Example Usage:**
Consider a car builder that can create different types of cars (sports, SUV, convertible). Using the Builder, the construction process of these cars can be standardized into different steps (building chassis, engine, interiors) while the specific details of each car type are handled through different concrete builders.

## 4. Chain of Responsibility
**Definition:**
The Chain of Responsibility pattern allows passing a request along a chain of handlers. Each handler decides whether to process the request or pass it to the next handler in the chain.

**Example Usage:**
In a helpdesk system, a support request may pass through different levels of technical support. Each level examines the request and decides whether it can handle it or pass it to the next level. This avoids coupling the request sender with the specific receiver and distributes responsibility among different objects.

## 5. Command
**Definition:**
The Command pattern transforms a request into an independent object that contains all the necessary information to perform the action. This allows parameterizing methods with different requests, delaying or queuing the execution of a request, and supporting undo operations.

**Example Usage:**
In a home automation application, commands such as turning on/off lights or adjusting the thermostat can be encapsulated in command objects. These commands can be sent by different devices, such as smartphones or tablets, and can be scheduled or undone as needed.

## 6. Prototype Pattern
**Definition:**
The Prototype pattern allows copying existing objects without making the code dependent on their classes. Each prototyped class implements the Prototype interface, which provides a method to clone itself.

**Example Usage:**
In a game, instead of creating objects from scratch every time in a scene, a 'prototype' object can be cloned to create identical copies. This is particularly useful in gaming scenarios where creating and destroying many similar objects can be performance-intensive.

## 7. Memento Pattern
**Definition:**
The Memento pattern allows saving and restoring the previous state of an object without revealing the details of its internal implementation. This pattern is useful for implementing features such as undo in applications that require the ability to revert to previous states.

**Example Usage:**
Imagine developing a text editor that allows users to undo text changes. Each time a significant edit is made, the editor's state is saved in a memento object. If the user wishes to undo the changes, the editor can restore the state from one of these memento objects, reverting the text to its previous state.

## 8. Mediator Pattern
**Definition:**
The Mediator pattern defines an object that centralizes complex communication and dependencies between connected objects, promoting loose coupling and preventing objects from referring directly to each other. This allows better handling of complex interactions and improves code maintainability.

**Example Usage:**
Consider an air traffic control application. Instead of allowing each aircraft to communicate directly with all others (creating an extremely complex system), a mediator – in this case, the control tower – handles all communications. Aircraft communicate only with the control tower, which then directs the actions of each aircraft, such as when and where to land.

## 9. Template Method Pattern
**Definition:**
The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to be executed by subclasses. This allows redefining certain steps of an algorithm without changing the algorithm's structure.

**Example Usage:**
Think of an automated testing framework. The Template Method can be used to define a standard test structure, where the template method establishes the test execution flow (setup, execution, cleanup). Specific test subclasses can then customize each step by implementing methods for setup, actual test execution, and cleanup operations after the test.

## 10. Observer Pattern
**Definition:**
The Observer pattern establishes a one-to-many relationship between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is particularly useful for implementing distributed event notification systems, where changes to one state must be reflected in real-time in other systems or components.

**Example Usage:**
Consider a climate management system in a smart building. Temperature sensors (publishers) continuously monitor the environment and, in case of significant changes, send updates to various devices (observers), such as air conditioners and heating systems, which adjust accordingly to maintain optimal temperature. This way, the climate control system can dynamically react to environmental conditions without direct human intervention, ensuring comfort and energy efficiency.

## 11. State Pattern
**Definition:**
The State pattern allows an object to change its behavior when its internal state changes. It appears as if the object is changing its class. This pattern is useful for handling complex state change situations, reducing the need for branching conditions (if-else or switch) within the code.

**Example Usage:**
Imagine developing an application to manage the lifecycle of an online order. The order can be in various states such as "Processing," "Shipped," "Delivered." Using the State pattern, you can define an abstract OrderState class with methods like process(), ship(), and deliver(). Each concrete state (e.g., ProcessingState, ShippedState, DeliveredState) will implement these methods to handle state transitions appropriately. The context (e.g., the Order class) maintains a reference to the current state and delegates state operations to concrete state objects, thus allowing the behavior of the order to change based on its current state without direct intervention from client code.

## 12. Strategy Pattern
**Definition:**
The Strategy pattern is a behavioral pattern that allows defining a family of algorithms, encapsulating them in a dedicated class, and making objects interchangeable within that context. This approach allows varying algorithms independently of the clients using them.

**Example Usage:**
Imagine an e-commerce application that needs to implement different tax calculation strategies depending on the customer's country. With the Strategy pattern, you can define a TaxStrategy interface with a calculateTax() method and then implement various concrete strategies for different tax contexts, such as USTaxStrategy, EUTaxStrategy, and AsiaTaxStrategy.

## 13. Iterator Pattern
**Definition:**
The Iterator pattern provides a way to access the elements of a sequential aggregate object without exposing its underlying representation. This pattern is particularly useful for managing different traversal modes of a collection.

**Example Usage:**
Consider a collection of data such as a tree or a graph. Using the Iterator pattern, you can provide uniform access to the elements of these complex data structures without the client code having to handle the differences between the various structures. For example, you could have different iterators like DepthFirstIterator and BreadthFirstIterator to traverse a graph.

## 14. Visitor Pattern
**Definition:**
The Visitor pattern allows separating an algorithm from the structure of the objects it operates on. This pattern provides a way to add new operations to existing classes without modifying them.

**Example Usage:**
Imagine having a customer management system in an insurance context. The Visitor pattern allows an object to traverse a list of customers and send them personalized messages regarding insurance.

## 15. Adapter Pattern
**Definition:**
The Adapter pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by transforming the interface of an existing class into another interface expected by clients.

**Example Usage:**
Suppose you have a new interface for rendering charts, but an existing library offers similar functionality with a different interface. Instead of rewriting the existing library, you can use an adapter to make the existing library work with the new rendering interface, thus enabling seamless integration.

## 16. Bridge Pattern
**Definition:**
The Bridge Pattern is a structural pattern that separates an abstraction from its implementation, allowing them to vary independently. It is used to divide a large class or a set of closely related classes into two separate hierarchies - abstraction and implementation - that can be developed and modified independently.

**Example Usage:**
In a pizza delivery application, there are different types of pizzas available, each with its unique taste, and different types of restaurants with different cooking styles. When an order for a pizza is placed, the application uses the bridge pattern to ensure that the pizza is composed according to the customer's preferences and cooked following the specific style of the chosen restaurant. This way, the bridge pattern facilitates integration between the different types of pizzas and the various cooking styles of the restaurants, allowing efficient and personalized delivery.

## 17. Composite Pattern
**Definition:**
The Composite Pattern is a structural pattern that allows treating groups of objects and individual objects uniformly. This pattern organizes objects into a tree structure to represent part-whole hierarchies. It enables users to work with individual objects and object compositions uniformly.

**Example Usage:**
Imagine having a gift box management system containing individual items and other boxes. The client creates a main box and adds some items like books and video games, along with a smaller box containing a book. The total price of all items inside the main box is then calculated. The composite pattern allows treating individual objects and object compositions the same way, simplifying the code and making operations uniform on both individual objects and groups of objects.

## 18. Decorator Pattern
**Definition:**
The Decorator Pattern is a structural pattern that allows adding additional responsibilities to objects dynamically without altering their structure through inheritance. This pattern provides a flexible alternative to deriving extended classes to extend functionality.

**Example Usage:**
Imagine having a notification system. The decorator pattern allows extending the functionality of various social platforms. This way, notifications can be sent through various channels without directly modifying the code.

## 19. Facade Pattern
**Definition:**
The Facade Pattern is a structural pattern that provides a unified interface to a set of interfaces in a subsystem. This pattern defines a high-level interface that makes the subsystem easier to use.

**Example Usage:**
Consider a complex system for managing multimedia devices in a car, which includes subsystems for audio, video, and Bluetooth connectivity. A facade can offer a simple interface to start music, stop video, or manage calls, hiding the complexity and dependencies between subsystems.

## 20. Flyweight Pattern
**Definition:**
The Flyweight Pattern is a structural pattern that uses sharing to support a large number of fine-grained objects efficiently. It is particularly useful when a large part of an object's state can be shared and made external to it.

**Example Usage:**
Imagine having an application to manage types of books. It uses a factory to create and share instances of book types. This way, if the same type of book is requested multiple times, the same object is returned instead of creating a new one each time. This saves memory and improves the overall performance of the application.

## 21. Proxy Pattern
**Definition:**
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. This pattern is used when you want to impose restrictions on accessing an object, lazy loading, or to provide transparent localization of an object in a distributed environment.

**Example Usage:**
In access control to a file system, a proxy can be used to control user operations on files. The proxy verifies a user's credentials before allowing actual access to the file, providing additional security.

## 22. Singleton
**Definition:**
The Singleton Pattern is a creational pattern that ensures a class has only one instance while providing a global access point to this instance.

**Example Usage:**
In an application, the Singleton pattern can be used to manage the application's configuration. A singleton object can contain all the configurations that remain constant during the application's execution and can be read from various parts of the program.

-----------------------

1. Abstract Factory Method
Definizione:
Il pattern Abstract Factory fornisce un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare
le loro classi concrete. Questo pattern è particolarmente utile quando un sistema deve essere indipendente
da come i suoi prodotti vengono creati, composti e rappresentati.

Esempio di utilizzo:
Immagina di sviluppare un software di simulazione che può rappresentare diversi ambienti (terrestre, marino, aereo).
Utilizzando il pattern Abstract Factory, potresti definire un'interfaccia Factory con metodi per creare vari
tipi di animali e piante, e poi implementare diverse fabbriche concrete per ciascun ambiente, che sanno come creare
gli oggetti specifici di quell'ambiente.

2. Factory Method
Definizione:
Il pattern Factory Method definisce un'interfaccia per creare un oggetto, ma lascia che le sottoclassi decidano
quale classe istanziare. Questo pattern delega la responsabilità della creazione dell'istanza ad una sottoclasse,
promuovendo il loose coupling.

Esempio di utilizzo:
Un'applicazione di gestione documenti può utilizzare il Factory Method per creare diverse tipologie di documenti
(testo, grafici, presentazioni). Ogni tipo di documento avrà una sua classe concreta, e il metodo factory nella classe base
deciderà quale documento creare in base all'input dell'utente, isolando così il codice cliente dalle classi concrete dei documenti.

3. Builder
Definizione:
Il pattern Builder separa la costruzione di un oggetto complesso dalla sua rappresentazione,
permettendo la stessa costruzione per diverse rappresentazioni. Questo pattern è utile quando
un oggetto deve essere creato in vari passaggi e il processo di costruzione deve essere lo stesso per diverse rappresentazioni.

Esempio di utilizzo:
Pensa a un costruttore di auto che può creare diversi tipi di auto (sportiva, SUV, convertibile).
Utilizzando il Builder, il processo di costruzione di queste auto può essere standardizzato in diversi passaggi
(costruzione telaio, motore, interni) mentre i dettagli specifici di ogni tipo di auto vengono gestiti
tramite differenti builder concreti.

4. Chain of Responsibility
Definizione:
Il pattern Chain of Responsibility permette di passare la richiesta lungo una catena di gestori.
Ogni gestore decide se processare la richiesta o passarla al prossimo gestore nella catena.

Esempio di utilizzo:
In un sistema di helpdesk, una richiesta di assistenza può passare attraverso diversi livelli di supporto tecnico.
Ogni livello esamina la richiesta e decide se può gestirla o se passarla al livello successivo.
Questo evita di accoppiare il mittente della richiesta con il ricevitore specifico e distribuisce la responsabilità
tra diversi oggetti.

5. Command
Definizione:
Il pattern Command trasforma una richiesta in un oggetto indipendente che contiene tutta l'informazione necessaria
per eseguire l'azione.
Questo permette di parametrizzare i metodi con diverse richieste, ritardare o mettere in coda l'esecuzione di una richiesta,
e supportare operazioni annullabili.

Esempio di utilizzo:
In un'applicazione di home automation, comandi come accendere/spegnere le luci o regolare il termostato possono essere incapsulati
in oggetti comando. Questi comandi possono essere inviati da dispositivi diversi, come smartphone o tablet,
e possono essere schedulati o annullati secondo necessità.

6. Prototype Pattern
Definizione:
Il pattern Prototype permette di copiare oggetti esistenti senza rendere il codice dipendente dalle loro classi.
Ogni classe prototipata implementa l'interfaccia Prototype che fornisce un metodo per clonare se stessa.

Esempio di utilizzo:
In un gioco, invece di creare da zero ogni volta gli oggetti in una scena, un oggetto 'prototipo' può essere clonato
per creare copie identiche. Questo è particolarmente utile in scenari di gaming dove la creazione
e la distruzione di molti oggetti simili può essere dispendiosa in termini di prestazioni.

7. Memento Pattern
Definizione:
Il pattern Memento permette di salvare e ripristinare lo stato precedente di un oggetto senza rivelare
i dettagli della sua implementazione interna. Questo pattern è utile per implementare funzionalità come l'undo in applicazioni
che richiedono la possibilità di ritornare a stati precedenti.

Esempio di utilizzo:
Immagina di sviluppare un editor di testo che permette agli utenti di annullare le modifiche al testo.
Ogni volta che un utente fa una modifica significativa, lo stato dell'editor viene salvato in un oggetto memento.
Se l'utente desidera annullare le modifiche, l'editor può ripristinare lo stato da uno di questi oggetti memento,
ripristinando il testo allo stato precedente.

8. Mediator Pattern
Definizione:
Il pattern Mediator definisce un oggetto che centralizza la comunicazione complessa e le dipendenze tra oggetti collegati,
promuovendo un accoppiamento debole e prevenendo che gli oggetti si riferiscano direttamente l'uno all'altro.
Questo permette di gestire meglio le interazioni complesse e di migliorare la manutenibilità del codice.

Esempio di utilizzo:
Considera un'applicazione di controllo del traffico aereo. Invece che permettere che ogni aereo comunichi direttamente
con tutti gli altri (creando un sistema estremamente complesso), un mediatore – in questo caso,
la torre di controllo – gestisce tutte le comunicazioni. Gli aerei comunicano solo con la torre di controllo,
che poi dirige le azioni di ogni aereo, come quando e dove atterrare.

9. Template Method Pattern
Definizione:
Il pattern Template Method definisce il programma di un algoritmo in un metodo, posticipando alcuni passaggi all'esecuzione
da parte delle sottoclassi. Questo permette di ridefinire certi passaggi di un algoritmo senza cambiare
la struttura dell'algoritmo stesso.

Esempio di utilizzo:
Pensa a un framework di test automatizzato. Il Template Method può essere usato per definire una struttura di test standard,
dove il metodo template stabilisce il flusso di esecuzione del test (preparazione, esecuzione, pulizia).
Le sottoclassi specifiche di test possono poi personalizzare ogni passaggio concretizzando i metodi per la preparazione,
l'esecuzione effettiva del test e le operazioni di pulizia dopo il test.

10. Observer Pattern
Definizione:
Il pattern Observer stabilisce una relazione di tipo uno-a-molti tra oggetti, in modo che quando un oggetto cambia stato,
tutti i suoi dipendenti vengono notificati e aggiornati automaticamente. Questo pattern è particolarmente utile
per implementare sistemi distribuiti di notifica eventi, dove le modifiche a uno stato devono essere riflesse
in tempo reale in altri sistemi o componenti.

Esempio di utilizzo:
Considera un sistema di gestione del clima in un edificio intelligente. Sensori di temperatura (publishers)
monitorano costantemente l'ambiente e, in caso di variazioni significative, inviano aggiornamenti a vari dispositivi (observers),
come condizionatori d'aria e sistemi di riscaldamento, che si adeguano di conseguenza per mantenere una temperatura ottimale.
In questo modo, il sistema di controllo del clima può reagire dinamicamente alle condizioni ambientali senza
intervento umano diretto, assicurando comfort e efficienza energetica.

11. State Pattern
Definizione:
Il pattern State permette a un oggetto di modificare il suo comportamento quando cambia il suo stato interno.
Sembrerà come se l'oggetto cambiasse la sua classe. Questo pattern è utile per gestire situazioni complesse di cambiamento di stato,
riducendo la necessità di condizioni ramificate (if-else o switch) all'interno del codice.

Esempio di utilizzo:
Immagina di sviluppare un'applicazione per gestire il ciclo di vita di un ordine online.
L'ordine può trovarsi in vari stati come "In elaborazione", "Spedito", "Consegnato". Utilizzando il pattern State,
puoi definire una classe astratta OrderState con metodi come process(), ship(), e deliver().
Ogni stato concreto (es. ProcessingState, ShippedState, DeliveredState) implementerà questi metodi per gestire
le transizioni tra gli stati in maniera appropriata. Il contesto (es. la classe Order) mantiene un riferimento
allo stato corrente e delega le operazioni di stato agli oggetti di stato concreti, permettendo così di cambiare
il comportamento dell'ordine in base al suo stato attuale senza l'intervento diretto del codice cliente.

12. Strategy Pattern
Definizione:
Il pattern Strategy è un pattern comportamentale che permette di definire una famiglia di algoritmi,
incapsularli in una classe dedicata, e rendere gli oggetti intercambiabili all'interno di quel contesto.
Questo approccio permette di variare gli algoritmi indipendentemente dai clienti che ne fanno uso.

Esempio di utilizzo:
Immagina un'applicazione di e-commerce che necessita di implementare diverse strategie di calcolo delle tasse
a seconda del paese del cliente.
Con il pattern Strategy, puoi definire un'interfaccia TaxStrategy con un metodo calculateTax() e poi implementare diverse strategie
concrete per differenti contesti fiscali, come USTaxStrategy, EUTaxStrategy, e AsiaTaxStrategy.

13. Iterator Pattern
Definizione:
Il pattern Iterator fornisce un modo per accedere agli elementi di un oggetto aggregato sequenzialmente senza esporre
la sua rappresentazione sottostante. Questo pattern è particolarmente utile per gestire diverse modalità
di attraversamento di una collezione.

Esempio di utilizzo:
Considera una collezione di dati come un albero o un grafico. Utilizzando il pattern Iterator, puoi fornire un accesso uniforme
agli elementi di queste strutture dati complesse senza che il codice cliente debba gestire le differenze tra le varie strutture.
Ad esempio, potresti avere iteratori diversi come DepthFirstIterator e BreadthFirstIterator per navigare attraverso un grafo.

14. Visitor Pattern
Definizione:
Il pattern Visitor consente di separare un algoritmo dalla struttura degli oggetti su cui opera.
Questo pattern fornisce un modo per aggiungere nuove operazioni a classi esistenti senza modificarle.

Esempio di utilizzo:
Immagina di avere un sistema di gestione clienti in un contesto di assicurazioni.
il pattern Visitor permette a un oggetto di attraversare una lista di clienti e inviare loro messaggi
personalizzati riguardanti le assicurazioni.

15. Adapter Pattern
Definizione:
Il pattern Adapter permette a interfacce incompatibili di lavorare insieme.
Agisce come un ponte tra due interfacce incompatibili trasformando l'interfaccia di una classe esistente
in un'altra interfaccia attesa dai clienti.

Esempio di utilizzo:
Supponi di avere una nuova interfaccia per il rendering di grafici, ma una libreria esistente che offre funzionalità simili
con un'interfaccia diversa. Invece di riscrivere la libreria esistente, puoi utilizzare un adapter per far sì
che la libreria esistente lavori con la nuova interfaccia di rendering, consentendo così un'integrazione senza interruzioni.

16. Bridge Pattern
Definizione:
Il Bridge Pattern è un pattern strutturale che separa un'astrazione dalla sua implementazione,
permettendo che le due possano variare indipendentemente. È utilizzato per dividere una classe grande o un set di classi
strettamente correlate in due gerarchie separate - astrazione e implementazione - che possono essere sviluppate
 e modificate separatamente.

Esempio di utilizzo:

In un'applicazione di consegna di pizze, ci sono diversi tipi di pizze disponibili, ognuna con il proprio gusto unico,
e diversi tipi di ristoranti con stili di cucina differenti. Quando un ordine per una pizza viene effettuato, l'applicazione
utilizza il bridge pattern per garantire che la pizza venga composta secondo le preferenze del cliente e cucinata
 seguendo lo stile specifico del ristorante scelto. In questo modo, il bridge pattern facilita l'integrazione tra
 i diversi tipi di pizze e i vari stili di cucina dei ristoranti, consentendo una consegna efficiente e personalizzata.

17. Composite Pattern
Definizione:
Il Composite Pattern è un pattern strutturale che consente di trattare gruppi di oggetti e singoli oggetti in modo uniforme.
Questo pattern organizza gli oggetti in una struttura ad albero per rappresentare gerarchie parte-tutto.
Permette agli utenti di lavorare con singoli oggetti e composizioni di oggetti in modo uniforme.

Esempio di utilizzo:
Immagina di avere un sistema di gestione di box regalo con contiene oggetti singoli e altre scatole. Il Client crea
una scatola principale e aggiunge alcuni oggetti come libri e videogiochi, insieme a una scatola più piccola che contiene un libro.
Il prezzo totale di tutti gli oggetti all'interno della scatola principale viene quindi calcolato.
Il pattern Composite consente di trattare singoli oggetti e composizioni di oggetti allo stesso modo, semplificando
il codice e rendendo le operazioni uniformi su singoli oggetti e gruppi di oggetti.

18. Decorator Pattern
Definizione:
Il Decorator Pattern è un pattern strutturale che permette di aggiungere responsabilità aggiuntive agli oggetti
dinamicamente senza alterare la loro struttura tramite l'ereditarietà. Questo pattern fornisce un'alternativa flessibile
al derivare classi estese per estendere le funzionalità.

Esempio di utilizzo:
Immagina di avere un sistema di notifiche. Il decorator pattern permette di estendere le funzionalità dei vari social.
In questo modo, è possibile inviare notifiche attraverso vari canali senza modificare direttamente il codice.

19. Facade Pattern
Definizione:
Il Facade Pattern è un pattern strutturale che fornisce un'interfaccia unificata a un insieme di interfacce in un sottosistema.
Questo pattern definisce un'interfaccia di alto livello che rende il sottosistema più facile da usare.

Esempio di utilizzo:
Considera un sistema complicato per la gestione di dispositivi multimediali in un'automobile,
che include sottosistemi per l'audio, il video e la connettività Bluetooth. Un facade può offrire una semplice interfaccia
per avviare la musica, stoppare il video, o gestire chiamate, nascondendo la complessità e le dipendenze tra i sottosistemi.

20. Flyweight Pattern
Definizione:
Il Flyweight Pattern è un pattern strutturale che usa la condivisione per supportare grandi quantità di oggetti
a grana fine in modo efficiente. È particolarmente utile quando una grande parte dello stato di un oggetto
può essere condivisa e resa esterna allo stesso.

Esempio di utilizzo:
Immagina di avere un'applicazione per gestire i tipi di libri. Utilizza una factory per creare e condividere istanze di tipi di libro.
In questo modo, se viene richiesto lo stesso tipo di libro più volte, viene restituito lo stesso oggetto anziché crearne uno nuovo ogni volta. Ciò consente di risparmiare memoria e migliorare le prestazioni complessive dell'applicazione.

21. Proxy Pattern
Definizione:
Il Proxy Pattern fornisce un surrogato o segnaposto per un altro oggetto per controllare l'accesso a quest'ultimo.
Questo pattern è usato quando si vuole imporre restrizioni nell'accesso ad un oggetto, carico pigro, o per fornire
una localizzazione trasparente di un oggetto in un ambiente distribuito.

Esempio di utilizzo:
Nel controllo di accesso a un sistema di file, un proxy può essere usato per controllare le operazioni degli utenti su file.
Il proxy verifica le credenziali di un utente prima di permettere l'accesso reale al file, fornendo sicurezza aggiuntiva.

22. Singleton
Definizione:
Il Singleton Pattern è un pattern creazionale che assicura che una classe abbia solo un'istanza,
mentre fornisce un punto di accesso globale a questa istanza.

Esempio di utilizzo:
In un'applicazione, il pattern Singleton può essere utilizzato per gestire la configurazione dell'applicazione.
Un oggetto singleton può contenere tutte le configurazioni che rimangono costanti durante l'esecuzione dell'applicazione
e che possono essere lette da varie parti del programma
