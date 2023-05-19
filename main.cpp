//  Assignment 4
//  Created by Mao Le Jonathan Ang on 9/5/23.
//  program that calculates the amount of a persons cellphone package and also
//  the amount of savings for other packages

#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    // insert code here...
    const int PACKAGE_1 = 1;
    const int PACKAGE_2 = 2;
    const int PACKAGE_3 = 3;
    const int A_MIN = 450;
    const int B_MIN = 900;
    const float A_BASE = 39.99;
    const float A_RATE = 0.45;
    const float B_BASE = 59.99;
    const float B_RATE = 0.40;
    const float C_BASE = 69.99;
    float cost, costA, costB;
    int packageNum, numMin;
    
    cout << "Select a subscription package:"
         << endl << "1. Package A"
         << endl << "2. Package B"
         << endl << "3. Package C"
         << endl << "4. Quit\n";
    
    cin >> packageNum;
    
    if (packageNum == 4)
        exit(0);
    else if (!(packageNum < 4 && packageNum > 0))
    {
        cout << "The valid choices are 1 through 4. Run the"
             << " program again and select one of those.";
        exit(0);
    }
    
    cout << "\nHow many minutes were used?\n";
    cin >> numMin;
    
    
    //calculates the cost for the A and B package as they are charged per min
    costA = A_BASE;
    if (numMin > A_MIN)
        costA += (numMin-A_MIN) * A_RATE;
    costB = B_BASE;
    if (numMin > B_MIN)
        costB += (numMin-B_MIN) * B_RATE;
    
    //calculates how much the person is paying and assigns it to cost
    if (packageNum == 1)
        cost = costA;
    else if (packageNum == 2)
        cost = costB;
    else
        cost = C_BASE;
    
    cout << "\nThe total amount due is $" << fixed << setprecision(2)
         << cost << endl;
    
    /*loop that prints how much savings each program brings but avoids the
     person's own package. savings is calculated by the difference between
     cost of the person's own package and the cases' package. default is case3*/
    for (int i = 1; i < 5; i++)
    {
        if (i == packageNum)
            continue;
        switch(i)
        {
            case PACKAGE_1:
                cout << "Savings with Package A: ";
                if (cost - costA <= 0)
                    cout << "No savings!\n";
                else
                    cout <<  "$" << cost - costA << endl;
                break;
            case PACKAGE_2:
                cout << "Savings with Package B: ";
                if (cost - costB <= 0)
                    cout << "No savings!\n";
                else
                    cout << "$" << cost - costB << endl;
                break;
            case PACKAGE_3:
                cout << "Savings with Package C: ";
                if (cost - C_BASE <= 0)
                    cout << "No savings!\n";
                else
                    cout << "$" << cost - C_BASE << endl;
            default:
                ;
        }
    }
    return 0;
}
/*
  Sample Run:

 Select a subscription package:
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 3
 
 How many minutes were used?
 500
 
 The total amount due is $69.99
 Savings with Package A: $7.50
 Savings with Package B: $10.00
 
 Sample Run:

 Select a subscription package:
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 5

 The valid choices are 1 through 4. Run the
 program again and select one of those.

 Sample Run:

 Select a subscription package :
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 1
 
 How many minutes were used?
 450
 
 The total amount due is $ 39.99
 Savings with Package B: No Saving!
 Savings with Package C: No Saving!

 Sample Run:

 Select a subscription package :
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 1
 
 How many minutes were used?
 500
 
 The total amount due is $ 62.49
 Savings with Package B: $ 2.50
 Savings with Package C: No Saving!

 Sample Run:

 Select a subscription package :
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 2
 
 How many minutes were used?
 500
 
 The total amount due is $ 59.99
 Savings with Package A: No Saving!
 Savings with Package C: No Saving!

 Sample Run:

 Select a subscription package :
 1. Package A
 2. Package B
 3. Package C
 4. Quit
 2
 
 How many minutes were used?
 200
 
 The total amount due is $ 59.99
 Savings with Package A: $ 20.00
 Savings with Package C: No Saving!*/
