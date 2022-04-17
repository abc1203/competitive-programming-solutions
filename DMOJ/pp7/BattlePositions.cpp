#include <iostream>

using namespace std;

int main()
{
    int I, N, J, count;
    cin >> I;
    cin >> N;
    cin >> J;
    
    count = 0;

    int troops[I + 1];

    for(int i = 0; i <= I; i++) {
        troops[i] = 0;
    }

    for(int i = 0; i < J; i++) {
        int position1, position2, numberOfTroops;
        cin >> position1;
        cin >> position2;
        cin >> numberOfTroops;

        position1--;
        position2--;

        troops[position1] += numberOfTroops;
        troops[position2 + 1] -= numberOfTroops;
    }
    
    for(int i = 1; i <= I; i++) {
        troops[i] += troops[i - 1];
    }

    for(int i = 0; i < I; i++) {
        if(troops[i] < N) {
            count++;
        }
    }
    
    cout << count << endl;
}
