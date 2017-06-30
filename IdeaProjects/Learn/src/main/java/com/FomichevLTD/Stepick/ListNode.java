package com.FomichevLTD.Stepick;



/**
 * Created by safomichev on 30.06.2017.
 */


//***********This class represents the node of the custom list***********//

public class ListNode {

    private int val;// The value of the node
    private ListNode next;// reference to next node
    private CustomLogger logger = new CustomLogger();

    // constructor
    public ListNode (int val) {
        this.val = val;
        logger.debug("Created node: value = " + val);
    }

    public void setVal (int val) {
        this.val = val;
        logger.debug("Set node's value: value = " + val);
    }

    public void setNext(ListNode next) {
        this.next = next;
        logger.debug("Set node's next element");
    }

    public int getVal() {
        logger.debug("Returned value. Value = " + this.val);
        return this.val;
    }

    public ListNode getNext() {
        logger.debug("Returned next element");
        return this.next;
    }

    // Распечатать список
    public void show() {
        logger.debug("Show all list");
        ListNode listNode = this;
        //Один элемент в списке
        if(listNode.next == null) {
            logger.debug("One element in list");
            int i = 1;
            logger.debug("val " + i + " = " + listNode.val);
            return;
        }
        int i = 1;
        while(listNode != null) {
            logger.debug("val " + i++ + " = " + listNode.val);
            listNode = listNode.next;
        }
        i--;
        logger.debug("List contains " + i + " elements");
        return;
    }


}
