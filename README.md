# State Pattern
## Goals
    - Understand how to define UML State machine
    - Understand how to encapsulate state
    - Understand how to add new states

## State Machine Diagram
### State
In real world, there are many states in each systems, and they acts differently when they are in different state.
### State machine Diagram
State machine diagram models *state change* in UML.

### Example of State Machine Diagram
<img width="600" alt="image" src="https://github.com/wnghks7787/OODP_StatePattern/assets/74361097/5bc6d957-5a5e-4880-8968-0a56c722ef48">
This is very simple fan. We cannot choose wind power. We either cannot make it rotates.

Each rectangle of the image is ***State***. Also, arrow means ***State transition***.

Yes, there is a circle, and we call it ***PseudoState***. Most time, they represent *initial*, *final*, *history*, etc.

# Code1
In this code, we make a "LightBulb" example. Lightbulb can be On, or Off.
Also, we need *state* variables to store lightbulb's state.

## Problems
This code is hard to add new state, for example "sleeping mode".
Maybe we make new constant "SLEEPING" and check it.
Code 1 show you how to make it.

### About *SLEEPING* state
We add *SLEEPING* state in code1.
However, in *if* statement, there is lots of redundancy, and it is not comfortable to check change of states.
Also, if we need to add new state, in this case *SLEEPING*, we should change every method to changing state.

### Solution
Encapsulate ***STATE***.
Find where change occurs. We need to make codes *Configure code regardless of current state, and independent with state change*.

So, let's make state to class for encapsulate. It makes the code to easily modify.

# Code2
<img width="450" alt="image" src="https://github.com/wnghks7787/OODP_StatePattern/assets/74361097/4145a610-c0d0-4116-a095-5db495571d3b">

This is class diagram with new ***State Design Pattern***.
It is quite similar with Strategy Design Pattern.
So, we can code it regardless current state.