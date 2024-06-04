#include<bits/stdc++.h>
#include<vector>
#define ll long long
#define f(i,a,b) for(int i = a ; i <= b ; i++)
#define f_(i,a,b) for(int i = a ; i >= b ; i--)
#define F(i,a,b) for(int i = a ; i < b ; i++)
#define memset(arr, n) memset(arr, n, sizeof(arr));
#define all(x) x.begin(), x.end()
#define sz size()
#define pb(x) push_back(x)

using namespace std;
bool used[1001] = {false};
vector<int> adj[1001];
int m, n, u;

void BFS(int u){
	queue<int> q;
	q.push(u);
	used[u] = true;
	while(!q.empty()){
		int top = q.front();
		q.pop();
		cout << top << ' ';
		used[top] = true;
		for(auto v:adj[top]){
			if(!used[v]){
				q.push(v);
				used[v] = true;	
			}
			
		}
	}
}

int main() {
	int t = 1;
	cin >> t;
	while(t--){
		memset(used, false);
		memset(adj, 0);
		cin >> n >> m >> u;
		f(i, 1, m){
			int a, b;
			cin >> a >> b;
			adj[a].pb(b);
			adj[b].pb(a);
		}
		BFS(u);
		cout << endl;
	}
}