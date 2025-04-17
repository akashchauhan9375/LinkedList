/* 
LEETCODE -- 160

IN THIS QUESTION WE HAVE TO FIND THE INTERSECTION POINT OF TWO LINKED LIST

APPROACH -->

WE WILL CALCULATE THAT WHICH LINKED LIST IS LARGE AND MAKE THE HEAD OF BOTH THE LINKED LIST EQUIDISTANCE FROM INTERSECTION
OR WE CAN SAY THAT BRING THE HEAD OF LARGER LINKED LIST EQUALS TO DISTANCE OF SMALLER LINKED LIST HEAD TO INTERSECTION POINT
AND THEN INCREASE BOTH THE HEAD BY ONE AND CHECK WHETHER THEY ARE EQUAL OR NOT........


*/

class LinkedList_Intersection{
    public Node getIntersection(Node headA, Node headB){
        int lenA = getCount(headA);
        int lenB = getcount(headB);

        while(lenA>lenB){
            lenA--;
            headA = headA.next;
        }

        while(lenB>lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headB;
    }

    public int getcount(Node headd){
        int count = 0;
        Node temp = headd;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
    }
}