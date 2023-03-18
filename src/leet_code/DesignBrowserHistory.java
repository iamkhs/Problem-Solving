package leet_code;
// https://leetcode.com/problems/design-browser-history/description/
public class DesignBrowserHistory {
    class Node{
        Node next, prev;
        String url;
        public Node(String url){
            this.url = url;
            next = null;
            prev = null;
        }
    }

    class BrowserHistory {
        Node curr;
        public BrowserHistory(String homepage) {
            curr = new Node(homepage);
        }

        public void visit(String url) {
            Node newPage = new Node(url);
            curr.next = newPage;
            newPage.prev = curr;
            curr = newPage;
        }

        public String back(int steps) {
            int step = 0;
            while(curr.prev != null && step < steps){
                curr = curr.prev;
                step++;
            }
            return curr.url;
        }

        public String forward(int steps) {
            int step = 0;
            while(curr.next != null && step < steps){
                curr = curr.next;
                step++;
            }
            return curr.url;
        }
    }
}
