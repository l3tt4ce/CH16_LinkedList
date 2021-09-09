	public int indexOf(E value) {
        int index = 0;
        ListNode<E> current = front.next;

        while (current.next != back){
            if (current.data.equals(value))
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(Object o){
        int index = size - 1;
        ListNode<E> targetNode = back.prev;
        while (targetNode != front){
            if (targetNode.data == o)
                return index;
            targetNode = targetNode.prev;
            index--;
        }
        return -1;
    }
