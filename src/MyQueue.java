public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        capacity = queueSize;
        queueArr = new int[capacity];
    }

    public boolean isQueueFull(){
        if(currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if(currentSize == 0){
            return true;
        }
        return false;
    }

    public void enqueue(int num){
        if(isQueueFull()){
            System.out.println("Queue is full");
            return;
        }
        queueArr[currentSize] = num;
        currentSize++;
        System.out.println(num+" have been add to Queue");
    }

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queueArr[0]+" have been remove from Queue");
        for (int i = 0; i < currentSize - 1; i++) {
            queueArr[i] = queueArr[i+1];
        }
        queueArr[currentSize] = 0;
        currentSize--;


    }
}
