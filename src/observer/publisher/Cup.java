package observer.publisher;

/**
 * Created by lianglitu on 16/9/19.
 */
public class Cup extends Publisher {
    String name="";
    int price=0;

    public Cup(String name,int price)
    {
        this.name=name;
        this.price=price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifySubscribers("name",name);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscribers("price",price);
    }
}
