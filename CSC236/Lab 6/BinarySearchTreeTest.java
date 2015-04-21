import java.util.Scanner;

public class BinarySearchTreeTest
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		BinaryTree tree = new BinarySearchTree();
		int num = 0;

		System.out.println("Please insert the binary tree with integers");
		num = keyboard.nextInt();

		while(num != -999)
		{
			num = keyboard.nextInt();
			tree.insert(num);
		}

		TreeNode t = tree.getRoot();
		TreeNode g = tree.swapSubTree(t);
		doPostorder(g);
	}

	public static void doPostorder(TreeNode t)
	{
		if(t != null)
		{
			doPostorder(t.getLeft());
			doPostorder(t.getRight());
			System.out.println(t.getValue());
		}
	}

}