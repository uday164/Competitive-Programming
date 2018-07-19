public Node DeleteFirst(Node head)
	{
		Node temp = head;
		head = head.next;

		temp.next = null;
		// System.out.println(temp.data);
		return head;
	}

	public void DeleteMiddle(Node head, int data)
	{
		Node temp = head;

		while(temp.next.data != data)
		{
			temp = temp.next;
		}

		Node ntemp = temp.next;

		temp.next = temp.next.next;

		ntemp.next=null;

		// System.out.println(temp.next.data);
	}

	public void DeleteLast(Node head)
	{
		Node temp = head;

		while(temp.next.next != null)
		{
			temp = temp.next;
		}

		temp.next = null;


	}
