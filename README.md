Author: Thomas Olson (olsoto)

Tech Stack: Java, OOP, SHA256 Cryptography

A blockchain implementation in Java, with cryptographic hashing, proof of work mining, and immutable data structures. Inspired by Programmers Blockchain and serves as a technical dive into Bitcoin-like fundamentals.

The objective was to implement a self-contained blockchain system, with a proof of work mining algorithm to control block creation difficulty. It demonstrates immutability and chain validation, while reinforcing strong object-oriented architecture.

Architecture:
- Block.java -> defines a block's structure, including the hashing and mining logic
- BlockChain.java -> orchestrates the chain creation, validation, and linking of blocks
- StringUtil.java -> Utility for SHA256 hashing and string conversion

Execution:
To run locally:
javac *.java
java BlockChain

Adjusting difficulty:
In BlockChain.java:
public static int difficulty = 4;
 - increasing difficulty exponentially raises mining time, illustration real blockchain computational cost.

Demonstrated Skills:
- OOP: encapsulated design with reusable Java classes
- Algorithms: executed proof-of-work mining logic
- Performance analysis: tested scaling and mining efficiency
- Software engineering practices: Modular architecture, documentation, version control (GitHub)
- Cryptography: Implemented SHA-256 hashing for secure data





