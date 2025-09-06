# Tic-Tac-Toe

Links:  

- [GitHub Repository](https://github.com/RickeyHo/Tic-Tac-Toe)  

---

## Instructions

Run `ConsoleApp.java` and follow the printed prompts.  
To select a box to fit in, the first number you enter will correspond to the column, and the second will correspond to the row. Both numbers are to be entered on the same line.  

---

## Design Snapshot

The board object is encapsulated by having a private grid as opposed to a public one which can be modified by bad actors. Any addition to the grid has to go through the `place()` method which checks whether or not the move is legal, based on who’s turn it is, and whether there is already a mark placed in that spot. Inheritance and polymorphism was used by having the `HumanPlayer` class and the `RandomAIPlayer` class both inherit from the base `Player` class, allowing for the `Player` field containing the player whose turn it is in the `Board` class to be implemented. One trade off that has been made is storing the player whose turn it is in the `currPlayer` field of the `Board` as an object of type `Player`. This was the most straight forward way to do it. But because the two player objects needed to be constructed with the board object, this meant that the board had to be constructed first, with the starting player added to the board after the two players were formed with the separate method `setStarter()`, which sets the board’s private `currPlayer` field. This made the code less clean.  

---

## Code Excerpts

The `toString()` method was overwritten for the `HumanPlayer` class. This is useful for debugging because when I was implemented multiplayer by appending the mark of the particular `HumanPlayer` to the printed question, so I know which player I was placing for.  

One JUnit test I am proud of is the `attemptToDrawOverExistingMark()` test. It attempts to place an X over where an O has been placed, and checks to see if such a change was actually made. This would see if the board would accept any changes that would overwrite the other person's moves.
