package 链表.设计链表;

import java.util.List;

/**
 * @auther XMZ
 * @create 2023--06-下午4:05
 */
public class 设计链表{
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.addAtHead(1);
        ml.addAtIndex(1,2);
        ml.addAtIndex(2,3);
        for(int i = 0; i < 3;i ++){
            System.out.println(ml.get(i));
        }
    }
}
class MyLinkedList {
    Listnode head;
    int size;
    public MyLinkedList() {
        size = 0;
        head = new Listnode(0);
    }

    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Listnode cur = head;
        for(int i = 0; i <= index; i++){
            cur =cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        index = Math.max(index,0);
        size++;
        Listnode temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        Listnode add =  new Listnode(val);
        add.next = temp.next;
        temp.next = add;

    }

    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){
            return;
        }
        size--;
        Listnode denode = head;
        Listnode tempnode;
        for(int i = 0; i  < index - 1; i++){
            denode = denode.next;
        }
        denode.next = denode.next.next;
    }
}
class Listnode{
    int val;
    Listnode next;
    public Listnode(int val){
        this.val = val;
    }
}