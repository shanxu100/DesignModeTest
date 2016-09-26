package Command;

/**
 * Created by guan on 9/24/16.
 */
public class Client {

    public static void main(String[] args)
    {
        //前期准备
        Executor executor=new Executor();
        Cmd1 cmd1=new Cmd1(executor);
        Cmd2 cmd2=new Cmd2(executor);
        Invoker invoker=new Invoker();

        //准备完毕，开始执行
        invoker.CmdList.add(cmd1);
        invoker.CmdList.add(cmd2);
        invoker.CmdList.add(cmd1);
        invoker.Notify();

        if (invoker.CmdList.get(0)==invoker.CmdList.get(2))
        {
            //list中的元素相同，说明是同一个对象两次加入了list中。
            System.out.println("same");
        }

    }
}
