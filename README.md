### Overview
The program utilizes a `main` class called `Cards` to implement the functionality of dealing and managing hands of cards from a deck. It features user interaction through the console for shuffling and drawing hands, and even allows for swapping hands under specific conditions.

### Features
**Deck Initialization**: Initializes a standard deck of 52 playing cards, combining four suits (Hearts, Clubs, Diamonds, Spades) with thirteen values (Ace through King).
**Deck Display**: Prints the deck in a structured format, with four cards per line, making it easy to visualize the suits and values.
**Shuffling and Drawing Hands**: Allows the user to shuffle the deck and draw one of four hands. Each hand consists of the next sequence of cards from the shuffled deck.
**Dynamic Hand Allocation**: Depending on the user's choice, the program dynamically assigns the 'playerHand' while the other three hands are assigned to virtual opponents.
**Hand Swapping**: If a specific game condition (`played7 = true`) is met, the player can choose to swap their hand with one of the three opponents, changing the game dynamics.

### User Interaction
The user can input commands to shuffle the deck or draw a hand.
After drawing a hand, if the game condition is met, the user can choose to swap hands with one of the opponents by entering the corresponding number.

### Technical Details
**Classes and Data Structures**: Uses `ArrayList` and `List` from Java's `util` package to manage the collections of cards.
**Randomness**: Utilizes the `Random` class to select hands randomly.
**Input Handling**: Employs a `Scanner` to capture user input from the console.

### Error Handling and Improvements
The program checks user inputs to ensure valid game actions are taken.
Improvements could include better handling of edge cases, such as invalid inputs or attempting actions when not applicable.
