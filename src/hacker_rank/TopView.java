package hacker_rank;
// https://www.hackerrank.com/challenges/tree-top-view/problem?isFullScreen=true
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
        int data;
        Node left;
        Node right;
}
public class TopView {
    public static void topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            if(curr.node.left != null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.hd+1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }

    }

    static class Pair{
        int hd;
        Node node;
        Pair(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }
}
