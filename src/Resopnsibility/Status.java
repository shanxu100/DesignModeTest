package Resopnsibility;

/**
 * Created by guan on 9/24/16.
 */
public abstract class Status {
    protected Status successor;
    String requestType = this.getClass().getSimpleName();


    public void setSuccessor(Status successor) {
        this.successor = successor;
    }

    public void doResponsibility(String request) {
        System.out.println(this.getClass().getSimpleName() + "接收request");
        if (this.requestType.equals(request)) {
            System.out.println("我能解决");
            solve(request);

        } else {

            System.out.println("我解决不了,转给我的successor");
            if (null == successor) {
                System.out.println("发现我没有successor,擦***");
            } else {
                successor.doResponsibility(request);
            }
        }
    }

    protected abstract void solve(String request);


}
