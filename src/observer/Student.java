package observer;



/**
 * Created by lianglitu on 16/9/19.
 */
public class Student extends Subscriber{
    String TAG=this.getClass().getSimpleName();
    String initInfo="";

    public Student(String info)
    {
        this.initInfo=info;
        //Log.e(TAG,"InitInfo:\t"+this.initInfo);
        System.out.println("InitInfo:\t"+this.initInfo);
    }

    @Override
    public void Update(Object key,Object value) {

        //Log.e(TAG,"UpdateInfo:\t"+key.toString()+"\t"+value.toString());
        System.out.println("UpdateInfo:\t"+key.toString()+"\t"+value.toString());
    }
}
