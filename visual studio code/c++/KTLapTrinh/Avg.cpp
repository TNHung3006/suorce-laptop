#include <iostream>
#include <cstdlib>
#include <string>
using namespace std;
int main(int argc, char* argv[]) {
    if (argc == 5) {
        int a = atoi(argv[1]);
        int b = atoi(argv[2]);
        int c = atoi(argv[3]);
        int d = atoi(argv[4]);
        float result = (a + b + c + d) / 4.0;
        cout << "Avg of Array: " << result << endl;
    }else cout << "Error: Invalid number of arguments." << endl;
    return 0;
}