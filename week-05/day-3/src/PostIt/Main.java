package PostIt;

import PostIt.PostIt;

public class Main {

    public static void main(String[] args) {

        PostIt postIt1 = new PostIt("Idea 1","Orange", "blue");
        PostIt postIt2 = new PostIt("Awesome", "Pink", "Black");
        PostIt postIt3 = new PostIt("Suberb!", "Yellow", "Green");

        System.out.println(postIt1.text);
        System.out.println(postIt2.text);
        System.out.println(postIt3.text);

    }
}
