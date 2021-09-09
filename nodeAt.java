public ListNode<E> nodeAt(int index){
	if (index < size / 2){
		ListNode<E> current = front;
		for (int i = 0; i < index + 1; i++) {
			current = current.next;
		}
		return current;
	} else{
		ListNode<E> current = back;
		for (int i = size; i >= index + 1; i--) {
			current = current.prev;
		}
		return current;
	}
}
