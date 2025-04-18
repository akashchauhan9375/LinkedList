
/*
 
LEETCODE -- 19
IN THIS QUESTION WE HAVE TO REMOVE THE NTH NODE
BRUTE FORCE APPROACH -- FIND THE TOTAL NO OF NODES IN THE LINKED LIST AND TRAVERSE TILL N-1th NODE AND THEN UPDATE THE LINK

OPTIMIZED APPROACH -- CREATE A DUMMY NODE THEN CREATE TWO POINTERS POINTING TO DUMMY THEN MOVE ONE POINTER TO NTH NODE 
NOW MOVE BOTH POINTER BY ONE STEP TILL SECOND POINT IS NOT TO NULL....WHEN THE SECOND POINTER IS EQUALS TO NULL THEN 
THE FIRST POINTER WILL BE ON THE N-1th NODE....THEN UPDATE THE LINKAGE 

 */


class RemoveNode{
    public static Node remove(Node head,int n){
        Node dummy = new Node(-1);
        dummy.next = head;

        Node first = dummy;
        Node second = dummy;

        for(int i=0;i<n;i++){
            second = second.next;
        }

        while(second != null){
            first= first.next;
            second = second.next;
        }
        first.next = first.next.next;

        return dummy.next;

    }
}