package task6;

public class Item {
    private int weight;
    private int cost;

    public Item(int weight, int cost){
        setWeight(weight);
        setCost(cost);
    }

    public void setWeight(int weight){
        if(weight > 0)
            this.weight = weight;
    }
    public void setCost(int cost){
        if(cost > 0)
            this.cost = cost;
    }

    public int getWeight(){
       return weight;
    }
    public int getCost(){
        return cost;
    }
}
