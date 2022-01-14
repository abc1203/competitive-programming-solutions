#include <bits/stdc++.h>
using namespace std;

unsigned long long MOD = 1000000007;
 
void multiplyMatrix(unsigned long long F[2][2], unsigned long long M[2][2]) {
    unsigned long long first = ((F[0][0] * M[0][0]) % MOD + (F[0][1] * M[1][0]) % MOD) % MOD;
    unsigned long long second = ((F[0][0] * M[0][1]) % MOD + (F[0][1] * M[1][1]) % MOD) % MOD;
    unsigned long long third = ((F[1][0] * M[0][0]) % MOD + (F[1][1] * M[1][0]) % MOD) % MOD;
    unsigned long long fourth = ((F[1][0] * M[0][1]) % MOD + (F[1][1] * M[1][1]) % MOD) % MOD;
     
    F[0][0] = first;
    F[0][1] = second;
    F[1][0] = third;
    F[1][1] = fourth;
}

void power(unsigned long long F[2][2], unsigned long long n) {
    if(n == 0 || n == 1) {
       return;
    }
    
    unsigned long long M[2][2] = {{1, 1}, {1, 0}};
     
    power(F, n / 2);
    multiplyMatrix(F, F);
     
    if (n % 2 != 0) {
        multiplyMatrix(F, M);
    }
}

unsigned long long fib(unsigned long long n) {
    unsigned long long F[2][2] = {{1, 1}, {1, 0}};
    
    if (n == 0) {
        return 0;
    }
    
    power(F, n - 1);
 
    return F[0][0];
}
 
int main()
{
    unsigned long long n; scanf("%llu",&n);
     
    printf("%llu", fib(n)%MOD);
}
