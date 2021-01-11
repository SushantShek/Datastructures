package com.practice.collections.suffix;

import java.util.ArrayList;
import java.util.List;

public class SuffixTree {
    private static final String WORD_TERMINATION = "$";
    private static final int POSITION_UNDEFINED = -1;
    private String pattern;
    private Node root;

    public SuffixTree(String pattern){
        root= new Node("",POSITION_UNDEFINED);
        for(int i= 0; i< pattern.length(); i++){
            addSuffix(root,pattern,i);
        }
        this.pattern = pattern;
    }

    private void addSuffix(Node root, String suffix, int position) {
        List<Node> nodes = getAllNodesInTraversePath(suffix, root, true);
        if (nodes.size() == 0) {
            addTreeNode(root, suffix, position);
        } else {
            Node lastNode = nodes.remove(nodes.size() - 1);
            String newText = suffix;
            if (nodes.size() > 0) {
                String existingSuffixUptoLastNode = nodes.stream()
                        .map(a -> a.getLetter())
                        .reduce("", String::concat);

                // Remove prefix from newText already included in parent
                newText = newText.substring(existingSuffixUptoLastNode.length());
            }
            extendNode(lastNode, newText, position);
        }
    }

    private List<Node> getAllNodesInTraversePath(String suffix, Node startNode, boolean flagpartialMatch) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < startNode.getNode().size(); i++) {
            Node currentNode = startNode.getNode().get(i);

            String nodeText = currentNode.getLetter();
            if (pattern.charAt(0) == nodeText.charAt(0)) {
                if (flagpartialMatch && pattern.length() <= nodeText.length()) {
                    nodes.add(currentNode);
                    return nodes;
                }

                int compareLength = Math.min(nodeText.length(), pattern.length());
                for (int j = 1; j < compareLength; j++) {
                    if (pattern.charAt(j) != nodeText.charAt(j)) {
                        if (flagpartialMatch) {
                            nodes.add(currentNode);
                        }
                        return nodes;
                    }
                }

                nodes.add(currentNode);
                if (pattern.length() > compareLength) {
                    List<Node> nodes2 = getAllNodesInTraversePath(pattern.substring(compareLength), currentNode, flagpartialMatch);
                    if (nodes2.size() > 0) {
                        nodes.addAll(nodes2);
                    } else if (!flagpartialMatch) {
                        nodes.add(null);
                    }
                }
                return nodes;
            }
        }
        return nodes;
    }

    private void addTreeNode(Node parentNode, String pattern, int i) {
        parentNode.setNode((List<Node>) new Node(pattern,i));
    }

    private void extendNode(Node lastNode, String newText, int position) {
        String currentText = lastNode.getLetter();
        String commonPrefix = getLongestCommonPrefix(currentText, newText);
    }

    private String getLongestCommonPrefix(String currentText, String newText) {
        for(int i =0; i< Math.min(currentText.length(),newText.length()); i++){
            if(currentText.charAt(i) != newText.charAt(i) ){
                return currentText.substring(0,i);
            }
        }
        return currentText.substring(0,Math.min(currentText.length(),newText.length()));
    }


}

 class Node{


     String letter;
     List<Node> node;
     int position;

    public Node(String l, int pos){
        this.letter = l;
        this.node = new ArrayList<>();
        this.position = pos;
    }
     public void setLetter(String letter) {
         this.letter = letter;
     }
     public String getLetter() {
         return letter;
     }

     public List<Node> getNode() {
         return node;
     }

     public void setNode(List<Node> node) {
         this.node = node;
     }

     public int getPosition() {
         return position;
     }

     public void setPosition(int position) {
         this.position = position;
     }

}
