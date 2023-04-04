package org.example.InterfaceSegregation;
/*
ISP recommends that interfaces should be broken down into smaller, more focused interfaces,
rather than having one large interface that contains everything. This makes it easier to reuse code
and to make changes to the system without affecting other parts of the system.

We should avoid using "fat interfaces".
 */
public class App {

	public static void main(String[] args) {
		
		RotationTree tree = new BalancedTree();
		
		tree.insert();
		tree.delete();
		tree.traverse();
		tree.leftRotation();
		tree.rightRotation();
		
	}
}
