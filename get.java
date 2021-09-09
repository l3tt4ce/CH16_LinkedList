public E get(int index){
	checkIndex(index);
	ListNode<E> current = nodeAt(index);
    return current.data;
}
