
public class LinkedList {

	private Node first;
	
	LinkedList(){
		
	}

	//SIZE

	public int size() {
		if (first == null) {
			return 0;
		} else {
			Node last = first;
			int s = 1;
			while(last.next != null){
				last = last.next;
				s++;
			}
			return s;
		}
	}

	//MIN MAX

	public int max() {
		int max = first.data;

		for (int i = 1; i < size(); i++) {
			if (get(i) > max) {
				max = get(i);
			}
		}
		return max;
	}

	public int min() {
		int min = first.data;

		for (int i = 1; i < size(); i++) {
			if (get(i) < min) {
				min = get(i);
			}
		}
		return min;
	}

	//GET

	public int get(int index){
		if (index == 0) {
			return first.data;
		} else {
			return pGet(first.next, index-1);
		}
	}

	private int pGet(Node n , int i){
		if (i == 0) {
			return n.data;
		}else{
			return pGet(n.next , i-1);
		}
	}

	public int indexOf(int data) {
		int index = -1;
		for (int i = 0; i < size(); i++) {
			if (get(i) == data) {
				return i;
			}
		}
		return index;
	}
	
	//SET

	public void set(int index , int data){
		if (index == 0) {
				first.data = data;
		} else {
			pSet(first.next, index-1 , data);
		}
	}
	
	private void pSet(Node n , int i , int d){
		if (i == 0) {
			n.data = d;
		}else{
			pSet(n.next , i-1 , d);
			}
	}
	
	//ADD NODES

	public void insertAtFront(int d) {
		
		Node temp = first;
		Node D = new Node(d);
		D.next = temp;
		first = D;
	}
	
	public void insertAtBack(int d) {
		Node D = new Node(d);
		if(first == null) {
			first = D;
		}else {
			Node last = first;
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = D;
		}
		
	}

	public void add(int d) {
		insertAtBack(d);
	}
	
	public void insertAtPosition(int d , int p) {
		if (p == 0) {
			insertAtFront(d);
		} else {
			Node D = new Node(d);
		Node index = first;
		for(int i = 0 ; i < p-1 ; i++) {
			index = index.next;
		}
		
		D.next = index.next;
		index.next = D;
		}
	}

	//DELETE NODE

	public void deleteFromFront() {
		Node temp = first.next;
		first = temp;
	}
	
	public void deleteFromBack() {
		
		Node c = first.next;
		Node p = first;
		while(c.next != null) {
			p = c;
			c = c.next;
		}
		p.next = null;
	}

	public void delete(int index) {
		if (index == 0) {
			deleteFromFront();
		} else {
			if (index < size()) {
				Node prv = first;
				for (int i = 0; i < index-1; i++) {
					prv = prv.next;
				}
				Node dlt = prv.next;
				prv.next = dlt.next;
			}
		}
	}
	
	//DISPLAY

	public String toString() {
		String s = "[ " + first.data;
		Node last = first.next;
		while(last != null) {
			s += ", " + last.data;
			last = last.next;
		}
		s += " ]";
		return s;
	}
	
	public void display() {
		Node last = first;
		System.out.print("[ " + last.data);
		last = last.next;
		while(last != null) {
			System.out.print(", " + last.data);
			last = last.next;
		}
		
		System.out.println(" ]");
	}

	public void display(String message) {
		System.out.println(message + ": ");
		Node last = first;
		System.out.print("[ " + last.data);
		last = last.next;
		while(last != null) {
			System.out.print(", " + last.data);
			last = last.next;
		}
		
		System.out.println(" ]");
	}

	//FUNCTIONS

	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
		return false;
	}

	public int OccNb(int a) {
		
		int occ = 0;
		Node last = first;
		
		do {
			
			if(last.data == a) {
				occ++;
			}
			last = last.next;
			
		}while(last != null);
		return occ;
	}
	
	public int oddNb() {
		int odd = 0;
		
		Node last = first;
		
		do {
			
			if((last.data % 2) == 1) {
				odd++;
			}
			last = last.next;
			
		}while(last != null);
		return odd;
	
	}

	public LinkedList evenEven(){
		
		LinkedList even = new LinkedList();
		Node last = first;
		
		int i = 0;
		
		do {
			
			if((last.data % 2) == 0 && i % 2 == 0) {
				even.insertAtFront(last.data);
			}
			last = last.next;
			i++;
			
		}while(last != null);
		
		return even;
		
	}
	
	public LinkedList addList(LinkedList b) {
		LinkedList sum = new LinkedList();
		
		int sumD = 0;
		
		Node lastA = first;
		Node lastB = b.first;
		do {
			
			sumD = lastA.data + lastB.data;
			sum.insertAtBack(sumD);
			
			lastA = lastA.next;
			lastB = lastB.next;
		}while(lastA != null && lastB != null);
		
		return sum;
	}
		
}