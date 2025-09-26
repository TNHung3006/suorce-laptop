#include <iostream>
using namespace std;
#define MAX 100000
int main() {
    int n, sum = 0;
    do{
        cout << "nhap 1 <= n <= " << MAX << endl;
        cin >> n;
    }while (n < 1 || n > MAX);

    for (int i = 2; i <= n; i+=2)
        sum += i;
   
    cout << "Tong cac so chan tu 1 den " << n << " la: "<< sum << endl;
    return 0;
}