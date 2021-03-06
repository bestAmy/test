package operation.four;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    private Map<Character,Integer> map=new HashMap<>();
    private Map<Character,String> ce=new HashMap<>();
    private PriorityQueue<Tree> trees=new PriorityQueue<>();
    private String source;
    private String result;
    public void init(String source){
        this.source=source;
        char[] chars= source.toCharArray();
        for (char c :chars){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        afterInit();
    }

    private void afterInit() {
        map.forEach((c,count)->{
            Node<Character> node=new Node<>();
            node.key=count;
            node.charData=c;

            Tree tree=new Tree();
            tree.setRoot(node);

            trees.add(tree);
        });
    }

    public void build(){
        while (this.trees.size()>1){
            Tree left=this.trees.poll();
            Tree right=this.trees.poll();

            Node node=new Node();
            node.key=left.getRoot().key+right.getRoot().key;
            node.leftChild=left.getRoot();
            node.rightChild=right.getRoot();

            left.setRoot(node);
            this.trees.add(left);
        }
    }
    public void encoding(){
        Tree tree=this.trees.peek();
        this.encoding(tree.getRoot(),"");
    }
    public String encodingResult(){
        StringBuilder sb=new StringBuilder();
        char[] chars= source.toCharArray();
        for (char c :chars){
            sb.append(ce.get(c)+' ');
        }
        return sb.toString();
    }
    private void encoding(Node<Character> node,String encoding){
        if (node!=null){
            if (node.leftChild==null && node.rightChild==null){
                ce.put(node.charData,encoding);
            }
            encoding(node.leftChild,encoding+"0");
            encoding(node.rightChild,encoding+"1");
        }
    }
    public void displayTree(){
        Tree tree=this.trees.peek();
        tree.inDisplay(tree.getRoot());
    }
    public void displayEncodeing(){
        ce.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
    public static void main(String[] args) {
        String source="ABCEDCEACEDBECBEDCBEAD*……%%……ECBEDDECBEDCAFDCFCBFCC";
        Huffman huffman=new Huffman();
        huffman.init(source);
        huffman.build();
        huffman.displayTree();
        System.out.println("-------");
        huffman.encoding();
        huffman.displayEncodeing();
        System.out.println(source+":"+huffman.encodingResult());
    }
}

