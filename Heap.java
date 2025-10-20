import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List <Integer> heap;

    public Heap(){
        this.heap= new ArrayList<>();
    }

    public List <Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
     return 2*index+1;
    }

    private int rightChild(int index){
        return 2*index+2;
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private void swap(int index1, int index2){
        int temp=heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }

    private void sinkDown(int index){          //commonly 0 the parent one, its use to check if children are less than parent, if not it swaps
        int maxIndex=index;
        while(true){
            int leftIndex=leftChild(index);  //initalised leftindex which is the leftchild of parent
            int rightIndex= rightChild(index); // initialised rightIndex which is the rightchild of parent

            if(leftIndex<heap.size()&&heap.get(leftIndex)>heap.get(maxIndex)){   //Checks if leftIndex greater than maxIndex i.e the parent index if so leftIndex becomes maxIndex
               maxIndex=leftIndex; 
            }
            if(rightIndex<heap.size()&&heap.get(rightIndex)>heap.get(maxIndex)){ //also checks if the rightIndex of the maxIndex is null or not
                maxIndex=rightIndex;                                             //Checks if rightIndex greater than leftIndex i.e the maxIndex (now) if so rightIndex becomes maxIndex
            }

            if(maxIndex!=index){  //If our parent i.e the index != maxIndex, then we swap them 
                swap(index, maxIndex);
                index=maxIndex;
            }else{
                return;
            }
        } 
    }

    public void insert(int value){
        heap.add(value);
        int current=heap.size()-1;

        while(current>0&&heap.get(current)>heap.get(parent(current))){
            swap(current, parent(current));
            current=parent(current);
        }
    }

    public Integer remove(){
        if(heap.size()==0){
            return null;
        }
        if(heap.size()==1){
            return heap.remove(0);
        }
        int maxValue=heap.get(0);
        heap.set(0, heap.remove(heap.size()-1)); //removes the last value and set it at index 0
        sinkDown(0);

        return maxValue;
    }
}
