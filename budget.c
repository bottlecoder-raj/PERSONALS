#include<stdio.h>

int main() {
    char input;
    float deposit = 0, home = 0, self = 0, amount;

    while (1) {
        // Display menu
        printf("\nChoose an option:\n");
        printf("W. CREDIT AMOUNT\nA. HOME\nS. SELF\nX. EXIT\n");
        printf("Enter your choice: ");
        scanf(" %c", &input); // Note the space before %c to ignore leftover newline characters

        if (input == 'W') {
            printf("Enter amount to credit: ");
            scanf("%f", &amount);
            deposit += amount; // Add the entered amount to the deposit
            printf("Amount credited. Total deposit: %.2f\n", deposit);
        } else if (input == 'A') {
            printf("Enter amount for home: ");
            scanf("%f", &amount);
            home += amount; // Add the entered amount to the home account
            printf("Amount added to home. Total home: %.2f\n", home);
        } else if (input == 'S') {
            printf("Enter amount for self: ");
            scanf("%f", &amount);
            self += amount; // Add the entered amount to the self account
            printf("Amount added to self. Total self: %.2f\n", self);
        } else if (input == 'X') {
            printf("Exiting program. Goodbye!\n");
            break; // Exit the loop
        } else {
            printf("Invalid input. Please try again.\n");
        }
    }

    printf("CREDIT:%.2f \t SELF:%.2f \t HOME:%.2f",deposit,self,home);
    
    
     printf("\nPress enter key to exit...");
    getchar(); // Consume the newline character left in the input buffer
    getchar(); // Wait for the user to press any key
    return 0;
}
