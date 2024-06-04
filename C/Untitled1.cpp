#include <bits/stdc++.h>
using namespace std;

class Person
{
private:
    string ID;
    string name;

public:
    Person()
    {
        getline (cin, ID);
        getline(cin, name);
    }
    void printData()
    {
        cout << ID << endl; 
        cout << name;
    }
};

int main()
{
    Person A;
    A.printData();
}
