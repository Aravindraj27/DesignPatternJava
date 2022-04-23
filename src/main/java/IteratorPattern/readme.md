### Iterator Pattern
* Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

### Applications
* Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).
* The iterator encapsulates the details of working with a complex data structure, providing the client with several simple methods of accessing the collection elements. While this approach is very convenient for the client, it also protects the collection from careless or malicious actions which the client would be able to perform if working with the collection directly.
* Use the pattern to reduce duplication of the traversal code across your app.
* The code of non-trivial iteration algorithms tends to be very bulky. When placed within the business logic of an app, it may blur the responsibility of the original code and make it less maintainable. Moving the traversal code to designated iterators can help you make the code of the application more lean and clean.
* Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.
* The pattern provides a couple of generic interfaces for both collections and iterators. Given that your code now uses these interfaces, it’ll still work if you pass it various kinds of collections and iterators that implement these interfaces.

### Implementation
1. Declare the iterator interface. At the very least, it must have a method for fetching the next element from a collection. But for the sake of convenience you can add a couple of other methods, such as fetching the previous element, tracking the current position, and checking the end of the iteration.
2. Declare the collection interface and describe a method for fetching iterators. The return type should be equal to that of the iterator interface. You may declare similar methods if you plan to have several distinct groups of iterators.
3. Implement concrete iterator classes for the collections that you want to be traversable with iterators. An iterator object must be linked with a single collection instance. Usually, this link is established via the iterator’s constructor.
4. Implement the collection interface in your collection classes. The main idea is to provide the client with a shortcut for creating iterators, tailored for a particular collection class. The collection object must pass itself to the iterator’s constructor to establish a link between them.
5. Go over the client code to replace all of the collection traversal code with the use of iterators. The client fetches a new iterator object each time it needs to iterate over the collection elements.

### Pros and Cons

|Pros           |Cons           |
|---------------|---------------|
|Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes. | Applying the pattern can be an overkill if your app only works with simple collections. |
|  Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything. | Using an iterator may be less efficient than going through elements of some specialized collections directly.|
| You can iterate over the same collection in parallel because each iterator object contains its own iteration state | |
| For the same reason, you can delay an iteration and continue it when needed| |

Refernce - https://refactoring.guru/design-patterns/iterator