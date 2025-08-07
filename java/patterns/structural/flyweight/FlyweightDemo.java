package com.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {

    public static class Forest {
        private List<Tree> trees = new ArrayList<>();

        public void plantTree(int x, int y, String name, String color, String texture) {
            TreeType type = TreeFactory.getTreeType(name, color, texture);
            Tree tree = new Tree(x, y, type);
            trees.add(tree);
        }

        public void drawForest() {
            for (Tree tree : trees) {
                tree.draw();
            }
        }

        public static void main(String[] args) {
            Forest forest = new Forest();

            forest.plantTree(1, 1, "Oak", "Green", "Rough");
            forest.plantTree(2, 3, "Oak", "Green", "Rough");
            forest.plantTree(5, 7, "Pine", "Dark Green", "Smooth");
            forest.plantTree(9, 6, "Oak", "Green", "Rough"); // reused

            forest.drawForest();
        }
    }
}
