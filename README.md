# Task-1: ATM Machine Program

## Overview
This project simulates an ATM machine with basic functionalities such as checking account balance, depositing money, and withdrawing money. The user must enter a correct PIN to access the ATM functionalities. The PIN for this ATM is preset to `5674`.

## Class Descriptions

### ATM Class
The `ATM` class contains the core functionalities of the ATM machine:
- **Attributes:**
  - `float Balance`: Stores the current balance in the account.
  - `int PIN`: The preset PIN for the ATM, initialized to `5674`.

- **Methods:**
  - `void checkpin()`: Prompts the user to enter the PIN and validates it. If the entered PIN is correct, it calls the `menu()` method; otherwise, it prompts the user again.
  - `void menu()`: Displays the menu with options to check balance, deposit, withdraw, or exit. Based on the user's choice, it calls the corresponding method.
  - `void checkbalance()`: Displays the current balance and returns to the menu.
  - `void withdraw()`: Prompts the user to enter an amount to withdraw. If the balance is sufficient, it deducts the amount from the balance and displays the updated balance. If the balance is insufficient, it notifies the user and returns to the menu.
  - `void deposit()`: Prompts the user to enter an amount to deposit. It adds the amount to the balance and displays the updated balance.

### ATMMachine Class
The `ATMMachine` class contains the `main` method, which creates an instance of the `ATM` class and starts the ATM by calling the `checkpin()` method.

## How to Run
1. **Compile the Program:**
   Ensure you have Java installed on your machine. Open a terminal or command prompt and navigate to the directory where the Java files are located. Compile the program using the following command:
   ```sh
   javac ATMMachine.java
   ```

2. **Run the Program:**
   After successful compilation, run the program using the following command:
   ```sh
   java ATMMachine
   ```

3. **Using the ATM:**
   - Enter the correct PIN (`5674`) when prompted.
   - Choose from the menu options by entering the corresponding number:
     1. Check A/C Balance
     2. Deposit
     3. Withdraw
     4. Exit

## Sample Output
```sh
Enter your pin:
5674
1. Check A/C Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
1
Balance: 0.0
1. Check A/C Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
2
Enter amount to deposit:
1000
Amount deposited
Balance: 1000.0
1. Check A/C Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
3
Enter amount to withdraw:
500
Balance: 500.0
1. Check A/C Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
4
```

## Notes
- Ensure to enter the correct PIN to access the ATM functionalities.
- The program will keep prompting for the PIN until a correct one is entered.
- The menu will reappear after each transaction to allow multiple operations until the user decides to exit.

## Future Enhancements
- Adding a mechanism to change the PIN.
- Implementing a limit on the number of PIN attempts.
- Adding more detailed error messages and handling unexpected inputs more gracefully.

## License
This project is for educational purposes and is provided as-is without any warranty. Use it to learn and understand the basics of Java programming and ATM machine simulations.
