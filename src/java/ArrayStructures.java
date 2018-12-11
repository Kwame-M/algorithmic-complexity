public class ArrayStructures{

//    int[] theArray = {10, 3, 1, 7};

    private int [] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){

        System.out.println("----------");

        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("---------");
        }
    }

    public int getValueOfIndex(int index){

        if(index < arraySize) return theArray[index];

        return 0;
    }

    public boolean doesFindThisValue(int searchValue){

        boolean valueInArray = false;

        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == searchValue){

                valueInArray = true;

            }

        }

        return valueInArray;

    }

    public static void main(String[] args){

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        long startTimeG = System.nanoTime();
        newArray.printArray();
        long endTimeG = System.nanoTime();
        System.out.println("Generating arrays took "+(endTimeG - startTimeG) + " milliseconds");


        long startTimeI = System.nanoTime();
        System.out.println(newArray.getValueOfIndex(9));
        long endTimeI = System.nanoTime();
        System.out.println("Finding index [2] took "+(endTimeI - startTimeI) + " milliseconds");

        long startTimeV = System.nanoTime();
        System.out.println(newArray.doesFindThisValue(18));
        long endTimeV = System.nanoTime();
        System.out.println("Finding the value [18] took "+(endTimeV - startTimeV) + " milliseconds");

    }
}