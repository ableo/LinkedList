package List;

import java.util.Scanner;

/**
 * Created by chuli on 24/09/2015.
 */
public class DemoList {
    public static void main(String[] args) {
        LinkedList DemoList = new LinkedList();
        Scanner keyBroad = new Scanner(System.in);
        while (true) {
            System.out.println("*****************************");
            System.out.println("Nhập 1 để thêm dữ liệu.");
            System.out.println("Nhập 2 để Xóa dữ liệu.");
            System.out.println("*****************************");
            switch (keyBroad.nextInt())
            {
                case 1 :
                    System.out.print("Nhập vào giá trị cần thêm: ");
                    DemoList.insertNode(new Node(keyBroad.nextInt()));
                    break;
                case 2:
                    System.out.print("Nhập vào giá trị cần xóa: ");
                    DemoList.removeNode(new Node(keyBroad.nextInt()));
            }
            ListNode current = DemoList.getFirsNode();
            System.out.println("*****************************");
            System.out.println("\t\tDanh sách : ");
            System.out.println("*****************************");
            while (current != null) {
                System.out.println("Number : " + current.getNode().getNumber());
                current = current.nextNode;
            }
        }

    }
}
