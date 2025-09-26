#include <iostream>
#include <limits> // Cần thiết cho numeric_limits
using namespace std;

#define PRINT_ARRAY(arr, n) { \
    cout << "Array: ";   \
    for (int i = 0; i < n; ++i) { \
        cout << arr[i] << " "; \
    } \
    cout << endl;    \
}

#define min(a, b) ((a) < (b) ? (a) : (b))

int main() {
    int numbers[] = {5, 2, 8, 1, 9};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    PRINT_ARRAY(numbers, size);
    
    int min = numbers[0];
    for (int i = 1; i < size; ++i) {
        min = min(min, numbers[i]);
    }

    cout << "Minimum element: " << min << endl;

    return 0;
}