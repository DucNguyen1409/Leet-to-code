package tree.binarytree;

import java.util.Objects;

public class BinaryTree {
    public static void main(String[] args) {


    }

    class TreeNode<E> {
        E value;
        TreeNode left;
        TreeNode right;

        TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    class BinarySearchTree {
        TreeNode root;
    }

    public void insert(TreeNode root, int value) {
        TreeNode treeNode = new TreeNode<>(value, null, null);
        if (root == null) {
            root = treeNode;
        } else {
            var currentNode = root;
            while(true) {
                if (currentNode.value.equals(value)) {
//                    return currentNode;
                }
            }
        }
    }

    public TreeNode<Integer> search(TreeNode<Integer> root, int value) {
        // node hiện tại là root
        var currentNode = root;

        // kiểm tra bằng vòng lặp While và trả về khi tìm được vị trí node
        while(true) {
            // nếu tìm ko có Node thì trả về null
            if (Objects.isNull(currentNode)) {
                return null;
            } else if (currentNode.value.equals(value)) {
                // nếu tìm thấy value là node hiện tại
                return currentNode;
            } else if (currentNode.value < value) {
                // nếu giá trị < hơn node hiện tại thì nhảy sang node bên phải
                currentNode = currentNode.right;
            } else {
                // nếu giá trị > hơn node hiện tại thì nhảy sang node bên trái
                currentNode = currentNode.left;
            }
        }
    }

    public static void remove(int value) {

    }
}
