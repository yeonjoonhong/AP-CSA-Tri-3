package src.util;

public class LinkedList2
{
    private Object opaqueObject;
    private LinkedList2 prevNode;
    private LinkedList2 nextNode;

    /**
     *  Constructs a new element with object objValue,
     *  followed by object address
     *
     * @param  opaqueObject  Address of Object
     */
    public LinkedList2(Object opaqueObject, LinkedList2 node)
    {
        this.setObject(opaqueObject);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

    /**
     *  Clone an object,
     *
     * @param  node  object to clone
     */
    public LinkedList2(LinkedList2 node)
    {
        opaqueObject = node.opaqueObject;
        prevNode = node.prevNode;
        nextNode = node.nextNode;
    }

    /**
     *  Setter for opaqueObjecg in LinkedList object
     *
     * @param  opaqueObject  Address of Object
     */
    public void setObject(Object opaqueObject)
    {
        this.opaqueObject = opaqueObject;
    }

    /**
     *  Setter for prevNode in LinkedList object
     *
     * @param node     A LinkedList object that is prevNode to current Object
     */
    public void setPrevNode(LinkedList2 node)
    {
        this.prevNode = node;
    }

    /**
     *  Setter for nextNode in LinkedList object
     *
     * @param node     A LinkedList object that is nextNode to current Object
     */
    public void setNextNode(LinkedList2 node)
    {
        this.nextNode = node;
    }

    /**
     *  Returns opaqueObject for this element
     *
     * @return    The opaqueObject associated with this element
     */
    public Object getObject()
    {
        return opaqueObject;
    }

    /**
     *  Returns reference to previous object in list
     *
     * @return    The pointer is to the previous object in the list
     */
    public LinkedList2 getPrevious()
    {
        return prevNode;
    }

    /**
     *  Returns reference to next object in list
     *
     * @return    The pointer is to the next object in the list
     */
    public LinkedList2 getNext()
    {
        return nextNode;
    }

}