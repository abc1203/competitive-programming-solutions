#include <iostream>

using namespace std;

int G, P, plane;

int main()
{
    scanf("%d%d", &G, &P);
    int gates[G + 1];
    int count = 0;

    for(int i = 0; i <= G; i++) {
        gates[i] = 0;
    }
    
    int index = 0;
    bool keepGoing = true;
    
    while(index < P && keepGoing) {
        scanf("%d", &plane);
        
        while(plane > 0 && gates[plane] > 0) {
            int t = gates[plane];
            gates[plane]++;
            plane -= t;
        }
        
        if(plane <= 0) {
            keepGoing = false;
        } else {
            gates[plane] = 1;
            count++;
        }
        
        index++;
    }
    
    /*
    for(int i = 0; i <= G; i++) {
        cout << gates[i] << " ";
    }
    */
    
    printf("%d\n", count);
}
