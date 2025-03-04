#include <iostream>
#include <fstream>
using namespace std;

void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        swap(arr[i], arr[minIdx]);
    }
}
void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {           
        int key = arr[i];                   
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}
void quickSort(int A[], int start, int end)
{
    //chon phan tu dau lam chot
    if (start < end) //co nhieu hon 1 phan tu
    {
        int s, e, tmp;
        s = start; e = end;
        while (s < e)
        {
            while (A[s] <= A[start]) s++;
            while (A[e] > A[start]) e--;
            if (s < e)
            {
                tmp = A[s];
                A[s] = A[e];
                A[e] = tmp;
            }
        }
        tmp = A[start];
        A[start] = A[e];
        A[e] = tmp;
        //goi de quy
        //sắp xếp dẫy bên trái
        quickSort(A, start, e-1);
        //sắp xếp dẫy bên phải
        quickSort(A, e + 1, end);
    }
}
        
int main() {
    fstream fs;
    fs.open("mang.txt");
    if (fs.is_open()) {
        cout << "Mo file thanh cong";
        cout << endl;
    }

    int arr[100], n = 0;
    while (fs >> arr[n]) {
        n++;
    }

    cout << "Mang ban dau: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    //selectionSort(arr, n);
    insertionSort(arr, n);
    //bubbleSort(arr, n);
    //quickSort(arr, 0, n - 1);

    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}