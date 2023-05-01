package leet_code;
// https://leetcode.com/problems/implement-trie-prefix-tree/description/
public class ImplementTrie_PrefixTree {
    class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            eow = false;
        }
    }

    Node root;
    public ImplementTrie_PrefixTree() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }

            if(word.length()-1 == i){
                curr.children[index].eow = true;
            }

            curr = curr.children[index];
        }
    }

    public boolean search(String word) {
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int index = word.charAt(i)-'a';
            Node node = curr.children[index];
            if(node == null){
                return false;
            }

            if(word.length()-1 == i && !node.eow){
                return false;
            }
            curr = node;
        }

        return true;
    }

    public boolean startsWith(String word) {
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int index = word.charAt(i)-'a';
            Node node = curr.children[index];
            if(node == null){
                return false;
            }
            curr = node;
        }

        return true;
    }
}