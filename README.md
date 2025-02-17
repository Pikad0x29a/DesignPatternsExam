# Design Patterns

## Enoncé

Une entreprise de développement logiciel souhaite créer une application de gestion des commandes pour une boutique en ligne. L'application doit permettre :  
* La création et la gestion des commandes.
* La notification des clients lors du changement d'état de la commande.
* L'utilisation de différentes méthodes de paiement.  

Vous devrez utiliser les principes de la **programmation orientée objet** ainsi que les **design patterns** suivants :  
* **Singleton** (gestion d'une instance unique)
* **Factory** (création des objets liés au paiement)
* **Builder** (création progressive d'une commande)
* **Observer** (notification des clients)
* **Chain of Responsibility** (gestion des étapes de validation d'une commande)  

### 1. Implémentation des commandes et du design pattern Builder (1h)

* Créez une classe <span style="color:green;">Commande</span> avec les attributs suivants : <span style="color:green;">id, produits, prixTotal, statut.</span>
* Implémentez un **Builder** pour permettre la construction progressive d'une commande.
### 2. Gestion des paiements avec Factory Pattern (1h)
* Créez une interface <span style="color:green;">MoyenPaiement</span> avec une méthode <span style="color:green;">payer(double montant).</span>
* Implémentez différentes classes concrètes (<span style="color:green;">CarteBancaire, PayPal, Cryptomonnaie</span>).
* Implémentez une **Factory** pour créer l'instance adéquate en fonction du type de paiement.
### 3. Gestion des notifications clients avec Observer (1h)
Implémentez un système de **notification** où les clients (observateurs) sont avertis du changement d'état de leur commande.
Créez une classe <span style="color:green;">Client</span> qui implémente un observateur et une classe <span style="color:green;">Commande</span> qui joue le rôle de sujet observable.
### 4. Gestion de la validation des commandes avec Chain of Responsibility (1h)
Implémentez une chaîne de validation des commandes avec les étapes suivantes :

* Vérification du stock
* Vérification du paiement
* Envoi de la commande

Chaque étape doit être un maillon de la chaîne, capable de traiter la commande ou de la passer au maillon suivant.
### 5. Gestion de l'instance unique avec Singleton (30 min)
Implémentez un **Singleton** pour gérer l'accès à un journal des transactions (<span style="color:green;">TransactionLogger</span>).


Résultat:

```console
Log: Démarrage de l'application
Log: Traitement de la commande 1
Vérification du stock pour la commande 1
Vérification du paiement pour la commande 1
Envoi de la commande 1
Log: Commande 1 traitée
Paiement de 770.47 effectué par carte bancaire.
Log: Paiement de 770.47€ effectué via carte

```

## Sources

- [Exo Netflix](https://github.com/TheSmartHyena/NetflixExo)
- [Geeksforgeeks](https://www.geeksforgeeks.org/java/)
- [Design Patterns via Refactoring guru](https://refactoring.guru/fr/design-patterns/java)
- [Design Patterns via koor](https://koor.fr/Java/Tutorial/java_design_patterns.wp)
- [Design Patterns via Tutorialspoint](https://www.tutorialspoint.com/design_pattern/index.htm)
- [Exemples de bonnes pratiques via Jetbrains](https://blog.jetbrains.com/fr/idea/2024/07/bonnes-pratiques-pour-la-programmation-java/)
- [Maven](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
- [Clean Code](https://invivoo.com/blog/lart-clean-code-environnement-java)
