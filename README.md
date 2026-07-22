
Word Shuffle Game (Java)

This is a multi-part Java project for building a **Word Shuffle Game**. The game challenges players to guess a randomly shuffled 10-letter word, revealing one letter at a time if they guess incorrectly.

This repository contains the implementation for **Assignment 2**, which focuses on:
- Creating a character wrapper class
- Loading a word into a character array list
- Testing the word loading and display logic



##Overview

###Task 1: Character Wrapper
A custom `CharWrapper` class wraps each character of the word and tracks whether it should be displayed. Hidden characters are shown as underscores.

###Task 2: Word Loader
The `WordLoader` class provides a method to convert a word into an `ArrayList<CharWrapper>`, initializing all characters as hidden.

###Task 3: Test Program
The `TestWordShuffle` class:
- Reads a random 10-letter word from a file (`words.txt`)
- Loads the word using `WordLoader.loadWord()`
- Displays the word with all characters hidden
- Reveals one random character for testing purposes



## How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Teekay7000/word-shuffle-game.git
   cd word-shuffle-game
