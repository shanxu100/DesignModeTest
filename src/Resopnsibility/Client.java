package Resopnsibility;

/**
 * Created by guan on 9/24/16.
 */
public class Client {

    public static void main(String[] args)
    {
        Status n1=new Node1();
        Status n2=new Node2();
        String request="Node3";

        n1.setSuccessor(n2);

        n1.doResponsibility(request);
    }
}
