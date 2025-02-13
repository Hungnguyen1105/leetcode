package Algorithm.leetcode;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class MergeTwoSortedLists {
    public Node mergeTowList (Node list1 , Node list2){
        Node fak = new Node(-1);
        Node current = fak;
        while (list1 != null && list2 == null){
            if (list1.val <= list2.val){
                current.next = list1;
                list1= list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current= current.next;
        }
        if (list1 != null){
            current.next= list1;
        }else{
            current.next = list2;
        }
        return fak.next;
    }
    public void printList(Node head){
        Node current = head;
        while (current != null){
            System.out.println(current.val + "->");
            current= current.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next= new Node (6);

        Node mergeList = solution.mergeTowList(list1,list2);
        solution.printList(mergeList);
    }

}
