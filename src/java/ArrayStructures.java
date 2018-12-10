public class ArrayStructures{

//    int[] theArray = {10, 3, 1, 7};

    private int [] theArray = new int[4];

    private int arraySize = 6;

    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){

        System.out.println("----");

        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----");
        }
    }


    public static void main(String[] args){

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        newArray.printArray();
    }
}