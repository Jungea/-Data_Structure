package lab10_1;

public class DirectedMatrixGraph {
	private int n; // ���� ����
	private int[][] matrix; // �������

	public DirectedMatrixGraph(int n) {
		this.n = n;
		this.matrix = new int[n][n];
	}

	// ������ ������ ��� �ش� �迭�� ���� 1
	public boolean hasEdge(int v1, int v2) {
		return (matrix[v1][v2] == 1);
	}

	public boolean isValid(int v) {
		return (0 <= v && v < n);
	}

	public void addEdge(int v1, int v2) {
		if (!isValid(v1) || !isValid(v2))
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�. <" + v1 + ", " + v2 + ">");
		else if (hasEdge(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. <" + v1 + ", " + v2 + ">");
		else
			matrix[v1][v2] = 1;
	}

	public void printAdjacentVertices(int v) {
		if (!isValid(v))
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else {
			for (int i = 0; i < n; i++)
				if (matrix[v][i] != 0)
					System.out.print(i + " ");
		}
	}
}
