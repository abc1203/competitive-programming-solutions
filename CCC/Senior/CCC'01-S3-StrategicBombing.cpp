#include<bits/stdc++.h>
using namespace std;

vector<int> adj[26];
vector<string> edges;


bool bfs(string edge) {
	bool vis[26]; 
	for(int i = 0; i < 26; ++i) vis[i] = false;
	int pos1 = edge[0] - 'A'; int pos2 = edge[1] - 'A';
	
	queue<int> q;
	int source = 0; vis[source] = true; q.push(source);
	
	while(!q.empty()) {
		source = q.front(); 
		q.pop();
		
		for(int v : adj[source]) {
			if(!vis[v] && !((source==pos1&&v==pos2)||(source==pos2&&v==pos1))) {
				q.push(v);
				vis[v] = true;
			}
		}
	}
	
	return vis[1];
}


int main() {
    string str;
    int ans = 0;
    
    while(true) {
    	cin >> str;
    	
    	if(str == "**") break;
    	
    	edges.push_back(str);
    	int u = str[0]-'A'; int v = str[1]-'A';
    	adj[u].push_back(v); 
    	adj[v].push_back(u);
    }
    
    for(string edge : edges) {
    	if(!bfs(edge)) {
    		cout << edge << endl;
    		ans++;
    	}
    }
    
    printf("There are %d disconnecting roads.\n", ans);
}
