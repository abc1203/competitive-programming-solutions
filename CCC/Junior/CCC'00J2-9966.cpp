#include <bits/stdc++.h>

using namespace std;

int main()
{
    int count = 0;
    int min, max;
    cin >> min;
    cin >> max;


    for(int i = min; i <= max; i++) {
        int numOfDigits = 0;
        int number = i;
        int newNumber = 0;
        bool isSame = true;

        while(number != 0) {
            number /= 10;
            numOfDigits++;
        }

        int digits[numOfDigits];
        number = i;

        for(int j = 0; j < numOfDigits; j++) {
            digits[j] = number % 10;
            number /= 10;
        }

        for(int j = 0; j < numOfDigits; j++) {
            if(digits[j] != 0 && digits[j] != 1 && digits[j] != 8 && digits[j] != 6 && digits[j] != 9) {
                isSame = false;
            } else if(digits[j] == 6) {
                digits[j] = 9;
            }  else if(digits[j] == 9) {
                digits[j] = 6;
            }
        }

        for(int j = 0; j < numOfDigits; j++) {
            newNumber += digits[numOfDigits - 1- j] * pow(10, j);
        }
        
        if(newNumber != i) {
            isSame = false;
        }

        if(isSame) {
            count++;
        }
        
    }
    
    cout << count;
    
    return 0;
}

