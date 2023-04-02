Beautify: Online  Makeup-Boutique 
Analysis and Design Document
Student: Marcu Eliza
Group: 30227
Table of Contents

I.	Project Specification
Proiectul meu consta in crearea unei aplicatii client-server, desktop  de cumparaturi de cosmetice.Actorii care vor interacţiona cu sistemul sunt: Administrator, Client, Vizitator. 
Administratorul poate adauga/modifica/sterge conturi utilizatori, gestiona produsele, gestiona comenzi. 
Clientul poate face log in/log out, poate modifica datele contului , vizualiza toate produsele, adauga produsele disponibile in cosul de cumparaturi si finaliza comanda.
Vizitatorul poate doar vizualiza produsele disponibile  si sa creeze un nou cont, devenind astfel client.

Aplicatia online de cosmetice permite tuturor clientilor sa isi creeze un cont, cu ajutorul caruia o sa poata adauga diferite produse dorite in cosul de cumparaturi, mai apoi sa le comande daca doresc.
Site-ul pune la dispozitia oricarui utilizator un motor de cautare pe baza numelui unui fel de criteriu 
Clientul va putea sa trimita catre admin cererea de a da restock la un anumit produs.

Diagrama de clase:
![1](https://github.com/zazaz21/Proiectare-Software/blob/master/Diagrama_1.jpg)


II.Observer Design Pattern
The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.

In this pattern, the objects are divided into two types: Observers and Subjects (or Publishers). A Subject is an object that maintains a list of its dependents, also known as Observers, and notifies them automatically of any changes to its state. The Observers then automatically update their own state to reflect the changes in the Subject.

This pattern is useful in situations where there is a need to notify multiple objects of changes in a single object, without having to tightly couple the objects. It allows for loose coupling between objects, making it easy to add new Observers or remove existing ones without affecting the rest of the system.

Examples of this pattern can be found in many real-world situations, such as a news agency that notifies subscribers of breaking news, or a weather station that provides updates to various devices.






