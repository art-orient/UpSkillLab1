package Сlasses.TheSimplestClassesAndObjects.Task5;

public class Counter {
    private int counter;
    private int downLimit;
    private int upLimit;

    public Counter() {
        this (0, 0, 10);
    }

    public Counter(int counter, int downLimit, int upLimit) {
        if (upLimit >= downLimit){
            this.downLimit = downLimit;
            this.upLimit = upLimit;
        } else {
            this.downLimit = upLimit;
            this.upLimit = downLimit;
        }
        setCounter(counter);
    }

    public int addOne (){
        if (counter < upLimit){
            counter++;
        } else {
            System.out.println("Counter has reached the upper limit.");
        }
        return counter;
    }

    public int minusOne (){
        if (counter > downLimit){
            counter--;
        } else {
            System.out.println("Counter has lowered.");
        }
        return counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter >= this.downLimit && counter <= this.upLimit){
            this.counter = counter;
        } else {
            this.counter = (int) (Math.random() * (upLimit - downLimit + 1) + downLimit);
        }
    }

    public int getDownLimit() {
        return downLimit;
    }

    public void setDownLimit(int downLimit) {
        this.downLimit = downLimit;
    }

    public int getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(int upLimit) {
        this.upLimit = upLimit;
    }
}
