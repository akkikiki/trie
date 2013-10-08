public class Trie {
  private static final int R = 256;
  private Node root = new Node();

  private static class Node {
    private Object value;
    private Node[] next = new Node[R];
  }

  public void put(String key, Object val) {
    root = put(root, key, val, 0);
  }

  public Node put(Node x, String key, Object val, int d) {
  }
}
