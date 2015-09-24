package List;

/**
 * Created by chuli on 24/09/2015.
 */
public class LinkedList {
    private ListNode firsNode;

    public ListNode getFirsNode() {
        return firsNode;
    }

    public void setFirsNode(ListNode firsNode) {
        this.firsNode = firsNode;
    }

    public LinkedList() {
        this.firsNode = null;
    }

    public void insertNode(Node Node) {
        if (isEmpty())
            this.firsNode = new ListNode(Node);
        else {
            ListNode newNode = new ListNode(Node);
            ListNode tg = this.firsNode.nextNode;
            this.firsNode.nextNode = newNode;
            newNode.nextNode = tg;
        }
    }

    public void removeNode(Node Node) {
        if (isEmpty())
            return;
        else if (Node.getNumber() == this.firsNode.getNode().getNumber()) {
            this.firsNode = null;
            return;
        }
        else
        {
            ListNode current = this.firsNode;
            while (current.nextNode != null)
            {
                if(Node.getNumber() == current.nextNode.getNode().getNumber())
                {
                    current.nextNode = current.nextNode.nextNode;
                    return;
                }
                current = current.nextNode;
            }
        }
    }

    public boolean isEmpty() {
        return this.firsNode == null;
    }

    public void setEmptyList() {
        this.firsNode = null;
    }
}
