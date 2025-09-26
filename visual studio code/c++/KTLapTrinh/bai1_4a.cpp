#include <iostream>
using namespace std;

//C1
#define SWAP(a, b) {x = x+y;y = x-y;x =x-y;}
//C2
//#define SWAP(a, b) (x = x+y,y = x-y,x =x-y)


int main() {
    int x = 10;
    int y = 20;
    cout << "Before swap: x = " << x << ", y = " << y << endl;
    SWAP(x, y); // Sử dụng macro để hoán đổi giá trị của x và y
    cout << "After swap: x = " << x << ", y = " << y << endl;

    return 0;
}