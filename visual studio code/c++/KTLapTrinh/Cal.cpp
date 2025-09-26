#include <iostream>
#include <cstdlib>
#include <string>
using namespace std;

int calculate(int a, int b, string op) {
    int result;
    switch (op[0]) {
        case '+': result = a + b;
            break;
        case '-': result = a - b;
            break;
        case '*': result = a * b;
            break;
        case '/':
            if (b != 0) result = (float)a / b;
            break;
    }
    return result;
}

int main(int argc, char* argv[]) {
    if (argc != 4) {
        cout << "Cach su dung: Cal <so1> <toan tu> <so2>" << endl;
        cout << "Vi du: Cal 250 + 170" << endl;
        return 1;
    }
    int a = atoi(argv[1]);
    string op = argv[2];
    int b = atoi(argv[3]);

    int result = calculate(a, b, op);
    cout << a << " " << op << " " << b << " = " << result << endl;

    return 0;
}