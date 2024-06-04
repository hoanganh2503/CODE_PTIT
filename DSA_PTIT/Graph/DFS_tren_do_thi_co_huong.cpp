#include<bits/stdc++.h>
#include<vector>
#define ll long long
#define f(i,a,b) for(int i = a ; i <= b ; i++)
#define f_(i,a,b) for(int i = a ; i >= b ; i--)
#define F(i,a,b) for(int i = a ; i < b ; i++)
#define memset(arr, n) memset(arr, n, sizeof(arr));
#define all(x) x.begin(), x.end()


using namespace std;

vector<int> arr[1001];
int n, m, x, visited[1001] = {0}; 

void DFS(int u){
	cout << u << " ";
	visited[u] = true;
	for(auto x:arr[u]) {
		if(!visited[x]) DFS(x);
	}
}

int main() {
	int t;
	cin >> t;
	while(t--){
		memset(arr, false);
		memset(visited, 0);
		cin >> n >> m >> x;
		f(i, 0, m-1){
			int a, b;
			cin >> a >> b;
			arr[a].push_back(b);
		}
		DFS(x);	
		cout << endl;	
	}
}