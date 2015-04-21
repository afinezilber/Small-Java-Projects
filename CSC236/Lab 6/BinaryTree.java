/*Allon Finezilber
  CSC-236
  Lab 6*/

public abstract class BinaryTree
{
	private TreeNode root;

	public BinaryTree()
	{
		root = null;
	}

	public TreeNode getRoot()
	{
		return root;
	}

	public void setRoot(TreeNode newNode)
	{
		root = newNode;
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public TreeNode swapSubTree(TreeNode tree)
	{
		if(tree == null)
			return null;

		else
		{
			TreeNode temp = new TreeNode(tree.getValue());
			temp.setLeft(swapSubTree(tree.getRight()));
			temp.setRight(swapSubTree(tree.getLeft()));

			return temp;
		}
	}


	public abstract void insert(Comparable item);
	public abstract TreeNode find(Comparable key);
}