package multithreading;

public class sumOfAddition {
        int start;
        int end;
        int counter;
        //constructor
        sumOfAddition( int start, int end){
            this.start = start;
            this.end = end;
        }
        void add () {
            for (int i = start; i <= end; i++) {
                counter++;
            }
        }
    }