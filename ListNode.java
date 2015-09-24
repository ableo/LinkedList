package List;

/**
 * Created by chuli on 24/09/2015.
 */
public class ListNode {
    private Node Node;

    public Node getNode() {
        return this.Node;
    }

    public void setNode(Node Node) {
        this.Node = Node;
    }

    public ListNode nextNode;

    public ListNode()
    {
        this.Node = new Node();
    }
    public ListNode(Node Node) {
        this(Node,null);
    }
    public ListNode(Node Node,ListNode nextNode)
    {
        this.Node = Node;
        this.nextNode = nextNode;
    }
}
