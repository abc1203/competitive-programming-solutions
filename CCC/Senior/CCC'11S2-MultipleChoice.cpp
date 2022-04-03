#include <iostream>

using namespace std;

int main()
{
    int N; cin >> N;
    char arr[2 * N];
    int count = 0;
    
    for(int i = 0; i < 2 * N; i++) {
        cin >> arr[i];
    }
    
    for(int i = 0; i < N; i++) {
        if(arr[i] == arr[i + N]) {
            count++;
        }
    }
    
    cout << count << endl;
}
