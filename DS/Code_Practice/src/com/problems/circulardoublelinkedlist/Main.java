package com.problems.circulardoublelinkedlist;

public class Main {
	public static void main(String[] args) {
//		LinkedList ll = new LinkedList();
//		ll.createLL(1);
//		ll.insertNode(9);
//		ll.insertNode(5);
//		ll.insertNode(10);
//		ll.insertNode(2);
//		
//		ll.traversalLL();
//		Questions q = new Questions();
//		LinkedList t = q.partition(ll, 4);
//		t.traversalLL();
		
		
//		System.out.println();
//		q.deleteDups(ll);
//		Node n = q.nthToLast(ll, 5);
//		System.out.println(n.value);
		
//		Questions1 qq = new Questions1();
//		LinkedList t1 = qq.partition(ll, 4);
//		t1.traversalLL();
//		Node n1 = q.nthToLast(ll, 1);
//		System.out.println(n1.value);
//		qq.deleteDups(ll);
//		ll.traversalLL();
		
//		LinkedList llA = new LinkedList();
//		llA.insertNode(7);
//		llA.insertNode(1);
//		llA.insertNode(6);
//		
//		LinkedList llB = new LinkedList();
//		llB.insertNode(5);
//		llB.insertNode(9);
//		llB.insertNode(2);
//		
//		Questions q = new Questions();
//		LinkedList result = q.sumLists(llA, llB);
		
//		Questions1 q1 = new Questions1();
//		LinkedList result1 = q1.sunmLists(llA, llB);
		
		LinkedList llA = new LinkedList();
		llA.insertNode(3);
		llA.insertNode(1);
		llA.insertNode(5);
		llA.insertNode(9);
		
		LinkedList llB = new LinkedList();
		llB.insertNode(2);
		llB.insertNode(4);
		llB.insertNode(6);
		llB.insertNode(3);
		llB.insertNode(1);
		llB.insertNode(5);
		llB.insertNode(8);

		
//		Questions q = new Questions();
//		q.addSameNode(llA, llB, 7);
//		q.addSameNode(llA, llB, 2);
//		q.addSameNode(llA, llB, 1);
//		Node inter = q.findIntersection(llA, llB);
//		System.out.println(inter.value);
		
		Questions1 q = new Questions1();
		q.addSameNode(llA, llB, 7);
		q.addSameNode(llA, llB, 2);
		q.addSameNode(llA, llB, 1);
		Node inter = q.findIntersection(llA, llB);
		System.out.println(inter.value);
		

	}
}




