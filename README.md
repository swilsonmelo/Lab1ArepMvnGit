# Lab1ArepMvnGit

## Laboratory 1
This project provides characteristics for calculating the mean and standard deviation in a data group.

I used my own implementation of a double LinkedList to store the data.

## LinkedList
A Double Linked List (DLL) contains an extra pointer, typically called previous pointer, together with next pointer and data which are there in singly linked list.

![DLL](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png)

These LinkedList can store any type of Object and do operations like:

- Add an item at the end.
- Add an item in any position.
- Get any node from the linkedList.
- Get the head node.
- Get the tail node.
- Know the number of items on the linkedList.
- Replace any item.
- Remove any element.
- Iterate on the linkedList.

## Running

Compile first time the project after downloaded.

    mvn package

Make unit tests.

    mvn test

To run the whole project.

    mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.ASE.app.calculator.App"

Generate documentation

    mvn javadoc:jar

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Willson Sneitder Melo Merchan** - Escuela Colombiana de Ingeniería Julio Garavito

## License

* This project is under GNU General Public License - see [LICENSE](https://github.com/swilsonmelo/Lab1ArepMvnGit/blob/master/LICENSE) to more info.

