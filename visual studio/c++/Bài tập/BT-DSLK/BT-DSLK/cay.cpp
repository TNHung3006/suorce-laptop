#include <iostream>

using namespace std;

struct Node {
	int giatri;
	Node* left, *right;
};
typedef struct Node* node;
node root;

void mocnut(node& root, int x) {
	if (root == NULL) {
		root = new Node();
		root->giatri = x;
		root->left = NULL;
		root->right = NULL;
	}
	else {
		if (root->giatri >= x) {
			mocnut(root->right, x);
		}
		else mocnut(root->left, x);
	}
}