package Сlasses.TheSimplestClassesAndObjects.Task1;

public class Test1 {
    private int firstVar = 22;
    private int secondVar = 3;

    public void printInfo (){
        System.out.println("First variable firstVar = " + firstVar);
        System.out.println("Second variable secondVar = " + secondVar);
    }

    public int sum (){
        return firstVar + secondVar;
    }
    public int findMax (){
        return Math.max(firstVar, secondVar);
    }
    public int getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(int firstVar) {
        this.firstVar = firstVar;
    }

    public int getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(int secondVar) {
        this.secondVar = secondVar;
    }
}
