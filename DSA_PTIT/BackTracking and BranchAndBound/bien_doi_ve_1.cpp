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

int main() {
	int t = 1;
	cin >> t;
	int dp[100001];
	dp[1] = 0;
	f(i, 2, 100000){
		dp[i] = dp[i-1] + 1;
		if(i % 3 == 0){
			dp[i] = min(dp[i], dp[i/3] + 1);
		}
		if(i % 2 == 0){
			dp[i] = min(dp[i], dp[i/2] + 1);
		}
	}
	while(t--){
		int n;
		cin >> n;
		cout << dp[n] << endl;
	}
}
