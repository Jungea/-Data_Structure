package course11;

/*
 * ���ϸ�: MyTreeMap2.java
 * �ۼ���: 2018.11.27
 * �ۼ���: ������
 * ����: String-String ���� �����ϴ� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

class MyTreeMap2 {
	// Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node
	private class Node {
		String key;
		String value;
		Node leftChild = null;
		Node rightChild = null;

		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;

	// (1) ���� get �޼ҵ� ���, ��� �˰����� �̿��� get �޼ҵ带 �ۼ��Ͻÿ�.(���� get �޼ҵ�� ������ ��)
	public String get(String key) {
		return reculGet(root, key);
	}

	private String reculGet(Node p, String key) {
		if (p == null)
			return null;
		else if (key.compareTo(p.key) < 0)
			return reculGet(p.leftChild, key);
		else if (key.compareTo(p.key) > 0)
			return reculGet(p.rightChild, key);
		else
			return p.value;
	}

	// (2) (�ɼ�) ���� �� �޼ҵ� put, insertKey ���, �ݺ� �˰����� �̿��� put �޼ҵ带 �ۼ��Ͻÿ�.(���� put,
	// insertKey �޼ҵ�� ������ ��)
	public void put(String key, String value) {
		Node p = root; //
		Node r = null; // �ش� Ű�� ���� ���

		while (p != null) {
			if (key.compareTo(p.key) == 0) { // �̹� �����ϴ� ���
				p.value = value;
				break;
			}
			r = p;
			if (key.compareTo(p.key) < 0)
				p = p.leftChild;
			else
				p = p.rightChild;

		}
		Node newNode = new Node(key, value);
		if (root == null) // ��Map
			root = newNode;
		else if (p == null) { // ��尡 �������� ���� ���
			if (key.compareTo(r.key) < 0)
				r.leftChild = newNode;
			else
				r.rightChild = newNode;
		}

	}

}