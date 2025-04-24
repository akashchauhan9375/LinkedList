/*
 LEETCODE - 83
 IN THIS QUESTION WE ARE GIVEN SORTED LINKED LIST AND WE HAVE TO REMOVE THE DUPLICATE NODES FROM THE LINKEDLIST

 */

 class RemoveDuplicateNode{
    public static Node removeDuplicate(Node head){
        Node temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
 }