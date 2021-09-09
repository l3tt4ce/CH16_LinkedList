private class LinkedIterator implements Iterator<E>{
        private ListNode<E> current;
        private boolean removeOk;
        int index;

        public LinkedIterator(){
            current = front.next;
            removeOk = false;
            index = 0;
        }

        public boolean hasNext(){
            return current != back;
        }

        public E next(){
            if (!hasNext())
                throw new NoSuchElementException();
            E result = current.data;
            removeOk = true;
            current = current.next;
            index++;
            return result;
        }

        public void remove(){
            if (!removeOk)
                throw new IllegalStateException();
            ListNode<E> prev2 = current.prev.prev;
            prev2.next = current;
            current.prev = prev2;
            removeOk = false;
            index--;
            size--;
        }

        public void add(E value){
            ListNode<E> newNode = new ListNode<>(value,current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            index++;
            size++;
        }

        public boolean hasPrevious(){
            return current != front;
        }

        public E previous(){
            if (!hasPrevious())
                throw new NoSuchElementException();
            E result = current.prev.data;
            removeOk = false;
            current = current.prev;
            index--;
            return result;
        }

        public void set(E value){
            current.prev.data = value;
        }

        public int previousIndex(){
            return index;
        }
        public int nextIndex(){
            return index + 1;
        }
    }
}
