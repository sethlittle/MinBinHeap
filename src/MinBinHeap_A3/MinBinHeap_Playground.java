package MinBinHeap_A3;

public class MinBinHeap_Playground {
	public static void main(String[] args) {
		// Add more tests as methods and call them here!!
		TestBuild();

		// MinBinHeap mbh = new MinBinHeap();
		// EntryPair e0 = new EntryPair("a", 1);
		// EntryPair e1 = new EntryPair("b", 4);
		// EntryPair e2 = new EntryPair("c", 8);
		// EntryPair e3 = new EntryPair("d", 12);
		// EntryPair e4 = new EntryPair("e", 13);
		// EntryPair e5 = new EntryPair("f", 16);
		// EntryPair e6 = new EntryPair("g", 23);
		// EntryPair e7 = new EntryPair("h", 25);
		// EntryPair e8 = new EntryPair("i", 27);
		// EntryPair e9 = new EntryPair("j", 29);
		// EntryPair e10 = new EntryPair("k", 30);
		// EntryPair e11 = new EntryPair("l", 31);
		//
		// mbh.insert(e3);
		// mbh.insert(e4);
		// mbh.insert(e5);
		// mbh.insert(e1);
		//
		// System.out.println("4, 12, 16, 13: ");
		// printHeap(mbh.getHeap(), mbh.size());
		//
		// mbh.insert(e10);
		// mbh.insert(e9);
		// mbh.insert(e0);
		//
		// System.out.println("1, 12, 4, 13, 30, 29, 16: ");
		// printHeap(mbh.getHeap(), mbh.size());
		//
		// mbh.delMin();
		//
		// System.out.println("delMin");
		// System.out.println("4, 12, 16, 13, 30, 29: ");
		// printHeap(mbh.getHeap(), mbh.size());
		//
		// mbh.delMin();
		// System.out.println("delMin");
		//
		// System.out.println("12, 13, 16, 29, 30: ");
		// printHeap(mbh.getHeap(), mbh.size());
		//
		// mbh.delMin();
		// System.out.println("delMin");
		//
		// System.out.println("13, 29, 16, 30: ");
		// printHeap(mbh.getHeap(), mbh.size());

	}

	public static void TestBuild() {
		// constructs a new minbinheap, constructs an array of EntryPair,
		// passes it into build function. Then print collection and heap.
		MinBinHeap mbh = new MinBinHeap();
		EntryPair[] collection = new EntryPair[16];
		collection[0] = new EntryPair("i", 16);
		collection[1] = new EntryPair("b", 1);
		collection[2] = new EntryPair("c", 12);
		collection[3] = new EntryPair("d", 10);
		collection[4] = new EntryPair("e", 15);
		collection[5] = new EntryPair("f", 11);
		collection[6] = new EntryPair("g", 17);
		collection[7] = new EntryPair("h", 14);
		collection[8] = new EntryPair("h", 6);
		collection[9] = new EntryPair("h", 3);
		collection[10] = new EntryPair("h", 2);
		collection[11] = new EntryPair("h", 0);
		collection[12] = new EntryPair("h", 5);
		collection[13] = new EntryPair("h", 3);
		collection[14] = new EntryPair("h", 7);
		collection[15] = new EntryPair("h", 4);
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
	}

	public static void printHeapCollection(EntryPair[] e) {
		// this will print the entirety of an array of entry pairs you will pass
		// to your build function.
		System.out.println("Printing Collection to pass in to build function:");
		for (int i = 0; i < e.length; i++) {
			System.out.print("(" + e[i].value + "," + e[i].priority + ")\t");
		}
		System.out.print("\n");
	}

	public static void printHeap(EntryPair[] e, int len) {
		// pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th
		// index....
		System.out.println("Printing Heap");
		for (int i = 1; i < len + 1; i++) {
			System.out.print("(" + e[i].value + "," + e[i].priority + ")\t");
		}
		System.out.print("\n");

	}
}
