# Privileges: A Terminal-Based Game
## 1. About the Game
Privileges is a terminal-based game designed to shed light on societal inequalities and the uneven distribution of opportunities. The game provides insights into various life paths across the globe and explores the social prerequisites for good jobs, education, and secure living conditions. The goal is to foster empathy towards social minorities, encourage self-reflection on one's societal position, and stimulate a stance of solidarity.

The game is designed to challenge our understanding and delve into the complex dynamics of privilege. It includes a series of questions that players answer based on their real-life experiences or the experiences of a pre-defined character. The game tracks the player's progress based on their answers, providing a visual representation of the privileges (or lack thereof) they may experience in their life.

## 2. Installation
To start the game, run the main.kt file located in the src/main/kotlin directory.

## 3. Game Structure and Flow
The game begins with an onboarding process where players choose the language they want to play the game in. The game currently supports Deutsch, English, Türkçe, Polski, and العربية.

After choosing the language, players are presented with a choice to play as themselves or to choose one of the pre-made characters. If they choose to play as themselves, they are encouraged to answer the questions as honestly as possible. If they choose a pre-made character, they are asked to immerse themselves in the role as much as possible and answer the questions based on that role.

The main part of the game consists of a series of questions. For each question, players can answer with 'yes' or 'no'. For each question answered with 'yes', the game advances the player one step forward - for one answered with 'no', the game moves the player a step back.

At the end of the game, players are presented with an evaluation of their answers and are encouraged to reflect on their experiences.

## 4. Customization and Further Development
The game is designed to be customizable and extendable. The questions can be adjusted to fit different contexts, and additional languages can be added to make the game more accessible to a broader audience.

## 5. License
This project is open source under the MIT license. This means you are free to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software, provided you include the appropriate copyright notice and disclaimers.

## 6. Contact
For any queries or suggestions, you can reach out through GitHub or visit borisniehaus.de.

## 7. Contributing
Contributions are welcome! Feel free to submit a pull request or open an issue on GitHub.

## 8. Sources
Many different sources have been used. For example:
- ROLLENSPIEL: „EINEN SCHRITT NACH VORN“ by www.handicap-international.de
- „abgehängt“ – Ein Privilegienspiel by bne-sachsen.de/

## 9. Disclaimer
I've been working on this repository for my "Mobile App Development" course at Syntax Institute. It's a terminal-based program that I developed as part of my capstone project for the "Fundamentals of Programming" module (M2).

I've written the program in Kotlin, using IntelliJ. This project gave me the opportunity to apply the concepts I learned in the course, including:

Loops: Loops are used multiple times in this code. An example is the while loop in the onboarding() function, which prompts the user to select a language until a valid input is made. Another while loop is used in the functions game1deu(), game1eng(), game1tur(), game1pol(), and game1arb() to prompt the user to input an answer to each question until a valid input is made.

Classes: Classes are used in this code to model different languages. There is an abstract class Language that serves as a base class for the specific language classes: English, German, Polish, Arabic, and Turkish. Each of these classes inherits from the Language class and implements the getMessage() method to retrieve messages in the respective language.

Constructors: Constructors are implicitly used in this code to create instances of the language classes. For example, when chosenLanguage = Deutsch() is called, the default constructor of the Deutsch class is invoked to create a new instance of this class.

Functions: Various functions are used in this code to perform specific tasks. For example, the wordWrap() function is used to wrap a text so that it fits within a certain width. The padEnd() function is used to extend the name in the printProgressBar() function to a certain length. The Override function is used in the language classes to override the getMessage() method of the base class Language.

Feel free to navigate through the code and try out the program. I hope it provides a good insight into what I've learned during my course and how I've been able to put those learnings into practice. Thank you for visiting!
