/*Allon Finezilber
  CSC-236
  Lab 6*/

public class TreeNode
{
	private Object value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(Object initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}

	public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}

	public Object getValue()
	{
		return value;
	}

	public TreeNode getLeft()
	{
		return left;
	}

	public TreeNode getRight()
	{
		return right;
	}

	public void setValue(Object newValue)
	{
		value = newValue;
	}

	public void setLeft(TreeNode newLeft)
	{
		left = newLeft;
	}

	public void setRight(TreeNode newRight)
	{
		right = newRight;
	}
}
