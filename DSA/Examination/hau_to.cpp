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
	int t ;
	cin >> t;
	while(t--){
		int ans = 0, n;
		string s, str;
		stack<string> st;
		cin >> n;
		f(i, 1, n-1) cin >> str, st.push(str);
		cin >> s;
		while(!st.empty()){
			cout << st.top();
			st.pop();
		}
//		f(i, 0, s.sz-1){
//			if(s[i] == '+' or s[i] == '-' or s[i] == '*' or s[i] == '/'){
//				string fi = st.top(); st.pop();
//				string se = st.top(); st.pop();
//				int kq;
//				switch (s[i]){
//					case '+':
//						kq = stoi(se) + stoi(fi);
//						break;	
//					case '-':
//						kq = stoi(se) - stoi(fi);
//						break;	
//					case '*':
//						kq = stoi(se) * stoi(fi);
//						break;
//					case '/':
//						kq = stoi(se) / stoi(fi);
//						break;						
//				}
//			st.push(to_string(kq));
//			}else st.push(string(1, s[i]));
//		}
		cout << st.top() << endl;
	}
}
