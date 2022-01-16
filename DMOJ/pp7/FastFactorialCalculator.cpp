#include <bits/stdc++.h>

using namespace std;
unsigned long long n, j;
unsigned int result;

int main()
{
	int N; scanf("%d", &N);
	
	for(int i = 0; i < N; i++) {
		scanf("%llu", &n);
		
		if(n >= 34) {
			printf("0\n");
		} else {
			result = 1;
            
            for (j = 1; j <= n; j++) {
                result *= j;
            }
            printf("%u\n", result);
		}
	}
}
