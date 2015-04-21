/*Allon Finezilber
  CSC-236
  Lab 6*/

public class BinarySearchTree extends BinaryTree
{

	public void insert(Comparable item)
	{
		if(getRoot() == null)
			setRoot(new TreeNode(item));

		else
		{
			TreeNode p = null;
			TreeNode q = getRoot();

			while(q != null)
			{
				p = q;
				if(item.compareTo(p.getValue()) < 0)
					q = p.getLeft();
				else
					q = p.getRight();
		    }

		if(item.compareTo(p.getValue()) < 0)
			p.setLeft(new TreeNode(item));

		else
			p.setRight(new TreeNode(item));
		}
	}

	public TreeNode find(Comparable key)
	{
		TreeNode p = getRoot();

		while(p != null && key.compareTo(p.getValue()) != 0)
		{

			if(key.compareTo(p.getValue()) < 0)
				p = p.getLeft();
			else
				p = p.getRight();
	    }

	    return p;
	}
}