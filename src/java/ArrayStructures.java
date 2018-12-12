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

    public void deleteIndex(int index){

        if(index < arraySize){

            for(int i = index; i < (arraySize - 1); i++){

                theArray[i] = theArray[i+1];

            }

            arraySize--;

        }

    }

    public void insertValue(int value){

        if(arraySize < 50){

            theArray[arraySize] = value;

            arraySize++;

        }
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

        long startTimeDI = System.nanoTime();
        newArray.deleteIndex(4);
        long endTimeDI = System.nanoTime();
        System.out.println("Deleting index [4] took "+(endTimeDI - startTimeDI) + " milliseconds");

        long startTimeD = System.nanoTime();
        newArray.printArray();
        long endTimeD = System.nanoTime();
        System.out.println("New array after deletion "+(endTimeD - startTimeD) + " milliseconds");

        long startTimeIV = System.nanoTime();
        newArray.insertValue(99);
        long endTimeIV = System.nanoTime();
        System.out.println("Inserting new value into array took "+(endTimeIV - startTimeIV) + " milliseconds");

        long startTimeAI = System.nanoTime();
        newArray.printArray();
        long endTimeAI = System.nanoTime();
        System.out.println("New array after insert took "+(endTimeAI - startTimeAI) + " milliseconds");


    }
}