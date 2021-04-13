public class UrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        String missingElement = url.substring(5);
        url = "https:" + missingElement;


        System.out.println(url);



    }

}
