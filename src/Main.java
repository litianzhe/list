/**
 * Created by user on 2017/2/5.
 */
public class Main {
    public static void main(String[] arg){
        ListNode listNode1=new ListNode(7);
        ListNode listNode2=new ListNode(6);
        ListNode listNode3=new ListNode(4);
        ListNode listNode4=new ListNode(8);
        ListNode listNode5=new ListNode(1);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        hsap1(listNode1);

    }
    static void hsap(ListNode node){
        if (node==null)return;
        System.out.println("打印:"+node.value);
        hsap(node.next);
    }
    static  void  hsap1(ListNode node){

        while (node!=null){
            System.out.println("打印:"+node.value);
           node=node.next;

        }
    }
}
