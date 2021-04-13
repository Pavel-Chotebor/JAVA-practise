package Count;

public class Count {

    int value;


    public Count (int value) {
        this.value=value;
    }

    public Count () {
        value = 0;
    }


    public void add (int addNumber) {
       value = value + addNumber;
        System.out.println("you just added " + " " + addNumber);

    }

    public void add () {
        value = value + 1;
        System.out.println("increasing by one...");

    }

    public void get () {
        System.out.println(value);

    }

    public void reset () {

        value = 0;

        System.out.println("reset done");
    }



}




