package observer.publisher;
/**
 * Created by lianglitu on 16/9/19.
 */
public class Pen extends Publisher {
    String name = "";
    String color = "";
    String TAG=this.getClass().getSimpleName();

    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

        notifySubscribers("color", color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifySubscribers("name", name);
    }

    public void showInfo()
    {
        //Log.v(TAG,"name:"+getName()+"\tcolor:"+getColor());
        System.out.print("name:"+getName()+"\tcolor:"+getColor());
    }
}
