#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    cin >> a; cin >> b;
    int length = 3;
    
    c = a - b;
    
    while(b >= c) {
        a = b;
        b = c;
        
        c = a - b;
        
        length++;
    }
    
    cout << length << endl;
}
