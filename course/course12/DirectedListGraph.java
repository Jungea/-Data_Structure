package course12;

/*
 * 파일명: DirectedListGraph.java
 * 작성일: 2018.12.4
 * 작성자: 정은애
 * 설명: 인접리스트를 이용하여 방향 그래프를 구현한 클래스
 */

class DirectedListGraph {
	private class Node {
		int vertex;
		Node link;

		Node(int vertex) {
			this.vertex = vertex;
		}
	}

	private Node[] list; // 인접 리스트
	private int n; // 정점 수
	int[] inDegreeNum;

	// 정점 0, 1, 2, ..., n-1 인 그래프를 생성
	public DirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
		this.inDegreeNum = new int[n];
	}

	// 정점 v의 진입차수를 구하여 리턴하는 메소드 ************* (2)
	public int inDegree(int v) {
//		int num = 0;
//		for (int i = 0; i < n; i++) {
//			if (i == v)
//				continue;
//			Node t = list[i];
//			while (t != null) {
//				if (t.vertex == v)
//					num++;
//				t = t.link;
//			}
//		}
//		return num;

		return inDegreeNum[v];
	}

	// 간선 (v1, v2) 존재 여부를 검사 - 정점 번호가 잘못된 경우는 예외 발생
	public boolean hasEdge(int v1, int v2) {
		Node p = list[v1];
		while (p != null) {
			if (p.vertex == v2)
				return true;
			p = p.link;
		}
		return false;
	}

	// 간선 (v1, v2)를 삽입
	public void addEdge(int v1, int v2) {
		if (!isValid(v1) || !isValid(v2)) {
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. (" + v1 + ", " + v2 + ")");
		} else if (hasEdge(v1, v2)) {
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다. (" + v1 + ", " + v2 + ")");
		} else {
			Node newNode = new Node(v2);
			newNode.link = list[v1];
			list[v1] = newNode;
			inDegreeNum[v2]++;
		}
	}

	// 정점 번호의 유효성을 검사
	private boolean isValid(int v) {
		return v >= 0 && v < n;
	}
}