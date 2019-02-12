package lab10_2;

public class UndirectedListGraph {
	private Node[] list;
	private int n; // ���� ��

	private class Node {
		int vertex;
		Node link;

		public Node(int vertex) {
			this.vertex = vertex;
		}
	}

	public UndirectedListGraph(int n) {
		this.n = n;
		list = new Node[n];
	}

	public boolean hasEdge(int v1, int v2) { // �̹� �����ϴ� �������� Ȯ��
		// ������ �׷����̹Ƿ� ���ʸ� Ȯ���ص� �ȴ�.
		Node t = list[v1];

		while (t != null) {
			if (t.vertex == v2)
				return true;
			t = t.link;
		}
		return false;
	}

	public boolean isValid(int v) { // ���� ��ȣ Ȯ��
		return (0 <= v && v < n);
	}

	public void addEdge(int v1, int v2) {
		if (!isValid(v1) || !isValid(v2))
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�. (" + v1 + ", " + v2 + ")");
		else if (hasEdge(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. (" + v1 + ", " + v2 + ")");
		else {
			// list[v1]�� ����Ű�� �ܼ����Ḯ��Ʈ�� �� �տ� v2 ����
			Node v1AinsertNode = new Node(v2);
			v1AinsertNode.link = list[v1];
			list[v1] = v1AinsertNode;

			// list[v2]�� ����Ű�� �ܼ����Ḯ��Ʈ�� �� �տ� v1 ����
			Node v2insertNode = new Node(v1);
			v2insertNode.link = list[v2];  
			list[v2] = v2insertNode;
		}
	}

	public void printAdjacentVertices(int v) {
		if (!isValid(v))
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else {
			Node t = list[v];
			while (t != null) {
				System.out.print(t.vertex + " ");
				t = t.link;
			}
		}
	}

}
