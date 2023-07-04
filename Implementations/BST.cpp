#include <iostream>

using namespace std;

class BST {

    private:
        int val;
        BST* left; 
        BST* right;
        int sz;

    public:
        BST(int v) {
            left = nullptr;
            right = nullptr;
            val = v;
            sz = 0;
        }
        void insert(int v) {
            if (v < val) {
                if (left == nullptr) left = new BST(v);
                else left->insert(v);
            }else {
                if (right == nullptr) right = new BST(v);
                else right->insert(v);
            }
        }
        bool search(int v) {
            if (v == val) return true;
            else if (v < val) left->search(v);
            else right->search(v);
        }
        int size() {return sz;}
        bool empty() {return sz == 0;}
        int minValue() {
            BST* cur = this; 
            if (left == nullptr) return cur->val;
            cur->left->minValue();
        }
        int maxValue() {
            BST* cur = this;
            if (right == nullptr) return cur->val;
            cur->right->minValue();
        }
        void preOrder(BST* cur) {
            if (cur != nullptr) cout << cur->val << " "; 
            preOrder(cur->left);
            preOrder(cur->right);
        }
        void inOrder(BST* cur) {
            preOrder(cur->left);
            if (cur != nullptr) cout << cur->val << " "; 
            preOrder(cur->right);
        }
        void postOrder(BST* cur) {
            preOrder(cur->left);
            preOrder(cur->right);
            if (cur != nullptr) cout << cur->val << " "; 
        }
};