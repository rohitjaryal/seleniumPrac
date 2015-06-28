package core.seleniumPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		// arraylistExample();
		// linkedListExample();
		// hashsetExample();
		treesetExample();
		linkedhashsetExample();
		hashsetExample();
		setExample();
	}

	public static void arraylistExample() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("daasd");
		arrayList.add("CCCC");

		Iterator<String> itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void linkedListExample() {
		List<String> listOfString = new LinkedList<String>();
		listOfString.add("Q");
		listOfString.add("W");
		listOfString.add(2, "E");

		for (String str : listOfString) {
			System.out.println(str);
		}
	}

	public static void hashsetExample() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(4);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(1);
		System.out.println();
		System.out.print("Hashset ");
		for (Integer str : hashSet) {
			System.out.print(str + " ");
		}
	}

	public static void setExample() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		Iterator<Integer> iterator = set.iterator();
		System.out.print("Set data: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public static void treesetExample() {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);

		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public static void linkedhashsetExample() {

		LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>();
		linkedHashset.add(4);
		linkedHashset.add(3);
		linkedHashset.add(2);
		linkedHashset.add(1);

		Iterator<Integer> iterator = linkedHashset.iterator();
		System.out.print("LinkedHashset set data: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
