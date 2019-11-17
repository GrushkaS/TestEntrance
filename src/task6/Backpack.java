package task6;

public class Backpack {

    private int weight;
    private int maxWeight;

    public Backpack(int maxWeight){
        setMaxWeight(maxWeight);
        setWeight(0);
    }
    public Backpack(int maxWeight,int weight){
        setMaxWeight(maxWeight);
        setWeight(weight);
    }

    public void setMaxWeight(int maxWeight){
        if(maxWeight >0) this.maxWeight = maxWeight;
    }
    public void setWeight(int weight){
        if(weight > 0 && weight <= maxWeight && weight <= maxWeight-this.weight )
        this.weight += weight;
    }
    public int getWeight(){
        return weight;
    }
    public int getWeightLeft(){
        return maxWeight - weight;
    }

    public boolean isFull(){
        if(weight == maxWeight) return true;
        else return false;
    }

}
