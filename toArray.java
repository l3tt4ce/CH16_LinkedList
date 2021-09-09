public Object[] toArray(){
        ListNode<E> current = front.next;
        Object[] result = new Object[size];
        int index = 0;

        while (current != back){
            result[index] = current.data;
            current=current.next;
            index++;
        }

        return result;
    }
