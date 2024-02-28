// Programa listaEnlazada.java
// demonstrates linked list
// to run this program: C>java LinkListApp
//++++++++++++++++
class Link {
	public int iData; // data item (key)
	public double dData; // data item
	public Link next; // next link in list
	
// ----------------
-
	public Link(int id, double dd) { // constructor

	iData = id; // initialize data
	dData = dd; // ('next' is automatically set to null)
	} 
// ------------
	public void displayLink() { // display ourself

	System.out.print("{" + iData + ", " + dData + "} ");
	}
} // end class Link

/7++++++++++++

class LinkList {
	private Link first; // ref to first link on list
// -------------
-
	public LinkList() { // constructor
	
	first = null; // no items on list yet
	}
// ---------------
-
	public boolean isEmpty() { // true if list is empty

	return (first==null);
	}
// --------------
-
// insert at start of list
	public void insertFirst(int id, double dd) { // make new link
	Link newLink = new Link(id, dd);
	newLink.next = first; // newLink --> old first
	first = newLink; // first --> newLink
	}
// ----------------------

public Link deleteFirst() {
	Link temp = first; //delete first item
	first = first.next; //(assumes list not empty)
	next //save reference to link
	return temp;
}



//delete it: first-->old
// return deleted link

// ---------------------
-
public void displayList() {
	System.out.print("List (first-->last): ");
	Link current = first;
	// start at beginning of list

while(current != null)
// until end of list,
{
	current.displayLink(); // print data
	current = current.next; // move to next link
}
	System.out.println("");
}
// -------------------
-
} // end class LinkList

//+++++++++++++

class listaEnlazada{
	public static void main(String[] args) {
		LinkList theList = new LinkList(); // make new list
		theList.insertFirst(22,2.99);
		theList.insertFirst(44,4.99);
		theList.insertFirst(66,6.99);
		theList.insertFirst(88,8.99);

		theList.displayList(); 	// insert four items
	// display list
while( !theList.isEmpty() )
// until it's empty,
{
	Link aLink = theList.deleteFirst();
	// delete link
	System.out.print("Deleted "); // display it
	aLink.displayLink();
	System.out.println("");
}
	theList.displayList(); // display list
	} // end main()
}
// end class LinkListApp


