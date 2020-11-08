学习笔记

深度优先搜索模板
``` go
Set visited = new HashSet<>();

public void dfs(Node node, int target, Set visited) {
	if (visited.contains(node)
		return;
	if (node.val == target)
		return;
	visited.add(node);
	process(node);
	for (Node next : node.children) {
		dfs(next, target, visited);
	} 
}
```
广度优先搜索模板
``` go
public void bfs(Node node, int target, Set visited) {
	 Deque deque = new LinkedList<>();
	 stack.offer(node);
	 while (!stack.isEmpty()) {
		 Node cur = stack.poll();
		 visited.add(cur);
		 process(cur);
		 for (Node next : gen_relation_nodes(cur)) 
			 deque.offer(next);
	 }
 } 
```
