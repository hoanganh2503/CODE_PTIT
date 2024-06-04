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
int n, m, visited[1001] = {0}, previ[1001]; 

void DFS(int u, int y){
	if(visited[y]) return;	
	visited[u] = true;
	for(auto x:arr[u]) {
		if(!visited[x]){
			previ[x] = u;
			DFS(x, y);
		} 
	}
}

void path(int x, int y){
	if(!visited[y]){
		cout << -1 << endl;
		return;
	}
	int a = previ[y], ax[1001], l = 0;
	ax[l++] = y;
	while(a != previ[x]){
		ax[l++] = a;
		a = previ[a];
	}
	f_(i, l-1, 0) cout << ax[i] << ' ';
}

int main() {
	int t;
	cin >> t;
	while(t--){
		memset(arr, false);
		memset(visited, 0);
		int x, y;
		cin >> n >> m >> x >> y;
		// Nhap danh sach canh
		f(i, 0, m-1){
			int a, b;
			cin >> a >> b;
			arr[a].push_back(b);
		}
		DFS(x, y);	
		path(x, y);
		cout << endl;	
	}

}
